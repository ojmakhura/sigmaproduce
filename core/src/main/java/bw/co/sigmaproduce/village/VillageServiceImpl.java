// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::village::VillageService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.village;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.village.VillageService
 */
@Service("villageService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class VillageServiceImpl
    extends VillageServiceBase
{
    public VillageServiceImpl(
        VillageDao villageDao,
        VillageRepository villageRepository,
        MessageSource messageSource
    ) {
        
        super(
            villageDao,
            villageRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.village.VillageService#findById(Long)
     */
    @Override
    protected VillageVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  VillageVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.village.VillageService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.village.VillageService#getAll()
     */
    @Override
    protected Collection<VillageVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<VillageVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.village.VillageService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.village.VillageService#save(VillageVO)
     */
    @Override
    protected VillageVO handleSave(VillageVO village)
        throws Exception
    {
        // TODO implement protected  VillageVO handleSave(VillageVO village)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.village.VillageService.handleSave(VillageVO village) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.village.VillageService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.village.VillageService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.village.VillageService#search(String)
     */
    @Override
    protected Collection<VillageVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<VillageVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.village.VillageService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.village.VillageService#getDistrictVillages(String)
     */
    @Override
    protected VillageVO handleGetDistrictVillages(String districtId)
        throws Exception
    {
        // TODO implement protected  VillageVO handleGetDistrictVillages(String districtId)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.village.VillageService.handleGetDistrictVillages(String districtId) Not implemented!");
    }

}