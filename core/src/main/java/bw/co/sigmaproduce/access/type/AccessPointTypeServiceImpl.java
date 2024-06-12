// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: bocraportal::backend::bw.co.sigmaproduce::access::type::AccessPointTypeService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.access.type;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.MessageSource;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see type.AccessPointTypeService
 */
@Service("accessPointTypeService")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class AccessPointTypeServiceImpl
        extends AccessPointTypeServiceBase {

    public AccessPointTypeServiceImpl(AccessPointTypeDao accessPointTypeDao,
            AccessPointTypeRepository accessPointTypeRepository, MessageSource messageSource) {
        super(accessPointTypeDao, accessPointTypeRepository, messageSource);
    }

    /**
     * @see type.AccessPointTypeService#findById(Long)
     */
    @Override
    protected AccessPointTypeVO handleFindById(Long id)
            throws Exception {
        AccessPointType type = getAccessPointTypeDao().load(id);
        return getAccessPointTypeDao().toAccessPointTypeVO(type);

    }

    /**
     * @see type.AccessPointTypeService#save(AccessPointTypeVO)
     */
    @Override
    protected AccessPointTypeVO handleSave(AccessPointTypeVO accessPointType)
            throws Exception {
        AccessPointType entity = getAccessPointTypeDao().accessPointTypeVOToEntity(accessPointType);
        entity = accessPointTypeRepository.saveAndFlush(entity);

        if (accessPointType.getId() == null) {
            accessPointType = getAccessPointTypeDao().toAccessPointTypeVO(entity);
        }

        return accessPointType;
    }

    /**
     * @see type.AccessPointTypeService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
            throws Exception {

        accessPointTypeDao.remove(id);

        return true;
    }

    /**
     * @see type.AccessPointTypeService#getAll()
     */
    @Override
    protected Collection<AccessPointTypeVO> handleGetAll()
            throws Exception {
        return (Collection<AccessPointTypeVO>) getAccessPointTypeDao()
                .loadAll(AccessPointTypeDao.TRANSFORM_ACCESSPOINTTYPEVO);
    }

    /**
     * @see type.AccessPointTypeService#search(String)
     */
    @Override
    protected Collection<AccessPointTypeVO> handleSearch(String criteria)
            throws Exception {
        Collection<AccessPointType> types = accessPointTypeDao.findByCriteria(criteria);
        Collection<AccessPointTypeVO> vos = new ArrayList<>();

        for (AccessPointType type : types) {
            vos.add(getAccessPointTypeDao().toAccessPointTypeVO(type));
        }

        return vos;
    }

    /**
     * @see type.AccessPointTypeService#getAll(Integer,
     *      Integer)
     */
    @Override
    protected Collection<AccessPointTypeVO> handleGetAll(Integer pageNumber, Integer pageSize)
            throws Exception {

        Collection<AccessPointType> types = accessPointTypeRepository.findAll(PageRequest.of(pageNumber, pageSize)).getContent();

        return accessPointTypeDao.toAccessPointTypeVOCollection(types);
    }

    @Override
    protected Collection<AccessPointTypeVO> handleSearch(Integer pageNumber, Integer pageSize, String criteria)
            throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}