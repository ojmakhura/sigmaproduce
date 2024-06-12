// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by hibernate/HibernateEntity.vsl in andromda-hibernate-cartridge on 06/12/2024 19:31:12+0200.
//
package bw.co.sigmaproduce.crop.issue;

import bw.co.sigmaproduce.crop.Crop;
import bw.co.sigmaproduce.crop.type.CropType;
import bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblem;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.File;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;

/**
 * TODO: Model Documentation for CropIssue
 */
@Entity
@Table(name = "CROP_ISSUE")
// Uncomment to enable caching for CropIssue
// @org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.read-write)
@NamedQuery(name = "CropIssue.findAll", query = "SELECT c FROM CropIssue AS c")
// HibernateEntity.vsl annotations merge-point
public class CropIssue
    implements Serializable, Comparable<CropIssue>
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 6205322125559016482L;

    // Generate 10 attributes
    private String id;

    /**
     * TODO: Model Documentation for CropIssue.id
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
     * TODO: Model Documentation for CropIssue.id
     * @param idIn String
     */
    public void setId(String idIn)
    {
        this.id = idIn;
    }

    private String createdBy;

    /**
     * TODO: Model Documentation for CropIssue.createdBy
     * @return this.createdBy String
     */
    @Column(name = "CREATED_BY", unique = false, nullable = false, insertable = true, updatable = true)
    public String getCreatedBy()
    {
        return this.createdBy;
    }

    /**
     * TODO: Model Documentation for CropIssue.createdBy
     * @param createdByIn String
     */
    public void setCreatedBy(String createdByIn)
    {
        this.createdBy = createdByIn;
    }

    private String updatedBy;

    /**
     * TODO: Model Documentation for CropIssue.updatedBy
     * @return this.updatedBy String
     */
    @Column(name = "UPDATED_BY", unique = false, nullable = true, insertable = true, updatable = true)
    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    /**
     * TODO: Model Documentation for CropIssue.updatedBy
     * @param updatedByIn String
     */
    public void setUpdatedBy(String updatedByIn)
    {
        this.updatedBy = updatedByIn;
    }

    private LocalDateTime updatedDate;

    /**
     * TODO: Model Documentation for CropIssue.updatedDate
     * @return this.updatedDate LocalDateTime
     */
    @Column(name = "UPDATED_DATE", unique = false, nullable = true, insertable = true, updatable = true)
    public LocalDateTime getUpdatedDate()
    {
        return this.updatedDate;
    }

    /**
     * TODO: Model Documentation for CropIssue.updatedDate
     * @param updatedDateIn LocalDateTime
     */
    public void setUpdatedDate(LocalDateTime updatedDateIn)
    {
        this.updatedDate = updatedDateIn;
    }

    private LocalDateTime createdDate;

    /**
     * TODO: Model Documentation for CropIssue.createdDate
     * @return this.createdDate LocalDateTime
     */
    @Column(name = "CREATED_DATE", unique = false, nullable = false, insertable = true, updatable = true)
    public LocalDateTime getCreatedDate()
    {
        return this.createdDate;
    }

    /**
     * TODO: Model Documentation for CropIssue.createdDate
     * @param createdDateIn LocalDateTime
     */
    public void setCreatedDate(LocalDateTime createdDateIn)
    {
        this.createdDate = createdDateIn;
    }

    private String name;

    /**
     * TODO: Model Documentation for CropIssue.name
     * @return this.name String
     */
    @Column(name = "NAME", unique = true, nullable = false, insertable = true, updatable = true)
    public String getName()
    {
        return this.name;
    }

    /**
     * TODO: Model Documentation for CropIssue.name
     * @param nameIn String
     */
    public void setName(String nameIn)
    {
        this.name = nameIn;
    }

    private String scientificName;

    /**
     * TODO: Model Documentation for CropIssue.scientificName
     * @return this.scientificName String
     */
    @Column(name = "SCIENTIFIC_NAME", unique = true, nullable = false, insertable = true, updatable = true)
    public String getScientificName()
    {
        return this.scientificName;
    }

    /**
     * TODO: Model Documentation for CropIssue.scientificName
     * @param scientificNameIn String
     */
    public void setScientificName(String scientificNameIn)
    {
        this.scientificName = scientificNameIn;
    }

    private Collection<File> images;

    /**
     * TODO: Model Documentation for CropIssue.images
     * @return this.images Collection<File>
     */
    @ElementCollection
    public Collection<File> getImages()
    {
        return this.images;
    }

    /**
     * TODO: Model Documentation for CropIssue.images
     * @param imagesIn Collection<File>
     */
    public void setImages(Collection<File> imagesIn)
    {
        this.images = imagesIn;
    }

    private String description;

    /**
     * TODO: Model Documentation for CropIssue.description
     * @return this.description String
     */
    @Column(name = "DESCRIPTION", unique = false, nullable = true, insertable = true, updatable = true)
    public String getDescription()
    {
        return this.description;
    }

    /**
     * TODO: Model Documentation for CropIssue.description
     * @param descriptionIn String
     */
    public void setDescription(String descriptionIn)
    {
        this.description = descriptionIn;
    }

    private CropIssueType issue;

    /**
     * TODO: Model Documentation for CropIssue.issue
     * @return this.issue CropIssueType
     */
    @Column(name = "ISSUE", unique = true, nullable = false, insertable = true, updatable = true)
    @Enumerated(EnumType.STRING)
    public CropIssueType getIssue()
    {
        return this.issue;
    }

    /**
     * TODO: Model Documentation for CropIssue.issue
     * @param issueIn CropIssueType
     */
    public void setIssue(CropIssueType issueIn)
    {
        this.issue = issueIn;
    }

    // Generate 3 associations
    private Collection<CultivationProblem> cultivationProblems = new HashSet<CultivationProblem>();

    /**
     * TODO: Model Documentation for CultivationProblem
     * @return this.cultivationProblems Collection<CultivationProblem>
     */
    @OneToMany( mappedBy = "cropIssue") 
    public Collection<CultivationProblem> getCultivationProblems()
    {
        return this.cultivationProblems;
    }

    /**
     * TODO: Model Documentation for CultivationProblem
     * @param cultivationProblemsIn Collection<CultivationProblem>
     */
    public void setCultivationProblems(Collection<CultivationProblem> cultivationProblemsIn)
    {
        this.cultivationProblems = cultivationProblemsIn;
    }

    /**
     * TODO: Model Documentation for CultivationProblem
     * @param elementToAdd CultivationProblem
     * @return <tt>true</tt> if this collection changed as a result of the
     *         call
     */
    public boolean addCultivationProblems(CultivationProblem elementToAdd)
    {
        return this.cultivationProblems.add(elementToAdd);
    }

    /**
     * TODO: Model Documentation for CultivationProblem
     * @param elementToRemove CultivationProblem
     * @return <tt>true</tt> if this collection changed as a result of the
     *         call
     */
    public boolean removeCultivationProblems(CultivationProblem elementToRemove)
    {
        return this.cultivationProblems.remove(elementToRemove);
    }

    private Collection<Crop> crops = new HashSet<Crop>();

    /**
     * TODO: Model Documentation for Crop
     * @return this.crops Collection<Crop>
     */
    @ManyToMany( mappedBy = "issues")
    public Collection<Crop> getCrops()
    {
        return this.crops;
    }

    /**
     * TODO: Model Documentation for Crop
     * @param cropsIn Collection<Crop>
     */
    public void setCrops(Collection<Crop> cropsIn)
    {
        this.crops = cropsIn;
    }

    /**
     * TODO: Model Documentation for Crop
     * @param elementToAdd Crop
     * @return <tt>true</tt> if this collection changed as a result of the
     *         call
     */
    public boolean addCrops(Crop elementToAdd)
    {
        return this.crops.add(elementToAdd);
    }

    /**
     * TODO: Model Documentation for Crop
     * @param elementToRemove Crop
     * @return <tt>true</tt> if this collection changed as a result of the
     *         call
     */
    public boolean removeCrops(Crop elementToRemove)
    {
        return this.crops.remove(elementToRemove);
    }

    private Collection<CropType> cropTypes = new HashSet<CropType>();

    /**
     * TODO: Model Documentation for CropType
     * @return this.cropTypes Collection<CropType>
     */
    @ManyToMany( mappedBy = "cropIssues")
    public Collection<CropType> getCropTypes()
    {
        return this.cropTypes;
    }

    /**
     * TODO: Model Documentation for CropType
     * @param cropTypesIn Collection<CropType>
     */
    public void setCropTypes(Collection<CropType> cropTypesIn)
    {
        this.cropTypes = cropTypesIn;
    }

    /**
     * TODO: Model Documentation for CropType
     * @param elementToAdd CropType
     * @return <tt>true</tt> if this collection changed as a result of the
     *         call
     */
    public boolean addCropTypes(CropType elementToAdd)
    {
        return this.cropTypes.add(elementToAdd);
    }

    /**
     * TODO: Model Documentation for CropType
     * @param elementToRemove CropType
     * @return <tt>true</tt> if this collection changed as a result of the
     *         call
     */
    public boolean removeCropTypes(CropType elementToRemove)
    {
        return this.cropTypes.remove(elementToRemove);
    }

    /**
     * Returns <code>true</code> if the argument is an CropIssue instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof CropIssue))
        {
            return false;
        }
        final CropIssue that = (CropIssue)object;
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
     * Constructs new instances of {@link CropIssue}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link CropIssue}.
         * @return new CropIssue()
         */
        public static CropIssue newInstance()
        {
            return new CropIssue();
        }

        /**
         * Constructs a new instance of {@link CropIssue}, taking all required and/or
         * read-only properties as arguments, except for identifiers.
         * @param createdBy String
         * @param createdDate LocalDateTime
         * @param name String
         * @param scientificName String
         * @param issue CropIssueType
         * @return newInstance
         */
        public static CropIssue newInstance(String createdBy, LocalDateTime createdDate, String name, String scientificName, CropIssueType issue)
        {
            final CropIssue entity = new CropIssue();
            entity.setCreatedBy(createdBy);
            entity.setCreatedDate(createdDate);
            entity.setName(name);
            entity.setScientificName(scientificName);
            entity.setIssue(issue);
            return entity;
        }

        /**
         * Constructs a new instance of {@link CropIssue}, taking all possible properties
         * (except the identifier(s))as arguments.
         * @param createdBy String
         * @param updatedBy String
         * @param updatedDate LocalDateTime
         * @param createdDate LocalDateTime
         * @param name String
         * @param scientificName String
         * @param images Collection<File>
         * @param description String
         * @param issue CropIssueType
         * @param cultivationProblems Collection<CultivationProblem>
         * @param crops Collection<Crop>
         * @param cropTypes Collection<CropType>
         * @return newInstance CropIssue
         */
        public static CropIssue newInstance(String createdBy, String updatedBy, LocalDateTime updatedDate, LocalDateTime createdDate, String name, String scientificName, Collection<File> images, String description, CropIssueType issue, Collection<CultivationProblem> cultivationProblems, Collection<Crop> crops, Collection<CropType> cropTypes)
        {
            final CropIssue entity = new CropIssue();
            entity.setCreatedBy(createdBy);
            entity.setUpdatedBy(updatedBy);
            entity.setUpdatedDate(updatedDate);
            entity.setCreatedDate(createdDate);
            entity.setName(name);
            entity.setScientificName(scientificName);
            entity.setImages(images);
            entity.setDescription(description);
            entity.setIssue(issue);
            entity.setCultivationProblems(cultivationProblems);
            entity.setCrops(crops);
            entity.setCropTypes(cropTypes);
            return entity;
        }
    }

    /**
     * @param other
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     * @see Comparable#compareTo
     */
    @Override
    public int compareTo(CropIssue other)
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
            if (this.getName() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getName().compareTo(other.getName()));
            }
            if (this.getScientificName() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getScientificName().compareTo(other.getScientificName()));
            }
            if (this.getImages() != null)
            {
                // Compare Collection sizes for ordering
                cmp = (cmp != 0 ? cmp : Math.abs(this.getImages().size()-other.getImages().size()));
            }
            if (this.getDescription() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getDescription().compareTo(other.getDescription()));
            }
            if (this.getIssue() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getIssue().compareTo(other.getIssue()));
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
        sb.append("CropIssue(");
        sb.append(" id=").append(getId());
        sb.append(" createdBy=").append(getCreatedBy());
        sb.append(" updatedBy=").append(getUpdatedBy());
        sb.append(" updatedDate=").append(getUpdatedDate());
        sb.append(" createdDate=").append(getCreatedDate());
        sb.append(" name=").append(getName());
        sb.append(" scientificName=").append(getScientificName());
        sb.append(" images=").append(getImages());
        sb.append(" description=").append(getDescription());
        sb.append(" issue=").append(getIssue());
        sb.append(")");
        return sb.toString();
    }
// HibernateEntity.vsl merge-point
}