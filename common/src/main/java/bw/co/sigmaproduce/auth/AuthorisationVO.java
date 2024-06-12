// license-header java merge-point
//
/**
 * @author Generated by ValueObject.vsl in andromda-java-cartridge on 05/31/2024 22:50:45+0200 Do not modify by hand!
 *
 * TEMPLATE:     ValueObject.vsl in andromda-java-cartridge.
 * MODEL CLASS:  bocraportal::backend::bw.co.sigmaproduce::auth::AuthorisationVO
 * STEREOTYPE:   FrontEndTable
 * STEREOTYPE:   ValueObject
 */
package bw.co.sigmaproduce.auth;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import bw.co.sigmaproduce.access.AccessPointVO;

/**
 * TODO: Model Documentation for AuthorisationVO
 */
public class AuthorisationVO
    implements Serializable, Comparable<AuthorisationVO>
{
    /** The serial version UID of this class. Needed for serialization. */
    private static final long serialVersionUID = -8176899428572898108L;

    // Class attributes
    /**
     * TODO: Model Documentation for AuthorisationVO.id
     */
    protected Long id;
    /**
     * TODO: Model Documentation for AuthorisationVO.createdBy
     */
    protected String createdBy;
    /**
     * TODO: Model Documentation for AuthorisationVO.updatedBy
     */
    protected String updatedBy;
    /**
     * TODO: Model Documentation for AuthorisationVO.createdDate
     */
    protected LocalDateTime createdDate;
    /**
     * TODO: Model Documentation for AuthorisationVO.updatedDate
     */
    protected LocalDateTime updatedDate;
    /**
     * TODO: Model Documentation for AuthorisationVO.accessPoint
     */
    protected AccessPointVO accessPoint;
    /**
     * TODO: Model Documentation for AuthorisationVO.roles
     */
    protected Collection<String> roles;

    /** Default Constructor with no properties */
    public AuthorisationVO()
    {
        // Documented empty block - avoid compiler warning - no super constructor
    }

    /**
     * Constructor taking only required properties
     * @param accessPointIn AccessPointVO TODO: Model Documentation for AuthorisationVO.accessPoint
     */
    public AuthorisationVO(final AccessPointVO accessPointIn)
    {
        this.accessPoint = accessPointIn;
    }

    /**
     * Constructor with all properties
     * @param idIn Long
     * @param createdByIn String
     * @param updatedByIn String
     * @param createdDateIn LocalDateTime
     * @param updatedDateIn LocalDateTime
     * @param accessPointIn AccessPointVO
     * @param rolesIn Collection<String>
     */
    public AuthorisationVO(final Long idIn, final String createdByIn, final String updatedByIn, final LocalDateTime createdDateIn, final LocalDateTime updatedDateIn, final AccessPointVO accessPointIn, final Collection<String> rolesIn)
    {
        this.id = idIn;
        this.createdBy = createdByIn;
        this.updatedBy = updatedByIn;
        this.createdDate = createdDateIn;
        this.updatedDate = updatedDateIn;
        this.accessPoint = accessPointIn;
        this.roles = rolesIn;
    }

    /**
     * Copies constructor from other AuthorisationVO
     *
     * @param otherBean Cannot be <code>null</code>
     * @throws NullPointerException if the argument is <code>null</code>
     */
    public AuthorisationVO(final AuthorisationVO otherBean)
    {
        this.id = otherBean.getId();
        this.createdBy = otherBean.getCreatedBy();
        this.updatedBy = otherBean.getUpdatedBy();
        this.createdDate = otherBean.getCreatedDate();
        this.updatedDate = otherBean.getUpdatedDate();
        this.accessPoint = otherBean.getAccessPoint();
        this.roles = otherBean.getRoles();
    }

    /**
     * Copies all properties from the argument value object into this value object.
     * @param otherBean Cannot be <code>null</code>
     */
    public void copy(final AuthorisationVO otherBean)
    {
        if (null != otherBean)
        {
            this.setId(otherBean.getId());
            this.setCreatedBy(otherBean.getCreatedBy());
            this.setUpdatedBy(otherBean.getUpdatedBy());
            this.setCreatedDate(otherBean.getCreatedDate());
            this.setUpdatedDate(otherBean.getUpdatedDate());
            this.setAccessPoint(otherBean.getAccessPoint());
            this.setRoles(otherBean.getRoles());
        }
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.id
     * Get the id Attribute
     * @return id Long
     */
    public Long getId()
    {
        return this.id;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.id
     * @param value Long
     */
    public void setId(final Long value)
    {
        this.id = value;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.createdBy
     * Get the createdBy Attribute
     * @return createdBy String
     */
    public String getCreatedBy()
    {
        return this.createdBy;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.createdBy
     * @param value String
     */
    public void setCreatedBy(final String value)
    {
        this.createdBy = value;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.updatedBy
     * Get the updatedBy Attribute
     * @return updatedBy String
     */
    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.updatedBy
     * @param value String
     */
    public void setUpdatedBy(final String value)
    {
        this.updatedBy = value;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.createdDate
     * Get the createdDate Attribute
     * @return createdDate LocalDateTime
     */
    public LocalDateTime getCreatedDate()
    {
        return this.createdDate;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.createdDate
     * @param value LocalDateTime
     */
    public void setCreatedDate(final LocalDateTime value)
    {
        this.createdDate = value;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.updatedDate
     * Get the updatedDate Attribute
     * @return updatedDate LocalDateTime
     */
    public LocalDateTime getUpdatedDate()
    {
        return this.updatedDate;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.updatedDate
     * @param value LocalDateTime
     */
    public void setUpdatedDate(final LocalDateTime value)
    {
        this.updatedDate = value;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.accessPoint
     * Get the accessPoint Attribute
     * @return accessPoint AccessPointVO
     */
    public AccessPointVO getAccessPoint()
    {
        return this.accessPoint;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.accessPoint
     * @param value AccessPointVO
     */
    public void setAccessPoint(final AccessPointVO value)
    {
        this.accessPoint = value;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.roles
     * Get the roles Attribute
     * @return roles Collection<String>
     */
    public Collection<String> getRoles()
    {
        if (this.roles == null)
        {
            this.roles = new ArrayList<String>();
        }
        return this.roles;
    }

    /**
     * TODO: Model Documentation for AuthorisationVO.roles
     * @param value Collection<String>
     */
    public void setRoles(final Collection<String> value)
    {
        this.roles = value;
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
        AuthorisationVO rhs = (AuthorisationVO) object;
        return new EqualsBuilder()
            .append(this.getId(), rhs.getId())
            .append(this.getCreatedBy(), rhs.getCreatedBy())
            .append(this.getUpdatedBy(), rhs.getUpdatedBy())
            .append(this.getCreatedDate(), rhs.getCreatedDate())
            .append(this.getUpdatedDate(), rhs.getUpdatedDate())
            .append(this.getAccessPoint(), rhs.getAccessPoint())
            .append(this.getRoles(), rhs.getRoles())
            .isEquals();
    }

    /**
     * @param object to compare this object against
     * @return int if equal
     * @see Comparable#compareTo(Object)
     */
    public int compareTo(final AuthorisationVO object)
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
            .append(this.getAccessPoint(), object.getAccessPoint())
            .append(this.getRoles(), object.getRoles())
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
            .append(this.getAccessPoint())
            .append(this.getRoles())
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
        builder.append("\t,\"accessPoint\" : \"" + this.getAccessPoint() + "\"");
        builder.append("\t,\"roles\" : \"" + this.getRoles() + "\"");
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

        final AuthorisationVO that = (AuthorisationVO)thatObject;
        return
            equal(this.getId(), that.getId())
            && equal(this.getCreatedBy(), that.getCreatedBy())
            && equal(this.getUpdatedBy(), that.getUpdatedBy())
            && equal(this.getCreatedDate(), that.getCreatedDate())
            && equal(this.getUpdatedDate(), that.getUpdatedDate())
            && equal(this.getAccessPoint(), that.getAccessPoint())
            && equal(this.getRoles(), that.getRoles())
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

    // AuthorisationVO value-object java merge-point
}