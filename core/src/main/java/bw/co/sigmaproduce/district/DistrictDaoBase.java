// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand! hibernate4or5=true hibernateVersion=6.1.6.Final
// Generated by hibernate/SpringHibernateDaoBase.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.district;

import bw.co.sigmaproduce.PrincipalStore;
import bw.co.sigmaproduce.SigmaproduceSpecifications;
import bw.co.sigmaproduce.village.VillageDao;
import bw.co.sigmaproduce.village.VillageRepository;
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
 * objects of type <code>District</code>.
 * </p>
 *
 * @see District
 */
public abstract class DistrictDaoBase
    implements DistrictDao
{

    protected final Logger logger = LoggerFactory.getLogger(DistrictDaoBase.class);

    protected final DistrictRepository districtRepository;

    protected VillageDao villageDao;
    protected final VillageRepository villageRepository;

    public DistrictDaoBase(
        VillageRepository villageRepository,
        DistrictRepository districtRepository
    ) {
        this.districtRepository = districtRepository;
        this.villageRepository = villageRepository;
    }

    /**
     * Sets the reference to <code>villageDao</code>.
     * @param villageDaoIn
     */
    @Autowired
    public void setVillageDao(@Lazy VillageDao villageDaoIn)
    {
        this.villageDao = villageDaoIn;
    }
    
    /**
     * Gets the reference to <code>villageDao</code>.
     * @return villageDao
     */
    protected VillageDao getVillageDao()
    {
        return this.villageDao;
    }

    /**
     * Gets the reference to <code>villageRepository</code>.
     * @return villageRepository
     */
    protected VillageRepository getVillageRepository()
    {
        return this.villageRepository;
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
                "District.get - 'id' can not be null");
        }
        Optional<District> entity = districtRepository.findById(id);
        return transformEntity(transform, entity.get());
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public District get(Long id)
    {
        return (District)this.get(TRANSFORM_NONE, id);
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
                "District.load - 'id' can not be null");
        }
        Optional<District> entity = districtRepository.findById(id);
        return transformEntity(transform, entity.get());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public District load(Long id)
    {
        return (District)this.load(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<District> loadAll()
    {
        return (Collection<District>) this.loadAll(DistrictDao.TRANSFORM_NONE);
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
        return this.loadAll(DistrictDao.TRANSFORM_NONE, pageNumber, pageSize);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> loadAll(final int transform, final int pageNumber, final int pageSize)
    {
		
        final Collection<?> results = districtRepository.findAll();
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
     * @param district District
     */
    protected void _prePersist(final District district)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postPersist event - This method is called after creating the entity
     * @param district District
     */
    protected void _postPersist(final District district)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preUpdate event - This method is called before updating the entity
     * @param district District
     */
    protected void _preUpdate(final District district)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postUpdate event - This method is called after updating the entity
     * @param district District
     */
    protected void _postUpdate(final District district)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preRemove event - This method is called before deleting the entity
     * @param district District
     */
    protected void _preRemove(final District district)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postRemove event - This method is called after deleting the entity
     * @param district District
     */
    protected void _postRemove(final District district)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public District create(District district)
    {
        return (District)this.create(DistrictDao.TRANSFORM_NONE, district);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(final int transform, District district)
    {
        if (district == null)
        {
            throw new IllegalArgumentException(
                "District.create - 'district' can not be null");
        }

        //prePersist event
        _prePersist(district);

        district = this.districtRepository.save(district);

        //postPersist event
        _postPersist(district);

        return this.transformEntity(transform, district);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<District> create(final Collection<District> entities)
    {
        return (Collection<District>) create(DistrictDao.TRANSFORM_NONE, entities);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> create(final int transform, final Collection<District> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "District.create - 'entities' can not be null");
        }
        Collection<Object> transformed = new ArrayList<Object>();
        for (District entity : entities)
        {
            transformed.add(create(transform, entity));
        }
        return transformed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public District create(
        String code,
        String name)
    {
        return (District)this.create(DistrictDao.TRANSFORM_NONE, code, name);
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
        District entity = new District();
        entity.setCode(code);
        entity.setName(name);
        return this.create(transform, entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(District district)
    {
        if (district == null)
        {
            throw new IllegalArgumentException(
                "District.update - 'district' can not be null");
        }

        //preUpdate event
        _preUpdate(district);

        district = this.districtRepository.save(district);

        //postUpdate event
        _postUpdate(district);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final Collection<District> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "District.update - 'entities' can not be null");
        }
        for (District entity : entities)
        {
            update(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(District district)
    {
        if (district == null)
        {
            throw new IllegalArgumentException(
                "District.remove - 'district' can not be null");
        }
        //preRemove event
        _preRemove(district);

        this.districtRepository.delete(district);

        //postRemove event
        _postRemove(district);
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
                "District.remove - 'id' can not be null");
        }
        District entity = this.get(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Collection<District> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "District.remove - 'entities' can not be null");
        }
        for (District entity : entities)
        {
            //preRemove event
            _preRemove(entity);

            this.districtRepository.delete(entity);

            //postRemove event
            _postRemove(entity);
        }
    }
    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>DistrictDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link District} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link DistrictVO} - {@link #TRANSFORM_DISTRICTVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link DistrictDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see DistrictDao#transformEntity(int, District)
     */
    @Override
    public Object transformEntity(final int transform, final District entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_DISTRICTVO :
                    target = toDistrictVO(entity);
                    break;
                case DistrictDao.TRANSFORM_NONE : // fall-through
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
            case TRANSFORM_DISTRICTVO :
                CollectionUtils.transform(entities, this.DISTRICTVO_TRANSFORMER);
                break;
            case DistrictDao.TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see DistrictDao#toEntities(Collection)
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
     * (which result in an array of entities) to {@link District}
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
                else if (input instanceof District)
                {
                    result = input;
                }
                return result;
            }
        };

    /**
     * @param row
     * @return District
     */
    protected District toEntity(Object[] row)
    {
        District target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final Object object = row[ctr];
                if (object instanceof District)
                {
                    target = (District)object;
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
    public Collection<DistrictVO> toDistrictVOCollection(Collection<District> entities)
    {
        if (entities == null)
        {
            return null;
        }
        @SuppressWarnings("rawtypes")
        Collection result = new ArrayList(entities);
        CollectionUtils.transform(result, this.DISTRICTVO_TRANSFORMER);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({ "unchecked" })
    public DistrictVO[] toDistrictVOArray(Collection<?> entities)
    {
        DistrictVO[] result = null;
        if (entities != null)
        {
        @SuppressWarnings("rawtypes")
            final Collection collection = new ArrayList(entities);
            this.toDistrictVOCollection(collection);
            result = (DistrictVO[]) collection.toArray(new DistrictVO[collection.size()]);
        }
        return result;
    }

    /**
     * Default implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link DistrictDaoImpl} class if you intend to use reporting queries.
     * @param row
     * @return toDistrictVO(this.toEntity(row))
     * @see DistrictDao#toDistrictVO(District)
     */
    protected DistrictVO toDistrictVO(Object[] row)
    {
        return this.toDistrictVO(this.toEntity(row));
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link DistrictVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private Transformer DISTRICTVO_TRANSFORMER =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof District)
                {
                    final District entity = (District)input;
                    result = toDistrictVO(entity);
                }
                else if (input instanceof Object[])
                {
                    final Object[] rows = (Object[])input;
                    result = toDistrictVO(rows);
                }
                return result;
            }
        };

    /**
     * {@inheritDoc}
     */
    @Override
    public void districtVOToEntityCollection(Collection<?> instances)
    {
        if (instances != null)
        {
            for (final Iterator<?> iterator = instances.iterator(); iterator.hasNext();)
            {
                // - remove an objects that are null or not of the correct instance
                if (!(iterator.next() instanceof DistrictVO))
                {
                    iterator.remove();
                }
            }
            CollectionUtils.transform(instances, this.DistrictVOToEntityTransformer);
        }
    }

    private final Transformer DistrictVOToEntityTransformer =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                return districtVOToEntity((DistrictVO)input);
            }
        };


    /**
     * {@inheritDoc}
     */
    @Override
    public void toDistrictVO(
        District source,
        DistrictVO target)
    {
        target.setId(source.getId());
        target.setCode(source.getCode());
        target.setName(source.getName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistrictVO toDistrictVO(final District entity)
    {
        DistrictVO target = null;
        if (entity != null)
        {
            target =  new DistrictVO();
            this.toDistrictVO(entity, target);
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void districtVOToEntity(
        DistrictVO source,
        District target,
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
    public District searchUniqueCode(final String code)
    {

        Specification<District> spec = SigmaproduceSpecifications.<District, String>findByAttribute(code, "code");
        List<District> entities = districtRepository.findAll(spec, Sort.by("code"));
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
        final District entity=this.searchUniqueCode(code);
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
    public District searchUniqueName(final String name)
    {

        Specification<District> spec = SigmaproduceSpecifications.<District, String>findByAttribute(name, "name");
        List<District> entities = districtRepository.findAll(spec, Sort.by("name"));
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
        final District entity=this.searchUniqueName(name);
        if(entity == null)
        {
            return null;
        }
        return transformEntity(transform, entity);
    }


    /**
     * Create or Update the <code>district</code> instance in the persistent store.
     * @param district
     */
    @Override
    public District createOrUpdate(District district)
    {
        if(district.getId() == null)
        {
            return (District)this.create(TRANSFORM_NONE,district);
        }
        this.update(district);
        return district;
    }

    // spring-hibernate-dao-base merge-point
}