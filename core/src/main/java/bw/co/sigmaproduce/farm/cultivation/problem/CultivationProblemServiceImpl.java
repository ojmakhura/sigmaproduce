// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::farm::cultivation::problem::CultivationProblemService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.farm.cultivation.problem;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService
 */
@Service("cultivationProblemService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class CultivationProblemServiceImpl
    extends CultivationProblemServiceBase
{
    public CultivationProblemServiceImpl(
        CultivationProblemDao cultivationProblemDao,
        CultivationProblemRepository cultivationProblemRepository,
        MessageSource messageSource
    ) {
        
        super(
            cultivationProblemDao,
            cultivationProblemRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService#findById(String)
     */
    @Override
    protected CultivationProblemVO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  CultivationProblemVO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService#getAll()
     */
    @Override
    protected Collection<CultivationProblemListVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<CultivationProblemListVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService#save(CultivationProblemVO)
     */
    @Override
    protected CultivationProblemVO handleSave(CultivationProblemVO cultivationProblem)
        throws Exception
    {
        // TODO implement protected  CultivationProblemVO handleSave(CultivationProblemVO cultivationProblem)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.handleSave(CultivationProblemVO cultivationProblem) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService#search(String)
     */
    @Override
    protected Collection<CultivationProblemListVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<CultivationProblemListVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService#search(Integer, Integer, String)
     */
    @Override
    protected Page<CultivationProblemListVO> handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Page<CultivationProblemListVO> handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService#getAll(Integer, Integer)
     */
    @Override
    protected Page<CultivationProblemListVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<CultivationProblemListVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

}