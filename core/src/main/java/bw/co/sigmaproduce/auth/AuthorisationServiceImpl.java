// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: bocraportal::backend::bw.co.sigmaproduce::authorisation::AuthorisationService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.springframework.context.MessageSource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bw.co.sigmaproduce.SigmaproduceSpecifications;
import bw.co.sigmaproduce.access.AccessPoint;

/**
 * @see bw.co.sigmaproduce.authorisation.AuthorisationService
 */
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
@Service("authorisationService")
public class AuthorisationServiceImpl
    extends AuthorisationServiceBase
{

    public AuthorisationServiceImpl(AuthorisationDao authorisationDao, AuthorisationRepository authorisationRepository,
            MessageSource messageSource) {

        super(authorisationDao, authorisationRepository, messageSource);
        //TODO Auto-generated constructor stub
    }

    /**
     * @see bw.co.sigmaproduce.authorisation.AuthorisationService#findById(Long)
     */
    @Override
    protected  AuthorisationVO handleFindById(Long id)
        throws Exception
    {
        if(id == null) {
            return null;
        }

        Authorisation authorisation = this.authorisationRepository.getReferenceById(id);
        return authorisationDao.toAuthorisationVO(authorisation);
    }

    /**
     * @see bw.co.sigmaproduce.authorisation.AuthorisationService#save(AuthorisationVO)
     */
    @Override
    protected  AuthorisationVO handleSave(AuthorisationVO authorisationVO)
        throws Exception
    {
        Authorisation entity = authorisationDao.authorisationVOToEntity(authorisationVO);

        entity = authorisationRepository.saveAndFlush(entity);

        return authorisationDao.toAuthorisationVO(entity);
    }

    /**
     * @see bw.co.sigmaproduce.authorisation.AuthorisationService#remove(Long)
     */
    @Override
    protected  boolean handleRemove(Long id)
        throws Exception
    {

        if(id == null) {
            return false;
        }

        this.authorisationRepository.deleteById(id);

        return true;
    }

    /**
     * @see bw.co.sigmaproduce.authorisation.AuthorisationService#getAll()
     */
    @Override
    protected  Collection<AuthorisationVO> handleGetAll()
        throws Exception
    {

        return (Collection<AuthorisationVO>) authorisationDao.loadAll(AuthorisationDao.TRANSFORM_AUTHORISATIONVO);
    }

    /**
     * @see bw.co.sigmaproduce.authorisation.AuthorisationService#search(AuthorisationCriteria)
     */
    @Override
    protected  Collection<AuthorisationVO> handleSearch(AuthorisationCriteria criteria)
        throws Exception
    {
        return (Collection<AuthorisationVO>) this.authorisationDao.findByCriteria(AuthorisationDao.TRANSFORM_AUTHORISATIONVO, criteria);
    }

    @Override
    protected Collection<AuthorisationVO> handleGetAll(Integer pageNumber, Integer pageSize) throws Exception {
        Collection<Authorisation> authorisations = null;

        if(pageNumber < 0 || pageSize < 1) {
            authorisations = authorisationRepository.findAll();
        } else {
            Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
            authorisations = authorisationRepository.findAll(pageable).getContent();
        }

        return authorisations == null ? null : authorisationDao.toAuthorisationVOCollection(authorisations);
    }

    @Override
    protected Collection<AuthorisationVO> handleGetAccessTypeCodeAuthorisations(Set<String> roles,
            Set<String> accessPointTypeCode) throws Exception {
        
        return (Collection<AuthorisationVO>) this.authorisationDao.findAccessTypeCodeAuthorisations(AuthorisationDao.TRANSFORM_AUTHORISATIONVO, roles, accessPointTypeCode);
    }

    @Override
    protected AuthorisationVO handleAssignMenuSection(Long authorisationId, Long menuSectionId)
            throws Exception {

        Authorisation authorisation = authorisationDao.load(authorisationId);

        authorisation = authorisationRepository.save(authorisation);

        return authorisationDao.toAuthorisationVO(authorisation);
    }

    @Override
    protected Collection<AuthorisationVO> handleFindByRolesAndUrl(String url, Set<String> roles) throws Exception {

        Specification<Authorisation> specs = SigmaproduceSpecifications.<Authorisation>findByAttributeLikeIgnoreCase(url, "accessPoint", "url");
        specs = specs.and(
            SigmaproduceSpecifications.<Authorisation, String>findByAttributeIn(roles, "roles")
        );

        Collection<Authorisation> authorisations = authorisationRepository.findByRolesAndUrlContaining(url, roles);
        Collection<AuthorisationVO> vos = new ArrayList<>();

        for(Authorisation auth : authorisations) {
            vos.add(authorisationDao.toAuthorisationVO(auth));
        }

        return vos;
    }

    @Override
    protected Collection<AuthorisationVO> handleFindByUrlPrefix(String prefix) throws Exception {
        Specification<Authorisation> specs = SigmaproduceSpecifications.<Authorisation>findByAttributeStartingWithIgnoreCase(prefix, "accessPoint", "url");
        Collection<Authorisation> authorisations = authorisationRepository.findAll(specs);
        
        Collection<AuthorisationVO> vos = new ArrayList<>();

        for(Authorisation auth : authorisations) {
            vos.add(authorisationDao.toAuthorisationVO(auth));
        }

        return vos;
    }

}