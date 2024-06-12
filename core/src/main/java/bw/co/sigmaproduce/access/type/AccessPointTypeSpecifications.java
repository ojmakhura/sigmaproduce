package bw.co.sigmaproduce.access.type;
import java.util.Collection;
import org.springframework.data.jpa.domain.Specification;

import bw.co.sigmaproduce.access.AccessPoint;

// bw.co.sigmaproduce.SigmaproduceSpecifications
public final class AccessPointTypeSpecifications {

    // Specifications for java.util.Collection<AccessPoint> accessPoints
    public static Specification<AccessPointType> findByAccessPointsIdIn(java.util.Collection<java.lang.Long> ids) {
        return (root, cq, cb) -> {
            
            // One to Many
            jakarta.persistence.criteria.Join<AccessPointType, AccessPoint> accessPointsJoin = root.join("accessPoints");
            return cb.in(accessPointsJoin.get("id")).value(ids);
        };
    }

    public static Specification<AccessPointType> findByAccessPointsIdNull() {
        return (root, cq, cb) -> {
            
            jakarta.persistence.criteria.Join<AccessPointType, AccessPoint> accessPointsJoin = root.join("accessPoints");
            return cb.isNull(accessPointsJoin.<java.lang.Long>get("id"));
        };
    }

    public static Specification<AccessPointType> findByAccessPointsIdNotNull() {
        return (root, cq, cb) -> {
            jakarta.persistence.criteria.Join<AccessPointType, AccessPoint> accessPointsJoin = root.join("accessPoints");
            return cb.isNotNull(accessPointsJoin.<java.lang.Long>get("id"));
        };
    }

    public static Specification<AccessPointType> findByAccessPointsId(java.lang.Long id) {
        return (root, cq, cb) -> {
            
            // One to Many
            jakarta.persistence.criteria.Join<AccessPointType, AccessPoint> accessPointsJoin = root.join("accessPoints");
            return cb.equal(accessPointsJoin.get("id"), id);
        };
    }

}