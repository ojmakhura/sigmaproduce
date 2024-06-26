// license-header java merge-point
//
/**
 * @author Generated by Service.vsl in andromda-java-cartridge on 05/31/2024 22:50:45+0200 Do not modify by hand!
 *
 * TEMPLATE:     Service.vsl in andromda-java-cartridge.
 * MODEL CLASS:  bocraportal::backend::bw.co.sigmaproduce::auth::AuthorisationService
 * STEREOTYPE:   Service
 */
package bw.co.sigmaproduce.auth;

import java.util.Collection;
import java.util.Set;

/**
 * TODO: Model Documentation for AuthorisationService
 */
public interface AuthorisationService
{
    /**
     * TODO: Model Documentation for AuthorisationService.findById
     * @param id TODO: Model Documentation for AuthorisationService.findById(id)
     * @return AuthorisationVO
     */
    public AuthorisationVO findById(Long id);

    /**
     * TODO: Model Documentation for AuthorisationService.save
     * @param authorisation TODO: Model Documentation for AuthorisationService.save(authorisation)
     * @return AuthorisationVO
     */
    public AuthorisationVO save(AuthorisationVO authorisation);

    /**
     * TODO: Model Documentation for AuthorisationService.remove
     * @param id TODO: Model Documentation for AuthorisationService.remove(id)
     * @return boolean
     */
    public boolean remove(Long id);

    /**
     * TODO: Model Documentation for AuthorisationService.getAll
     * @return Collection<AuthorisationVO>
     */
    public Collection<AuthorisationVO> getAll();

    /**
     * TODO: Model Documentation for AuthorisationService.search
     * @param criteria TODO: Model Documentation for AuthorisationService.search(criteria)
     * @return Collection<AuthorisationVO>
     */
    public Collection<AuthorisationVO> search(AuthorisationCriteria criteria);

    /**
     * TODO: Model Documentation for AuthorisationService.getAll
     * @param pageNumber TODO: Model Documentation for AuthorisationService.getAll(pageNumber)
     * @param pageSize TODO: Model Documentation for AuthorisationService.getAll(pageSize)
     * @return Collection<AuthorisationVO>
     */
    public Collection<AuthorisationVO> getAll(Integer pageNumber, Integer pageSize);

    /**
     * TODO: Model Documentation for
     * AuthorisationService.getAccessTypeCodeAuthorisations
     * @param roles TODO: Model Documentation for
AuthorisationService.getAccessTypeCodeAuthorisations(roles)
     * @param accessPointTypeCodes TODO: Model Documentation for
AuthorisationService.getAccessTypeCodeAuthorisations(accessPointTypeCodes)
     * @return Collection<AuthorisationVO>
     */
    public Collection<AuthorisationVO> getAccessTypeCodeAuthorisations(Set<String> roles, Set<String> accessPointTypeCodes);

    /**
     * TODO: Model Documentation for AuthorisationService.assignMenuSection
     * @param authorisationId TODO: Model Documentation for
AuthorisationService.assignMenuSection(authorisationId)
     * @param menuSectionId TODO: Model Documentation for
AuthorisationService.assignMenuSection(menuSectionId)
     * @return AuthorisationVO
     */
    public AuthorisationVO assignMenuSection(Long authorisationId, Long menuSectionId);

    /**
     * TODO: Model Documentation for AuthorisationService.findByRolesAndUrl
     * @param url TODO: Model Documentation for AuthorisationService.findByRolesAndUrl(url)
     * @param roles TODO: Model Documentation for AuthorisationService.findByRolesAndUrl(roles)
     * @return Collection<AuthorisationVO>
     */
    public Collection<AuthorisationVO> findByRolesAndUrl(String url, Set<String> roles);

    /**
     * TODO: Model Documentation for AuthorisationService.findByUrlPrefix
     * @param prefix TODO: Model Documentation for AuthorisationService.findByUrlPrefix(prefix)
     * @return Collection<AuthorisationVO>
     */
    public Collection<AuthorisationVO> findByUrlPrefix(String prefix);

}