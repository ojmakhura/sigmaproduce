// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringWS.java.vsl in andromda-webservices. Do not modify by hand!.
//
package bw.co.sigmaproduce.access;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 
 * TODO: Model Documentation for AccessPointRestController
 */
public interface AccessPointController {

    @GetMapping("/id/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id", required = false) Long id);

    @GetMapping("/all")
    public ResponseEntity<?> getAll();

    @GetMapping("/page/{pageNumber}/size/{pageSize}")
    public ResponseEntity<?> getAllPaged(@PathVariable(name = "pageNumber", required = false) Integer pageNumber, @PathVariable(name = "pageSize", required = false) Integer pageSize);

    @PostMapping("/search/page/{pageNumber}/size/{pageSize}")
    public ResponseEntity<?> pagedSearch(@PathVariable(name = "pageNumber", required = false) Integer pageNumber, @PathVariable(name = "pageSize", required = false) Integer pageSize, @RequestBody(required = true) AccessPointCriteria criteria);

    @DeleteMapping("/id/{id}")
    public ResponseEntity<?> remove(@PathVariable(name = "id", required = false) Long id);

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody(required = true) AccessPointVO accessPoint);

    @PostMapping("/search")
    public ResponseEntity<?> search(@RequestBody(required = false) AccessPointCriteria criteria);
}