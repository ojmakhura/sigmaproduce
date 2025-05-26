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

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    protected CropVarietyDTO handleFindById(String id)
        throws Exception
    {
        CropVariety cropVariety = this.cropVarietyRepository.findById(id).orElse(null);
        if(cropVariety == null) {
            return null;
        }

        return this.getCropVarietyDao().toCropVarietyDTO(cropVariety);
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#getAll()
     */
    @Override
    protected Collection<CropVarietyList> handleGetAll()
        throws Exception
    {

        Collection<CropVariety> cropVarieties = this.cropVarietyRepository.findAll();
        if(CollectionUtils.isEmpty(cropVarieties)) {
            return null;
        }

        return this.getCropVarietyDao().toCropVarietyListCollection(cropVarieties);
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#getAll(Integer, Integer)
     */
    @Override
    protected Page<CropVarietyList> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {

        Page<CropVariety> cropVarieties = this.cropVarietyRepository.findAll(PageRequest.of(pageNumber, pageSize));
        
        return cropVarieties.map(cropVariety -> this.getCropVarietyDao().toCropVarietyList(cropVariety));
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {

        this.cropVarietyRepository.deleteById(id);
        return true;
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#save(CropVarietyDTO)
     */
    @Override
    protected CropVarietyDTO handleSave(CropVarietyDTO cropVariety)
        throws Exception
    {

        CropVariety entity = this.getCropVarietyDao().cropVarietyDTOToEntity(cropVariety);
        entity = this.cropVarietyRepository.save(entity);

        return this.getCropVarietyDao().toCropVarietyDTO(entity);
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#search(String)
     */
    @Override
    protected Collection<CropVarietyList> handleSearch(String criteria)
        throws Exception
    {

        Collection<CropVariety> cropVarieties = this.cropVarietyDao.findByCriteria(criteria);
        if(CollectionUtils.isEmpty(cropVarieties)) {
            return null;
        }

        return this.getCropVarietyDao().toCropVarietyListCollection(cropVarieties);
    }

    /**
     * @see bw.co.sigmaproduce.crop.variety.CropVarietyService#search(Integer, Integer, String)
     */
    @Override
    protected Page<CropVarietyList> handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {

        Page<CropVariety> cropVarieties = this.cropVarietyDao.findByCriteriaPaged(criteria, pageSize, pageNumber);

        return cropVarieties.map(cropVariety -> this.getCropVarietyDao().toCropVarietyList(cropVariety));
    }

}