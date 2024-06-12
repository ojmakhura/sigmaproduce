// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by hibernate/HibernateEntity.vsl in andromda-hibernate-cartridge on 05/31/2024 22:50:30+0200.
//
package bw.co.sigmaproduce.access.type;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import bw.co.sigmaproduce.access.AccessPoint;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 * TODO: Model Documentation for AccessPointType
 */
// $entity.uniqueConstraints
@Entity
@Table(
    name = "ACCESS_POINT_TYPE")
// Uncomment to enable caching for AccessPointType
// @org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.read-write)
@NamedQuery(name = "AccessPointType.findAll", query = "SELECT a FROM AccessPointType AS a")
// HibernateEntity.vsl annotations merge-point
public class AccessPointType
    implements Serializable, Comparable<AccessPointType>
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 8187776407428318930L;

    // Generate 4 attributes
    private String code;

    /**
     * TODO: Model Documentation for AccessPointType.code
     * @return this.code String
     */
    @Column(name = "CODE", unique = true, nullable = false, insertable = true, updatable = true)
    public String getCode()
    {
        return this.code;
    }

    /**
     * TODO: Model Documentation for AccessPointType.code
     * @param codeIn String
     */
    public void setCode(String codeIn)
    {
        this.code = codeIn;
    }

    private String name;

    /**
     * TODO: Model Documentation for AccessPointType.name
     * @return this.name String
     */
    @Column(name = "NAME", unique = true, nullable = false, insertable = true, updatable = true)
    public String getName()
    {
        return this.name;
    }

    /**
     * TODO: Model Documentation for AccessPointType.name
     * @param nameIn String
     */
    public void setName(String nameIn)
    {
        this.name = nameIn;
    }

    private String description;

    /**
     * TODO: Model Documentation for AccessPointType.description
     * @return this.description String
     */
    @Lob
    @Column(name = "DESCRIPTION", unique = false, nullable = true, insertable = true, updatable = true)
    public String getDescription()
    {
        return this.description;
    }

    /**
     * TODO: Model Documentation for AccessPointType.description
     * @param descriptionIn String
     */
    public void setDescription(String descriptionIn)
    {
        this.description = descriptionIn;
    }

    private Long id;

    /**
     * TODO: Model Documentation for AccessPointType.id
     * @return this.id Long
     */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACCESS_POINT_TYPE_SEQ")
    @SequenceGenerator(name="ACCESS_POINT_TYPE_SEQ", sequenceName="ACCESS_POINT_TYPE_SEQ", allocationSize=1)
    @Column(name = "ID", unique = false, nullable = true, insertable = true, updatable = true)
    public Long getId()
    {
        return this.id;
    }

    /**
     * TODO: Model Documentation for AccessPointType.id
     * @param idIn Long
     */
    public void setId(Long idIn)
    {
        this.id = idIn;
    }

    // Generate 1 associations
    private Collection<AccessPoint> accessPoints = new HashSet<AccessPoint>();

    /**
     * TODO: Model Documentation for AccessPoint
     * @return this.accessPoints Collection<AccessPoint>
     */
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "accessPointType")
    public Collection<AccessPoint> getAccessPoints()
    {
        return this.accessPoints;
    }

    /**
     * TODO: Model Documentation for AccessPoint
     * @param accessPointsIn Collection<AccessPoint>
     */
    public void setAccessPoints(Collection<AccessPoint> accessPointsIn)
    {
        this.accessPoints = accessPointsIn;
    }

    /**
     * TODO: Model Documentation for AccessPoint
     * @param elementToAdd AccessPoint
     * @return <tt>true</tt> if this collection changed as a result of the
     *         call
     */
    public boolean addAccessPoints(AccessPoint elementToAdd)
    {
        return this.accessPoints.add(elementToAdd);
    }

    /**
     * TODO: Model Documentation for AccessPoint
     * @param elementToRemove AccessPoint
     * @return <tt>true</tt> if this collection changed as a result of the
     *         call
     */
    public boolean removeAccessPoints(AccessPoint elementToRemove)
    {
        return this.accessPoints.remove(elementToRemove);
    }

    /**
     * Returns <code>true</code> if the argument is an AccessPointType instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof AccessPointType))
        {
            return false;
        }
        final AccessPointType that = (AccessPointType)object;
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
     * Constructs new instances of {@link AccessPointType}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link AccessPointType}.
         * @return new AccessPointType()
         */
        public static AccessPointType newInstance()
        {
            return new AccessPointType();
        }

        /**
         * Constructs a new instance of {@link AccessPointType}, taking all required and/or
         * read-only properties as arguments, except for identifiers.
         * @param code String
         * @param name String
         * @return newInstance
         */
        public static AccessPointType newInstance(String code, String name)
        {
            final AccessPointType entity = new AccessPointType();
            entity.setCode(code);
            entity.setName(name);
            return entity;
        }

        /**
         * Constructs a new instance of {@link AccessPointType}, taking all possible properties
         * (except the identifier(s))as arguments.
         * @param code String
         * @param name String
         * @param description String
         * @param accessPoints Collection<AccessPoint>
         * @return newInstance AccessPointType
         */
        public static AccessPointType newInstance(String code, String name, String description, Collection<AccessPoint> accessPoints)
        {
            final AccessPointType entity = new AccessPointType();
            entity.setCode(code);
            entity.setName(name);
            entity.setDescription(description);
            entity.setAccessPoints(accessPoints);
            return entity;
        }
    }

    /**
     * @param other
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     * @see Comparable#compareTo
     */
    @Override
    public int compareTo(AccessPointType other)
    {
        int cmp = 0;
        if (this.getId() != null && other.getId() != null)
        {
            cmp = this.getId().compareTo(other.getId());
        }
        else
        {
            if (this.getCode() != null && other.getCode() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getCode().compareTo(other.getCode()));
            }
            if (this.getName() != null && other.getName() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getName().compareTo(other.getName()));
            }
            if (this.getDescription() != null && other.getDescription() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getDescription().compareTo(other.getDescription()));
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
        sb.append("AccessPointType(");
        sb.append(" code=").append(getCode());
        sb.append(" name=").append(getName());
        sb.append(" description=").append(getDescription());
        sb.append(" id=").append(getId());
        sb.append(")");
        return sb.toString();
    }
// HibernateEntity.vsl merge-point
}