// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by hibernate/HibernateEntity.vsl in andromda-hibernate-cartridge on 06/12/2024 19:31:12+0200.
//
package bw.co.sigmaproduce.farm.cultivation;

import bw.co.sigmaproduce.crop.variety.CropVariety;
import bw.co.sigmaproduce.farm.Farm;
import bw.co.sigmaproduce.farm.Unit;
import bw.co.sigmaproduce.farm.cultivation.harvest.Harvest;
import bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblem;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;

/**
 * TODO: Model Documentation for Cultivation
 */
@Entity
@Table(name = "CULTIVATION")
// Uncomment to enable caching for Cultivation
// @org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.read-write)
@NamedQuery(name = "Cultivation.findAll", query = "SELECT c FROM Cultivation AS c")
// HibernateEntity.vsl annotations merge-point
public class Cultivation
    implements Serializable, Comparable<Cultivation>
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 485724126903068222L;

    // Generate 9 attributes
    private String id;

    /**
     * TODO: Model Documentation for Cultivation.id
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
     * TODO: Model Documentation for Cultivation.id
     * @param idIn String
     */
    public void setId(String idIn)
    {
        this.id = idIn;
    }

    private String createdBy;

    /**
     * TODO: Model Documentation for Cultivation.createdBy
     * @return this.createdBy String
     */
    @Column(name = "CREATED_BY", unique = false, nullable = false, insertable = true, updatable = true)
    public String getCreatedBy()
    {
        return this.createdBy;
    }

    /**
     * TODO: Model Documentation for Cultivation.createdBy
     * @param createdByIn String
     */
    public void setCreatedBy(String createdByIn)
    {
        this.createdBy = createdByIn;
    }

    private String updatedBy;

    /**
     * TODO: Model Documentation for Cultivation.updatedBy
     * @return this.updatedBy String
     */
    @Column(name = "UPDATED_BY", unique = false, nullable = true, insertable = true, updatable = true)
    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    /**
     * TODO: Model Documentation for Cultivation.updatedBy
     * @param updatedByIn String
     */
    public void setUpdatedBy(String updatedByIn)
    {
        this.updatedBy = updatedByIn;
    }

    private LocalDateTime updatedDate;

    /**
     * TODO: Model Documentation for Cultivation.updatedDate
     * @return this.updatedDate LocalDateTime
     */
    @Column(name = "UPDATED_DATE", unique = false, nullable = true, insertable = true, updatable = true)
    public LocalDateTime getUpdatedDate()
    {
        return this.updatedDate;
    }

    /**
     * TODO: Model Documentation for Cultivation.updatedDate
     * @param updatedDateIn LocalDateTime
     */
    public void setUpdatedDate(LocalDateTime updatedDateIn)
    {
        this.updatedDate = updatedDateIn;
    }

    private LocalDateTime createdDate;

    /**
     * TODO: Model Documentation for Cultivation.createdDate
     * @return this.createdDate LocalDateTime
     */
    @Column(name = "CREATED_DATE", unique = false, nullable = false, insertable = true, updatable = true)
    public LocalDateTime getCreatedDate()
    {
        return this.createdDate;
    }

    /**
     * TODO: Model Documentation for Cultivation.createdDate
     * @param createdDateIn LocalDateTime
     */
    public void setCreatedDate(LocalDateTime createdDateIn)
    {
        this.createdDate = createdDateIn;
    }

    private LocalDate cultivationDate;

    /**
     * TODO: Model Documentation for Cultivation.cultivationDate
     * @return this.cultivationDate LocalDate
     */
    @Column(name = "CULTIVATION_DATE", unique = false, nullable = true, insertable = true, updatable = true)
    public LocalDate getCultivationDate()
    {
        return this.cultivationDate;
    }

    /**
     * TODO: Model Documentation for Cultivation.cultivationDate
     * @param cultivationDateIn LocalDate
     */
    public void setCultivationDate(LocalDate cultivationDateIn)
    {
        this.cultivationDate = cultivationDateIn;
    }

    private LocalDate exptectedHarvestDate;

    /**
     * TODO: Model Documentation for
     * Cultivation.exptectedHarvestDate
     * @return this.exptectedHarvestDate LocalDate
     */
    @Column(name = "EXPTECTED_HARVEST_DATE", unique = false, nullable = true, insertable = true, updatable = true)
    public LocalDate getExptectedHarvestDate()
    {
        return this.exptectedHarvestDate;
    }

    /**
     * TODO: Model Documentation for
     * Cultivation.exptectedHarvestDate
     * @param exptectedHarvestDateIn LocalDate
     */
    public void setExptectedHarvestDate(LocalDate exptectedHarvestDateIn)
    {
        this.exptectedHarvestDate = exptectedHarvestDateIn;
    }

    private Double size;

    /**
     * TODO: Model Documentation for Cultivation.size
     * @return this.size Double
     */
    @Column(name = "SIZE", unique = false, nullable = true, insertable = true, updatable = true)
    public Double getSize()
    {
        return this.size;
    }

    /**
     * TODO: Model Documentation for Cultivation.size
     * @param sizeIn Double
     */
    public void setSize(Double sizeIn)
    {
        this.size = sizeIn;
    }

    private Unit unit;

    /**
     * TODO: Model Documentation for Cultivation.unit
     * @return this.unit Unit
     */
    @Column(name = "UNIT", unique = false, nullable = true, insertable = true, updatable = true)
    @Enumerated(EnumType.STRING)
    public Unit getUnit()
    {
        return this.unit;
    }

    /**
     * TODO: Model Documentation for Cultivation.unit
     * @param unitIn Unit
     */
    public void setUnit(Unit unitIn)
    {
        this.unit = unitIn;
    }

    // Generate 4 associations
    private Collection<CultivationProblem> cultivationProblems = new HashSet<CultivationProblem>();

    /**
     * TODO: Model Documentation for CultivationProblem
     * @return this.cultivationProblems Collection<CultivationProblem>
     */
    @OneToMany( mappedBy = "cultivation") 
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

    private CropVariety cropVariety;

    /**
     * TODO: Model Documentation for CropVariety
     * @return this.cropVariety CropVariety
     */
    @ManyToOne(optional = false,  fetch = FetchType.LAZY)
    @JoinColumn(name = "CROP_VARIETY_FK")
    public CropVariety getCropVariety()
    {
        return this.cropVariety;
    }

    /**
     * TODO: Model Documentation for CropVariety
     * @param cropVarietyIn CropVariety
     */
    public void setCropVariety(CropVariety cropVarietyIn)
    {
        this.cropVariety = cropVarietyIn;
    }

    private Farm farm;

    /**
     * TODO: Model Documentation for Farm
     * @return this.farm Farm
     */
    @ManyToOne(optional = false,  fetch = FetchType.LAZY)
    @JoinColumn(name = "FARM_FK")
    public Farm getFarm()
    {
        return this.farm;
    }

    /**
     * TODO: Model Documentation for Farm
     * @param farmIn Farm
     */
    public void setFarm(Farm farmIn)
    {
        this.farm = farmIn;
    }

    private Collection<Harvest> harvests = new HashSet<Harvest>();

    /**
     * TODO: Model Documentation for Harvest
     * @return this.harvests Collection<Harvest>
     */
    @OneToMany( mappedBy = "cultivation") 
    public Collection<Harvest> getHarvests()
    {
        return this.harvests;
    }

    /**
     * TODO: Model Documentation for Harvest
     * @param harvestsIn Collection<Harvest>
     */
    public void setHarvests(Collection<Harvest> harvestsIn)
    {
        this.harvests = harvestsIn;
    }

    /**
     * TODO: Model Documentation for Harvest
     * @param elementToAdd Harvest
     * @return <tt>true</tt> if this collection changed as a result of the
     *         call
     */
    public boolean addHarvests(Harvest elementToAdd)
    {
        return this.harvests.add(elementToAdd);
    }

    /**
     * TODO: Model Documentation for Harvest
     * @param elementToRemove Harvest
     * @return <tt>true</tt> if this collection changed as a result of the
     *         call
     */
    public boolean removeHarvests(Harvest elementToRemove)
    {
        return this.harvests.remove(elementToRemove);
    }

    /**
     * Returns <code>true</code> if the argument is an Cultivation instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Cultivation))
        {
            return false;
        }
        final Cultivation that = (Cultivation)object;
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
     * Constructs new instances of {@link Cultivation}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link Cultivation}.
         * @return new Cultivation()
         */
        public static Cultivation newInstance()
        {
            return new Cultivation();
        }

        /**
         * Constructs a new instance of {@link Cultivation}, taking all required and/or
         * read-only properties as arguments, except for identifiers.
         * @param createdBy String
         * @param createdDate LocalDateTime
         * @param cropVariety CropVariety
         * @param farm Farm
         * @return newInstance
         */
        public static Cultivation newInstance(String createdBy, LocalDateTime createdDate, CropVariety cropVariety, Farm farm)
        {
            final Cultivation entity = new Cultivation();
            entity.setCreatedBy(createdBy);
            entity.setCreatedDate(createdDate);
            entity.setCropVariety(cropVariety);
            entity.setFarm(farm);
            return entity;
        }

        /**
         * Constructs a new instance of {@link Cultivation}, taking all possible properties
         * (except the identifier(s))as arguments.
         * @param createdBy String
         * @param updatedBy String
         * @param updatedDate LocalDateTime
         * @param createdDate LocalDateTime
         * @param cultivationDate LocalDate
         * @param exptectedHarvestDate LocalDate
         * @param size Double
         * @param unit Unit
         * @param cultivationProblems Collection<CultivationProblem>
         * @param cropVariety CropVariety
         * @param farm Farm
         * @param harvests Collection<Harvest>
         * @return newInstance Cultivation
         */
        public static Cultivation newInstance(String createdBy, String updatedBy, LocalDateTime updatedDate, LocalDateTime createdDate, LocalDate cultivationDate, LocalDate exptectedHarvestDate, Double size, Unit unit, Collection<CultivationProblem> cultivationProblems, CropVariety cropVariety, Farm farm, Collection<Harvest> harvests)
        {
            final Cultivation entity = new Cultivation();
            entity.setCreatedBy(createdBy);
            entity.setUpdatedBy(updatedBy);
            entity.setUpdatedDate(updatedDate);
            entity.setCreatedDate(createdDate);
            entity.setCultivationDate(cultivationDate);
            entity.setExptectedHarvestDate(exptectedHarvestDate);
            entity.setSize(size);
            entity.setUnit(unit);
            entity.setCultivationProblems(cultivationProblems);
            entity.setCropVariety(cropVariety);
            entity.setFarm(farm);
            entity.setHarvests(harvests);
            return entity;
        }
    }

    /**
     * @param other
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     * @see Comparable#compareTo
     */
    @Override
    public int compareTo(Cultivation other)
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
            if (this.getCultivationDate() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getCultivationDate().compareTo(other.getCultivationDate()));
            }
            if (this.getExptectedHarvestDate() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getExptectedHarvestDate().compareTo(other.getExptectedHarvestDate()));
            }
            if (this.getSize() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getSize().compareTo(other.getSize()));
            }
            if (this.getUnit() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getUnit().compareTo(other.getUnit()));
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
        sb.append("Cultivation(");
        sb.append(" id=").append(getId());
        sb.append(" createdBy=").append(getCreatedBy());
        sb.append(" updatedBy=").append(getUpdatedBy());
        sb.append(" updatedDate=").append(getUpdatedDate());
        sb.append(" createdDate=").append(getCreatedDate());
        sb.append(" cultivationDate=").append(getCultivationDate());
        sb.append(" exptectedHarvestDate=").append(getExptectedHarvestDate());
        sb.append(" size=").append(getSize());
        sb.append(" unit=").append(getUnit());
        sb.append(")");
        return sb.toString();
    }
// HibernateEntity.vsl merge-point
}