// license-header java merge-point
//
/**
 * @author Generated by Service.vsl in andromda-java-cartridge on 06/12/2024 19:31:21+0200 Do not modify by hand!
 *
 * TEMPLATE:     Service.vsl in andromda-java-cartridge.
 * MODEL CLASS:  AndroMDAModel::backend::bw.co.sigmaproduce::farm::cultivation::problem::CultivationProblemService
 * STEREOTYPE:   Service
 */
package bw.co.sigmaproduce.farm.cultivation.problem;

import java.util.Collection;
import org.springframework.data.domain.Page;

/**
 * TODO: Model Documentation for
 * bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService
 */
public interface CultivationProblemService
{
    /**
     * TODO: Model Documentation for
     * bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.findById
     * @param id TODO: Model Documentation for
bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.findById(id)
     * @return CultivationProblemVO
     */
    public CultivationProblemVO findById(String id);

    /**
     * TODO: Model Documentation for
     * bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.getAll
     * @return Collection<CultivationProblemListVO>
     */
    public Collection<CultivationProblemListVO> getAll();

    /**
     * TODO: Model Documentation for
     * bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.remove
     * @param id TODO: Model Documentation for
bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.remove(id)
     * @return boolean
     */
    public boolean remove(String id);

    /**
     * TODO: Model Documentation for
     * bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.save
     * @param cultivationProblem TODO: Model Documentation for
bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.save(cultivationProblem)
     * @return CultivationProblemVO
     */
    public CultivationProblemVO save(CultivationProblemVO cultivationProblem);

    /**
     * TODO: Model Documentation for
     * bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.search
     * @param criteria TODO: Model Documentation for
bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.search(criteria)
     * @return Collection<CultivationProblemListVO>
     */
    public Collection<CultivationProblemListVO> search(String criteria);

    /**
     * TODO: Model Documentation for
     * bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.search
     * @param pageNumber TODO: Model Documentation for
bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.search(pageNumber)
     * @param pageSize TODO: Model Documentation for
bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.search(pageSize)
     * @param criteria TODO: Model Documentation for
bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.search(criteria)
     * @return Page<CultivationProblemListVO>
     */
    public Page<CultivationProblemListVO> search(Integer pageNumber, Integer pageSize, String criteria);

    /**
     * TODO: Model Documentation for
     * bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.getAll
     * @param pageNumber TODO: Model Documentation for
bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.getAll(pageNumber)
     * @param pageSize TODO: Model Documentation for
bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemService.getAll(pageSize)
     * @return Page<CultivationProblemListVO>
     */
    public Page<CultivationProblemListVO> getAll(Integer pageNumber, Integer pageSize);

}