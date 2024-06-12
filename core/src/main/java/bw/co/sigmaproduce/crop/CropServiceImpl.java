// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::crop::CropService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.crop;

import bw.co.sigmaproduce.crop.issue.CropIssueType;
import bw.co.sigmaproduce.crop.variety.CropVariety;
import bw.co.sigmaproduce.crop.variety.CropVarietyDao;
import bw.co.sigmaproduce.crop.variety.CropVarietyRepository;
import io.micrometer.common.util.StringUtils;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.crop.CropService
 */
@Service("cropService")
@Transactional()
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
     * @see bw.co.sigmaproduce.crop.CropService#findById(String)
     */
    @Override
    protected CropVO handleFindById(String id)
        throws Exception
    {

        Crop crop = this.cropRepository.findById(id).orElse(null);

        return crop != null ? cropDao.toCropVO(crop) : null;

    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#getAll()
     */
    @Override
    protected Collection<CropListVO> handleGetAll()
        throws Exception
    {

        return cropDao.toCropListVOCollection(this.cropRepository.findAll());
        
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#getAll(Integer, Integer)
     */
    @Override
    protected Page<CropListVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {

        Page<Crop> crops = this.cropRepository.findAll(PageRequest.of(pageNumber, pageSize));

        return crops.map(crop -> cropDao.toCropListVO(crop));
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {

        this.cropRepository.deleteById(id);

        return true;
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#save(CropVO)
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
     * @see bw.co.sigmaproduce.crop.CropService#search(String)
     */
    @Override
    @Transactional
    protected Collection<CropListVO> handleSearch(String criteria)
        throws Exception
    {
        Collection<Crop> crop = this.cropDao.findByCriteria(criteria);
        return cropDao.toCropListVOCollection(crop);
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#search(Integer, Integer, String)
     */
    @Override
    protected Page<CropListVO> handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {

        Page<Crop> crops = this.cropDao.findByCriteriaPaged(criteria, pageSize, pageNumber);

        return crops.map(crop -> cropDao.toCropListVO(crop));
    }

    @Override
    protected Collection<CropListVO> handleFindByCropTypes(Set<String> cropTypeIds) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleFindByCropTypes'");
    }

    @Override
    protected Collection<CropListVO> handleFindByIssueType(CropIssueType issueType) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleFindByIssueType'");
    }

    @Override
    protected Collection<Page<CropListVO>> handleFindByCropTypes(Set<String> cropTypeIds, Integer pageNumber,
            Integer pageSize) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleFindByCropTypes'");
    }

}