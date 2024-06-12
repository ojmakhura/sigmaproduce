package bw.co.sigmaproduce.access;
import java.util.Collection;
import org.springframework.data.jpa.domain.Specification;

import bw.co.sigmaproduce.access.type.AccessPointType;

// bw.co.sigmaproduce.SigmaproduceSpecifications
public final class AccessPointSpecifications {

    // Specifications for AccessPointType accessPointType
    public static Specification<AccessPoint> findByAccessPointTypeIdIn(java.util.Collection<java.lang.Long> ids) {
        return (root, cq, cb) -> {
            
            // Many to One
            jakarta.persistence.criteria.Join<AccessPoint, AccessPointType> accessPointTypeJoin = root.join("accessPointType");
            return cb.in(accessPointTypeJoin.get("id")).value(ids);
        };
    }

    public static Specification<AccessPoint> findByAccessPointTypeIdNull() {
        return (root, cq, cb) -> {
            
            jakarta.persistence.criteria.Join<AccessPoint, AccessPointType> accessPointTypeJoin = root.join("accessPointType");
            return cb.isNull(accessPointTypeJoin.<java.lang.Long>get("id"));
        };
    }

    public static Specification<AccessPoint> findByAccessPointTypeIdNotNull() {
        return (root, cq, cb) -> {
            jakarta.persistence.criteria.Join<AccessPoint, AccessPointType> accessPointTypeJoin = root.join("accessPointType");
            return cb.isNotNull(accessPointTypeJoin.<java.lang.Long>get("id"));
        };
    }

    public static Specification<AccessPoint> findByAccessPointTypeId(java.lang.Long id) {
        return (root, cq, cb) -> {
            
            // Many to One
            jakarta.persistence.criteria.Join<AccessPoint, AccessPointType> accessPointTypeJoin = root.join("accessPointType");
            return cb.equal(accessPointTypeJoin.get("id"), id);
        };
    }

    public static Specification<AccessPoint> findByTypeContainingIgnoreCase(java.lang.String type) {
        return (root, cq, cb) -> {
            jakarta.persistence.criteria.Join accessPointTypeJoin = root.join("accessPointType");
            return cb.like(accessPointTypeJoin.get("name"), '%' + type + '%');
        };
    }

}