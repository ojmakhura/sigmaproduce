// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand! hibernate4or5=true hibernateVersion=6.1.6.Final
// Generated by hibernate/SpringHibernateDaoBase.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.farm.cultivation;

import bw.co.sigmaproduce.PrincipalStore;
import bw.co.sigmaproduce.crop.variety.CropVariety;
import bw.co.sigmaproduce.crop.variety.CropVarietyDao;
import bw.co.sigmaproduce.crop.variety.CropVarietyRepository;
import bw.co.sigmaproduce.farm.Farm;
import bw.co.sigmaproduce.farm.FarmDao;
import bw.co.sigmaproduce.farm.FarmRepository;
import bw.co.sigmaproduce.farm.Unit;
import bw.co.sigmaproduce.farm.cultivation.harvest.HarvestDao;
import bw.co.sigmaproduce.farm.cultivation.harvest.HarvestRepository;
import bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemDao;
import bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemRepository;
import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>Cultivation</code>.
 * </p>
 *
 * @see Cultivation
 */
public abstract class CultivationDaoBase
    implements CultivationDao
{

    protected final Logger logger = LoggerFactory.getLogger(CultivationDaoBase.class);

    protected final CultivationRepository cultivationRepository;

    protected FarmDao farmDao;
    protected final FarmRepository farmRepository;

    protected CropVarietyDao cropVarietyDao;
    protected final CropVarietyRepository cropVarietyRepository;

    protected HarvestDao harvestDao;
    protected final HarvestRepository harvestRepository;

    protected CultivationProblemDao cultivationProblemDao;
    protected final CultivationProblemRepository cultivationProblemRepository;

    public CultivationDaoBase(
        FarmRepository farmRepository,
        CropVarietyRepository cropVarietyRepository,
        HarvestRepository harvestRepository,
        CultivationProblemRepository cultivationProblemRepository,
        CultivationRepository cultivationRepository
    ) {
        this.cultivationRepository = cultivationRepository;
        this.farmRepository = farmRepository;
        this.cropVarietyRepository = cropVarietyRepository;
        this.harvestRepository = harvestRepository;
        this.cultivationProblemRepository = cultivationProblemRepository;
    }

    /**
     * Sets the reference to <code>farmDao</code>.
     * @param farmDaoIn
     */
    @Autowired
    public void setFarmDao(@Lazy FarmDao farmDaoIn)
    {
        this.farmDao = farmDaoIn;
    }
    
    /**
     * Gets the reference to <code>farmDao</code>.
     * @return farmDao
     */
    protected FarmDao getFarmDao()
    {
        return this.farmDao;
    }

    /**
     * Gets the reference to <code>farmRepository</code>.
     * @return farmRepository
     */
    protected FarmRepository getFarmRepository()
    {
        return this.farmRepository;
    }

    /**
     * Sets the reference to <code>cropVarietyDao</code>.
     * @param cropVarietyDaoIn
     */
    @Autowired
    public void setCropVarietyDao(@Lazy CropVarietyDao cropVarietyDaoIn)
    {
        this.cropVarietyDao = cropVarietyDaoIn;
    }
    
    /**
     * Gets the reference to <code>cropVarietyDao</code>.
     * @return cropVarietyDao
     */
    protected CropVarietyDao getCropVarietyDao()
    {
        return this.cropVarietyDao;
    }

    /**
     * Gets the reference to <code>cropVarietyRepository</code>.
     * @return cropVarietyRepository
     */
    protected CropVarietyRepository getCropVarietyRepository()
    {
        return this.cropVarietyRepository;
    }

    /**
     * Sets the reference to <code>harvestDao</code>.
     * @param harvestDaoIn
     */
    @Autowired
    public void setHarvestDao(@Lazy HarvestDao harvestDaoIn)
    {
        this.harvestDao = harvestDaoIn;
    }
    
    /**
     * Gets the reference to <code>harvestDao</code>.
     * @return harvestDao
     */
    protected HarvestDao getHarvestDao()
    {
        return this.harvestDao;
    }

    /**
     * Gets the reference to <code>harvestRepository</code>.
     * @return harvestRepository
     */
    protected HarvestRepository getHarvestRepository()
    {
        return this.harvestRepository;
    }

    /**
     * Sets the reference to <code>cultivationProblemDao</code>.
     * @param cultivationProblemDaoIn
     */
    @Autowired
    public void setCultivationProblemDao(@Lazy CultivationProblemDao cultivationProblemDaoIn)
    {
        this.cultivationProblemDao = cultivationProblemDaoIn;
    }
    
    /**
     * Gets the reference to <code>cultivationProblemDao</code>.
     * @return cultivationProblemDao
     */
    protected CultivationProblemDao getCultivationProblemDao()
    {
        return this.cultivationProblemDao;
    }

    /**
     * Gets the reference to <code>cultivationProblemRepository</code>.
     * @return cultivationProblemRepository
     */
    protected CultivationProblemRepository getCultivationProblemRepository()
    {
        return this.cultivationProblemRepository;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(final int transform, final String id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Cultivation.get - 'id' can not be null");
        }
        Optional<Cultivation> entity = cultivationRepository.findById(id);
        return transformEntity(transform, entity.get());
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Cultivation get(String id)
    {
        return (Cultivation)this.get(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object load(final int transform, final String id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Cultivation.load - 'id' can not be null");
        }
        Optional<Cultivation> entity = cultivationRepository.findById(id);
        return transformEntity(transform, entity.get());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cultivation load(String id)
    {
        return (Cultivation)this.load(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<Cultivation> loadAll()
    {
        return (Collection<Cultivation>) this.loadAll(CultivationDao.TRANSFORM_NONE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> loadAll(final int transform)
    {
        return this.loadAll(transform, -1, -1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> loadAll(final int pageNumber, final int pageSize)
    {
        return this.loadAll(CultivationDao.TRANSFORM_NONE, pageNumber, pageSize);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> loadAll(final int transform, final int pageNumber, final int pageSize)
    {
		
        final Collection<?> results = cultivationRepository.findAll();
        this.transformEntities(transform, results);
        return results;
    }

    /**
     * firstResult = (pageNumber - 1) * pageSize
     * @param pageNumber
     * @param pageSize
     * @return firstResult
     */
    protected int calculateFirstResult(int pageNumber, int pageSize)
    {
        int firstResult = 0;
        if (pageNumber > 0)
        {
            firstResult = (pageNumber - 1) * pageSize;
        }
        return firstResult;
    }

    /**
     * prePersist event - This method is called before creating the entity
     * @param cultivation Cultivation
     */
    protected void _prePersist(final Cultivation cultivation)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postPersist event - This method is called after creating the entity
     * @param cultivation Cultivation
     */
    protected void _postPersist(final Cultivation cultivation)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preUpdate event - This method is called before updating the entity
     * @param cultivation Cultivation
     */
    protected void _preUpdate(final Cultivation cultivation)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postUpdate event - This method is called after updating the entity
     * @param cultivation Cultivation
     */
    protected void _postUpdate(final Cultivation cultivation)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preRemove event - This method is called before deleting the entity
     * @param cultivation Cultivation
     */
    protected void _preRemove(final Cultivation cultivation)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postRemove event - This method is called after deleting the entity
     * @param cultivation Cultivation
     */
    protected void _postRemove(final Cultivation cultivation)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cultivation create(Cultivation cultivation)
    {
        return (Cultivation)this.create(CultivationDao.TRANSFORM_NONE, cultivation);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(final int transform, Cultivation cultivation)
    {
        if (cultivation == null)
        {
            throw new IllegalArgumentException(
                "Cultivation.create - 'cultivation' can not be null");
        }

        //prePersist event
        _prePersist(cultivation);

        cultivation = this.cultivationRepository.save(cultivation);

        //postPersist event
        _postPersist(cultivation);

        return this.transformEntity(transform, cultivation);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<Cultivation> create(final Collection<Cultivation> entities)
    {
        return (Collection<Cultivation>) create(CultivationDao.TRANSFORM_NONE, entities);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> create(final int transform, final Collection<Cultivation> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Cultivation.create - 'entities' can not be null");
        }
        Collection<Object> transformed = new ArrayList<Object>();
        for (Cultivation entity : entities)
        {
            transformed.add(create(transform, entity));
        }
        return transformed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cultivation create(
        String createdBy,
        String updatedBy,
        LocalDateTime updatedDate,
        LocalDateTime createdDate,
        LocalDate cultivationDate,
        LocalDate exptectedHarvestDate,
        Double size,
        Unit unit)
    {
        return (Cultivation)this.create(CultivationDao.TRANSFORM_NONE, createdBy, updatedBy, updatedDate, createdDate, cultivationDate, exptectedHarvestDate, size, unit);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(
        final int transform,
        String createdBy,
        String updatedBy,
        LocalDateTime updatedDate,
        LocalDateTime createdDate,
        LocalDate cultivationDate,
        LocalDate exptectedHarvestDate,
        Double size,
        Unit unit)
    {
        Cultivation entity = new Cultivation();
        entity.setCreatedBy(createdBy);
        entity.setUpdatedBy(updatedBy);
        entity.setUpdatedDate(updatedDate);
        entity.setCreatedDate(createdDate);
        entity.setCultivationDate(cultivationDate);
        entity.setExptectedHarvestDate(exptectedHarvestDate);
        entity.setSize(size);
        entity.setUnit(unit);
        return this.create(transform, entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cultivation create(
        String createdBy,
        LocalDateTime createdDate,
        CropVariety cropVariety,
        Farm farm)
    {
        return (Cultivation)this.create(CultivationDao.TRANSFORM_NONE, createdBy, createdDate, cropVariety, farm);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(
        final int transform,
        String createdBy,
        LocalDateTime createdDate,
        CropVariety cropVariety,
        Farm farm)
    {
        Cultivation entity = new Cultivation();
        entity.setCreatedBy(createdBy);
        entity.setCreatedDate(createdDate);
        entity.setCropVariety(cropVariety);
        entity.setFarm(farm);
        return this.create(transform, entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(Cultivation cultivation)
    {
        if (cultivation == null)
        {
            throw new IllegalArgumentException(
                "Cultivation.update - 'cultivation' can not be null");
        }

        //preUpdate event
        _preUpdate(cultivation);

        cultivation = this.cultivationRepository.save(cultivation);

        //postUpdate event
        _postUpdate(cultivation);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final Collection<Cultivation> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Cultivation.update - 'entities' can not be null");
        }
        for (Cultivation entity : entities)
        {
            update(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Cultivation cultivation)
    {
        if (cultivation == null)
        {
            throw new IllegalArgumentException(
                "Cultivation.remove - 'cultivation' can not be null");
        }
        //preRemove event
        _preRemove(cultivation);

        this.cultivationRepository.delete(cultivation);

        //postRemove event
        _postRemove(cultivation);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(String id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Cultivation.remove - 'id' can not be null");
        }
        Cultivation entity = this.get(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Collection<Cultivation> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Cultivation.remove - 'entities' can not be null");
        }
        for (Cultivation entity : entities)
        {
            //preRemove event
            _preRemove(entity);

            this.cultivationRepository.delete(entity);

            //postRemove event
            _postRemove(entity);
        }
    }
    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>CultivationDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link Cultivation} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link CultivationVO} - {@link #TRANSFORM_CULTIVATIONVO}</li>
     *   <li>{@link CultivationListVO} - {@link #TRANSFORM_CULTIVATIONLISTVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link CultivationDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see CultivationDao#transformEntity(int, Cultivation)
     */
    @Override
    public Object transformEntity(final int transform, final Cultivation entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_CULTIVATIONVO :
                    target = toCultivationVO(entity);
                    break;
                case TRANSFORM_CULTIVATIONLISTVO :
                    target = toCultivationListVO(entity);
                    break;
                case CultivationDao.TRANSFORM_NONE : // fall-through
                default:
                    target = entity;
            }
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void transformEntities(final int transform, final Collection<?> entities)
    {
        switch (transform)
        {
            case TRANSFORM_CULTIVATIONVO :
                CollectionUtils.transform(entities, this.CULTIVATIONVO_TRANSFORMER);
                break;
            case TRANSFORM_CULTIVATIONLISTVO :
                CollectionUtils.transform(entities, this.CULTIVATIONLISTVO_TRANSFORMER);
                break;
            case CultivationDao.TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see CultivationDao#toEntities(Collection)
     */
    @Override
    public void toEntities(final Collection<?> results)
    {
        if (results != null)
        {
            CollectionUtils.transform(results, this.ENTITYTRANSFORMER);
        }
    }

    /**
     * This anonymous transformer is designed to transform report query results
     * (which result in an array of entities) to {@link Cultivation}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private Transformer ENTITYTRANSFORMER =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof Object[])
                {
                    final Object[] rows = (Object[])input;
                    result = toEntity(rows);
                }
                else if (input instanceof Cultivation)
                {
                    result = input;
                }
                return result;
            }
        };

    /**
     * @param row
     * @return Cultivation
     */
    protected Cultivation toEntity(Object[] row)
    {
        Cultivation target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final Object object = row[ctr];
                if (object instanceof Cultivation)
                {
                    target = (Cultivation)object;
                    break;
                }
            }
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<CultivationVO> toCultivationVOCollection(Collection<Cultivation> entities)
    {
        if (entities == null)
        {
            return null;
        }
        @SuppressWarnings("rawtypes")
        Collection result = new ArrayList(entities);
        CollectionUtils.transform(result, this.CULTIVATIONVO_TRANSFORMER);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({ "unchecked" })
    public CultivationVO[] toCultivationVOArray(Collection<?> entities)
    {
        CultivationVO[] result = null;
        if (entities != null)
        {
        @SuppressWarnings("rawtypes")
            final Collection collection = new ArrayList(entities);
            this.toCultivationVOCollection(collection);
            result = (CultivationVO[]) collection.toArray(new CultivationVO[collection.size()]);
        }
        return result;
    }

    /**
     * Default implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link CultivationDaoImpl} class if you intend to use reporting queries.
     * @param row
     * @return toCultivationVO(this.toEntity(row))
     * @see CultivationDao#toCultivationVO(Cultivation)
     */
    protected CultivationVO toCultivationVO(Object[] row)
    {
        return this.toCultivationVO(this.toEntity(row));
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link CultivationVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private Transformer CULTIVATIONVO_TRANSFORMER =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof Cultivation)
                {
                    final Cultivation entity = (Cultivation)input;
                    result = toCultivationVO(entity);
                }
                else if (input instanceof Object[])
                {
                    final Object[] rows = (Object[])input;
                    result = toCultivationVO(rows);
                }
                return result;
            }
        };

    /**
     * {@inheritDoc}
     */
    @Override
    public void cultivationVOToEntityCollection(Collection<?> instances)
    {
        if (instances != null)
        {
            for (final Iterator<?> iterator = instances.iterator(); iterator.hasNext();)
            {
                // - remove an objects that are null or not of the correct instance
                if (!(iterator.next() instanceof CultivationVO))
                {
                    iterator.remove();
                }
            }
            CollectionUtils.transform(instances, this.CultivationVOToEntityTransformer);
        }
    }

    private final Transformer CultivationVOToEntityTransformer =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                return cultivationVOToEntity((CultivationVO)input);
            }
        };


    /**
     * {@inheritDoc}
     */
    @Override
    public void toCultivationVO(
        Cultivation source,
        CultivationVO target)
    {
        target.setId(source.getId());
        target.setCreatedBy(source.getCreatedBy());
        target.setUpdatedBy(source.getUpdatedBy());
        target.setCreatedDate(source.getCreatedDate());
        target.setUpdatedDate(source.getUpdatedDate());
        // No conversion for target.farm (can't convert source.getFarm():Farm to bw.co.sigmaproduce.farm.FarmListVO)
        // No conversion for target.cropVariety (can't convert source.getCropVariety():CropVariety to bw.co.sigmaproduce.crop.variety.CropVarietyList)
        target.setCultivationDate(source.getCultivationDate());
        target.setExptectedHarvestDate(source.getExptectedHarvestDate());
        target.setSize(source.getSize());
        target.setUnit(source.getUnit());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CultivationVO toCultivationVO(final Cultivation entity)
    {
        CultivationVO target = null;
        if (entity != null)
        {
            target =  new CultivationVO();
            this.toCultivationVO(entity, target);
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cultivationVOToEntity(
        CultivationVO source,
        Cultivation target,
        boolean copyIfNull)
    {
        if (copyIfNull || source.getCreatedBy() != null)
        {
            target.setCreatedBy(source.getCreatedBy());
        }
        if (copyIfNull || source.getUpdatedBy() != null)
        {
            target.setUpdatedBy(source.getUpdatedBy());
        }
        if (copyIfNull || source.getUpdatedDate() != null)
        {
            target.setUpdatedDate(source.getUpdatedDate());
        }
        if (copyIfNull || source.getCreatedDate() != null)
        {
            target.setCreatedDate(source.getCreatedDate());
        }
        if (copyIfNull || source.getCultivationDate() != null)
        {
            target.setCultivationDate(source.getCultivationDate());
        }
        if (copyIfNull || source.getExptectedHarvestDate() != null)
        {
            target.setExptectedHarvestDate(source.getExptectedHarvestDate());
        }
        if (copyIfNull || source.getSize() != null)
        {
            target.setSize(source.getSize());
        }
        if (copyIfNull || source.getUnit() != null)
        {
            target.setUnit(source.getUnit());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<CultivationListVO> toCultivationListVOCollection(Collection<Cultivation> entities)
    {
        if (entities == null)
        {
            return null;
        }
        @SuppressWarnings("rawtypes")
        Collection result = new ArrayList(entities);
        CollectionUtils.transform(result, this.CULTIVATIONLISTVO_TRANSFORMER);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({ "unchecked" })
    public CultivationListVO[] toCultivationListVOArray(Collection<?> entities)
    {
        CultivationListVO[] result = null;
        if (entities != null)
        {
        @SuppressWarnings("rawtypes")
            final Collection collection = new ArrayList(entities);
            this.toCultivationListVOCollection(collection);
            result = (CultivationListVO[]) collection.toArray(new CultivationListVO[collection.size()]);
        }
        return result;
    }

    /**
     * Default implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link CultivationDaoImpl} class if you intend to use reporting queries.
     * @param row
     * @return toCultivationListVO(this.toEntity(row))
     * @see CultivationDao#toCultivationListVO(Cultivation)
     */
    protected CultivationListVO toCultivationListVO(Object[] row)
    {
        return this.toCultivationListVO(this.toEntity(row));
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link CultivationListVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private Transformer CULTIVATIONLISTVO_TRANSFORMER =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof Cultivation)
                {
                    final Cultivation entity = (Cultivation)input;
                    result = toCultivationListVO(entity);
                }
                else if (input instanceof Object[])
                {
                    final Object[] rows = (Object[])input;
                    result = toCultivationListVO(rows);
                }
                return result;
            }
        };

    /**
     * {@inheritDoc}
     */
    @Override
    public void cultivationListVOToEntityCollection(Collection<?> instances)
    {
        if (instances != null)
        {
            for (final Iterator<?> iterator = instances.iterator(); iterator.hasNext();)
            {
                // - remove an objects that are null or not of the correct instance
                if (!(iterator.next() instanceof CultivationListVO))
                {
                    iterator.remove();
                }
            }
            CollectionUtils.transform(instances, this.CultivationListVOToEntityTransformer);
        }
    }

    private final Transformer CultivationListVOToEntityTransformer =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                return cultivationListVOToEntity((CultivationListVO)input);
            }
        };


    /**
     * {@inheritDoc}
     */
    @Override
    public void toCultivationListVO(
        Cultivation source,
        CultivationListVO target)
    {
        target.setId(source.getId());
        target.setCreatedBy(source.getCreatedBy());
        target.setUpdatedBy(source.getUpdatedBy());
        target.setCreatedDate(source.getCreatedDate());
        target.setUpdatedDate(source.getUpdatedDate());
        // No conversion for target.cropVariety (can't convert source.getCropVariety():CropVariety to String)
        target.setSize(source.getSize());
        target.setUnit(source.getUnit());
        // No conversion for target.farm (can't convert source.getFarm():Farm to String)
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CultivationListVO toCultivationListVO(final Cultivation entity)
    {
        CultivationListVO target = null;
        if (entity != null)
        {
            target =  new CultivationListVO();
            this.toCultivationListVO(entity, target);
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cultivationListVOToEntity(
        CultivationListVO source,
        Cultivation target,
        boolean copyIfNull)
    {
        if (copyIfNull || source.getCreatedBy() != null)
        {
            target.setCreatedBy(source.getCreatedBy());
        }
        if (copyIfNull || source.getUpdatedBy() != null)
        {
            target.setUpdatedBy(source.getUpdatedBy());
        }
        if (copyIfNull || source.getUpdatedDate() != null)
        {
            target.setUpdatedDate(source.getUpdatedDate());
        }
        if (copyIfNull || source.getCreatedDate() != null)
        {
            target.setCreatedDate(source.getCreatedDate());
        }
        if (copyIfNull || source.getSize() != null)
        {
            target.setSize(source.getSize());
        }
        if (copyIfNull || source.getUnit() != null)
        {
            target.setUnit(source.getUnit());
        }
    }

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected Principal getPrincipal()
    {
        return PrincipalStore.get();
    }


    /**
     * Create or Update the <code>cultivation</code> instance in the persistent store.
     * @param cultivation
     */
    @Override
    public Cultivation createOrUpdate(Cultivation cultivation)
    {
        if(cultivation.getId() == null)
        {
            return (Cultivation)this.create(TRANSFORM_NONE,cultivation);
        }
        this.update(cultivation);
        return cultivation;
    }

    // spring-hibernate-dao-base merge-point
}