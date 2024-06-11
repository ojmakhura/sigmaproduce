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

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bw.co.sigmaproduce.SigmaproduceSpecifications;

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

        Village village = this.getVillageRepository().getReferenceById(id);

        return this.getVillageDao().toVillageVO(village);
    }

    /**
     * @see bw.co.sigmaproduce.village.VillageService#getAll()
     */
    @Override
    protected Collection<VillageVO> handleGetAll()
        throws Exception
    {

        Collection<Village> all = this.getVillageRepository().findAll();

        return this.getVillageDao().toVillageVOCollection(all);
    }

    /**
     * @see bw.co.sigmaproduce.village.VillageService#save(VillageVO)
     */
    @Override
    protected VillageVO handleSave(VillageVO village)
        throws Exception
    {

        Village entity = this.getVillageDao().villageVOToEntity(village);
        entity = this.getVillageRepository().save(entity);

        return this.getVillageDao().toVillageVO(entity);
    }

    /**
     * @see bw.co.sigmaproduce.village.VillageService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
            
            this.villageRepository.deleteById(id);
    
            return true;
    }

    /**
     * @see bw.co.sigmaproduce.village.VillageService#search(String)
     */
    @Override
    protected Collection<VillageVO> handleSearch(String criteria)
        throws Exception
    {
        Specification<Village> spec = null;

        if(StringUtils.isNotBlank(criteria)) {
            spec = SigmaproduceSpecifications.<Village>findByAttributeLikeIgnoreCase(criteria, "name")
                    .or(SigmaproduceSpecifications.findByAttributeLikeIgnoreCase(criteria, "district", "name"));
        }

        Collection<Village> all = this.getVillageRepository().findAll(spec);

        return this.getVillageDao().toVillageVOCollection(all);
    }

    @Override
    protected VillageVO handleGetDistrictVillages(String districtId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleGetDistrictVillages'");
    }

}