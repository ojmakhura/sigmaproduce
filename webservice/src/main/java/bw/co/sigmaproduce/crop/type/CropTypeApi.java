// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringWS.java.vsl in andromda-webservices. Do not modify by hand!.
//
package bw.co.sigmaproduce.crop.type;

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
 * TODO: Model Documentation for bw.co.sigmaproduce.crop.type.CropTypeApi
 */
public interface CropTypeApi {

    @GetMapping("/{id}")
    @Operation(summary = "Find Crop by id", description = "Get the cropp with the given id")
    public ResponseEntity<?> findById(@PathVariable(name = "id", required = true) String id);

    @GetMapping()
    @Operation(summary = "Get Crops", description = "Get all all crops in the data store")
    public ResponseEntity<?> getAll();

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove crop by id", description = "Remove the crop with the given id")
    public ResponseEntity<?> remove(@PathVariable(name = "id", required = true) String id);

    @PostMapping()
    @Operation(summary = "Save Crop", description = "Save acrops to data store")
    public ResponseEntity<?> save(@RequestBody(required = true) CropTypeVO cropType);

    @PostMapping("search")
    @Operation(summary = "Search Crops", description = "Search crops based on the criteria")
    public ResponseEntity<?> search(@RequestParam(name = "criteria", required = false) String criteria);
}