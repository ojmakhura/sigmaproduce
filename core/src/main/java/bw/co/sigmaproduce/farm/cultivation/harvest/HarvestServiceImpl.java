// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::farm::cultivation::harvest::HarvestService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.farm.cultivation.harvest;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService
 */
@Service("harvestService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class HarvestServiceImpl
    extends HarvestServiceBase
{
    public HarvestServiceImpl(
        HarvestDao harvestDao,
        HarvestRepository harvestRepository,
        MessageSource messageSource
    ) {
        
        super(
            harvestDao,
            harvestRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService#findById(String)
     */
    @Override
    protected HarvestDTO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  HarvestDTO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService#getAll()
     */
    @Override
    protected Collection<HarvestList> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<HarvestList> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService#save(HarvestDTO)
     */
    @Override
    protected HarvestDTO handleSave(HarvestDTO harvest)
        throws Exception
    {
        // TODO implement protected  HarvestDTO handleSave(HarvestDTO harvest)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService.handleSave(HarvestDTO harvest) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService#search(HarvestCriteria)
     */
    @Override
    protected Collection<HarvestList> handleSearch(HarvestCriteria criteria)
        throws Exception
    {
        // TODO implement protected  Collection<HarvestList> handleSearch(HarvestCriteria criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService.handleSearch(HarvestCriteria criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService#search(Integer, Integer, HarvestCriteria)
     */
    @Override
    protected Page<HarvestList> handleSearch(Integer pageNumber, Integer pageSize, HarvestCriteria criteria)
        throws Exception
    {
        // TODO implement protected  Page<HarvestList> handleSearch(Integer pageNumber, Integer pageSize, HarvestCriteria criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService.handleSearch(Integer pageNumber, Integer pageSize, HarvestCriteria criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService#getAll(Integer, Integer)
     */
    @Override
    protected Page<HarvestList> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<HarvestList> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.harvest.HarvestService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

}