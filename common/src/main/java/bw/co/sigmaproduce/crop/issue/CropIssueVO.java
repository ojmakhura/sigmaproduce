// license-header java merge-point
//
/**
 * @author Generated by ValueObject.vsl in andromda-java-cartridge on 06/12/2024 19:31:21+0200 Do not modify by hand!
 *
 * TEMPLATE:     ValueObject.vsl in andromda-java-cartridge.
 * MODEL CLASS:  AndroMDAModel::backend::bw.co.sigmaproduce::crop::issue::CropIssueVO
 * STEREOTYPE:   ValueObject
 */
package bw.co.sigmaproduce.crop.issue;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * TODO: Model Documentation for CropIssueVO
 */
public class CropIssueVO
    implements Serializable, Comparable<CropIssueVO>
{
    /** The serial version UID of this class. Needed for serialization. */
    private static final long serialVersionUID = -6368655855508458403L;

    // Class attributes
    /**
     * TODO: Model Documentation for CropIssueVO.id
     */
    protected String id;
    /**
     * TODO: Model Documentation for CropIssueVO.createdBy
     */
    protected String createdBy;
    /**
     * TODO: Model Documentation for CropIssueVO.updatedBy
     */
    protected String updatedBy;
    /**
     * TODO: Model Documentation for CropIssueVO.createdDate
     */
    protected LocalDateTime createdDate;
    /**
     * TODO: Model Documentation for CropIssueVO.updatedDate
     */
    protected LocalDateTime updatedDate;
    /**
     * TODO: Model Documentation for CropIssueVO.issueType
     */
    protected CropIssueType issueType;
    /**
     * TODO: Model Documentation for CropIssueVO.name
     */
    protected String name;
    /**
     * TODO: Model Documentation for CropIssueVO.scientificName
     */
    protected String scientificName;
    /**
     * TODO: Model Documentation for CropIssueVO.images
     */
    protected Collection<File> images;
    /**
     * TODO: Model Documentation for CropIssueVO.description
     */
    protected String description;

    /** Default Constructor with no properties */
    public CropIssueVO()
    {
        // Documented empty block - avoid compiler warning - no super constructor
    }

    /**
     * Constructor taking only required properties
     * @param issueTypeIn CropIssueType TODO: Model Documentation for CropIssueVO.issueType
     * @param nameIn String TODO: Model Documentation for CropIssueVO.name
     * @param scientificNameIn String TODO: Model Documentation for CropIssueVO.scientificName
     */
    public CropIssueVO(final CropIssueType issueTypeIn, final String nameIn, final String scientificNameIn)
    {
        this.issueType = issueTypeIn;
        this.name = nameIn;
        this.scientificName = scientificNameIn;
    }

    /**
     * Constructor with all properties
     * @param idIn String
     * @param createdByIn String
     * @param updatedByIn String
     * @param createdDateIn LocalDateTime
     * @param updatedDateIn LocalDateTime
     * @param issueTypeIn CropIssueType
     * @param nameIn String
     * @param scientificNameIn String
     * @param imagesIn Collection<File>
     * @param descriptionIn String
     */
    public CropIssueVO(final String idIn, final String createdByIn, final String updatedByIn, final LocalDateTime createdDateIn, final LocalDateTime updatedDateIn, final CropIssueType issueTypeIn, final String nameIn, final String scientificNameIn, final Collection<File> imagesIn, final String descriptionIn)
    {
        this.id = idIn;
        this.createdBy = createdByIn;
        this.updatedBy = updatedByIn;
        this.createdDate = createdDateIn;
        this.updatedDate = updatedDateIn;
        this.issueType = issueTypeIn;
        this.name = nameIn;
        this.scientificName = scientificNameIn;
        this.images = imagesIn;
        this.description = descriptionIn;
    }

    /**
     * Copies constructor from other CropIssueVO
     *
     * @param otherBean Cannot be <code>null</code>
     * @throws NullPointerException if the argument is <code>null</code>
     */
    public CropIssueVO(final CropIssueVO otherBean)
    {
        this.id = otherBean.getId();
        this.createdBy = otherBean.getCreatedBy();
        this.updatedBy = otherBean.getUpdatedBy();
        this.createdDate = otherBean.getCreatedDate();
        this.updatedDate = otherBean.getUpdatedDate();
        this.issueType = otherBean.getIssueType();
        this.name = otherBean.getName();
        this.scientificName = otherBean.getScientificName();
        this.images = otherBean.getImages();
        this.description = otherBean.getDescription();
    }

    /**
     * Copies all properties from the argument value object into this value object.
     * @param otherBean Cannot be <code>null</code>
     */
    public void copy(final CropIssueVO otherBean)
    {
        if (null != otherBean)
        {
            this.setId(otherBean.getId());
            this.setCreatedBy(otherBean.getCreatedBy());
            this.setUpdatedBy(otherBean.getUpdatedBy());
            this.setCreatedDate(otherBean.getCreatedDate());
            this.setUpdatedDate(otherBean.getUpdatedDate());
            this.setIssueType(otherBean.getIssueType());
            this.setName(otherBean.getName());
            this.setScientificName(otherBean.getScientificName());
            this.setImages(otherBean.getImages());
            this.setDescription(otherBean.getDescription());
        }
    }

    /**
     * TODO: Model Documentation for CropIssueVO.id
     * Get the id Attribute
     * @return id String
     */
    public String getId()
    {
        return this.id;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.id
     * @param value String
     */
    public void setId(final String value)
    {
        this.id = value;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.createdBy
     * Get the createdBy Attribute
     * @return createdBy String
     */
    public String getCreatedBy()
    {
        return this.createdBy;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.createdBy
     * @param value String
     */
    public void setCreatedBy(final String value)
    {
        this.createdBy = value;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.updatedBy
     * Get the updatedBy Attribute
     * @return updatedBy String
     */
    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.updatedBy
     * @param value String
     */
    public void setUpdatedBy(final String value)
    {
        this.updatedBy = value;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.createdDate
     * Get the createdDate Attribute
     * @return createdDate LocalDateTime
     */
    public LocalDateTime getCreatedDate()
    {
        return this.createdDate;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.createdDate
     * @param value LocalDateTime
     */
    public void setCreatedDate(final LocalDateTime value)
    {
        this.createdDate = value;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.updatedDate
     * Get the updatedDate Attribute
     * @return updatedDate LocalDateTime
     */
    public LocalDateTime getUpdatedDate()
    {
        return this.updatedDate;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.updatedDate
     * @param value LocalDateTime
     */
    public void setUpdatedDate(final LocalDateTime value)
    {
        this.updatedDate = value;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.issueType
     * Get the issueType Attribute
     * @return issueType CropIssueType
     */
    public CropIssueType getIssueType()
    {
        return this.issueType;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.issueType
     * @param value CropIssueType
     */
    public void setIssueType(final CropIssueType value)
    {
        this.issueType = value;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.name
     * Get the name Attribute
     * @return name String
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.name
     * @param value String
     */
    public void setName(final String value)
    {
        this.name = value;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.scientificName
     * Get the scientificName Attribute
     * @return scientificName String
     */
    public String getScientificName()
    {
        return this.scientificName;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.scientificName
     * @param value String
     */
    public void setScientificName(final String value)
    {
        this.scientificName = value;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.images
     * Get the images Attribute
     * @return images Collection<File>
     */
    public Collection<File> getImages()
    {
        if (this.images == null)
        {
            this.images = new ArrayList<File>();
        }
        return this.images;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.images
     * @param value Collection<File>
     */
    public void setImages(final Collection<File> value)
    {
        this.images = value;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.description
     * Get the description Attribute
     * @return description String
     */
    public String getDescription()
    {
        return this.description;
    }

    /**
     * TODO: Model Documentation for CropIssueVO.description
     * @param value String
     */
    public void setDescription(final String value)
    {
        this.description = value;
    }

    /**
     * @param object to compare this object against
     * @return boolean if equal
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(final Object object)
    {
        if (object==null || object.getClass() != this.getClass())
        {
             return false;
        }
        // Check if the same object instance
        if (object==this)
        {
            return true;
        }
        CropIssueVO rhs = (CropIssueVO) object;
        return new EqualsBuilder()
            .append(this.getId(), rhs.getId())
            .append(this.getCreatedBy(), rhs.getCreatedBy())
            .append(this.getUpdatedBy(), rhs.getUpdatedBy())
            .append(this.getCreatedDate(), rhs.getCreatedDate())
            .append(this.getUpdatedDate(), rhs.getUpdatedDate())
            .append(this.getIssueType(), rhs.getIssueType())
            .append(this.getName(), rhs.getName())
            .append(this.getScientificName(), rhs.getScientificName())
            .append(this.getImages(), rhs.getImages())
            .append(this.getDescription(), rhs.getDescription())
            .isEquals();
    }

    /**
     * @param object to compare this object against
     * @return int if equal
     * @see Comparable#compareTo(Object)
     */
    public int compareTo(final CropIssueVO object)
    {
        if (object==null)
        {
            return -1;
        }
        // Check if the same object instance
        if (object==this)
        {
            return 0;
        }
        return new CompareToBuilder()
            .append(this.getId(), object.getId())
            .append(this.getCreatedBy(), object.getCreatedBy())
            .append(this.getUpdatedBy(), object.getUpdatedBy())
            .append(this.getCreatedDate(), object.getCreatedDate())
            .append(this.getUpdatedDate(), object.getUpdatedDate())
            .append(this.getIssueType(), object.getIssueType())
            .append(this.getName(), object.getName())
            .append(this.getScientificName(), object.getScientificName())
            .append(this.getImages(), object.getImages())
            .append(this.getDescription(), object.getDescription())
            .toComparison();
    }

    /**
     * @return int hashCode value
     * @see Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        return new HashCodeBuilder(1249046965, -82296885)
            .append(this.getId())
            .append(this.getCreatedBy())
            .append(this.getUpdatedBy())
            .append(this.getCreatedDate())
            .append(this.getUpdatedDate())
            .append(this.getIssueType())
            .append(this.getName())
            .append(this.getScientificName())
            .append(this.getImages())
            .append(this.getDescription())
            .toHashCode();
    }

    /**
     * @return String representation of object
     * @see Object#toString()
     */
    @Override
    public String toString()
    {

        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        builder.append("\t\"id\" : \"" + this.getId() + "\"");
        builder.append("\t,\"createdBy\" : \"" + this.getCreatedBy() + "\"");
        builder.append("\t,\"updatedBy\" : \"" + this.getUpdatedBy() + "\"");
        builder.append("\t,\"createdDate\" : \"" + this.getCreatedDate() + "\"");
        builder.append("\t,\"updatedDate\" : \"" + this.getUpdatedDate() + "\"");
        builder.append("\t,\"issueType\" : \"" + this.getIssueType() + "\"");
        builder.append("\t,\"name\" : \"" + this.getName() + "\"");
        builder.append("\t,\"scientificName\" : \"" + this.getScientificName() + "\"");
        builder.append("\t,\"images\" : \"" + this.getImages() + "\"");
        builder.append("\t,\"description\" : \"" + this.getDescription() + "\"");
        builder.append("}");
        return builder.toString();

    }

    /**
     * Compares the properties of this instance to the properties of the argument. This method will return
     * {@code false} as soon as it detects that the argument is {@code null} or not of the same type as
     * (or a sub-type of) this instance's type.
     *
     * <p/>For array, collection or map properties the comparison will be done one level deep, in other words:
     * the elements will be compared using the {@code equals()} operation.
     *
     * <p/>Note that two properties will be considered equal when both values are {@code null}.
     *
     * @param thatObject the object containing the properties to compare against this instance
     * @return this method will return {@code true} in case the argument has the same type as this class, or is a
     *      sub-type of this class and all properties as found on this class have equal values when queried on that
     *      argument instance; in all other cases this method will return {@code false}
     */
    public boolean equalProperties(final Object thatObject)
    {
        if (thatObject == null || !this.getClass().isAssignableFrom(thatObject.getClass()))
        {
            return false;
        }

        final CropIssueVO that = (CropIssueVO)thatObject;
        return
            equal(this.getId(), that.getId())
            && equal(this.getCreatedBy(), that.getCreatedBy())
            && equal(this.getUpdatedBy(), that.getUpdatedBy())
            && equal(this.getCreatedDate(), that.getCreatedDate())
            && equal(this.getUpdatedDate(), that.getUpdatedDate())
            && equal(this.getIssueType(), that.getIssueType())
            && equal(this.getName(), that.getName())
            && equal(this.getScientificName(), that.getScientificName())
            && equal(this.getImages(), that.getImages())
            && equal(this.getDescription(), that.getDescription())
        ;
    }

    /**
     * This is a convenient helper method which is able to detect whether or not two values are equal. Two values
     * are equal when they are both {@code null}, are arrays of the same length with equal elements or are
     * equal objects (this includes {@link Collection} and {@link java.util.Map} instances).
     *
     * <p/>Note that for array, collection or map instances the comparison runs one level deep.
     *
     * @param first the first object to compare, may be {@code null}
     * @param second the second object to compare, may be {@code null}
     * @return this method will return {@code true} in case both objects are equal as explained above;
     *      in all other cases this method will return {@code false}
     */
    protected static boolean equal(final Object first, final Object second)
    {
        final boolean equal;

        if (first == null)
        {
            equal = (second == null);
        }
        else if (first.getClass().isArray() && (second != null) && second.getClass().isArray())
        {
            equal = Arrays.equals((Object[])first, (Object[])second);
        }
        else // note that the following also covers Collection and java.util.Map
        {
            equal = first.equals(second);
        }

        return equal;
    }

    // CropIssueVO value-object java merge-point
}