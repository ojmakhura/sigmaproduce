// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.sigma::crop::CropService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.sigma.crop;

import bw.co.roguesystems.sigma.crop.variety.CropVariety;
import bw.co.roguesystems.sigma.crop.variety.CropVarietyDao;
import bw.co.roguesystems.sigma.crop.variety.CropVarietyRepository;
import io.micrometer.common.util.StringUtils;

import java.time.LocalDateTime;
import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.sigma.crop.CropService
 */
@Service("cropService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class CropServiceImpl
    extends CropServiceBase
{
    public CropServiceImpl(
        CropDao cropDao,
        CropRepository cropRepository,
        CropVarietyDao cropVarietyDao,
        CropVarietyRepository cropVarietyRepository,
        MessageSource messageSource
    ) {
        
        super(
            cropDao,
            cropRepository,
            cropVarietyDao,
            cropVarietyRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.sigma.crop.CropService#findById(String)
     */
    @Override
    protected CropVO handleFindById(String id)
        throws Exception
    {

        Crop crop = this.cropRepository.findById(id).orElse(null);

        return crop != null ? cropDao.toCropVO(crop) : null;

    }

    /**
     * @see bw.co.roguesystems.sigma.crop.CropService#getAll()
     */
    @Override
    protected Collection<CropVO> handleGetAll()
        throws Exception
    {

        return cropDao.toCropVOCollection(this.cropRepository.findAll());
        
    }

    /**
     * @see bw.co.roguesystems.sigma.crop.CropService#getAll(Integer, Integer)
     */
    @Override
    protected Page<CropVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {

        Page<Crop> crops = this.cropRepository.findAll(PageRequest.of(pageNumber, pageSize));

        return crops.map(crop -> cropDao.toCropVO(crop));
    }

    /**
     * @see bw.co.roguesystems.sigma.crop.CropService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {

        this.cropRepository.deleteById(id);

        return true;
    }

    /**
     * @see bw.co.roguesystems.sigma.crop.CropService#save(CropVO)
     */
    @Override
    protected CropVO handleSave(CropVO crop)
        throws Exception
    {
        if(StringUtils.isBlank(crop.getId())) {
            crop.setCreatedBy("SYSTEM");
            crop.setCreatedDate(LocalDateTime.now());
        }

        Crop entity = cropDao.cropVOToEntity(crop);

        if(CollectionUtils.isNotEmpty(entity.getCropVarieties())) {

            for(CropVariety variety : entity.getCropVarieties()) {
                if(StringUtils.isBlank(variety.getId())) {

                    variety.setCreatedBy("SYSTEM");
                    variety.setCreatedDate(LocalDateTime.now());

                    variety.setCrop(entity);
                }
            }
        }
        
        entity = this.cropRepository.save(entity);

        return cropDao.toCropVO(entity);
    }

    /**
     * @see bw.co.roguesystems.sigma.crop.CropService#search(String)
     */
    @Override
    protected Collection<CropVO> handleSearch(String criteria)
        throws Exception
    {
        Collection<Crop> crop = this.cropDao.findByCriteria(criteria);
        return cropDao.toCropVOCollection(crop);
    }

    /**
     * @see bw.co.roguesystems.sigma.crop.CropService#search(Integer, Integer, String)
     */
    @Override
    protected Page<CropVO> handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {

        Page<Crop> crops = this.cropDao.findByCriteriaPaged(criteria, pageSize, pageNumber);

        return crops.map(crop -> cropDao.toCropVO(crop));
    }

}