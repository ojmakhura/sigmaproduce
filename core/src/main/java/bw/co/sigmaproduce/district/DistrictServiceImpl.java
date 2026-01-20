// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::district::DistrictService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.district;

import bw.co.sigmaproduce.SigmaproduceSpecifications;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.district.DistrictService
 */
@Service("districtService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class DistrictServiceImpl
    extends DistrictServiceBase
{
    public DistrictServiceImpl(
        DistrictDao districtDao,
        DistrictRepository districtRepository,
        MessageSource messageSource
    ) {
        
        super(
            districtDao,
            districtRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#findById(Long)
     */
    @Override
    protected DistrictDTO handleFindById(String id)
        throws Exception
    {

        District district = this.getDistrictRepository().getReferenceById(id);

        return this.getDistrictDao().toDistrictDTO(district);
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#getAll()
     */
    @Override
    protected Collection<DistrictDTO> handleGetAll()
        throws Exception
    {

        return this.getDistrictDao().toDistrictDTOCollection(this.getDistrictRepository().findAll());
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#save(DistrictDTO)
     */
    @Override
    protected DistrictDTO handleSave(DistrictDTO district)
        throws Exception
    {

        District entity = this.getDistrictDao().districtDTOToEntity(district);

        entity = this.getDistrictRepository().save(entity);

        return this.getDistrictDao().toDistrictDTO(entity);
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#remove(Long)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        this.getDistrictRepository().deleteById(id);
        return true;
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#search(String)
     */
    @Override
    protected Collection<DistrictDTO> handleSearch(String criteria)
        throws Exception
    {
        Specification<District> spec = (root, query, builder) -> builder.conjunction();

        if(StringUtils.isNotBlank(criteria)) {
            spec = SigmaproduceSpecifications.findByAttributeLikeIgnoreCase(criteria, "name");
        }

        return this.getDistrictDao().toDistrictDTOCollection(this.getDistrictRepository().findAll(spec));
    }

}