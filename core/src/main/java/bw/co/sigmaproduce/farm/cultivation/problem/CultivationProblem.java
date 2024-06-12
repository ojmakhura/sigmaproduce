// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by hibernate/HibernateEntity.vsl in andromda-hibernate-cartridge on 06/12/2024 19:31:12+0200.
//
package bw.co.sigmaproduce.farm.cultivation.problem;

import bw.co.sigmaproduce.crop.issue.CropIssue;
import bw.co.sigmaproduce.farm.cultivation.Cultivation;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.File;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 * TODO: Model Documentation for CultivationProblem
 */
@Entity
@Table(name = "CULTIVATION_PROBLEM")
// Uncomment to enable caching for CultivationProblem
// @org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.read-write)
@NamedQuery(name = "CultivationProblem.findAll", query = "SELECT c FROM CultivationProblem AS c")
// HibernateEntity.vsl annotations merge-point
public class CultivationProblem
    implements Serializable, Comparable<CultivationProblem>
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -5749037493099621326L;

    // Generate 8 attributes
    private String id;

    /**
     * TODO: Model Documentation for
     * CultivationProblem.id
     * @return this.id String
     */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID", unique = false, nullable = true, insertable = true, updatable = true)
    public String getId()
    {
        return this.id;
    }

    /**
     * TODO: Model Documentation for
     * CultivationProblem.id
     * @param idIn String
     */
    public void setId(String idIn)
    {
        this.id = idIn;
    }

    private String createdBy;

    /**
     * TODO: Model Documentation for
     * CultivationProblem.createdBy
     * @return this.createdBy String
     */
    @Column(name = "CREATED_BY", unique = false, nullable = false, insertable = true, updatable = true)
    public String getCreatedBy()
    {
        return this.createdBy;
    }

    /**
     * TODO: Model Documentation for
     * CultivationProblem.createdBy
     * @param createdByIn String
     */
    public void setCreatedBy(String createdByIn)
    {
        this.createdBy = createdByIn;
    }

    private String updatedBy;

    /**
     * TODO: Model Documentation for
     * CultivationProblem.updatedBy
     * @return this.updatedBy String
     */
    @Column(name = "UPDATED_BY", unique = false, nullable = true, insertable = true, updatable = true)
    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    /**
     * TODO: Model Documentation for
     * CultivationProblem.updatedBy
     * @param updatedByIn String
     */
    public void setUpdatedBy(String updatedByIn)
    {
        this.updatedBy = updatedByIn;
    }

    private LocalDateTime updatedDate;

    /**
     * TODO: Model Documentation for
     * CultivationProblem.updatedDate
     * @return this.updatedDate LocalDateTime
     */
    @Column(name = "UPDATED_DATE", unique = false, nullable = true, insertable = true, updatable = true)
    public LocalDateTime getUpdatedDate()
    {
        return this.updatedDate;
    }

    /**
     * TODO: Model Documentation for
     * CultivationProblem.updatedDate
     * @param updatedDateIn LocalDateTime
     */
    public void setUpdatedDate(LocalDateTime updatedDateIn)
    {
        this.updatedDate = updatedDateIn;
    }

    private LocalDateTime createdDate;

    /**
     * TODO: Model Documentation for
     * CultivationProblem.createdDate
     * @return this.createdDate LocalDateTime
     */
    @Column(name = "CREATED_DATE", unique = false, nullable = false, insertable = true, updatable = true)
    public LocalDateTime getCreatedDate()
    {
        return this.createdDate;
    }

    /**
     * TODO: Model Documentation for
     * CultivationProblem.createdDate
     * @param createdDateIn LocalDateTime
     */
    public void setCreatedDate(LocalDateTime createdDateIn)
    {
        this.createdDate = createdDateIn;
    }

    private String description;

    /**
     * TODO: Model Documentation for
     * CultivationProblem.description
     * @return this.description String
     */
    @Column(name = "DESCRIPTION", unique = false, nullable = false, insertable = true, updatable = true)
    public String getDescription()
    {
        return this.description;
    }

    /**
     * TODO: Model Documentation for
     * CultivationProblem.description
     * @param descriptionIn String
     */
    public void setDescription(String descriptionIn)
    {
        this.description = descriptionIn;
    }

    private Collection<File> photos;

    /**
     * TODO: Model Documentation for
     * CultivationProblem.photos
     * @return this.photos Collection<File>
     */
    @ElementCollection
    public Collection<File> getPhotos()
    {
        return this.photos;
    }

    /**
     * TODO: Model Documentation for
     * CultivationProblem.photos
     * @param photosIn Collection<File>
     */
    public void setPhotos(Collection<File> photosIn)
    {
        this.photos = photosIn;
    }

    private LocalDate dateNoticed;

    /**
     * TODO: Model Documentation for
     * CultivationProblem.dateNoticed
     * @return this.dateNoticed LocalDate
     */
    @Column(name = "DATE_NOTICED", unique = true, nullable = false, insertable = true, updatable = true)
    public LocalDate getDateNoticed()
    {
        return this.dateNoticed;
    }

    /**
     * TODO: Model Documentation for
     * CultivationProblem.dateNoticed
     * @param dateNoticedIn LocalDate
     */
    public void setDateNoticed(LocalDate dateNoticedIn)
    {
        this.dateNoticed = dateNoticedIn;
    }

    // Generate 2 associations
    private Cultivation cultivation;

    /**
     * TODO: Model Documentation for Cultivation
     * @return this.cultivation Cultivation
     */
    @ManyToOne(optional = false,  fetch = FetchType.LAZY)
    @JoinColumn(name = "CULTIVATION_FK")
    public Cultivation getCultivation()
    {
        return this.cultivation;
    }

    /**
     * TODO: Model Documentation for Cultivation
     * @param cultivationIn Cultivation
     */
    public void setCultivation(Cultivation cultivationIn)
    {
        this.cultivation = cultivationIn;
    }

    private CropIssue cropIssue;

    /**
     * TODO: Model Documentation for CropIssue
     * @return this.cropIssue CropIssue
     */
    @ManyToOne(optional = false,  fetch = FetchType.LAZY)
    @JoinColumn(name = "CROP_ISSUE_FK")
    public CropIssue getCropIssue()
    {
        return this.cropIssue;
    }

    /**
     * TODO: Model Documentation for CropIssue
     * @param cropIssueIn CropIssue
     */
    public void setCropIssue(CropIssue cropIssueIn)
    {
        this.cropIssue = cropIssueIn;
    }

    /**
     * Returns <code>true</code> if the argument is an CultivationProblem instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof CultivationProblem))
        {
            return false;
        }
        final CultivationProblem that = (CultivationProblem)object;
        if (this.id == null || that.getId() == null || !this.id.equals(that.getId()))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     */
    @Override
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (this.id == null ? 0 : this.id.hashCode());

        return hashCode;
    }

    /**
     * Constructs new instances of {@link CultivationProblem}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link CultivationProblem}.
         * @return new CultivationProblem()
         */
        public static CultivationProblem newInstance()
        {
            return new CultivationProblem();
        }

        /**
         * Constructs a new instance of {@link CultivationProblem}, taking all required and/or
         * read-only properties as arguments, except for identifiers.
         * @param createdBy String
         * @param createdDate LocalDateTime
         * @param description String
         * @param dateNoticed LocalDate
         * @param cultivation Cultivation
         * @param cropIssue CropIssue
         * @return newInstance
         */
        public static CultivationProblem newInstance(String createdBy, LocalDateTime createdDate, String description, LocalDate dateNoticed, Cultivation cultivation, CropIssue cropIssue)
        {
            final CultivationProblem entity = new CultivationProblem();
            entity.setCreatedBy(createdBy);
            entity.setCreatedDate(createdDate);
            entity.setDescription(description);
            entity.setDateNoticed(dateNoticed);
            entity.setCultivation(cultivation);
            entity.setCropIssue(cropIssue);
            return entity;
        }

        /**
         * Constructs a new instance of {@link CultivationProblem}, taking all possible properties
         * (except the identifier(s))as arguments.
         * @param createdBy String
         * @param updatedBy String
         * @param updatedDate LocalDateTime
         * @param createdDate LocalDateTime
         * @param description String
         * @param photos Collection<File>
         * @param dateNoticed LocalDate
         * @param cultivation Cultivation
         * @param cropIssue CropIssue
         * @return newInstance CultivationProblem
         */
        public static CultivationProblem newInstance(String createdBy, String updatedBy, LocalDateTime updatedDate, LocalDateTime createdDate, String description, Collection<File> photos, LocalDate dateNoticed, Cultivation cultivation, CropIssue cropIssue)
        {
            final CultivationProblem entity = new CultivationProblem();
            entity.setCreatedBy(createdBy);
            entity.setUpdatedBy(updatedBy);
            entity.setUpdatedDate(updatedDate);
            entity.setCreatedDate(createdDate);
            entity.setDescription(description);
            entity.setPhotos(photos);
            entity.setDateNoticed(dateNoticed);
            entity.setCultivation(cultivation);
            entity.setCropIssue(cropIssue);
            return entity;
        }
    }

    /**
     * @param other
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     * @see Comparable#compareTo
     */
    @Override
    public int compareTo(CultivationProblem other)
    {
        int cmp = 0;
        if (this.getId() != null)
        {
            cmp = this.getId().compareTo(other.getId());
        }
        else
        {
            if (this.getCreatedBy() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getCreatedBy().compareTo(other.getCreatedBy()));
            }
            if (this.getUpdatedBy() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getUpdatedBy().compareTo(other.getUpdatedBy()));
            }
            if (this.getUpdatedDate() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getUpdatedDate().compareTo(other.getUpdatedDate()));
            }
            if (this.getCreatedDate() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getCreatedDate().compareTo(other.getCreatedDate()));
            }
            if (this.getDescription() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getDescription().compareTo(other.getDescription()));
            }
            if (this.getPhotos() != null)
            {
                // Compare Collection sizes for ordering
                cmp = (cmp != 0 ? cmp : Math.abs(this.getPhotos().size()-other.getPhotos().size()));
            }
            if (this.getDateNoticed() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getDateNoticed().compareTo(other.getDateNoticed()));
            }
        }
        return cmp;
    }

    /**
     * Returns a String representation of the object
     * @return String Textual representation of the object displaying name/value pairs for all attributes
     * @see Object#toString
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("CultivationProblem(");
        sb.append(" id=").append(getId());
        sb.append(" createdBy=").append(getCreatedBy());
        sb.append(" updatedBy=").append(getUpdatedBy());
        sb.append(" updatedDate=").append(getUpdatedDate());
        sb.append(" createdDate=").append(getCreatedDate());
        sb.append(" description=").append(getDescription());
        sb.append(" photos=").append(getPhotos());
        sb.append(" dateNoticed=").append(getDateNoticed());
        sb.append(")");
        return sb.toString();
    }
// HibernateEntity.vsl merge-point
}