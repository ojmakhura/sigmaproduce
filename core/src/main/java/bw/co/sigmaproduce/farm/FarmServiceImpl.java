// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::farm::FarmService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.farm;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.farm.FarmService
 */
@Service("farmService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class FarmServiceImpl
    extends FarmServiceBase
{
    public FarmServiceImpl(
        FarmDao farmDao,
        FarmRepository farmRepository,
        MessageSource messageSource
    ) {
        
        super(
            farmDao,
            farmRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#findById(String)
     */
    @Override
    protected FarmListVO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  FarmListVO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.FarmService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#getAll()
     */
    @Override
    protected Collection<FarmListVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<FarmListVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.FarmService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#getAll(Integer, Integer)
     */
    @Override
    protected Page<FarmListVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<FarmListVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.FarmService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.FarmService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#save(FarmVO)
     */
    @Override
    protected FarmVO handleSave(FarmVO farm)
        throws Exception
    {
        // TODO implement protected  FarmVO handleSave(FarmVO farm)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.FarmService.handleSave(FarmVO farm) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#search(FarmCriteria)
     */
    @Override
    protected Collection<FarmListVO> handleSearch(FarmCriteria criteria)
        throws Exception
    {
        // TODO implement protected  Collection<FarmListVO> handleSearch(FarmCriteria criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.FarmService.handleSearch(FarmCriteria criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#search(Integer, Integer, FarmCriteria)
     */
    @Override
    protected Page<FarmListVO> handleSearch(Integer pageNumber, Integer pageSize, FarmCriteria criteria)
        throws Exception
    {
        // TODO implement protected  Page<FarmListVO> handleSearch(Integer pageNumber, Integer pageSize, FarmCriteria criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.FarmService.handleSearch(Integer pageNumber, Integer pageSize, FarmCriteria criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#findByVillage(String)
     */
    @Override
    protected FarmListVO handleFindByVillage(String villageId)
        throws Exception
    {
        // TODO implement protected  FarmListVO handleFindByVillage(String villageId)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.FarmService.handleFindByVillage(String villageId) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#findByDistrict(String)
     */
    @Override
    protected FarmListVO handleFindByDistrict(String districtId)
        throws Exception
    {
        // TODO implement protected  FarmListVO handleFindByDistrict(String districtId)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.FarmService.handleFindByDistrict(String districtId) Not implemented!");
    }

}