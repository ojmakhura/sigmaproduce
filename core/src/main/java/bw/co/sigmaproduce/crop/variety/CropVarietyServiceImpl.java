// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::crop::variety::CropVarietyService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.crop.variety;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.crop.variety.CropVarietyService
 */
@Service("cropVarietyService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class CropVarietyServiceImpl
    extends CropVarietyServiceBase
{
    public CropVarietyServiceImpl(
        CropVarietyDao cropVarietyDao,
        CropVarietyRepository cropVarietyRepository,
        MessageSource messageSource
    ) {
        
        super(
            cropVarietyDao,
            cropVarietyRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#findById(String)
     */
    @Override
    protected CropVarietyVO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  CropVarietyVO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.variety.CropVarietyService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#getAll()
     */
    @Override
    protected Collection<CropVarietyList> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<CropVarietyList> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.variety.CropVarietyService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#getAll(Integer, Integer)
     */
    @Override
    protected Page<CropVarietyList> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<CropVarietyList> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.variety.CropVarietyService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.variety.CropVarietyService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#save(CropVarietyVO)
     */
    @Override
    protected CropVarietyVO handleSave(CropVarietyVO cropVariety)
        throws Exception
    {
        // TODO implement protected  CropVarietyVO handleSave(CropVarietyVO cropVariety)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.variety.CropVarietyService.handleSave(CropVarietyVO cropVariety) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#search(String)
     */
    @Override
    protected Collection<CropVarietyList> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<CropVarietyList> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.variety.CropVarietyService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#search(Integer, Integer, String)
     */
    @Override
    protected Page<CropVarietyList> handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Page<CropVarietyList> handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.variety.CropVarietyService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

}