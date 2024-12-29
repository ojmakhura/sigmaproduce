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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
    protected CropIssueVO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  CropIssueVO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.issue.CropIssueService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#getAll()
     */
    @Override
    protected Collection<CropIssueVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<CropIssueVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.issue.CropIssueService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.issue.CropIssueService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#save(CropIssueVO)
     */
    @Override
    protected CropIssueVO handleSave(CropIssueVO cropIssue)
        throws Exception
    {
        // TODO implement protected  CropIssueVO handleSave(CropIssueVO cropIssue)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.issue.CropIssueService.handleSave(CropIssueVO cropIssue) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#search(String)
     */
    @Override
    protected Collection<CropIssueVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<CropIssueVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.issue.CropIssueService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#searchByType(CropIssueType)
     */
    @Override
    protected Collection<CropIssueVO> handleSearchByType(CropIssueType type)
        throws Exception
    {
        // TODO implement protected  Collection<CropIssueVO> handleSearchByType(CropIssueType type)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.issue.CropIssueService.handleSearchByType(CropIssueType type) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#getAll(Integer, Integer)
     */
    @Override
    protected Page<CropIssueVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<CropIssueVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.issue.CropIssueService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#search(String, Integer, Integer)
     */
    @Override
    protected Page<CropIssueVO> handleSearch(String criteria, Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<CropIssueVO> handleSearch(String criteria, Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.issue.CropIssueService.handleSearch(String criteria, Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#searchByTypeAndCrop(CropIssueType, String, Integer, Integer)
     */
    @Override
    protected Page<CropIssueVO> handleSearchByTypeAndCrop(CropIssueType type, String cropId, Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<CropIssueVO> handleSearchByTypeAndCrop(CropIssueType type, String cropId, Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.issue.CropIssueService.handleSearchByTypeAndCrop(CropIssueType type, String cropId, Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueService#searchByTypeAndCrop(CropIssueType, String)
     */
    @Override
    protected Collection<CropIssueVO> handleSearchByTypeAndCrop(CropIssueType type, String cropId)
        throws Exception
    {
        // TODO implement protected  Collection<CropIssueVO> handleSearchByTypeAndCrop(CropIssueType type, String cropId)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.crop.issue.CropIssueService.handleSearchByTypeAndCrop(CropIssueType type, String cropId) Not implemented!");
    }

}