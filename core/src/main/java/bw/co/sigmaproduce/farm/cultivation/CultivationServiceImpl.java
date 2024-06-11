// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::farm::cultivation::CultivationService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.farm.cultivation;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.farm.cultivation.CultivationService
 */
@Service("cultivationService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class CultivationServiceImpl
    extends CultivationServiceBase
{
    public CultivationServiceImpl(
        CultivationDao cultivationDao,
        CultivationRepository cultivationRepository,
        MessageSource messageSource
    ) {
        
        super(
            cultivationDao,
            cultivationRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.CultivationService#findById(String)
     */
    @Override
    protected CultivationVO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  CultivationVO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.CultivationService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.CultivationService#getAll()
     */
    @Override
    protected Collection<CultivationListVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<CultivationListVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.CultivationService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.CultivationService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.CultivationService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.CultivationService#save(CultivationVO)
     */
    @Override
    protected CultivationVO handleSave(CultivationVO cultivation)
        throws Exception
    {
        // TODO implement protected  CultivationVO handleSave(CultivationVO cultivation)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.CultivationService.handleSave(CultivationVO cultivation) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.CultivationService#search(CultivationCriteria)
     */
    @Override
    protected Collection<CultivationListVO> handleSearch(CultivationCriteria criteria)
        throws Exception
    {
        // TODO implement protected  Collection<CultivationListVO> handleSearch(CultivationCriteria criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.CultivationService.handleSearch(CultivationCriteria criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.CultivationService#search(Integer, Integer, CultivationCriteria)
     */
    @Override
    protected Page<CultivationListVO> handleSearch(Integer pageNumber, Integer pageSize, CultivationCriteria criteria)
        throws Exception
    {
        // TODO implement protected  Page<CultivationListVO> handleSearch(Integer pageNumber, Integer pageSize, CultivationCriteria criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.CultivationService.handleSearch(Integer pageNumber, Integer pageSize, CultivationCriteria criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.cultivation.CultivationService#getAll(Integer, Integer)
     */
    @Override
    protected Page<CultivationListVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<CultivationListVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.cultivation.CultivationService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

}