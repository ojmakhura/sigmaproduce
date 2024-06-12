// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringRepository.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.farm;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FarmRepository extends 
        JpaRepository<Farm, String>,
        JpaSpecificationExecutor<Farm> {

    // Generating pageable query method for id
    Page<Farm> findByIdNull(Pageable pageable);

    Page<Farm> findByIdStartingWithIgnoreCase(String id, Pageable pageable);
    
    Page<Farm> findByIdEndingWithIgnoreCase(String id, Pageable pageable);
    
    Page<Farm> findByIdContainingIgnoreCase(String id, Pageable pageable);
    
    Page<Farm> findByIdLikeIgnoreCase(String id, Pageable pageable);
    
    Page<Farm> findByIdNotLikeIgnoreCase(String id, Pageable pageable);
    
    Page<Farm> findByIdContaining(String id, Pageable pageable);
    
    // Search by a list of parameters
    List<Farm> findByIdNot(String id);
    Page<Farm> findByIdNot(String id, Pageable pageable);
    
    List<Farm> findByIdIn(List<String> ids);
    Page<Farm> findByIdIn(List<String> ids, Pageable pageable);
    
    List<Farm> findByIdNotIn(List<String> ids);
    Page<Farm> findByIdNotIn(List<String> ids, Pageable pageable);

    // Generating pageable query method for createdBy
    Page<Farm> findByCreatedBy(String createdBy, Pageable pageable);

    Page<Farm> findByCreatedByStartingWithIgnoreCase(String createdBy, Pageable pageable);
    
    Page<Farm> findByCreatedByEndingWithIgnoreCase(String createdBy, Pageable pageable);
    
    Page<Farm> findByCreatedByContainingIgnoreCase(String createdBy, Pageable pageable);
    
    Page<Farm> findByCreatedByLikeIgnoreCase(String createdBy, Pageable pageable);
    
    Page<Farm> findByCreatedByNotLikeIgnoreCase(String createdBy, Pageable pageable);
    
    Page<Farm> findByCreatedByContaining(String createdBy, Pageable pageable);
    
    // Search by a list of parameters
    List<Farm> findByCreatedByNot(String createdBy);
    Page<Farm> findByCreatedByNot(String createdBy, Pageable pageable);
    
    List<Farm> findByCreatedByIn(List<String> createdBys);
    Page<Farm> findByCreatedByIn(List<String> createdBys, Pageable pageable);
    
    List<Farm> findByCreatedByNotIn(List<String> createdBys);
    Page<Farm> findByCreatedByNotIn(List<String> createdBys, Pageable pageable);

    // Generating pageable query method for updatedBy
    Page<Farm> findByUpdatedByNull(Pageable pageable);

    Page<Farm> findByUpdatedByStartingWithIgnoreCase(String updatedBy, Pageable pageable);
    
    Page<Farm> findByUpdatedByEndingWithIgnoreCase(String updatedBy, Pageable pageable);
    
    Page<Farm> findByUpdatedByContainingIgnoreCase(String updatedBy, Pageable pageable);
    
    Page<Farm> findByUpdatedByLikeIgnoreCase(String updatedBy, Pageable pageable);
    
    Page<Farm> findByUpdatedByNotLikeIgnoreCase(String updatedBy, Pageable pageable);
    
    Page<Farm> findByUpdatedByContaining(String updatedBy, Pageable pageable);
    
    // Search by a list of parameters
    List<Farm> findByUpdatedByNot(String updatedBy);
    Page<Farm> findByUpdatedByNot(String updatedBy, Pageable pageable);
    
    List<Farm> findByUpdatedByIn(List<String> updatedBys);
    Page<Farm> findByUpdatedByIn(List<String> updatedBys, Pageable pageable);
    
    List<Farm> findByUpdatedByNotIn(List<String> updatedBys);
    Page<Farm> findByUpdatedByNotIn(List<String> updatedBys, Pageable pageable);

    // Generating pageable query method for updatedDate
    Page<Farm> findByUpdatedDateNull(Pageable pageable);

    Page<Farm> findByUpdatedDateAfter(LocalDateTime updatedDate, Pageable pageable);
    
    Page<Farm> findByUpdatedDateBefore(LocalDateTime updatedDate, Pageable pageable);
    
    Page<Farm> findByUpdatedDateBetween(LocalDateTime updatedDateStart, LocalDateTime updatedDateEnd, Pageable pageable);
    
    // Search by a list of parameters
    List<Farm> findByUpdatedDateNot(LocalDateTime updatedDate);
    Page<Farm> findByUpdatedDateNot(LocalDateTime updatedDate, Pageable pageable);
    
    List<Farm> findByUpdatedDateIn(List<LocalDateTime> updatedDates);
    Page<Farm> findByUpdatedDateIn(List<LocalDateTime> updatedDates, Pageable pageable);
    
    List<Farm> findByUpdatedDateNotIn(List<LocalDateTime> updatedDates);
    Page<Farm> findByUpdatedDateNotIn(List<LocalDateTime> updatedDates, Pageable pageable);

    // Generating pageable query method for createdDate
    Page<Farm> findByCreatedDate(LocalDateTime createdDate, Pageable pageable);

    Page<Farm> findByCreatedDateAfter(LocalDateTime createdDate, Pageable pageable);
    
    Page<Farm> findByCreatedDateBefore(LocalDateTime createdDate, Pageable pageable);
    
    Page<Farm> findByCreatedDateBetween(LocalDateTime createdDateStart, LocalDateTime createdDateEnd, Pageable pageable);
    
    // Search by a list of parameters
    List<Farm> findByCreatedDateNot(LocalDateTime createdDate);
    Page<Farm> findByCreatedDateNot(LocalDateTime createdDate, Pageable pageable);
    
    List<Farm> findByCreatedDateIn(List<LocalDateTime> createdDates);
    Page<Farm> findByCreatedDateIn(List<LocalDateTime> createdDates, Pageable pageable);
    
    List<Farm> findByCreatedDateNotIn(List<LocalDateTime> createdDates);
    Page<Farm> findByCreatedDateNotIn(List<LocalDateTime> createdDates, Pageable pageable);

    // Generating pageable query method for name
    Page<Farm> findByName(String name, Pageable pageable);

    Page<Farm> findByNameStartingWithIgnoreCase(String name, Pageable pageable);
    
    Page<Farm> findByNameEndingWithIgnoreCase(String name, Pageable pageable);
    
    Page<Farm> findByNameContainingIgnoreCase(String name, Pageable pageable);
    
    Page<Farm> findByNameLikeIgnoreCase(String name, Pageable pageable);
    
    Page<Farm> findByNameNotLikeIgnoreCase(String name, Pageable pageable);
    
    Page<Farm> findByNameContaining(String name, Pageable pageable);
    
    // Search by a list of parameters
    List<Farm> findByNameNot(String name);
    Page<Farm> findByNameNot(String name, Pageable pageable);
    
    List<Farm> findByNameIn(List<String> names);
    Page<Farm> findByNameIn(List<String> names, Pageable pageable);
    
    List<Farm> findByNameNotIn(List<String> names);
    Page<Farm> findByNameNotIn(List<String> names, Pageable pageable);

    // Generating pageable query method for ownerId
    Page<Farm> findByOwnerId(String ownerId, Pageable pageable);

    Page<Farm> findByOwnerIdStartingWithIgnoreCase(String ownerId, Pageable pageable);
    
    Page<Farm> findByOwnerIdEndingWithIgnoreCase(String ownerId, Pageable pageable);
    
    Page<Farm> findByOwnerIdContainingIgnoreCase(String ownerId, Pageable pageable);
    
    Page<Farm> findByOwnerIdLikeIgnoreCase(String ownerId, Pageable pageable);
    
    Page<Farm> findByOwnerIdNotLikeIgnoreCase(String ownerId, Pageable pageable);
    
    Page<Farm> findByOwnerIdContaining(String ownerId, Pageable pageable);
    
    // Search by a list of parameters
    List<Farm> findByOwnerIdNot(String ownerId);
    Page<Farm> findByOwnerIdNot(String ownerId, Pageable pageable);
    
    List<Farm> findByOwnerIdIn(List<String> ownerIds);
    Page<Farm> findByOwnerIdIn(List<String> ownerIds, Pageable pageable);
    
    List<Farm> findByOwnerIdNotIn(List<String> ownerIds);
    Page<Farm> findByOwnerIdNotIn(List<String> ownerIds, Pageable pageable);

    // Generating pageable query method for latitude
    Page<Farm> findByLatitudeNull(Pageable pageable);

    Page<Farm> findByLatitudeLessThanEqual(Double latitude, Pageable pageable);
    
    Page<Farm> findByLatitudeGreaterThanEqual(Double latitude, Pageable pageable);
    
    Page<Farm> findByLatitudeLessThan(Double latitude, Pageable pageable);
    
    Page<Farm> findByLatitudeGreaterThan(Double latitude, Pageable pageable);
    
    Page<Farm> findByLatitudeBetween(Double latitudeStart, Double latitudeEnd, Pageable pageable);
    
    // Search by a list of parameters
    List<Farm> findByLatitudeNot(Double latitude);
    Page<Farm> findByLatitudeNot(Double latitude, Pageable pageable);
    
    List<Farm> findByLatitudeIn(List<Double> latitudes);
    Page<Farm> findByLatitudeIn(List<Double> latitudes, Pageable pageable);
    
    List<Farm> findByLatitudeNotIn(List<Double> latitudes);
    Page<Farm> findByLatitudeNotIn(List<Double> latitudes, Pageable pageable);

    // Generating pageable query method for longitude
    Page<Farm> findByLongitudeNull(Pageable pageable);

    Page<Farm> findByLongitudeLessThanEqual(Double longitude, Pageable pageable);
    
    Page<Farm> findByLongitudeGreaterThanEqual(Double longitude, Pageable pageable);
    
    Page<Farm> findByLongitudeLessThan(Double longitude, Pageable pageable);
    
    Page<Farm> findByLongitudeGreaterThan(Double longitude, Pageable pageable);
    
    Page<Farm> findByLongitudeBetween(Double longitudeStart, Double longitudeEnd, Pageable pageable);
    
    // Search by a list of parameters
    List<Farm> findByLongitudeNot(Double longitude);
    Page<Farm> findByLongitudeNot(Double longitude, Pageable pageable);
    
    List<Farm> findByLongitudeIn(List<Double> longitudes);
    Page<Farm> findByLongitudeIn(List<Double> longitudes, Pageable pageable);
    
    List<Farm> findByLongitudeNotIn(List<Double> longitudes);
    Page<Farm> findByLongitudeNotIn(List<Double> longitudes, Pageable pageable);

    // Generating pageable query method for description
    Page<Farm> findByDescriptionNull(Pageable pageable);

    Page<Farm> findByDescriptionStartingWithIgnoreCase(String description, Pageable pageable);
    
    Page<Farm> findByDescriptionEndingWithIgnoreCase(String description, Pageable pageable);
    
    Page<Farm> findByDescriptionContainingIgnoreCase(String description, Pageable pageable);
    
    Page<Farm> findByDescriptionLikeIgnoreCase(String description, Pageable pageable);
    
    Page<Farm> findByDescriptionNotLikeIgnoreCase(String description, Pageable pageable);
    
    Page<Farm> findByDescriptionContaining(String description, Pageable pageable);
    
    // Search by a list of parameters
    List<Farm> findByDescriptionNot(String description);
    Page<Farm> findByDescriptionNot(String description, Pageable pageable);
    
    List<Farm> findByDescriptionIn(List<String> descriptions);
    Page<Farm> findByDescriptionIn(List<String> descriptions, Pageable pageable);
    
    List<Farm> findByDescriptionNotIn(List<String> descriptions);
    Page<Farm> findByDescriptionNotIn(List<String> descriptions, Pageable pageable);

    // Generating pageable query method for size
    Page<Farm> findBySizeNull(Pageable pageable);

    Page<Farm> findBySizeLessThanEqual(Double size, Pageable pageable);
    
    Page<Farm> findBySizeGreaterThanEqual(Double size, Pageable pageable);
    
    Page<Farm> findBySizeLessThan(Double size, Pageable pageable);
    
    Page<Farm> findBySizeGreaterThan(Double size, Pageable pageable);
    
    Page<Farm> findBySizeBetween(Double sizeStart, Double sizeEnd, Pageable pageable);
    
    // Search by a list of parameters
    List<Farm> findBySizeNot(Double size);
    Page<Farm> findBySizeNot(Double size, Pageable pageable);
    
    List<Farm> findBySizeIn(List<Double> sizes);
    Page<Farm> findBySizeIn(List<Double> sizes, Pageable pageable);
    
    List<Farm> findBySizeNotIn(List<Double> sizes);
    Page<Farm> findBySizeNotIn(List<Double> sizes, Pageable pageable);

    // Generating pageable query method for unit
    Page<Farm> findByUnitNull(Pageable pageable);

    // Search by a list of parameters
    List<Farm> findByUnitNot(Unit unit);
    Page<Farm> findByUnitNot(Unit unit, Pageable pageable);
    
    List<Farm> findByUnitIn(List<Unit> units);
    Page<Farm> findByUnitIn(List<Unit> units, Pageable pageable);
    
    List<Farm> findByUnitNotIn(List<Unit> units);
    Page<Farm> findByUnitNotIn(List<Unit> units, Pageable pageable);

    // Search by a list of parameters
    List<Farm> findByPhotosNot(File photos);
    Page<Farm> findByPhotosNot(File photos, Pageable pageable);
    
    List<Farm> findByPhotosIn(List<File> photoss);
    Page<Farm> findByPhotosIn(List<File> photoss, Pageable pageable);
    
    List<Farm> findByPhotosNotIn(List<File> photoss);
    Page<Farm> findByPhotosNotIn(List<File> photoss, Pageable pageable);

}