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
import bw.co.sigmaproduce.crop.variety.CropVarietyDao;
import bw.co.sigmaproduce.crop.variety.CropVarietyRepository;
import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.crop.CropService
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
     * @see bw.co.sigmaproduce.crop.CropService#findById(String)
     */
    @Override
    protected CropVO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  CropVO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.CropService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#getAll()
     */
    @Override
    protected Collection<CropListVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<CropListVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.CropService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#getAll(Integer, Integer)
     */
    @Override
    protected Page<CropListVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<CropListVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.CropService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.CropService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#save(CropVO)
     */
    @Override
    protected CropVO handleSave(CropVO crop)
        throws Exception
    {
        // TODO implement protected  CropVO handleSave(CropVO crop)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.CropService.handleSave(CropVO crop) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#search(String)
     */
    @Override
    protected Collection<CropListVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<CropListVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.CropService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#search(Integer, Integer, String)
     */
    @Override
    protected Page<CropListVO> handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Page<CropListVO> handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.CropService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#findByCropTypes(Set<String>)
     */
    @Override
    protected Collection<CropListVO> handleFindByCropTypes(Set<String> cropTypeIds)
        throws Exception
    {
        // TODO implement protected  Collection<CropListVO> handleFindByCropTypes(Set<String> cropTypeIds)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.CropService.handleFindByCropTypes(Set<String> cropTypeIds) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#findByIssueType(CropIssueType)
     */
    @Override
    protected Collection<CropListVO> handleFindByIssueType(CropIssueType issueType)
        throws Exception
    {
        // TODO implement protected  Collection<CropListVO> handleFindByIssueType(CropIssueType issueType)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.CropService.handleFindByIssueType(CropIssueType issueType) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.CropService#findByCropTypes(Set<String>, Integer, Integer)
     */
    @Override
    protected Collection<Page<CropListVO>> handleFindByCropTypes(Set<String> cropTypeIds, Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Collection<Page<CropListVO>> handleFindByCropTypes(Set<String> cropTypeIds, Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.CropService.handleFindByCropTypes(Set<String> cropTypeIds, Integer pageNumber, Integer pageSize) Not implemented!");
    }

}