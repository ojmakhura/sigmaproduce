// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringWS.java.vsl in andromda-webservices. Do not modify by hand!.
//
package bw.co.sigmaproduce.village;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * TODO: Model Documentation for bw.co.sigmaproduce.village.VillageApi
 */
public interface VillageApi {

    @GetMapping("/{id}")
    @Operation(summary = "Find Village by id", description = "Get the village with the given id")
    public ResponseEntity<?> findById(@PathVariable(name = "id", required = false) Long id);

    @GetMapping()
    @Operation(summary = "Get All Villages", description = "Get all villages in the data store")
    public ResponseEntity<?> getAll();

    @GetMapping("/district")
    public ResponseEntity<?> getDistrictVillages(@RequestParam(name = "districtId", required = true) String districtId);

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove village by id", description = "Remove the vilalge with the given id")
    public ResponseEntity<?> remove(@PathVariable(name = "id", required = false) Long id);

    @PostMapping()
    @Operation(summary = "Save Village", description = "Save village to data store")
    public ResponseEntity<?> save(@RequestBody(required = true) VillageVO village);

    @GetMapping("search")
    @Operation(summary = "Search Villages", description = "Search villages based on the criteria")
    public ResponseEntity<?> search(@RequestParam(name = "criteria", required = false) String criteria);
}