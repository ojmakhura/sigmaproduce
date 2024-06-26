// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand! hibernate4or5=true hibernateVersion=6.1.6.Final
// Generated by hibernate/SpringHibernateDaoBase.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.village;

import bw.co.sigmaproduce.PrincipalStore;
import bw.co.sigmaproduce.SigmaproduceSpecifications;
import bw.co.sigmaproduce.district.DistrictDao;
import bw.co.sigmaproduce.district.DistrictRepository;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>Village</code>.
 * </p>
 *
 * @see Village
 */
public abstract class VillageDaoBase
    implements VillageDao
{

    protected final Logger logger = LoggerFactory.getLogger(VillageDaoBase.class);

    protected final VillageRepository villageRepository;

    protected DistrictDao districtDao;
    protected final DistrictRepository districtRepository;

    public VillageDaoBase(
        DistrictRepository districtRepository,
        VillageRepository villageRepository
    ) {
        this.villageRepository = villageRepository;
        this.districtRepository = districtRepository;
    }

    /**
     * Sets the reference to <code>districtDao</code>.
     * @param districtDaoIn
     */
    @Autowired
    public void setDistrictDao(@Lazy DistrictDao districtDaoIn)
    {
        this.districtDao = districtDaoIn;
    }
    
    /**
     * Gets the reference to <code>districtDao</code>.
     * @return districtDao
     */
    protected DistrictDao getDistrictDao()
    {
        return this.districtDao;
    }

    /**
     * Gets the reference to <code>districtRepository</code>.
     * @return districtRepository
     */
    protected DistrictRepository getDistrictRepository()
    {
        return this.districtRepository;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(final int transform, final Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Village.get - 'id' can not be null");
        }
        Optional<Village> entity = villageRepository.findById(id);
        return transformEntity(transform, entity.get());
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Village get(Long id)
    {
        return (Village)this.get(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object load(final int transform, final Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Village.load - 'id' can not be null");
        }
        Optional<Village> entity = villageRepository.findById(id);
        return transformEntity(transform, entity.get());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Village load(Long id)
    {
        return (Village)this.load(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<Village> loadAll()
    {
        return (Collection<Village>) this.loadAll(VillageDao.TRANSFORM_NONE);
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
        return this.loadAll(VillageDao.TRANSFORM_NONE, pageNumber, pageSize);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> loadAll(final int transform, final int pageNumber, final int pageSize)
    {
		
        final Collection<?> results = villageRepository.findAll();
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
     * @param village Village
     */
    protected void _prePersist(final Village village)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postPersist event - This method is called after creating the entity
     * @param village Village
     */
    protected void _postPersist(final Village village)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preUpdate event - This method is called before updating the entity
     * @param village Village
     */
    protected void _preUpdate(final Village village)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postUpdate event - This method is called after updating the entity
     * @param village Village
     */
    protected void _postUpdate(final Village village)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preRemove event - This method is called before deleting the entity
     * @param village Village
     */
    protected void _preRemove(final Village village)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postRemove event - This method is called after deleting the entity
     * @param village Village
     */
    protected void _postRemove(final Village village)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Village create(Village village)
    {
        return (Village)this.create(VillageDao.TRANSFORM_NONE, village);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(final int transform, Village village)
    {
        if (village == null)
        {
            throw new IllegalArgumentException(
                "Village.create - 'village' can not be null");
        }

        //prePersist event
        _prePersist(village);

        village = this.villageRepository.save(village);

        //postPersist event
        _postPersist(village);

        return this.transformEntity(transform, village);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<Village> create(final Collection<Village> entities)
    {
        return (Collection<Village>) create(VillageDao.TRANSFORM_NONE, entities);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> create(final int transform, final Collection<Village> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Village.create - 'entities' can not be null");
        }
        Collection<Object> transformed = new ArrayList<Object>();
        for (Village entity : entities)
        {
            transformed.add(create(transform, entity));
        }
        return transformed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Village create(
        String code,
        String name)
    {
        return (Village)this.create(VillageDao.TRANSFORM_NONE, code, name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(
        final int transform,
        String code,
        String name)
    {
        Village entity = new Village();
        entity.setCode(code);
        entity.setName(name);
        return this.create(transform, entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(Village village)
    {
        if (village == null)
        {
            throw new IllegalArgumentException(
                "Village.update - 'village' can not be null");
        }

        //preUpdate event
        _preUpdate(village);

        village = this.villageRepository.save(village);

        //postUpdate event
        _postUpdate(village);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final Collection<Village> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Village.update - 'entities' can not be null");
        }
        for (Village entity : entities)
        {
            update(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Village village)
    {
        if (village == null)
        {
            throw new IllegalArgumentException(
                "Village.remove - 'village' can not be null");
        }
        //preRemove event
        _preRemove(village);

        this.villageRepository.delete(village);

        //postRemove event
        _postRemove(village);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Village.remove - 'id' can not be null");
        }
        Village entity = this.get(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Collection<Village> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Village.remove - 'entities' can not be null");
        }
        for (Village entity : entities)
        {
            //preRemove event
            _preRemove(entity);

            this.villageRepository.delete(entity);

            //postRemove event
            _postRemove(entity);
        }
    }
    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>VillageDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link Village} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link VillageVO} - {@link #TRANSFORM_VILLAGEVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link VillageDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see VillageDao#transformEntity(int, Village)
     */
    @Override
    public Object transformEntity(final int transform, final Village entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_VILLAGEVO :
                    target = toVillageVO(entity);
                    break;
                case VillageDao.TRANSFORM_NONE : // fall-through
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
            case TRANSFORM_VILLAGEVO :
                CollectionUtils.transform(entities, this.VILLAGEVO_TRANSFORMER);
                break;
            case VillageDao.TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see VillageDao#toEntities(Collection)
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
     * (which result in an array of entities) to {@link Village}
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
                else if (input instanceof Village)
                {
                    result = input;
                }
                return result;
            }
        };

    /**
     * @param row
     * @return Village
     */
    protected Village toEntity(Object[] row)
    {
        Village target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final Object object = row[ctr];
                if (object instanceof Village)
                {
                    target = (Village)object;
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
    public Collection<VillageVO> toVillageVOCollection(Collection<Village> entities)
    {
        if (entities == null)
        {
            return null;
        }
        @SuppressWarnings("rawtypes")
        Collection result = new ArrayList(entities);
        CollectionUtils.transform(result, this.VILLAGEVO_TRANSFORMER);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({ "unchecked" })
    public VillageVO[] toVillageVOArray(Collection<?> entities)
    {
        VillageVO[] result = null;
        if (entities != null)
        {
        @SuppressWarnings("rawtypes")
            final Collection collection = new ArrayList(entities);
            this.toVillageVOCollection(collection);
            result = (VillageVO[]) collection.toArray(new VillageVO[collection.size()]);
        }
        return result;
    }

    /**
     * Default implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link VillageDaoImpl} class if you intend to use reporting queries.
     * @param row
     * @return toVillageVO(this.toEntity(row))
     * @see VillageDao#toVillageVO(Village)
     */
    protected VillageVO toVillageVO(Object[] row)
    {
        return this.toVillageVO(this.toEntity(row));
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link VillageVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private Transformer VILLAGEVO_TRANSFORMER =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof Village)
                {
                    final Village entity = (Village)input;
                    result = toVillageVO(entity);
                }
                else if (input instanceof Object[])
                {
                    final Object[] rows = (Object[])input;
                    result = toVillageVO(rows);
                }
                return result;
            }
        };

    /**
     * {@inheritDoc}
     */
    @Override
    public void villageVOToEntityCollection(Collection<?> instances)
    {
        if (instances != null)
        {
            for (final Iterator<?> iterator = instances.iterator(); iterator.hasNext();)
            {
                // - remove an objects that are null or not of the correct instance
                if (!(iterator.next() instanceof VillageVO))
                {
                    iterator.remove();
                }
            }
            CollectionUtils.transform(instances, this.VillageVOToEntityTransformer);
        }
    }

    private final Transformer VillageVOToEntityTransformer =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                return villageVOToEntity((VillageVO)input);
            }
        };


    /**
     * {@inheritDoc}
     */
    @Override
    public void toVillageVO(
        Village source,
        VillageVO target)
    {
        target.setId(source.getId());
        target.setCode(source.getCode());
        target.setName(source.getName());
        // No conversion for target.district (can't convert source.getDistrict():bw.co.sigmaproduce.district.District to bw.co.sigmaproduce.district.DistrictVO)
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VillageVO toVillageVO(final Village entity)
    {
        VillageVO target = null;
        if (entity != null)
        {
            target =  new VillageVO();
            this.toVillageVO(entity, target);
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void villageVOToEntity(
        VillageVO source,
        Village target,
        boolean copyIfNull)
    {
        if (copyIfNull || source.getCode() != null)
        {
            target.setCode(source.getCode());
        }
        if (copyIfNull || source.getName() != null)
        {
            target.setName(source.getName());
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
     * {@inheritDoc}
     */
    @Override
    public Village searchUniqueCode(final String code)
    {

        Specification<Village> spec = SigmaproduceSpecifications.<Village, String>findByAttribute(code, "code");
        List<Village> entities = villageRepository.findAll(spec, Sort.by("code"));
        if(CollectionUtils.isEmpty(entities)) {
            return null;
        }

        return entities.get(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object searchUniqueCode(final int transform, final String code)
    {
        final Village entity=this.searchUniqueCode(code);
        if(entity == null)
        {
            return null;
        }
        return transformEntity(transform, entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Village searchUniqueName(final String name)
    {

        Specification<Village> spec = SigmaproduceSpecifications.<Village, String>findByAttribute(name, "name");
        List<Village> entities = villageRepository.findAll(spec, Sort.by("name"));
        if(CollectionUtils.isEmpty(entities)) {
            return null;
        }

        return entities.get(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object searchUniqueName(final int transform, final String name)
    {
        final Village entity=this.searchUniqueName(name);
        if(entity == null)
        {
            return null;
        }
        return transformEntity(transform, entity);
    }


    /**
     * Create or Update the <code>village</code> instance in the persistent store.
     * @param village
     */
    @Override
    public Village createOrUpdate(Village village)
    {
        if(village.getId() == null)
        {
            return (Village)this.create(TRANSFORM_NONE,village);
        }
        this.update(village);
        return village;
    }

    // spring-hibernate-dao-base merge-point
}