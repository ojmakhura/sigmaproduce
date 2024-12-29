// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::crop::type::CropTypeService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.crop.type;

import bw.co.sigmaproduce.crop.CropDao;
import bw.co.sigmaproduce.crop.CropRepository;
import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.crop.type.CropTypeService
 */
@Service("cropTypeService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class CropTypeServiceImpl
    extends CropTypeServiceBase
{
    public CropTypeServiceImpl(
        CropTypeDao cropTypeDao,
        CropTypeRepository cropTypeRepository,
        CropDao cropDao,
        CropRepository cropRepository,
        MessageSource messageSource
    ) {
        
        super(
            cropTypeDao,
            cropTypeRepository,
            cropDao,
            cropRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.crop.type.CropTypeService#findById(String)
     */
    @Override
    protected CropTypeVO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  CropTypeVO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.type.CropTypeService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.type.CropTypeService#getAll()
     */
    @Override
    protected Collection<CropTypeVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<CropTypeVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.type.CropTypeService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.type.CropTypeService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.type.CropTypeService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.type.CropTypeService#save(CropTypeVO)
     */
    @Override
    protected CropTypeVO handleSave(CropTypeVO cropType)
        throws Exception
    {
        // TODO implement protected  CropTypeVO handleSave(CropTypeVO cropType)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.type.CropTypeService.handleSave(CropTypeVO cropType) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.type.CropTypeService#search(String)
     */
    @Override
    protected Collection<CropTypeVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<CropTypeVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.type.CropTypeService.handleSearch(String criteria) Not implemented!");
    }

}