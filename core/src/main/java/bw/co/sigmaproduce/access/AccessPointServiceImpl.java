// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: bocraportal::backend::bw.co.sigmaproduce::access::AccessPointService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see AccessPointService
 */
@Service("accessPointService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class AccessPointServiceImpl
    extends AccessPointServiceBase
{

    public AccessPointServiceImpl(AccessPointDao accessPointDao, AccessPointRepository accessPointRepository,
            MessageSource messageSource) {
        super(accessPointDao, accessPointRepository, messageSource);
    }

    /**
     * @see AccessPointService#findById(Long)
     */
    @Override
    protected  AccessPointVO handleFindById(Long id)
        throws Exception
    {
        AccessPoint point = getAccessPointDao().load(id);
        return accessPointDao.toAccessPointVO(point);
    }

    /**
     * @see AccessPointService#getAll()
     */
    @Override
    protected  Collection<AccessPointVO> handleGetAll()
        throws Exception
    {
        return (Collection<AccessPointVO>) getAccessPointDao().loadAll(AccessPointDao.TRANSFORM_ACCESSPOINTVO);
    }

    /**
     * @see AccessPointService#getAll(Integer, Integer)
     */
    @Override
    protected  Collection<AccessPointVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        Collection<AccessPoint> entities = accessPointRepository.findAll(PageRequest.of(pageNumber, pageSize)).getContent();
        return accessPointDao.toAccessPointVOCollection(entities);
    }

    /**
     * @see AccessPointService#remove(Long)
     */
    @Override
    protected  boolean handleRemove(Long id)
        throws Exception
    {
        accessPointRepository.deleteById(id);
        return true;
    }

    /**
     * @see AccessPointService#save(AccessPointVO)
     */
    @Override
    protected  AccessPointVO handleSave(AccessPointVO accessPoint)
        throws Exception
    {
        AccessPoint point = getAccessPointDao().accessPointVOToEntity(accessPoint);
        // point = accessPointDao.createOrUpdate(point);
        point = accessPointRepository.saveAndFlush(point);

        if(accessPoint.getId() != null) {
            return getAccessPointDao().toAccessPointVO(point);
        }

        return accessPointDao.toAccessPointVO(point);
    }

    /**
     * @see AccessPointService#search(String)
     */
    @Override
    protected  Collection<AccessPointVO> handleSearch(AccessPointCriteria criteria)
        throws Exception
    {
        Collection<AccessPoint> points = accessPointDao.findByCriteria(criteria);
        return accessPointDao.toAccessPointVOCollection(points);
    }

    /**
     * @see AccessPointService#search(Integer, Integer, AccessPointCriteria)
     */
    @Override
    protected  Page<AccessPointVO> handleSearch(Integer pageNumber, Integer pageSize, AccessPointCriteria criteria)
        throws Exception
    {

        if (pageNumber == null) {
            throw new AccessPointServiceException("Page number must not be null.");
        }

        if (pageNumber < 1) {
            throw new AccessPointServiceException("Page number must not be less than 1.");
        }

        if (pageSize == null) {
            throw new AccessPointServiceException("Page size must not be null.");
        }

        if (pageSize < 1) {
            throw new AccessPointServiceException("Page size must not be less than 1.");
        }

        criteria.setFetchSize(pageSize);
        criteria.setPageNumber(pageNumber);

        Specification<AccessPoint> specifications = ((AccessPointDaoImpl)accessPointDao).getFindByCriteriaSpecifications(criteria);
        Pageable pageable = PageRequest.of(criteria.getPageNumber() - 1, criteria.getFetchSize());
        Page<AccessPoint> pageData = accessPointRepository.findAll(specifications, pageable);
        
        return pageData.map(point -> accessPointDao.toAccessPointVO(point)); 
    }

}