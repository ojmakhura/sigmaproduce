// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::crop::issue::CropIssueService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.crop.issue;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bw.co.sigmaproduce.SigmaproduceSpecifications;
import io.micrometer.common.util.StringUtils;

/**
 * @see bw.co.sigmaproduce.crop.issue.CropIssueService
 */
@Service("cropIssueService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class CropIssueServiceImpl
    extends CropIssueServiceBase
{
    public CropIssueServiceImpl(
        CropIssueDao cropIssueDao,
        CropIssueRepository cropIssueRepository,
        MessageSource messageSource
    ) {
        
        super(
            cropIssueDao,
            cropIssueRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#findById(String)
     */
    @Override
    protected CropIssueDTO handleFindById(String id)
        throws Exception
    {

        CropIssue cropIssue = this.getCropIssueRepository().getReferenceById(id);

        return this.getCropIssueDao().toCropIssueDTO(cropIssue);
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#getAll()
     */
    @Override
    protected Collection<CropIssueDTO> handleGetAll()
        throws Exception
    {

        return this.getCropIssueDao().toCropIssueDTOCollection(this.getCropIssueRepository().findAll());
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {

        this.getCropIssueRepository().deleteById(id);
        return true;
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#save(CropIssueDTO)
     */
    @Override
    protected CropIssueDTO handleSave(CropIssueDTO cropIssue)
        throws Exception
    {
            
            CropIssue entity = this.getCropIssueDao().cropIssueDTOToEntity(cropIssue);
    
            entity = this.getCropIssueRepository().save(entity);
    
            return this.getCropIssueDao().toCropIssueDTO(entity);
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#search(String)
     */
    @Override
    protected Collection<CropIssueDTO> handleSearch(String criteria)
        throws Exception
    {

        Specification<CropIssue> spec = null;

        if(StringUtils.isNotBlank(criteria)) {
            spec = SigmaproduceSpecifications.<CropIssue>findByAttributeContainingIgnoreCase(criteria, "name")
                    .or(SigmaproduceSpecifications.findByAttributeContainingIgnoreCase(criteria, "description"));
        }

        return this.getCropIssueDao().toCropIssueDTOCollection(this.getCropIssueRepository().findAll(spec));
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#searchByType(CropIssueType)
     */
    @Override
    protected Collection<CropIssueDTO> handleSearchByType(CropIssueType type)
        throws Exception
    {

        Specification<CropIssue> spec = null;

        if(type != null) {
            spec = SigmaproduceSpecifications.<CropIssue, CropIssueType>findByAttribute(type, "type");
        }

        return this.getCropIssueDao().toCropIssueDTOCollection(this.getCropIssueRepository().findAll(spec));
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#getAll(Integer, Integer)
     */
    @Override
    protected Page<CropIssueDTO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {

        return this.getCropIssueRepository().findAll(PageRequest.of(pageNumber, pageSize)).map(this.getCropIssueDao()::toCropIssueDTO);
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#search(String, Integer, Integer)
     */
    @Override
    protected Page<CropIssueDTO> handleSearch(String criteria, Integer pageNumber, Integer pageSize)
        throws Exception
    {

        Specification<CropIssue> spec = null;

        if(StringUtils.isNotBlank(criteria)) {
            spec = SigmaproduceSpecifications.<CropIssue>findByAttributeContainingIgnoreCase(criteria, "name")
                    .or(SigmaproduceSpecifications.findByAttributeContainingIgnoreCase(criteria, "description"));
        }

        return this.getCropIssueRepository().findAll(spec, PageRequest.of(pageNumber, pageSize)).map(this.getCropIssueDao()::toCropIssueDTO);
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#searchByTypeAndCrop(CropIssueType, String, Integer, Integer)
     */
    @Override
    protected Page<CropIssueDTO> handleSearchByTypeAndCrop(CropIssueType type, String cropId, Integer pageNumber, Integer pageSize)
        throws Exception
    {

        Specification<CropIssue> spec = null;

        if(type != null) {
            spec = SigmaproduceSpecifications.<CropIssue, CropIssueType>findByAttribute(type, "type");
        }

        if(StringUtils.isNotBlank(cropId)) {
            spec = spec.and(SigmaproduceSpecifications.<CropIssue, String>findByAttribute(cropId, "crop", "id"));
        }

        return this.getCropIssueRepository().findAll(spec, PageRequest.of(pageNumber, pageSize)).map(this.getCropIssueDao()::toCropIssueDTO);
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#searchByTypeAndCrop(CropIssueType, String)
     */
    @Override
    protected Collection<CropIssueDTO> handleSearchByTypeAndCrop(CropIssueType type, String cropId)
        throws Exception
    {

        Specification<CropIssue> spec = null;

        if(type != null) {
            spec = SigmaproduceSpecifications.<CropIssue, CropIssueType>findByAttribute(type, "type");
        }

        if(StringUtils.isNotBlank(cropId)) {
            spec = spec.and(SigmaproduceSpecifications.<CropIssue, String>findByAttribute(cropId, "crop", "id"));
        }

        return this.getCropIssueDao().toCropIssueDTOCollection(this.getCropIssueRepository().findAll(spec));
    }

}