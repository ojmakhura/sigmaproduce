// license-header java merge-point
//
/**
 * @author Generated by ValueObject.vsl in andromda-java-cartridge on 06/12/2024 19:31:22+0200 Do not modify by hand!
 *
 * TEMPLATE:     ValueObject.vsl in andromda-java-cartridge.
 * MODEL CLASS:  AndroMDAModel::backend::bw.co.sigmaproduce::farm::cultivation::CultivationListVO
 * STEREOTYPE:   ValueObject
 */
package bw.co.sigmaproduce.farm.cultivation;

import bw.co.sigmaproduce.farm.Unit;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * TODO: Model Documentation for CultivationListVO
 */
public class CultivationListVO
    implements Serializable, Comparable<CultivationListVO>
{
    /** The serial version UID of this class. Needed for serialization. */
    private static final long serialVersionUID = 5700869849887978220L;

    // Class attributes
    /**
     * TODO: Model Documentation for CultivationListVO.id
     */
    protected String id;
    /**
     * TODO: Model Documentation for CultivationListVO.createdBy
     */
    protected String createdBy;
    /**
     * TODO: Model Documentation for CultivationListVO.updatedBy
     */
    protected String updatedBy;
    /**
     * TODO: Model Documentation for
     * CultivationListVO.createdDate
     */
    protected LocalDateTime createdDate;
    /**
     * TODO: Model Documentation for
     * CultivationListVO.updatedDate
     */
    protected LocalDateTime updatedDate;
    /**
     * TODO: Model Documentation for CultivationListVO.crop
     */
    protected String crop;
    /**
     * TODO: Model Documentation for
     * CultivationListVO.cropVariety
     */
    protected String cropVariety;
    /**
     * TODO: Model Documentation for CultivationListVO.size
     */
    protected Double size;
    /**
     * TODO: Model Documentation for CultivationListVO.unit
     */
    protected Unit unit;
    /**
     * TODO: Model Documentation for CultivationListVO.farm
     */
    protected String farm;
    /**
     * TODO: Model Documentation for CultivationListVO.farmId
     */
    protected String farmId;
    /**
     * TODO: Model Documentation for
     * CultivationListVO.cropVarietyId
     */
    protected String cropVarietyId;

    /**
     * Constructor taking only required properties
     */
    public CultivationListVO()
    {
        // Documented empty block - avoid compiler warning - no super constructor
    }

    /**
     * Constructor with all properties
     * @param idIn String
     * @param createdByIn String
     * @param updatedByIn String
     * @param createdDateIn LocalDateTime
     * @param updatedDateIn LocalDateTime
     * @param cropIn String
     * @param cropVarietyIn String
     * @param sizeIn Double
     * @param unitIn Unit
     * @param farmIn String
     * @param farmIdIn String
     * @param cropVarietyIdIn String
     */
    public CultivationListVO(final String idIn, final String createdByIn, final String updatedByIn, final LocalDateTime createdDateIn, final LocalDateTime updatedDateIn, final String cropIn, final String cropVarietyIn, final Double sizeIn, final Unit unitIn, final String farmIn, final String farmIdIn, final String cropVarietyIdIn)
    {
        this.id = idIn;
        this.createdBy = createdByIn;
        this.updatedBy = updatedByIn;
        this.createdDate = createdDateIn;
        this.updatedDate = updatedDateIn;
        this.crop = cropIn;
        this.cropVariety = cropVarietyIn;
        this.size = sizeIn;
        this.unit = unitIn;
        this.farm = farmIn;
        this.farmId = farmIdIn;
        this.cropVarietyId = cropVarietyIdIn;
    }

    /**
     * Copies constructor from other CultivationListVO
     *
     * @param otherBean Cannot be <code>null</code>
     * @throws NullPointerException if the argument is <code>null</code>
     */
    public CultivationListVO(final CultivationListVO otherBean)
    {
        this.id = otherBean.getId();
        this.createdBy = otherBean.getCreatedBy();
        this.updatedBy = otherBean.getUpdatedBy();
        this.createdDate = otherBean.getCreatedDate();
        this.updatedDate = otherBean.getUpdatedDate();
        this.crop = otherBean.getCrop();
        this.cropVariety = otherBean.getCropVariety();
        this.size = otherBean.getSize();
        this.unit = otherBean.getUnit();
        this.farm = otherBean.getFarm();
        this.farmId = otherBean.getFarmId();
        this.cropVarietyId = otherBean.getCropVarietyId();
    }

    /**
     * Copies all properties from the argument value object into this value object.
     * @param otherBean Cannot be <code>null</code>
     */
    public void copy(final CultivationListVO otherBean)
    {
        if (null != otherBean)
        {
            this.setId(otherBean.getId());
            this.setCreatedBy(otherBean.getCreatedBy());
            this.setUpdatedBy(otherBean.getUpdatedBy());
            this.setCreatedDate(otherBean.getCreatedDate());
            this.setUpdatedDate(otherBean.getUpdatedDate());
            this.setCrop(otherBean.getCrop());
            this.setCropVariety(otherBean.getCropVariety());
            this.setSize(otherBean.getSize());
            this.setUnit(otherBean.getUnit());
            this.setFarm(otherBean.getFarm());
            this.setFarmId(otherBean.getFarmId());
            this.setCropVarietyId(otherBean.getCropVarietyId());
        }
    }

    /**
     * TODO: Model Documentation for CultivationListVO.id
     * Get the id Attribute
     * @return id String
     */
    public String getId()
    {
        return this.id;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.id
     * @param value String
     */
    public void setId(final String value)
    {
        this.id = value;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.createdBy
     * Get the createdBy Attribute
     * @return createdBy String
     */
    public String getCreatedBy()
    {
        return this.createdBy;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.createdBy
     * @param value String
     */
    public void setCreatedBy(final String value)
    {
        this.createdBy = value;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.updatedBy
     * Get the updatedBy Attribute
     * @return updatedBy String
     */
    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.updatedBy
     * @param value String
     */
    public void setUpdatedBy(final String value)
    {
        this.updatedBy = value;
    }

    /**
     * TODO: Model Documentation for
     * CultivationListVO.createdDate
     * Get the createdDate Attribute
     * @return createdDate LocalDateTime
     */
    public LocalDateTime getCreatedDate()
    {
        return this.createdDate;
    }

    /**
     * TODO: Model Documentation for
     * CultivationListVO.createdDate
     * @param value LocalDateTime
     */
    public void setCreatedDate(final LocalDateTime value)
    {
        this.createdDate = value;
    }

    /**
     * TODO: Model Documentation for
     * CultivationListVO.updatedDate
     * Get the updatedDate Attribute
     * @return updatedDate LocalDateTime
     */
    public LocalDateTime getUpdatedDate()
    {
        return this.updatedDate;
    }

    /**
     * TODO: Model Documentation for
     * CultivationListVO.updatedDate
     * @param value LocalDateTime
     */
    public void setUpdatedDate(final LocalDateTime value)
    {
        this.updatedDate = value;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.crop
     * Get the crop Attribute
     * @return crop String
     */
    public String getCrop()
    {
        return this.crop;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.crop
     * @param value String
     */
    public void setCrop(final String value)
    {
        this.crop = value;
    }

    /**
     * TODO: Model Documentation for
     * CultivationListVO.cropVariety
     * Get the cropVariety Attribute
     * @return cropVariety String
     */
    public String getCropVariety()
    {
        return this.cropVariety;
    }

    /**
     * TODO: Model Documentation for
     * CultivationListVO.cropVariety
     * @param value String
     */
    public void setCropVariety(final String value)
    {
        this.cropVariety = value;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.size
     * Get the size Attribute
     * @return size Double
     */
    public Double getSize()
    {
        return this.size;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.size
     * @param value Double
     */
    public void setSize(final Double value)
    {
        this.size = value;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.unit
     * Get the unit Attribute
     * @return unit Unit
     */
    public Unit getUnit()
    {
        return this.unit;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.unit
     * @param value Unit
     */
    public void setUnit(final Unit value)
    {
        this.unit = value;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.farm
     * Get the farm Attribute
     * @return farm String
     */
    public String getFarm()
    {
        return this.farm;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.farm
     * @param value String
     */
    public void setFarm(final String value)
    {
        this.farm = value;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.farmId
     * Get the farmId Attribute
     * @return farmId String
     */
    public String getFarmId()
    {
        return this.farmId;
    }

    /**
     * TODO: Model Documentation for CultivationListVO.farmId
     * @param value String
     */
    public void setFarmId(final String value)
    {
        this.farmId = value;
    }

    /**
     * TODO: Model Documentation for
     * CultivationListVO.cropVarietyId
     * Get the cropVarietyId Attribute
     * @return cropVarietyId String
     */
    public String getCropVarietyId()
    {
        return this.cropVarietyId;
    }

    /**
     * TODO: Model Documentation for
     * CultivationListVO.cropVarietyId
     * @param value String
     */
    public void setCropVarietyId(final String value)
    {
        this.cropVarietyId = value;
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
        CultivationListVO rhs = (CultivationListVO) object;
        return new EqualsBuilder()
            .append(this.getId(), rhs.getId())
            .append(this.getCreatedBy(), rhs.getCreatedBy())
            .append(this.getUpdatedBy(), rhs.getUpdatedBy())
            .append(this.getCreatedDate(), rhs.getCreatedDate())
            .append(this.getUpdatedDate(), rhs.getUpdatedDate())
            .append(this.getCrop(), rhs.getCrop())
            .append(this.getCropVariety(), rhs.getCropVariety())
            .append(this.getSize(), rhs.getSize())
            .append(this.getUnit(), rhs.getUnit())
            .append(this.getFarm(), rhs.getFarm())
            .append(this.getFarmId(), rhs.getFarmId())
            .append(this.getCropVarietyId(), rhs.getCropVarietyId())
            .isEquals();
    }

    /**
     * @param object to compare this object against
     * @return int if equal
     * @see Comparable#compareTo(Object)
     */
    public int compareTo(final CultivationListVO object)
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
            .append(this.getCrop(), object.getCrop())
            .append(this.getCropVariety(), object.getCropVariety())
            .append(this.getSize(), object.getSize())
            .append(this.getUnit(), object.getUnit())
            .append(this.getFarm(), object.getFarm())
            .append(this.getFarmId(), object.getFarmId())
            .append(this.getCropVarietyId(), object.getCropVarietyId())
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
            .append(this.getCrop())
            .append(this.getCropVariety())
            .append(this.getSize())
            .append(this.getUnit())
            .append(this.getFarm())
            .append(this.getFarmId())
            .append(this.getCropVarietyId())
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
        builder.append("\t,\"crop\" : \"" + this.getCrop() + "\"");
        builder.append("\t,\"cropVariety\" : \"" + this.getCropVariety() + "\"");
        builder.append("\t,\"size\" : \"" + this.getSize() + "\"");
        builder.append("\t,\"unit\" : \"" + this.getUnit() + "\"");
        builder.append("\t,\"farm\" : \"" + this.getFarm() + "\"");
        builder.append("\t,\"farmId\" : \"" + this.getFarmId() + "\"");
        builder.append("\t,\"cropVarietyId\" : \"" + this.getCropVarietyId() + "\"");
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

        final CultivationListVO that = (CultivationListVO)thatObject;
        return
            equal(this.getId(), that.getId())
            && equal(this.getCreatedBy(), that.getCreatedBy())
            && equal(this.getUpdatedBy(), that.getUpdatedBy())
            && equal(this.getCreatedDate(), that.getCreatedDate())
            && equal(this.getUpdatedDate(), that.getUpdatedDate())
            && equal(this.getCrop(), that.getCrop())
            && equal(this.getCropVariety(), that.getCropVariety())
            && equal(this.getSize(), that.getSize())
            && equal(this.getUnit(), that.getUnit())
            && equal(this.getFarm(), that.getFarm())
            && equal(this.getFarmId(), that.getFarmId())
            && equal(this.getCropVarietyId(), that.getCropVarietyId())
        ;
    }

    /**
     * This is a convenient helper method which is able to detect whether or not two values are equal. Two values
     * are equal when they are both {@code null}, are arrays of the same length with equal elements or are
     * equal objects (this includes {@link java.util.Collection} and {@link java.util.Map} instances).
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
        else // note that the following also covers java.util.Collection and java.util.Map
        {
            equal = first.equals(second);
        }

        return equal;
    }

    // CultivationListVO value-object java merge-point
}