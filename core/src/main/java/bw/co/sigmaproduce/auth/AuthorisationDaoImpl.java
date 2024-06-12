// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on $springUtils.date.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.co.sigmaproduce.auth;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bw.co.sigmaproduce.access.AccessPoint;
import bw.co.sigmaproduce.access.AccessPointRepository;
import bw.co.sigmaproduce.access.AccessPointVO;
import bw.co.sigmaproduce.access.type.AccessPointTypeRepository;


/**
 * @see Authorisation
 */
@Repository("authorisationDao")
@Transactional
public class AuthorisationDaoImpl
    extends AuthorisationDaoBase
{
    public AuthorisationDaoImpl(AccessPointRepository accessPointRepository,
            AccessPointTypeRepository accessPointTypeRepository,
            AuthorisationRepository authorisationRepository) {

        super(accessPointRepository, accessPointTypeRepository, authorisationRepository);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toAuthorisationVO(
        Authorisation source,
        AuthorisationVO target)
    {
        super.toAuthorisationVO(source, target);

        if(source.getAccessPoint() != null && source.getAccessPoint().getId() != null) {
            AccessPointVO point = getAccessPointDao().toAccessPointVO(source.getAccessPoint());// new AccessPointVO();
            // point.setId(source.getAccessPoint().getId());
            // point.setName(source.getAccessPoint().getName());
            // point.setUrl(source.getAccessPoint().getUrl());

            // AccessPointType typeEntity = source.getAccessPoint().getAccessPointType();

            // if(typeEntity != null && typeEntity.getId() != null) {
            //     AccessPointTypeVO type = new AccessPointTypeVO();
            //     type.setCode(typeEntity.getCode());
            //     type.setId(typeEntity.getId());
            //     type.setName(typeEntity.getName());

            //     point.setAccessPointType(type);
            // }

            target.setAccessPoint(point);
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorisationVO toAuthorisationVO(final Authorisation entity)
    {
        // TODO verify behavior of toAuthorisationVO
        return super.toAuthorisationVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private Authorisation loadAuthorisationFromAuthorisationVO(AuthorisationVO authorisationVO)
    {
        if (authorisationVO.getId() == null)
        {
            return  Authorisation.Factory.newInstance();
        }
        else
        {
            return this.load(authorisationVO.getId());
        }
    }

    /**
     * {@inheritDoc}
     */
    public Authorisation authorisationVOToEntity(AuthorisationVO authorisationVO)
    {
        // TODO verify behavior of authorisationVOToEntity
        Authorisation entity = this.loadAuthorisationFromAuthorisationVO(authorisationVO);
        this.authorisationVOToEntity(authorisationVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void authorisationVOToEntity(
        AuthorisationVO source,
        Authorisation target,
        boolean copyIfNull)
    {
        // TODO verify behavior of authorisationVOToEntity
        target.setRoles(new java.util.ArrayList<>());
        super.authorisationVOToEntity(source, target, copyIfNull);

        if(source.getAccessPoint() != null && source.getAccessPoint().getId() != null) {
            AccessPoint entity = getAccessPointDao().load(source.getAccessPoint().getId());
            target.setAccessPoint(entity);
        }
    }

}