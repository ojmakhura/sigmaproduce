// license-header java merge-point
//
/**
 * @author Generated by Service.vsl in andromda-java-cartridge on 06/12/2024 19:31:21+0200 Do not modify by hand!
 *
 * TEMPLATE:     Service.vsl in andromda-java-cartridge.
 * MODEL CLASS:  AndroMDAModel::backend::bw.co.sigmaproduce::village::VillageService
 * STEREOTYPE:   Service
 */
package bw.co.sigmaproduce.village;

import java.util.Collection;

/**
 * TODO: Model Documentation for bw.co.sigmaproduce.village.VillageService
 */
public interface VillageService
{
    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.village.VillageService.findById
     * @param id TODO: Model Documentation for bw.co.sigmaproduce.village.VillageService.findById(id)
     * @return VillageVO
     */
    public VillageVO findById(Long id);

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.village.VillageService.getAll
     * @return Collection<VillageVO>
     */
    public Collection<VillageVO> getAll();

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.village.VillageService.save
     * @param village TODO: Model Documentation for bw.co.sigmaproduce.village.VillageService.save(village)
     * @return VillageVO
     */
    public VillageVO save(VillageVO village);

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.village.VillageService.remove
     * @param id TODO: Model Documentation for bw.co.sigmaproduce.village.VillageService.remove(id)
     * @return boolean
     */
    public boolean remove(Long id);

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.village.VillageService.search
     * @param criteria TODO: Model Documentation for bw.co.sigmaproduce.village.VillageService.search(criteria)
     * @return Collection<VillageVO>
     */
    public Collection<VillageVO> search(String criteria);

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.village.VillageService.getDistrictVillages
     * @param districtId TODO: Model Documentation for
bw.co.sigmaproduce.village.VillageService.getDistrictVillages(districtId)
     * @return VillageVO
     */
    public VillageVO getDistrictVillages(String districtId);

}