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
import bw.co.sigmaproduce.crop.CropListVO;
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
    protected DistrictVO handleFindById(Long id)
        throws Exception
    {

        District district = this.getDistrictRepository().getReferenceById(id);

        return this.getDistrictDao().toDistrictVO(district);
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#getAll()
     */
    @Override
    protected Collection<DistrictVO> handleGetAll()
        throws Exception
    {

        return this.getDistrictDao().toDistrictVOCollection(this.getDistrictRepository().findAll());
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#save(DistrictVO)
     */
    @Override
    protected DistrictVO handleSave(DistrictVO district)
        throws Exception
    {

        District entity = this.getDistrictDao().districtVOToEntity(district);

        entity = this.getDistrictRepository().save(entity);

        return this.getDistrictDao().toDistrictVO(entity);
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        this.getDistrictRepository().deleteById(id);
        return true;
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#search(String)
     */
    @Override
    protected Collection<DistrictVO> handleSearch(String criteria)
        throws Exception
    {
        Specification<District> spec = null;

        if(StringUtils.isNotBlank(criteria)) {
            spec = SigmaproduceSpecifications.findByAttributeLikeIgnoreCase(criteria, "name");
        }

        return this.getDistrictDao().toDistrictVOCollection(this.getDistrictRepository().findAll(spec));
    }

}