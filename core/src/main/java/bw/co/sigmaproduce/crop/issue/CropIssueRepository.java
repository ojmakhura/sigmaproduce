// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringRepository.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.crop.issue;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CropIssueRepository extends 
        JpaRepository<CropIssue, String>,
        JpaSpecificationExecutor<CropIssue> {

    // Generating pageable query method for id
    Page<CropIssue> findByIdNull(Pageable pageable);

    Page<CropIssue> findByIdStartingWithIgnoreCase(String id, Pageable pageable);
    
    Page<CropIssue> findByIdEndingWithIgnoreCase(String id, Pageable pageable);
    
    Page<CropIssue> findByIdContainingIgnoreCase(String id, Pageable pageable);
    
    Page<CropIssue> findByIdLikeIgnoreCase(String id, Pageable pageable);
    
    Page<CropIssue> findByIdNotLikeIgnoreCase(String id, Pageable pageable);
    
    Page<CropIssue> findByIdContaining(String id, Pageable pageable);
    
    // Search by a list of parameters
    List<CropIssue> findByIdNot(String id);
    Page<CropIssue> findByIdNot(String id, Pageable pageable);
    
    List<CropIssue> findByIdIn(List<String> ids);
    Page<CropIssue> findByIdIn(List<String> ids, Pageable pageable);
    
    List<CropIssue> findByIdNotIn(List<String> ids);
    Page<CropIssue> findByIdNotIn(List<String> ids, Pageable pageable);

    // Generating pageable query method for createdBy
    Page<CropIssue> findByCreatedBy(String createdBy, Pageable pageable);

    Page<CropIssue> findByCreatedByStartingWithIgnoreCase(String createdBy, Pageable pageable);
    
    Page<CropIssue> findByCreatedByEndingWithIgnoreCase(String createdBy, Pageable pageable);
    
    Page<CropIssue> findByCreatedByContainingIgnoreCase(String createdBy, Pageable pageable);
    
    Page<CropIssue> findByCreatedByLikeIgnoreCase(String createdBy, Pageable pageable);
    
    Page<CropIssue> findByCreatedByNotLikeIgnoreCase(String createdBy, Pageable pageable);
    
    Page<CropIssue> findByCreatedByContaining(String createdBy, Pageable pageable);
    
    // Search by a list of parameters
    List<CropIssue> findByCreatedByNot(String createdBy);
    Page<CropIssue> findByCreatedByNot(String createdBy, Pageable pageable);
    
    List<CropIssue> findByCreatedByIn(List<String> createdBys);
    Page<CropIssue> findByCreatedByIn(List<String> createdBys, Pageable pageable);
    
    List<CropIssue> findByCreatedByNotIn(List<String> createdBys);
    Page<CropIssue> findByCreatedByNotIn(List<String> createdBys, Pageable pageable);

    // Generating pageable query method for updatedBy
    Page<CropIssue> findByUpdatedByNull(Pageable pageable);

    Page<CropIssue> findByUpdatedByStartingWithIgnoreCase(String updatedBy, Pageable pageable);
    
    Page<CropIssue> findByUpdatedByEndingWithIgnoreCase(String updatedBy, Pageable pageable);
    
    Page<CropIssue> findByUpdatedByContainingIgnoreCase(String updatedBy, Pageable pageable);
    
    Page<CropIssue> findByUpdatedByLikeIgnoreCase(String updatedBy, Pageable pageable);
    
    Page<CropIssue> findByUpdatedByNotLikeIgnoreCase(String updatedBy, Pageable pageable);
    
    Page<CropIssue> findByUpdatedByContaining(String updatedBy, Pageable pageable);
    
    // Search by a list of parameters
    List<CropIssue> findByUpdatedByNot(String updatedBy);
    Page<CropIssue> findByUpdatedByNot(String updatedBy, Pageable pageable);
    
    List<CropIssue> findByUpdatedByIn(List<String> updatedBys);
    Page<CropIssue> findByUpdatedByIn(List<String> updatedBys, Pageable pageable);
    
    List<CropIssue> findByUpdatedByNotIn(List<String> updatedBys);
    Page<CropIssue> findByUpdatedByNotIn(List<String> updatedBys, Pageable pageable);

    // Generating pageable query method for updatedDate
    Page<CropIssue> findByUpdatedDateNull(Pageable pageable);

    Page<CropIssue> findByUpdatedDateAfter(LocalDateTime updatedDate, Pageable pageable);
    
    Page<CropIssue> findByUpdatedDateBefore(LocalDateTime updatedDate, Pageable pageable);
    
    Page<CropIssue> findByUpdatedDateBetween(LocalDateTime updatedDateStart, LocalDateTime updatedDateEnd, Pageable pageable);
    
    // Search by a list of parameters
    List<CropIssue> findByUpdatedDateNot(LocalDateTime updatedDate);
    Page<CropIssue> findByUpdatedDateNot(LocalDateTime updatedDate, Pageable pageable);
    
    List<CropIssue> findByUpdatedDateIn(List<LocalDateTime> updatedDates);
    Page<CropIssue> findByUpdatedDateIn(List<LocalDateTime> updatedDates, Pageable pageable);
    
    List<CropIssue> findByUpdatedDateNotIn(List<LocalDateTime> updatedDates);
    Page<CropIssue> findByUpdatedDateNotIn(List<LocalDateTime> updatedDates, Pageable pageable);

    // Generating pageable query method for createdDate
    Page<CropIssue> findByCreatedDate(LocalDateTime createdDate, Pageable pageable);

    Page<CropIssue> findByCreatedDateAfter(LocalDateTime createdDate, Pageable pageable);
    
    Page<CropIssue> findByCreatedDateBefore(LocalDateTime createdDate, Pageable pageable);
    
    Page<CropIssue> findByCreatedDateBetween(LocalDateTime createdDateStart, LocalDateTime createdDateEnd, Pageable pageable);
    
    // Search by a list of parameters
    List<CropIssue> findByCreatedDateNot(LocalDateTime createdDate);
    Page<CropIssue> findByCreatedDateNot(LocalDateTime createdDate, Pageable pageable);
    
    List<CropIssue> findByCreatedDateIn(List<LocalDateTime> createdDates);
    Page<CropIssue> findByCreatedDateIn(List<LocalDateTime> createdDates, Pageable pageable);
    
    List<CropIssue> findByCreatedDateNotIn(List<LocalDateTime> createdDates);
    Page<CropIssue> findByCreatedDateNotIn(List<LocalDateTime> createdDates, Pageable pageable);

    // Generating pageable query method for name
    Page<CropIssue> findByName(String name, Pageable pageable);

    Page<CropIssue> findByNameStartingWithIgnoreCase(String name, Pageable pageable);
    
    Page<CropIssue> findByNameEndingWithIgnoreCase(String name, Pageable pageable);
    
    Page<CropIssue> findByNameContainingIgnoreCase(String name, Pageable pageable);
    
    Page<CropIssue> findByNameLikeIgnoreCase(String name, Pageable pageable);
    
    Page<CropIssue> findByNameNotLikeIgnoreCase(String name, Pageable pageable);
    
    Page<CropIssue> findByNameContaining(String name, Pageable pageable);
    
    // Search by a list of parameters
    List<CropIssue> findByNameNot(String name);
    Page<CropIssue> findByNameNot(String name, Pageable pageable);
    
    List<CropIssue> findByNameIn(List<String> names);
    Page<CropIssue> findByNameIn(List<String> names, Pageable pageable);
    
    List<CropIssue> findByNameNotIn(List<String> names);
    Page<CropIssue> findByNameNotIn(List<String> names, Pageable pageable);

    // Generating pageable query method for scientificName
    Page<CropIssue> findByScientificName(String scientificName, Pageable pageable);

    Page<CropIssue> findByScientificNameStartingWithIgnoreCase(String scientificName, Pageable pageable);
    
    Page<CropIssue> findByScientificNameEndingWithIgnoreCase(String scientificName, Pageable pageable);
    
    Page<CropIssue> findByScientificNameContainingIgnoreCase(String scientificName, Pageable pageable);
    
    Page<CropIssue> findByScientificNameLikeIgnoreCase(String scientificName, Pageable pageable);
    
    Page<CropIssue> findByScientificNameNotLikeIgnoreCase(String scientificName, Pageable pageable);
    
    Page<CropIssue> findByScientificNameContaining(String scientificName, Pageable pageable);
    
    // Search by a list of parameters
    List<CropIssue> findByScientificNameNot(String scientificName);
    Page<CropIssue> findByScientificNameNot(String scientificName, Pageable pageable);
    
    List<CropIssue> findByScientificNameIn(List<String> scientificNames);
    Page<CropIssue> findByScientificNameIn(List<String> scientificNames, Pageable pageable);
    
    List<CropIssue> findByScientificNameNotIn(List<String> scientificNames);
    Page<CropIssue> findByScientificNameNotIn(List<String> scientificNames, Pageable pageable);

    // Search by a list of parameters
    List<CropIssue> findByImagesNot(File images);
    Page<CropIssue> findByImagesNot(File images, Pageable pageable);
    
    List<CropIssue> findByImagesIn(List<File> imagess);
    Page<CropIssue> findByImagesIn(List<File> imagess, Pageable pageable);
    
    List<CropIssue> findByImagesNotIn(List<File> imagess);
    Page<CropIssue> findByImagesNotIn(List<File> imagess, Pageable pageable);

    // Generating pageable query method for description
    Page<CropIssue> findByDescriptionNull(Pageable pageable);

    Page<CropIssue> findByDescriptionStartingWithIgnoreCase(String description, Pageable pageable);
    
    Page<CropIssue> findByDescriptionEndingWithIgnoreCase(String description, Pageable pageable);
    
    Page<CropIssue> findByDescriptionContainingIgnoreCase(String description, Pageable pageable);
    
    Page<CropIssue> findByDescriptionLikeIgnoreCase(String description, Pageable pageable);
    
    Page<CropIssue> findByDescriptionNotLikeIgnoreCase(String description, Pageable pageable);
    
    Page<CropIssue> findByDescriptionContaining(String description, Pageable pageable);
    
    // Search by a list of parameters
    List<CropIssue> findByDescriptionNot(String description);
    Page<CropIssue> findByDescriptionNot(String description, Pageable pageable);
    
    List<CropIssue> findByDescriptionIn(List<String> descriptions);
    Page<CropIssue> findByDescriptionIn(List<String> descriptions, Pageable pageable);
    
    List<CropIssue> findByDescriptionNotIn(List<String> descriptions);
    Page<CropIssue> findByDescriptionNotIn(List<String> descriptions, Pageable pageable);

    // Generating pageable query method for issue
    Page<CropIssue> findByIssue(CropIssueType issue, Pageable pageable);

    // Search by a list of parameters
    List<CropIssue> findByIssueNot(CropIssueType issue);
    Page<CropIssue> findByIssueNot(CropIssueType issue, Pageable pageable);
    
    List<CropIssue> findByIssueIn(List<CropIssueType> issues);
    Page<CropIssue> findByIssueIn(List<CropIssueType> issues, Pageable pageable);
    
    List<CropIssue> findByIssueNotIn(List<CropIssueType> issues);
    Page<CropIssue> findByIssueNotIn(List<CropIssueType> issues, Pageable pageable);

}