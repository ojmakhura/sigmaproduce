// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on $springUtils.date.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.co.sigmaproduce.district;

import bw.co.sigmaproduce.village.VillageRepository;
import org.springframework.stereotype.Repository;

/**
 * @see District
 */
@Repository("districtDao")
public class DistrictDaoImpl
    extends DistrictDaoBase
{
    
    public DistrictDaoImpl(
        VillageRepository villageRepository,
        DistrictRepository districtRepository
    ) {

        super(
            villageRepository,
            districtRepository
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toDistrictVO(
        District source,
        DistrictVO target)
    {
        // TODO verify behavior of toDistrictVO
        super.toDistrictVO(source, target);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistrictVO toDistrictVO(final District entity)
    {
        // TODO verify behavior of toDistrictVO
        return super.toDistrictVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private District loadDistrictFromDistrictVO(DistrictVO districtVO)
    {
        if (districtVO.getId() == null)
        {
            return  District.Factory.newInstance();
        }
        else
        {
            return this.load(districtVO.getId());
        }
    }

    /**
     * {@inheritDoc}
     */
    public District districtVOToEntity(DistrictVO districtVO)
    {
        // TODO verify behavior of districtVOToEntity
        District entity = this.loadDistrictFromDistrictVO(districtVO);
        this.districtVOToEntity(districtVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void districtVOToEntity(
        DistrictVO source,
        District target,
        boolean copyIfNull)
    {
        // TODO verify behavior of districtVOToEntity
        super.districtVOToEntity(source, target, copyIfNull);
    }
}