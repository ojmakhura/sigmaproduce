// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringWS.java.vsl in andromda-webservices. Do not modify by hand!.
//
package bw.co.sigmaproduce.auth;

import bw.co.sigmaproduce.security.SecurityAuthorisationCheck;
import io.swagger.v3.oas.annotations.Operation;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public abstract class AuthorisationControllerBase implements AuthorisationController {

    protected Logger logger = LoggerFactory.getLogger(AuthorisationController.class);
        protected final AuthorisationService authorisationService;

    public AuthorisationControllerBase(
        AuthorisationService authorisationService    ) {
        this.authorisationService = authorisationService;
    }

    @GetMapping("/{authorisationId}/{menuSectionId}")
    @Operation(summary = "Assigne Menu Section", description = "Assign menu sections to authorisation")
    @SecurityAuthorisationCheck(path = "/authorisation/{authorisationId}/{menuSectionId}", method = "GET")
    public ResponseEntity<?> assignMenuSection(Long authorisationId, Long menuSectionId) {
        return handleAssignMenuSection(authorisationId, menuSectionId);
    }

    public abstract ResponseEntity<?> handleAssignMenuSection(Long authorisationId, Long menuSectionId);

    @GetMapping("/id/{id}")
    @Operation(summary = "Find Authorisation by id", description = "Get the authorisation with the given id")
    @SecurityAuthorisationCheck(path = "/authorisation/id/{id}", method = "GET")
    public ResponseEntity<?> findById(Long id) {
        return handleFindById(id);
    }

    public abstract ResponseEntity<?> handleFindById(Long id);

    @PostMapping("/find-by-roles-url")
    @Operation(summary = "Find By Roleds and URL", description = "Find authorisations given roles and the access point URL")
    @SecurityAuthorisationCheck(path = "/authorisation/find-by-roles-url", method = "POST")
    public ResponseEntity<?> findByRolesAndUrl(String url, Set<String> roles) {
        return handleFindByRolesAndUrl(url, roles);
    }

    public abstract ResponseEntity<?> handleFindByRolesAndUrl(String url, Set<String> roles);

    @PostMapping("/restricted-view-items")
    @SecurityAuthorisationCheck(path = "/authorisation/restricted-view_items", method = "POST")
    @Operation(summary = "Find By Roleds and URL", description = "Find authorisations given roles and the access point URL")
    public ResponseEntity<?> findRestrictedViewItems(String url, Set<String> roles) {
        return handleFindRestrictedViewItems(url, roles);
    }

    public abstract ResponseEntity<?> handleFindRestrictedViewItems(String url, Set<String> roles);

    @GetMapping("authorised")
    @Operation(summary = "Authorisations by Access Point Type Code ", description = "Get authorisations given roles and access point type codes")
    @SecurityAuthorisationCheck(path = "/authorisation/authorised", method = "GET")
    public ResponseEntity<?> getAccessTypeCodeAuthorisations(Set<String> roles, Set<String> accessPointTypeCodes) {
        return handleGetAccessTypeCodeAuthorisations(roles, accessPointTypeCodes);
    }

    public abstract ResponseEntity<?> handleGetAccessTypeCodeAuthorisations(Set<String> roles, Set<String> accessPointTypeCodes);

    @GetMapping("/all")
    @SecurityAuthorisationCheck(path = "/authorisation/all", method = "GET")
    @Operation(summary = "Get All Authorisations", description = "Get all authorisations in the database")
    public ResponseEntity<?> getAll() {
        return handleGetAll();
    }

    public abstract ResponseEntity<?> handleGetAll();

    @GetMapping("/page/{pageNumber}/size/{pageSize}")
    @SecurityAuthorisationCheck(path = "/authorisation/page/{pageNumber}/size/{pageSize}", method = "GET")
    @Operation(summary = "Get a Page", description = "Get a page given a page number and page size")
    public ResponseEntity<?> getAllPaged(Integer pageNumber, Integer pageSize) {
        return handleGetAllPaged(pageNumber, pageSize);
    }

    public abstract ResponseEntity<?> handleGetAllPaged(Integer pageNumber, Integer pageSize);

    @DeleteMapping("/id/{id}")
    @Operation(summary = "Remove Authorisation by id", description = "Remove the authorisation for the given id")
    @SecurityAuthorisationCheck(path = "/authorisation/id/{id}", method = "DELETE")
    public ResponseEntity<?> remove(Long id) {
        return handleRemove(id);
    }

    public abstract ResponseEntity<?> handleRemove(Long id);

    @PostMapping()
    @SecurityAuthorisationCheck(path = "/authorisation", method = "POST")
    @Operation(summary = "Save Authorisation", description = "Save the given authorisation")
    public ResponseEntity<?> save(AuthorisationVO authorisation) {
        return handleSave(authorisation);
    }

    public abstract ResponseEntity<?> handleSave(AuthorisationVO authorisation);

    @PostMapping("/search")
    @SecurityAuthorisationCheck(path = "/authorisation/search", method = "POST")
    @Operation(summary = "Search Authorisations", description = "Search authorisations given the criteria.")
    public ResponseEntity<?> search(AuthorisationCriteria criteria) {
        return handleSearch(criteria);
    }

    public abstract ResponseEntity<?> handleSearch(AuthorisationCriteria criteria);

    /**
     * Gets the reference to <code>$serviceRef.daoName</code>.
     * @return authorisationService
     */
    protected AuthorisationService getAuthorisationService()
    {
        return this.authorisationService;
    }

}