package bw.co.sigmaproduce;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.Authentication;

public class AuditTracker {
    
    public static void auditTrail(AuditableDTO auditable, Authentication authentication) {
        if (auditable != null) {
            String username = "anonymousUser";
            if(authentication != null) {

                username = authentication.getName();
            }

            if(StringUtils.isBlank(auditable.getId())) {

                auditable.setCreatedBy(username);
            } else {

                auditable.setModifiedBy(username);
            }

        }
    }
}
