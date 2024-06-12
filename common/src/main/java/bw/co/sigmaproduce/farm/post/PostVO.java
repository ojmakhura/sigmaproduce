// license-header java merge-point
//
/**
 * @author Generated by ValueObject.vsl in andromda-java-cartridge on 06/12/2024 19:31:22+0200 Do not modify by hand!
 *
 * TEMPLATE:     ValueObject.vsl in andromda-java-cartridge.
 * MODEL CLASS:  AndroMDAModel::backend::bw.co.sigmaproduce::farm::post::PostVO
 * STEREOTYPE:   ValueObject
 */
package bw.co.sigmaproduce.farm.post;

import bw.co.sigmaproduce.farm.FarmVO;
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
 * TODO: Model Documentation for PostVO
 */
public class PostVO
    implements Serializable, Comparable<PostVO>
{
    /** The serial version UID of this class. Needed for serialization. */
    private static final long serialVersionUID = 8859673359667717398L;

    // Class attributes
    /**
     * TODO: Model Documentation for PostVO.id
     */
    protected String id;
    /**
     * TODO: Model Documentation for PostVO.createdBy
     */
    protected String createdBy;
    /**
     * TODO: Model Documentation for PostVO.updatedBy
     */
    protected String updatedBy;
    /**
     * TODO: Model Documentation for PostVO.createdDate
     */
    protected LocalDateTime createdDate;
    /**
     * TODO: Model Documentation for PostVO.updatedDate
     */
    protected LocalDateTime updatedDate;
    /**
     * TODO: Model Documentation for PostVO.content
     */
    protected String content;
    /**
     * TODO: Model Documentation for PostVO.images
     */
    protected Collection<File> images;
    /**
     * TODO: Model Documentation for PostVO.farm
     */
    protected FarmVO farm;

    /** Default Constructor with no properties */
    public PostVO()
    {
        // Documented empty block - avoid compiler warning - no super constructor
    }

    /**
     * Constructor taking only required properties
     * @param farmIn FarmVO TODO: Model Documentation for PostVO.farm
     */
    public PostVO(final FarmVO farmIn)
    {
        this.farm = farmIn;
    }

    /**
     * Constructor with all properties
     * @param idIn String
     * @param createdByIn String
     * @param updatedByIn String
     * @param createdDateIn LocalDateTime
     * @param updatedDateIn LocalDateTime
     * @param contentIn String
     * @param imagesIn Collection<File>
     * @param farmIn FarmVO
     */
    public PostVO(final String idIn, final String createdByIn, final String updatedByIn, final LocalDateTime createdDateIn, final LocalDateTime updatedDateIn, final String contentIn, final Collection<File> imagesIn, final FarmVO farmIn)
    {
        this.id = idIn;
        this.createdBy = createdByIn;
        this.updatedBy = updatedByIn;
        this.createdDate = createdDateIn;
        this.updatedDate = updatedDateIn;
        this.content = contentIn;
        this.images = imagesIn;
        this.farm = farmIn;
    }

    /**
     * Copies constructor from other PostVO
     *
     * @param otherBean Cannot be <code>null</code>
     * @throws NullPointerException if the argument is <code>null</code>
     */
    public PostVO(final PostVO otherBean)
    {
        this.id = otherBean.getId();
        this.createdBy = otherBean.getCreatedBy();
        this.updatedBy = otherBean.getUpdatedBy();
        this.createdDate = otherBean.getCreatedDate();
        this.updatedDate = otherBean.getUpdatedDate();
        this.content = otherBean.getContent();
        this.images = otherBean.getImages();
        this.farm = otherBean.getFarm();
    }

    /**
     * Copies all properties from the argument value object into this value object.
     * @param otherBean Cannot be <code>null</code>
     */
    public void copy(final PostVO otherBean)
    {
        if (null != otherBean)
        {
            this.setId(otherBean.getId());
            this.setCreatedBy(otherBean.getCreatedBy());
            this.setUpdatedBy(otherBean.getUpdatedBy());
            this.setCreatedDate(otherBean.getCreatedDate());
            this.setUpdatedDate(otherBean.getUpdatedDate());
            this.setContent(otherBean.getContent());
            this.setImages(otherBean.getImages());
            this.setFarm(otherBean.getFarm());
        }
    }

    /**
     * TODO: Model Documentation for PostVO.id
     * Get the id Attribute
     * @return id String
     */
    public String getId()
    {
        return this.id;
    }

    /**
     * TODO: Model Documentation for PostVO.id
     * @param value String
     */
    public void setId(final String value)
    {
        this.id = value;
    }

    /**
     * TODO: Model Documentation for PostVO.createdBy
     * Get the createdBy Attribute
     * @return createdBy String
     */
    public String getCreatedBy()
    {
        return this.createdBy;
    }

    /**
     * TODO: Model Documentation for PostVO.createdBy
     * @param value String
     */
    public void setCreatedBy(final String value)
    {
        this.createdBy = value;
    }

    /**
     * TODO: Model Documentation for PostVO.updatedBy
     * Get the updatedBy Attribute
     * @return updatedBy String
     */
    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    /**
     * TODO: Model Documentation for PostVO.updatedBy
     * @param value String
     */
    public void setUpdatedBy(final String value)
    {
        this.updatedBy = value;
    }

    /**
     * TODO: Model Documentation for PostVO.createdDate
     * Get the createdDate Attribute
     * @return createdDate LocalDateTime
     */
    public LocalDateTime getCreatedDate()
    {
        return this.createdDate;
    }

    /**
     * TODO: Model Documentation for PostVO.createdDate
     * @param value LocalDateTime
     */
    public void setCreatedDate(final LocalDateTime value)
    {
        this.createdDate = value;
    }

    /**
     * TODO: Model Documentation for PostVO.updatedDate
     * Get the updatedDate Attribute
     * @return updatedDate LocalDateTime
     */
    public LocalDateTime getUpdatedDate()
    {
        return this.updatedDate;
    }

    /**
     * TODO: Model Documentation for PostVO.updatedDate
     * @param value LocalDateTime
     */
    public void setUpdatedDate(final LocalDateTime value)
    {
        this.updatedDate = value;
    }

    /**
     * TODO: Model Documentation for PostVO.content
     * Get the content Attribute
     * @return content String
     */
    public String getContent()
    {
        return this.content;
    }

    /**
     * TODO: Model Documentation for PostVO.content
     * @param value String
     */
    public void setContent(final String value)
    {
        this.content = value;
    }

    /**
     * TODO: Model Documentation for PostVO.images
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
     * TODO: Model Documentation for PostVO.images
     * @param value Collection<File>
     */
    public void setImages(final Collection<File> value)
    {
        this.images = value;
    }

    /**
     * TODO: Model Documentation for PostVO.farm
     * Get the farm Attribute
     * @return farm FarmVO
     */
    public FarmVO getFarm()
    {
        return this.farm;
    }

    /**
     * TODO: Model Documentation for PostVO.farm
     * @param value FarmVO
     */
    public void setFarm(final FarmVO value)
    {
        this.farm = value;
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
        PostVO rhs = (PostVO) object;
        return new EqualsBuilder()
            .append(this.getId(), rhs.getId())
            .append(this.getCreatedBy(), rhs.getCreatedBy())
            .append(this.getUpdatedBy(), rhs.getUpdatedBy())
            .append(this.getCreatedDate(), rhs.getCreatedDate())
            .append(this.getUpdatedDate(), rhs.getUpdatedDate())
            .append(this.getContent(), rhs.getContent())
            .append(this.getImages(), rhs.getImages())
            .append(this.getFarm(), rhs.getFarm())
            .isEquals();
    }

    /**
     * @param object to compare this object against
     * @return int if equal
     * @see Comparable#compareTo(Object)
     */
    public int compareTo(final PostVO object)
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
            .append(this.getContent(), object.getContent())
            .append(this.getImages(), object.getImages())
            .append(this.getFarm(), object.getFarm())
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
            .append(this.getContent())
            .append(this.getImages())
            .append(this.getFarm())
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
        builder.append("\t,\"content\" : \"" + this.getContent() + "\"");
        builder.append("\t,\"images\" : \"" + this.getImages() + "\"");
        builder.append("\t,\"farm\" : \"" + this.getFarm() + "\"");
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

        final PostVO that = (PostVO)thatObject;
        return
            equal(this.getId(), that.getId())
            && equal(this.getCreatedBy(), that.getCreatedBy())
            && equal(this.getUpdatedBy(), that.getUpdatedBy())
            && equal(this.getCreatedDate(), that.getCreatedDate())
            && equal(this.getUpdatedDate(), that.getUpdatedDate())
            && equal(this.getContent(), that.getContent())
            && equal(this.getImages(), that.getImages())
            && equal(this.getFarm(), that.getFarm())
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

    // PostVO value-object java merge-point
}