// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringWS.java.vsl in andromda-webservices. Do not modify by hand!.
//
package bw.co.sigmaproduce.farm.cultivation;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 
 * TODO: Model Documentation for bw.co.sigmaproduce.farm.cultivation.CultivationApi
 */
public interface CultivationApi {

    @GetMapping("/{id}")
    @Operation(summary = "Find Farm by id", description = "Get the farm with the given id")
    public ResponseEntity<?> findById(@PathVariable(name = "id", required = true) String id);

    @GetMapping()
    @Operation(summary = "Get Farms", description = "Get all farms in the data store")
    public ResponseEntity<?> getAll();

    @GetMapping("/page/{pageNumber}/size/{pageSize}")
    @Operation(summary = "Get Farms Page", description = "Get {pageSize} farms with for a particular {pageNumber}")
    public ResponseEntity<?> getAllPaged(@PathVariable(name = "pageNumber", required = false) Integer pageNumber, @PathVariable(name = "pageSize", required = false) Integer pageSize);

    @PostMapping("/search/page/{pageNumber}/size/{pageSize}")
    @Operation(summary = "Search Farms Page", description = "Get {pageSize} farms for a particular {pageNumber} given a search criteria")
    public ResponseEntity<?> pagedSearch(@PathVariable(name = "pageNumber", required = false) Integer pageNumber, @PathVariable(name = "pageSize", required = false) Integer pageSize, @RequestBody(required = true) CultivationCriteria criteria);

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove farm by id", description = "Remove the farm with the given id")
    public ResponseEntity<?> remove(@PathVariable(name = "id", required = true) String id);

    @PostMapping()
    @Operation(summary = "Save Farm", description = "Save a farm to data store")
    public ResponseEntity<?> save(@RequestBody(required = true) CultivationVO cultivation);

    @PostMapping("search")
    @Operation(summary = "Search Farms", description = "Search farms based on the criteria")
    public ResponseEntity<?> search(@RequestBody(required = false) CultivationCriteria criteria);
}