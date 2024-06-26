// license-header java merge-point
//
/**
 * @author Generated by Service.vsl in andromda-java-cartridge on 06/12/2024 19:31:21+0200 Do not modify by hand!
 *
 * TEMPLATE:     Service.vsl in andromda-java-cartridge.
 * MODEL CLASS:  AndroMDAModel::backend::bw.co.sigmaproduce::crop::issue::CropIssueService
 * STEREOTYPE:   Service
 */
package bw.co.sigmaproduce.crop.issue;

import java.util.Collection;
import org.springframework.data.domain.Page;

/**
 * TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService
 */
public interface CropIssueService
{
    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.findById
     * @param id TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.findById(id)
     * @return CropIssueVO
     */
    public CropIssueVO findById(String id);

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.getAll
     * @return Collection<CropIssueVO>
     */
    public Collection<CropIssueVO> getAll();

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.remove
     * @param id TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.remove(id)
     * @return boolean
     */
    public boolean remove(String id);

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.save
     * @param cropIssue TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.save(cropIssue)
     * @return CropIssueVO
     */
    public CropIssueVO save(CropIssueVO cropIssue);

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.search
     * @param criteria TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.search(criteria)
     * @return Collection<CropIssueVO>
     */
    public Collection<CropIssueVO> search(String criteria);

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.searchByType
     * @param type TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.searchByType(type)
     * @return Collection<CropIssueVO>
     */
    public Collection<CropIssueVO> searchByType(CropIssueType type);

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.getAll
     * @param pageNumber TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.getAll(pageNumber)
     * @param pageSize TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.getAll(pageSize)
     * @return Page<CropIssueVO>
     */
    public Page<CropIssueVO> getAll(Integer pageNumber, Integer pageSize);

    /**
     * TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.search
     * @param criteria TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.search(criteria)
     * @param pageNumber TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.search(pageNumber)
     * @param pageSize TODO: Model Documentation for bw.co.sigmaproduce.crop.issue.CropIssueService.search(pageSize)
     * @return Page<CropIssueVO>
     */
    public Page<CropIssueVO> search(String criteria, Integer pageNumber, Integer pageSize);

    /**
     * TODO: Model Documentation for
     * bw.co.sigmaproduce.crop.issue.CropIssueService.searchByTypeAndCrop
     * @param type TODO: Model Documentation for
bw.co.sigmaproduce.crop.issue.CropIssueService.searchByTypeAndCrop(type)
     * @param cropId TODO: Model Documentation for
bw.co.sigmaproduce.crop.issue.CropIssueService.searchByTypeAndCrop(cropId)
     * @param pageNumber TODO: Model Documentation for
bw.co.sigmaproduce.crop.issue.CropIssueService.searchByTypeAndCrop(pageNumber)
     * @param pageSize TODO: Model Documentation for
bw.co.sigmaproduce.crop.issue.CropIssueService.searchByTypeAndCrop(pageSize)
     * @return Page<CropIssueVO>
     */
    public Page<CropIssueVO> searchByTypeAndCrop(CropIssueType type, String cropId, Integer pageNumber, Integer pageSize);

    /**
     * TODO: Model Documentation for
     * bw.co.sigmaproduce.crop.issue.CropIssueService.searchByTypeAndCrop
     * @param type TODO: Model Documentation for
bw.co.sigmaproduce.crop.issue.CropIssueService.searchByTypeAndCrop(type)
     * @param cropId TODO: Model Documentation for
bw.co.sigmaproduce.crop.issue.CropIssueService.searchByTypeAndCrop(cropId)
     * @return Collection<CropIssueVO>
     */
    public Collection<CropIssueVO> searchByTypeAndCrop(CropIssueType type, String cropId);

}