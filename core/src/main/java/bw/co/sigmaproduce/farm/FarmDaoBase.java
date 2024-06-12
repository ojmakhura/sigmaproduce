// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand! hibernate4or5=true hibernateVersion=6.1.6.Final
// Generated by hibernate/SpringHibernateDaoBase.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.farm;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>bw.co.sigmaproduce.farm.Farm</code>.
 * </p>
 *
 * @see bw.co.sigmaproduce.farm.Farm
 */
public abstract class FarmDaoBase
    implements bw.co.sigmaproduce.farm.FarmDao
{

    protected final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(FarmDaoBase.class);

    protected final bw.co.sigmaproduce.farm.FarmRepository farmRepository;

    protected bw.co.sigmaproduce.village.VillageDao villageDao;
    protected final bw.co.sigmaproduce.village.VillageRepository villageRepository;

    protected bw.co.sigmaproduce.farm.cultivation.CultivationDao cultivationDao;
    protected final bw.co.sigmaproduce.farm.cultivation.CultivationRepository cultivationRepository;

    protected bw.co.sigmaproduce.farm.post.PostDao postDao;
    protected final bw.co.sigmaproduce.farm.post.PostRepository postRepository;

    public FarmDaoBase(
        bw.co.sigmaproduce.village.VillageRepository villageRepository,
        bw.co.sigmaproduce.farm.cultivation.CultivationRepository cultivationRepository,
        bw.co.sigmaproduce.farm.post.PostRepository postRepository,
        bw.co.sigmaproduce.farm.FarmRepository farmRepository
    ) {
        this.farmRepository = farmRepository;
        this.villageRepository = villageRepository;
        this.cultivationRepository = cultivationRepository;
        this.postRepository = postRepository;
    }

    /**
     * Sets the reference to <code>villageDao</code>.
     * @param villageDaoIn
     */
    @org.springframework.beans.factory.annotation.Autowired
    public void setVillageDao(@org.springframework.context.annotation.Lazy bw.co.sigmaproduce.village.VillageDao villageDaoIn)
    {
        this.villageDao = villageDaoIn;
    }
    
    /**
     * Gets the reference to <code>villageDao</code>.
     * @return villageDao
     */
    protected bw.co.sigmaproduce.village.VillageDao getVillageDao()
    {
        return this.villageDao;
    }

    /**
     * Gets the reference to <code>villageRepository</code>.
     * @return villageRepository
     */
    protected bw.co.sigmaproduce.village.VillageRepository getVillageRepository()
    {
        return this.villageRepository;
    }

    /**
     * Sets the reference to <code>cultivationDao</code>.
     * @param cultivationDaoIn
     */
    @org.springframework.beans.factory.annotation.Autowired
    public void setCultivationDao(@org.springframework.context.annotation.Lazy bw.co.sigmaproduce.farm.cultivation.CultivationDao cultivationDaoIn)
    {
        this.cultivationDao = cultivationDaoIn;
    }
    
    /**
     * Gets the reference to <code>cultivationDao</code>.
     * @return cultivationDao
     */
    protected bw.co.sigmaproduce.farm.cultivation.CultivationDao getCultivationDao()
    {
        return this.cultivationDao;
    }

    /**
     * Gets the reference to <code>cultivationRepository</code>.
     * @return cultivationRepository
     */
    protected bw.co.sigmaproduce.farm.cultivation.CultivationRepository getCultivationRepository()
    {
        return this.cultivationRepository;
    }

    /**
     * Sets the reference to <code>postDao</code>.
     * @param postDaoIn
     */
    @org.springframework.beans.factory.annotation.Autowired
    public void setPostDao(@org.springframework.context.annotation.Lazy bw.co.sigmaproduce.farm.post.PostDao postDaoIn)
    {
        this.postDao = postDaoIn;
    }
    
    /**
     * Gets the reference to <code>postDao</code>.
     * @return postDao
     */
    protected bw.co.sigmaproduce.farm.post.PostDao getPostDao()
    {
        return this.postDao;
    }

    /**
     * Gets the reference to <code>postRepository</code>.
     * @return postRepository
     */
    protected bw.co.sigmaproduce.farm.post.PostRepository getPostRepository()
    {
        return this.postRepository;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(final int transform, final java.lang.String id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Farm.get - 'id' can not be null");
        }
        java.util.Optional<bw.co.sigmaproduce.farm.Farm> entity = farmRepository.findById(id);
        return transformEntity(transform, entity.get());
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.farm.Farm get(java.lang.String id)
    {
        return (bw.co.sigmaproduce.farm.Farm)this.get(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object load(final int transform, final java.lang.String id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Farm.load - 'id' can not be null");
        }
        java.util.Optional<bw.co.sigmaproduce.farm.Farm> entity = farmRepository.findById(id);
        return transformEntity(transform, entity.get());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.farm.Farm load(java.lang.String id)
    {
        return (bw.co.sigmaproduce.farm.Farm)this.load(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public java.util.Collection<bw.co.sigmaproduce.farm.Farm> loadAll()
    {
        return (java.util.Collection<bw.co.sigmaproduce.farm.Farm>) this.loadAll(bw.co.sigmaproduce.farm.FarmDao.TRANSFORM_NONE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.Collection<?> loadAll(final int transform)
    {
        return this.loadAll(transform, -1, -1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.Collection<?> loadAll(final int pageNumber, final int pageSize)
    {
        return this.loadAll(bw.co.sigmaproduce.farm.FarmDao.TRANSFORM_NONE, pageNumber, pageSize);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.Collection<?> loadAll(final int transform, final int pageNumber, final int pageSize)
    {
		
        final java.util.Collection<?> results = farmRepository.findAll();
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
     * @param farm bw.co.sigmaproduce.farm.Farm
     */
    protected void _prePersist(final bw.co.sigmaproduce.farm.Farm farm)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postPersist event - This method is called after creating the entity
     * @param farm bw.co.sigmaproduce.farm.Farm
     */
    protected void _postPersist(final bw.co.sigmaproduce.farm.Farm farm)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preUpdate event - This method is called before updating the entity
     * @param farm bw.co.sigmaproduce.farm.Farm
     */
    protected void _preUpdate(final bw.co.sigmaproduce.farm.Farm farm)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postUpdate event - This method is called after updating the entity
     * @param farm bw.co.sigmaproduce.farm.Farm
     */
    protected void _postUpdate(final bw.co.sigmaproduce.farm.Farm farm)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preRemove event - This method is called before deleting the entity
     * @param farm bw.co.sigmaproduce.farm.Farm
     */
    protected void _preRemove(final bw.co.sigmaproduce.farm.Farm farm)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postRemove event - This method is called after deleting the entity
     * @param farm bw.co.sigmaproduce.farm.Farm
     */
    protected void _postRemove(final bw.co.sigmaproduce.farm.Farm farm)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.farm.Farm create(bw.co.sigmaproduce.farm.Farm farm)
    {
        return (bw.co.sigmaproduce.farm.Farm)this.create(bw.co.sigmaproduce.farm.FarmDao.TRANSFORM_NONE, farm);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(final int transform, bw.co.sigmaproduce.farm.Farm farm)
    {
        if (farm == null)
        {
            throw new IllegalArgumentException(
                "Farm.create - 'farm' can not be null");
        }

        //prePersist event
        _prePersist(farm);

        farm = this.farmRepository.save(farm);

        //postPersist event
        _postPersist(farm);

        return this.transformEntity(transform, farm);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public java.util.Collection<bw.co.sigmaproduce.farm.Farm> create(final java.util.Collection<bw.co.sigmaproduce.farm.Farm> entities)
    {
        return (java.util.Collection<bw.co.sigmaproduce.farm.Farm>) create(bw.co.sigmaproduce.farm.FarmDao.TRANSFORM_NONE, entities);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.Collection<?> create(final int transform, final java.util.Collection<bw.co.sigmaproduce.farm.Farm> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Farm.create - 'entities' can not be null");
        }
        java.util.Collection<Object> transformed = new java.util.ArrayList<Object>();
        for (bw.co.sigmaproduce.farm.Farm entity : entities)
        {
            transformed.add(create(transform, entity));
        }
        return transformed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.farm.Farm create(
        java.lang.String createdBy,
        java.lang.String updatedBy,
        java.time.LocalDateTime updatedDate,
        java.time.LocalDateTime createdDate,
        java.lang.String name,
        java.lang.String ownerId,
        java.lang.Double latitude,
        java.lang.Double longitude,
        java.lang.String description,
        java.lang.Double size,
        bw.co.sigmaproduce.farm.Unit unit,
        java.util.Collection<java.io.File> photos)
    {
        return (bw.co.sigmaproduce.farm.Farm)this.create(bw.co.sigmaproduce.farm.FarmDao.TRANSFORM_NONE, createdBy, updatedBy, updatedDate, createdDate, name, ownerId, latitude, longitude, description, size, unit, photos);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(
        final int transform,
        java.lang.String createdBy,
        java.lang.String updatedBy,
        java.time.LocalDateTime updatedDate,
        java.time.LocalDateTime createdDate,
        java.lang.String name,
        java.lang.String ownerId,
        java.lang.Double latitude,
        java.lang.Double longitude,
        java.lang.String description,
        java.lang.Double size,
        bw.co.sigmaproduce.farm.Unit unit,
        java.util.Collection<java.io.File> photos)
    {
        bw.co.sigmaproduce.farm.Farm entity = new bw.co.sigmaproduce.farm.Farm();
        entity.setCreatedBy(createdBy);
        entity.setUpdatedBy(updatedBy);
        entity.setUpdatedDate(updatedDate);
        entity.setCreatedDate(createdDate);
        entity.setName(name);
        entity.setOwnerId(ownerId);
        entity.setLatitude(latitude);
        entity.setLongitude(longitude);
        entity.setDescription(description);
        entity.setSize(size);
        entity.setUnit(unit);
        entity.setPhotos(photos);
        return this.create(transform, entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(bw.co.sigmaproduce.farm.Farm farm)
    {
        if (farm == null)
        {
            throw new IllegalArgumentException(
                "Farm.update - 'farm' can not be null");
        }

        //preUpdate event
        _preUpdate(farm);

        farm = this.farmRepository.save(farm);

        //postUpdate event
        _postUpdate(farm);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final java.util.Collection<bw.co.sigmaproduce.farm.Farm> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Farm.update - 'entities' can not be null");
        }
        for (bw.co.sigmaproduce.farm.Farm entity : entities)
        {
            update(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(bw.co.sigmaproduce.farm.Farm farm)
    {
        if (farm == null)
        {
            throw new IllegalArgumentException(
                "Farm.remove - 'farm' can not be null");
        }
        //preRemove event
        _preRemove(farm);

        this.farmRepository.delete(farm);

        //postRemove event
        _postRemove(farm);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(java.lang.String id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Farm.remove - 'id' can not be null");
        }
        bw.co.sigmaproduce.farm.Farm entity = this.get(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(java.util.Collection<bw.co.sigmaproduce.farm.Farm> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Farm.remove - 'entities' can not be null");
        }
        for (bw.co.sigmaproduce.farm.Farm entity : entities)
        {
            //preRemove event
            _preRemove(entity);

            this.farmRepository.delete(entity);

            //postRemove event
            _postRemove(entity);
        }
    }
    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>bw.co.sigmaproduce.farm.FarmDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link bw.co.sigmaproduce.farm.Farm} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link bw.co.sigmaproduce.farm.FarmVO} - {@link #TRANSFORM_FARMVO}</li>
     *   <li>{@link bw.co.sigmaproduce.farm.FarmListVO} - {@link #TRANSFORM_FARMLISTVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link bw.co.sigmaproduce.farm.FarmDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see bw.co.sigmaproduce.farm.FarmDao#transformEntity(int, bw.co.sigmaproduce.farm.Farm)
     */
    @Override
    public Object transformEntity(final int transform, final bw.co.sigmaproduce.farm.Farm entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_FARMVO :
                    target = toFarmVO(entity);
                    break;
                case TRANSFORM_FARMLISTVO :
                    target = toFarmListVO(entity);
                    break;
                case bw.co.sigmaproduce.farm.FarmDao.TRANSFORM_NONE : // fall-through
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
    public void transformEntities(final int transform, final java.util.Collection<?> entities)
    {
        switch (transform)
        {
            case TRANSFORM_FARMVO :
                org.apache.commons.collections4.CollectionUtils.transform(entities, this.FARMVO_TRANSFORMER);
                break;
            case TRANSFORM_FARMLISTVO :
                org.apache.commons.collections4.CollectionUtils.transform(entities, this.FARMLISTVO_TRANSFORMER);
                break;
            case bw.co.sigmaproduce.farm.FarmDao.TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see bw.co.sigmaproduce.farm.FarmDao#toEntities(java.util.Collection)
     */
    @Override
    public void toEntities(final java.util.Collection<?> results)
    {
        if (results != null)
        {
            org.apache.commons.collections4.CollectionUtils.transform(results, this.ENTITYTRANSFORMER);
        }
    }

    /**
     * This anonymous transformer is designed to transform report query results
     * (which result in an array of entities) to {@link bw.co.sigmaproduce.farm.Farm}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private org.apache.commons.collections4.Transformer ENTITYTRANSFORMER =
        new org.apache.commons.collections4.Transformer()
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
                else if (input instanceof bw.co.sigmaproduce.farm.Farm)
                {
                    result = input;
                }
                return result;
            }
        };

    /**
     * @param row
     * @return bw.co.sigmaproduce.farm.Farm
     */
    protected bw.co.sigmaproduce.farm.Farm toEntity(Object[] row)
    {
        bw.co.sigmaproduce.farm.Farm target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final Object object = row[ctr];
                if (object instanceof bw.co.sigmaproduce.farm.Farm)
                {
                    target = (bw.co.sigmaproduce.farm.Farm)object;
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
    public java.util.Collection<bw.co.sigmaproduce.farm.FarmVO> toFarmVOCollection(java.util.Collection<bw.co.sigmaproduce.farm.Farm> entities)
    {
        if (entities == null)
        {
            return null;
        }
        @SuppressWarnings("rawtypes")
        java.util.Collection result = new java.util.ArrayList(entities);
        org.apache.commons.collections4.CollectionUtils.transform(result, this.FARMVO_TRANSFORMER);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({ "unchecked" })
    public bw.co.sigmaproduce.farm.FarmVO[] toFarmVOArray(java.util.Collection<?> entities)
    {
        bw.co.sigmaproduce.farm.FarmVO[] result = null;
        if (entities != null)
        {
        @SuppressWarnings("rawtypes")
            final java.util.Collection collection = new java.util.ArrayList(entities);
            this.toFarmVOCollection(collection);
            result = (bw.co.sigmaproduce.farm.FarmVO[]) collection.toArray(new bw.co.sigmaproduce.farm.FarmVO[collection.size()]);
        }
        return result;
    }

    /**
     * Default implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link FarmDaoImpl} class if you intend to use reporting queries.
     * @param row
     * @return toFarmVO(this.toEntity(row))
     * @see bw.co.sigmaproduce.farm.FarmDao#toFarmVO(bw.co.sigmaproduce.farm.Farm)
     */
    protected bw.co.sigmaproduce.farm.FarmVO toFarmVO(Object[] row)
    {
        return this.toFarmVO(this.toEntity(row));
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link bw.co.sigmaproduce.farm.FarmVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private org.apache.commons.collections4.Transformer FARMVO_TRANSFORMER =
        new org.apache.commons.collections4.Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof bw.co.sigmaproduce.farm.Farm)
                {
                    final bw.co.sigmaproduce.farm.Farm entity = (bw.co.sigmaproduce.farm.Farm)input;
                    result = toFarmVO(entity);
                }
                else if (input instanceof Object[])
                {
                    final Object[] rows = (Object[])input;
                    result = toFarmVO(rows);
                }
                return result;
            }
        };

    /**
     * {@inheritDoc}
     */
    @Override
    public void farmVOToEntityCollection(java.util.Collection<?> instances)
    {
        if (instances != null)
        {
            for (final java.util.Iterator<?> iterator = instances.iterator(); iterator.hasNext();)
            {
                // - remove an objects that are null or not of the correct instance
                if (!(iterator.next() instanceof bw.co.sigmaproduce.farm.FarmVO))
                {
                    iterator.remove();
                }
            }
            org.apache.commons.collections4.CollectionUtils.transform(instances, this.FarmVOToEntityTransformer);
        }
    }

    private final org.apache.commons.collections4.Transformer FarmVOToEntityTransformer =
        new org.apache.commons.collections4.Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                return farmVOToEntity((bw.co.sigmaproduce.farm.FarmVO)input);
            }
        };


    /**
     * {@inheritDoc}
     */
    @Override
    public void toFarmVO(
        bw.co.sigmaproduce.farm.Farm source,
        bw.co.sigmaproduce.farm.FarmVO target)
    {
        target.setId(source.getId());
        target.setCreatedBy(source.getCreatedBy());
        target.setUpdatedBy(source.getUpdatedBy());
        target.setCreatedDate(source.getCreatedDate());
        target.setUpdatedDate(source.getUpdatedDate());
        target.setName(source.getName());
        target.setDescription(source.getDescription());
        target.setLatitude(source.getLatitude());
        target.setLongitude(source.getLongitude());
        // No conversion for target.nearestVillage (can't convert source.getNearestVillage():bw.co.sigmaproduce.village.Village to bw.co.sigmaproduce.village.VillageVO)
        target.setOwnerId(source.getOwnerId());
        target.setUnit(source.getUnit());
        target.setSize(source.getSize());
        // No conversion for target.alliedFarms (can't convert source.getAlliedFarms():bw.co.sigmaproduce.farm.Farm to bw.co.sigmaproduce.farm.FarmListVO)
        // No conversion for target.cultivations (can't convert source.getCultivations():bw.co.sigmaproduce.farm.cultivation.Cultivation to bw.co.sigmaproduce.farm.cultivation.CultivationListVO)
        // No conversion for target.posts (can't convert source.getPosts():bw.co.sigmaproduce.farm.post.Post to bw.co.sigmaproduce.farm.post.PostVO)
        if(org.apache.commons.collections4.CollectionUtils.isNotEmpty(target.getPhotos())){
            target.getPhotos().clear();
        } else {
            target.setPhotos(new java.util.ArrayList<>());
        }
        
        if(null!=source.getPhotos()) {
            target.getPhotos().addAll(source.getPhotos());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.farm.FarmVO toFarmVO(final bw.co.sigmaproduce.farm.Farm entity)
    {
        bw.co.sigmaproduce.farm.FarmVO target = null;
        if (entity != null)
        {
            target =  new bw.co.sigmaproduce.farm.FarmVO();
            this.toFarmVO(entity, target);
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void farmVOToEntity(
        bw.co.sigmaproduce.farm.FarmVO source,
        bw.co.sigmaproduce.farm.Farm target,
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
        if (copyIfNull || source.getName() != null)
        {
            target.setName(source.getName());
        }
        if (copyIfNull || source.getOwnerId() != null)
        {
            target.setOwnerId(source.getOwnerId());
        }
        if (copyIfNull || source.getLatitude() != null)
        {
            target.setLatitude(source.getLatitude());
        }
        if (copyIfNull || source.getLongitude() != null)
        {
            target.setLongitude(source.getLongitude());
        }
        if (copyIfNull || source.getDescription() != null)
        {
            target.setDescription(source.getDescription());
        }
        if (copyIfNull || source.getSize() != null)
        {
            target.setSize(source.getSize());
        }
        if (copyIfNull || source.getUnit() != null)
        {
            target.setUnit(source.getUnit());
        }
        if (copyIfNull || source.getPhotos() != null)
        {
            if(org.apache.commons.collections4.CollectionUtils.isNotEmpty(target.getPhotos())){
                target.getPhotos().clear();
            } else {
                target.setPhotos(new java.util.ArrayList<>());
            }
            if(null != source.getPhotos()) {
                target.getPhotos().addAll(source.getPhotos());
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public java.util.Collection<bw.co.sigmaproduce.farm.FarmListVO> toFarmListVOCollection(java.util.Collection<bw.co.sigmaproduce.farm.Farm> entities)
    {
        if (entities == null)
        {
            return null;
        }
        @SuppressWarnings("rawtypes")
        java.util.Collection result = new java.util.ArrayList(entities);
        org.apache.commons.collections4.CollectionUtils.transform(result, this.FARMLISTVO_TRANSFORMER);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({ "unchecked" })
    public bw.co.sigmaproduce.farm.FarmListVO[] toFarmListVOArray(java.util.Collection<?> entities)
    {
        bw.co.sigmaproduce.farm.FarmListVO[] result = null;
        if (entities != null)
        {
        @SuppressWarnings("rawtypes")
            final java.util.Collection collection = new java.util.ArrayList(entities);
            this.toFarmListVOCollection(collection);
            result = (bw.co.sigmaproduce.farm.FarmListVO[]) collection.toArray(new bw.co.sigmaproduce.farm.FarmListVO[collection.size()]);
        }
        return result;
    }

    /**
     * Default implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link FarmDaoImpl} class if you intend to use reporting queries.
     * @param row
     * @return toFarmListVO(this.toEntity(row))
     * @see bw.co.sigmaproduce.farm.FarmDao#toFarmListVO(bw.co.sigmaproduce.farm.Farm)
     */
    protected bw.co.sigmaproduce.farm.FarmListVO toFarmListVO(Object[] row)
    {
        return this.toFarmListVO(this.toEntity(row));
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link bw.co.sigmaproduce.farm.FarmListVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private org.apache.commons.collections4.Transformer FARMLISTVO_TRANSFORMER =
        new org.apache.commons.collections4.Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof bw.co.sigmaproduce.farm.Farm)
                {
                    final bw.co.sigmaproduce.farm.Farm entity = (bw.co.sigmaproduce.farm.Farm)input;
                    result = toFarmListVO(entity);
                }
                else if (input instanceof Object[])
                {
                    final Object[] rows = (Object[])input;
                    result = toFarmListVO(rows);
                }
                return result;
            }
        };

    /**
     * {@inheritDoc}
     */
    @Override
    public void farmListVOToEntityCollection(java.util.Collection<?> instances)
    {
        if (instances != null)
        {
            for (final java.util.Iterator<?> iterator = instances.iterator(); iterator.hasNext();)
            {
                // - remove an objects that are null or not of the correct instance
                if (!(iterator.next() instanceof bw.co.sigmaproduce.farm.FarmListVO))
                {
                    iterator.remove();
                }
            }
            org.apache.commons.collections4.CollectionUtils.transform(instances, this.FarmListVOToEntityTransformer);
        }
    }

    private final org.apache.commons.collections4.Transformer FarmListVOToEntityTransformer =
        new org.apache.commons.collections4.Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                return farmListVOToEntity((bw.co.sigmaproduce.farm.FarmListVO)input);
            }
        };


    /**
     * {@inheritDoc}
     */
    @Override
    public void toFarmListVO(
        bw.co.sigmaproduce.farm.Farm source,
        bw.co.sigmaproduce.farm.FarmListVO target)
    {
        target.setId(source.getId());
        target.setName(source.getName());
        target.setLatitude(source.getLatitude());
        target.setLongitude(source.getLongitude());
        // No conversion for target.nearestVillage (can't convert source.getNearestVillage():bw.co.sigmaproduce.village.Village to java.lang.String)
        target.setUnit(source.getUnit());
        target.setSize(source.getSize());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.farm.FarmListVO toFarmListVO(final bw.co.sigmaproduce.farm.Farm entity)
    {
        bw.co.sigmaproduce.farm.FarmListVO target = null;
        if (entity != null)
        {
            target =  new bw.co.sigmaproduce.farm.FarmListVO();
            this.toFarmListVO(entity, target);
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void farmListVOToEntity(
        bw.co.sigmaproduce.farm.FarmListVO source,
        bw.co.sigmaproduce.farm.Farm target,
        boolean copyIfNull)
    {
        if (copyIfNull || source.getName() != null)
        {
            target.setName(source.getName());
        }
        if (copyIfNull || source.getLatitude() != null)
        {
            target.setLatitude(source.getLatitude());
        }
        if (copyIfNull || source.getLongitude() != null)
        {
            target.setLongitude(source.getLongitude());
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
    protected java.security.Principal getPrincipal()
    {
        return bw.co.sigmaproduce.PrincipalStore.get();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.farm.Farm searchUniqueName(final java.lang.String name)
    {

        org.springframework.data.jpa.domain.Specification<bw.co.sigmaproduce.farm.Farm> spec = bw.co.sigmaproduce.SigmaproduceSpecifications.<bw.co.sigmaproduce.farm.Farm, java.lang.String>findByAttribute(name, "name");
        java.util.List<bw.co.sigmaproduce.farm.Farm> entities = farmRepository.findAll(spec, org.springframework.data.domain.Sort.by("name"));
        if(org.apache.commons.collections4.CollectionUtils.isEmpty(entities)) {
            return null;
        }

        return entities.get(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object searchUniqueName(final int transform, final java.lang.String name)
    {
        final bw.co.sigmaproduce.farm.Farm entity=this.searchUniqueName(name);
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
    public bw.co.sigmaproduce.farm.Farm searchUniquePhotos(final java.io.File photos)
    {

        org.springframework.data.jpa.domain.Specification<bw.co.sigmaproduce.farm.Farm> spec = bw.co.sigmaproduce.SigmaproduceSpecifications.<bw.co.sigmaproduce.farm.Farm, java.io.File>findByAttribute(photos, "photos");
        java.util.List<bw.co.sigmaproduce.farm.Farm> entities = farmRepository.findAll(spec, org.springframework.data.domain.Sort.by("photos"));
        if(org.apache.commons.collections4.CollectionUtils.isEmpty(entities)) {
            return null;
        }

        return entities.get(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object searchUniquePhotos(final int transform, final java.io.File photos)
    {
        final bw.co.sigmaproduce.farm.Farm entity=this.searchUniquePhotos(photos);
        if(entity == null)
        {
            return null;
        }
        return transformEntity(transform, entity);
    }


    /**
     * Create or Update the <code>farm</code> instance in the persistent store.
     * @param farm
     */
    @Override
    public bw.co.sigmaproduce.farm.Farm createOrUpdate(bw.co.sigmaproduce.farm.Farm farm)
    {
        if(farm.getId() == null)
        {
            return (bw.co.sigmaproduce.farm.Farm)this.create(TRANSFORM_NONE,farm);
        }
        this.update(farm);
        return farm;
    }

    // spring-hibernate-dao-base merge-point
}