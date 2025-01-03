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
import bw.co.sigmaproduce.crop.issue.CropIssueVO;
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
    @Transactional
    protected CropTypeVO handleFindById(String id)
        throws Exception
    {
        
        CropType cropType = this.cropTypeRepository.findById(id).orElse(null);
        
        return this.getCropTypeDao().toCropTypeVO(cropType);
    }

    /**
     * @see bw.co.sigmaproduce.crop.type.CropTypeService#getAll()
     */
    @Override
    protected Collection<CropTypeVO> handleGetAll()
        throws Exception
    {

        return this.getCropTypeDao().toCropTypeVOCollection(this.getCropTypeRepository().findAll());
    }

    /**
     * @see bw.co.sigmaproduce.crop.type.CropTypeService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {

        this.getCropTypeRepository().deleteById(id);
        
        return true;
    }

    /**
     * @see bw.co.sigmaproduce.crop.type.CropTypeService#save(CropIssueVO)
     */
    @Override
    protected CropTypeVO handleSave(CropTypeVO cropType)
        throws Exception
    {

        CropType entity = this.getCropTypeDao().cropTypeVOToEntity(cropType);
        entity = this.getCropTypeRepository().save(entity);
        
        return this.getCropTypeDao().toCropTypeVO(entity);
    }

    /**
     * @see bw.co.sigmaproduce.crop.type.CropTypeService#search(String)
     */
    @Override
    protected Collection<CropTypeVO> handleSearch(String criteria)
        throws Exception
    {

        return this.getCropTypeDao().toCropTypeVOCollection(this.getCropTypeDao().findByCriteria(criteria));
    }

}