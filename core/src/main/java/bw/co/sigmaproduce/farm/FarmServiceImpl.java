// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::farm::FarmService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.farm;

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
 * @see bw.co.sigmaproduce.farm.FarmService
 */
@Service("farmService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class FarmServiceImpl
    extends FarmServiceBase
{
    public FarmServiceImpl(
        FarmDao farmDao,
        FarmRepository farmRepository,
        MessageSource messageSource
    ) {
        
        super(
            farmDao,
            farmRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#findById(String)
     */
    @Override
    protected FarmListDTO handleFindById(String id)
        throws Exception
    {

        Farm farm = this.getFarmRepository().getReferenceById(id);

        return this.getFarmDao().toFarmListDTO(farm);
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#getAll()
     */
    @Override
    protected Collection<FarmListDTO> handleGetAll()
        throws Exception
    {

        Collection<Farm> farms = this.getFarmRepository().findAll();

        return this.getFarmDao().toFarmListDTOCollection(farms);
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#getAll(Integer, Integer)
     */
    @Override
    protected Page<FarmListDTO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {

        Page<Farm> farms = this.getFarmRepository().findAll(PageRequest.of(pageNumber, pageSize));

        return farms.map(farm -> this.getFarmDao().toFarmListDTO(farm));
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
            this.getFarmRepository().deleteById(id);
    
            return true;
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#save(FarmDTO)
     */
    @Override
    protected FarmDTO handleSave(FarmDTO farm)
        throws Exception
    {

            Farm entity = this.getFarmDao().farmDTOToEntity(farm);
    
            entity = this.getFarmRepository().save(entity);
    
            return this.getFarmDao().toFarmDTO(entity);
    }

    private Specification<Farm> getFarmSpecification(FarmCriteria criteria) {
        Specification<Farm> spec = null;

        if(StringUtils.isNotBlank(criteria.getVillage())) {

            spec = SigmaproduceSpecifications.<Farm>findByAttributeContainingIgnoreCase(criteria.getVillage(), "nearestVillage", "name");
        }

        if(StringUtils.isNotBlank(criteria.getId())) {
            Specification<Farm>  tmp = SigmaproduceSpecifications.<Farm>findByAttributeContainingIgnoreCase(criteria.getId(), "id");
            
            spec = spec == null ? tmp : spec.or(tmp);
        }

        if(StringUtils.isNotBlank(criteria.getOwner())) {

            Specification<Farm>  tmp = SigmaproduceSpecifications.<Farm>findByAttributeContainingIgnoreCase(criteria.getOwner(), "owner");

            spec = spec == null ? tmp : spec.or(tmp);

        }

        if(criteria.getMinSize() != null) {

            Specification<Farm>  tmp = SigmaproduceSpecifications.<Farm, Double>findByAttributeGreaterThanEqual(criteria.getMinSize(), "size");

            spec = spec == null ? tmp : spec.or(tmp);

        }

        if(criteria.getMaxSize() != null) {

            Specification<Farm>  tmp = SigmaproduceSpecifications.<Farm, Double>findByAttributeLessThanEqual(criteria.getMaxSize(), "size");

            spec = spec == null ? tmp : spec.or(tmp);

        }

        if(criteria.getUnit() != null) {

            Specification<Farm>  tmp = SigmaproduceSpecifications.<Farm, Unit>findByAttribute(criteria.getUnit(), "sizeUnit");

            spec = spec == null ? tmp : spec.or(tmp);

        }



        return spec;
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#search(FarmCriteria)
     */
    @Override
    protected Collection<FarmListDTO> handleSearch(FarmCriteria criteria)
        throws Exception
    {

        Specification<Farm> spec = this.getFarmSpecification(criteria);

        return this.getFarmDao().toFarmListDTOCollection(this.getFarmRepository().findAll(spec));        
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#search(Integer, Integer, FarmCriteria)
     */
    @Override
    protected Page<FarmListDTO> handleSearch(Integer pageNumber, Integer pageSize, FarmCriteria criteria)
        throws Exception
    {

        Specification<Farm> spec = this.getFarmSpecification(criteria);

        return this.getFarmRepository().findAll(spec, PageRequest.of(pageNumber, pageSize)).map(farm -> this.getFarmDao().toFarmListDTO(farm));       
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#findByVillage(String)
     */
    @Override
    protected FarmListDTO handleFindByVillage(String villageId)
        throws Exception
    {
        Specification<Farm> spec = SigmaproduceSpecifications.<Farm>findByAttributeContainingIgnoreCase(villageId, "nearestVillage", "id");

        return this.getFarmDao().toFarmListDTO(this.getFarmRepository().findOne(spec).get());
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmService#findByDistrict(String)
     */
    @Override
    protected FarmListDTO handleFindByDistrict(String districtId)
        throws Exception
    {

        Specification<Farm> spec = SigmaproduceSpecifications.<Farm>findByAttributeContainingIgnoreCase(districtId, "nearestVillage", "district", "id");

        return this.getFarmDao().toFarmListDTO(this.getFarmRepository().findOne(spec).get());
    }

}