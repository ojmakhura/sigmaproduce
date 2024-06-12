package bw.co.sigmaproduce.auth;
import java.util.Collection;
import org.springframework.data.jpa.domain.Specification;

import bw.co.sigmaproduce.access.AccessPoint;

// bw.co.sigmaproduce.SigmaproduceSpecifications
public final class AuthorisationSpecifications {


    // Specifications for AccessPoint accessPoint
    public static Specification<Authorisation> findByAccessPointIdIn(java.util.Collection<java.lang.Long> ids) {
        return (root, cq, cb) -> {
            
            // One to One
            jakarta.persistence.criteria.Join<Authorisation, AccessPoint> accessPointJoin = root.join("accessPoint");
            return cb.in(accessPointJoin.get("id")).value(ids);
        };
    }

    public static Specification<Authorisation> findByAccessPointIdNull() {
        return (root, cq, cb) -> {
            
            jakarta.persistence.criteria.Join<Authorisation, AccessPoint> accessPointJoin = root.join("accessPoint");
            return cb.isNull(accessPointJoin.<java.lang.Long>get("id"));
        };
    }

    public static Specification<Authorisation> findByAccessPointIdNotNull() {
        return (root, cq, cb) -> {
            jakarta.persistence.criteria.Join<Authorisation, AccessPoint> accessPointJoin = root.join("accessPoint");
            return cb.isNotNull(accessPointJoin.<java.lang.Long>get("id"));
        };
    }

    public static Specification<Authorisation> findByAccessPointId(java.lang.Long id) {
        return (root, cq, cb) -> {
            
            // One to One
            jakarta.persistence.criteria.Join<Authorisation, AccessPoint> accessPointJoin = root.join("accessPoint");
            return cb.equal(accessPointJoin.get("id"), id);
        };
    }

    public static Specification<Authorisation> findByAccessPointNameContainingIgnoreCase(java.lang.String accessPointName) {
        return (root, cq, cb) -> {
            jakarta.persistence.criteria.Join accessPointJoin = root.join("accessPoint");
            return cb.like(accessPointJoin.get("name"), '%' + accessPointName + '%');
        };
    }

    public static Specification<Authorisation> findByAccessPointUrlContainingIgnoreCase(java.lang.String accessPointUrl) {
        return (root, cq, cb) -> {
            jakarta.persistence.criteria.Join accessPointJoin = root.join("accessPoint");
            return cb.like(accessPointJoin.get("url"), '%' + accessPointUrl + '%');
        };
    }

}