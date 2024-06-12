// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringRepository.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.farm.cultivation.harvest;

import java.io.File;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HarvestRepository extends 
        JpaRepository<Harvest, String>,
        JpaSpecificationExecutor<Harvest> {

    // Generating pageable query method for id
    Page<Harvest> findByIdNull(Pageable pageable);

    Page<Harvest> findByIdStartingWithIgnoreCase(String id, Pageable pageable);
    
    Page<Harvest> findByIdEndingWithIgnoreCase(String id, Pageable pageable);
    
    Page<Harvest> findByIdContainingIgnoreCase(String id, Pageable pageable);
    
    Page<Harvest> findByIdLikeIgnoreCase(String id, Pageable pageable);
    
    Page<Harvest> findByIdNotLikeIgnoreCase(String id, Pageable pageable);
    
    Page<Harvest> findByIdContaining(String id, Pageable pageable);
    
    // Search by a list of parameters
    List<Harvest> findByIdNot(String id);
    Page<Harvest> findByIdNot(String id, Pageable pageable);
    
    List<Harvest> findByIdIn(List<String> ids);
    Page<Harvest> findByIdIn(List<String> ids, Pageable pageable);
    
    List<Harvest> findByIdNotIn(List<String> ids);
    Page<Harvest> findByIdNotIn(List<String> ids, Pageable pageable);

    // Generating pageable query method for createdBy
    Page<Harvest> findByCreatedBy(String createdBy, Pageable pageable);

    Page<Harvest> findByCreatedByStartingWithIgnoreCase(String createdBy, Pageable pageable);
    
    Page<Harvest> findByCreatedByEndingWithIgnoreCase(String createdBy, Pageable pageable);
    
    Page<Harvest> findByCreatedByContainingIgnoreCase(String createdBy, Pageable pageable);
    
    Page<Harvest> findByCreatedByLikeIgnoreCase(String createdBy, Pageable pageable);
    
    Page<Harvest> findByCreatedByNotLikeIgnoreCase(String createdBy, Pageable pageable);
    
    Page<Harvest> findByCreatedByContaining(String createdBy, Pageable pageable);
    
    // Search by a list of parameters
    List<Harvest> findByCreatedByNot(String createdBy);
    Page<Harvest> findByCreatedByNot(String createdBy, Pageable pageable);
    
    List<Harvest> findByCreatedByIn(List<String> createdBys);
    Page<Harvest> findByCreatedByIn(List<String> createdBys, Pageable pageable);
    
    List<Harvest> findByCreatedByNotIn(List<String> createdBys);
    Page<Harvest> findByCreatedByNotIn(List<String> createdBys, Pageable pageable);

    // Generating pageable query method for harvestDate
    Page<Harvest> findByHarvestDate(LocalDate harvestDate, Pageable pageable);

    Page<Harvest> findByHarvestDateAfter(LocalDate harvestDate, Pageable pageable);
    
    Page<Harvest> findByHarvestDateBefore(LocalDate harvestDate, Pageable pageable);
    
    Page<Harvest> findByHarvestDateBetween(LocalDate harvestDateStart, LocalDate harvestDateEnd, Pageable pageable);
    
    // Search by a list of parameters
    List<Harvest> findByHarvestDateNot(LocalDate harvestDate);
    Page<Harvest> findByHarvestDateNot(LocalDate harvestDate, Pageable pageable);
    
    List<Harvest> findByHarvestDateIn(List<LocalDate> harvestDates);
    Page<Harvest> findByHarvestDateIn(List<LocalDate> harvestDates, Pageable pageable);
    
    List<Harvest> findByHarvestDateNotIn(List<LocalDate> harvestDates);
    Page<Harvest> findByHarvestDateNotIn(List<LocalDate> harvestDates, Pageable pageable);

    // Generating pageable query method for quantity
    Page<Harvest> findByQuantityNull(Pageable pageable);

    Page<Harvest> findByQuantityLessThanEqual(Integer quantity, Pageable pageable);
    
    Page<Harvest> findByQuantityGreaterThanEqual(Integer quantity, Pageable pageable);
    
    Page<Harvest> findByQuantityLessThan(Integer quantity, Pageable pageable);
    
    Page<Harvest> findByQuantityGreaterThan(Integer quantity, Pageable pageable);
    
    Page<Harvest> findByQuantityBetween(Integer quantityStart, Integer quantityEnd, Pageable pageable);
    
    // Search by a list of parameters
    List<Harvest> findByQuantityNot(Integer quantity);
    Page<Harvest> findByQuantityNot(Integer quantity, Pageable pageable);
    
    List<Harvest> findByQuantityIn(List<Integer> quantitys);
    Page<Harvest> findByQuantityIn(List<Integer> quantitys, Pageable pageable);
    
    List<Harvest> findByQuantityNotIn(List<Integer> quantitys);
    Page<Harvest> findByQuantityNotIn(List<Integer> quantitys, Pageable pageable);

    // Generating pageable query method for unit
    Page<Harvest> findByUnit(HarvestUnit unit, Pageable pageable);

    // Search by a list of parameters
    List<Harvest> findByUnitNot(HarvestUnit unit);
    Page<Harvest> findByUnitNot(HarvestUnit unit, Pageable pageable);
    
    List<Harvest> findByUnitIn(List<HarvestUnit> units);
    Page<Harvest> findByUnitIn(List<HarvestUnit> units, Pageable pageable);
    
    List<Harvest> findByUnitNotIn(List<HarvestUnit> units);
    Page<Harvest> findByUnitNotIn(List<HarvestUnit> units, Pageable pageable);

    // Search by a list of parameters
    List<Harvest> findByImagesNot(File images);
    Page<Harvest> findByImagesNot(File images, Pageable pageable);
    
    List<Harvest> findByImagesIn(List<File> imagess);
    Page<Harvest> findByImagesIn(List<File> imagess, Pageable pageable);
    
    List<Harvest> findByImagesNotIn(List<File> imagess);
    Page<Harvest> findByImagesNotIn(List<File> imagess, Pageable pageable);

}