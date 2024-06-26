// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand! hibernate4or5=true hibernateVersion=6.1.6.Final
// Generated by hibernate/SpringHibernateDaoBase.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.crop.issue;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>bw.co.sigmaproduce.crop.issue.CropIssue</code>.
 * </p>
 *
 * @see bw.co.sigmaproduce.crop.issue.CropIssue
 */
public abstract class CropIssueDaoBase
    implements bw.co.sigmaproduce.crop.issue.CropIssueDao
{

    protected final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(CropIssueDaoBase.class);

    protected final bw.co.sigmaproduce.crop.issue.CropIssueRepository cropIssueRepository;

    protected bw.co.sigmaproduce.crop.type.CropTypeDao cropTypeDao;
    protected final bw.co.sigmaproduce.crop.type.CropTypeRepository cropTypeRepository;

    protected bw.co.sigmaproduce.crop.CropDao cropDao;
    protected final bw.co.sigmaproduce.crop.CropRepository cropRepository;

    protected bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemDao cultivationProblemDao;
    protected final bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemRepository cultivationProblemRepository;

    public CropIssueDaoBase(
        bw.co.sigmaproduce.crop.type.CropTypeRepository cropTypeRepository,
        bw.co.sigmaproduce.crop.CropRepository cropRepository,
        bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemRepository cultivationProblemRepository,
        bw.co.sigmaproduce.crop.issue.CropIssueRepository cropIssueRepository
    ) {
        this.cropIssueRepository = cropIssueRepository;
        this.cropTypeRepository = cropTypeRepository;
        this.cropRepository = cropRepository;
        this.cultivationProblemRepository = cultivationProblemRepository;
    }

    /**
     * Sets the reference to <code>cropTypeDao</code>.
     * @param cropTypeDaoIn
     */
    @org.springframework.beans.factory.annotation.Autowired
    public void setCropTypeDao(@org.springframework.context.annotation.Lazy bw.co.sigmaproduce.crop.type.CropTypeDao cropTypeDaoIn)
    {
        this.cropTypeDao = cropTypeDaoIn;
    }
    
    /**
     * Gets the reference to <code>cropTypeDao</code>.
     * @return cropTypeDao
     */
    protected bw.co.sigmaproduce.crop.type.CropTypeDao getCropTypeDao()
    {
        return this.cropTypeDao;
    }

    /**
     * Gets the reference to <code>cropTypeRepository</code>.
     * @return cropTypeRepository
     */
    protected bw.co.sigmaproduce.crop.type.CropTypeRepository getCropTypeRepository()
    {
        return this.cropTypeRepository;
    }

    /**
     * Sets the reference to <code>cropDao</code>.
     * @param cropDaoIn
     */
    @org.springframework.beans.factory.annotation.Autowired
    public void setCropDao(@org.springframework.context.annotation.Lazy bw.co.sigmaproduce.crop.CropDao cropDaoIn)
    {
        this.cropDao = cropDaoIn;
    }
    
    /**
     * Gets the reference to <code>cropDao</code>.
     * @return cropDao
     */
    protected bw.co.sigmaproduce.crop.CropDao getCropDao()
    {
        return this.cropDao;
    }

    /**
     * Gets the reference to <code>cropRepository</code>.
     * @return cropRepository
     */
    protected bw.co.sigmaproduce.crop.CropRepository getCropRepository()
    {
        return this.cropRepository;
    }

    /**
     * Sets the reference to <code>cultivationProblemDao</code>.
     * @param cultivationProblemDaoIn
     */
    @org.springframework.beans.factory.annotation.Autowired
    public void setCultivationProblemDao(@org.springframework.context.annotation.Lazy bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemDao cultivationProblemDaoIn)
    {
        this.cultivationProblemDao = cultivationProblemDaoIn;
    }
    
    /**
     * Gets the reference to <code>cultivationProblemDao</code>.
     * @return cultivationProblemDao
     */
    protected bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemDao getCultivationProblemDao()
    {
        return this.cultivationProblemDao;
    }

    /**
     * Gets the reference to <code>cultivationProblemRepository</code>.
     * @return cultivationProblemRepository
     */
    protected bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemRepository getCultivationProblemRepository()
    {
        return this.cultivationProblemRepository;
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
                "CropIssue.get - 'id' can not be null");
        }
        java.util.Optional<bw.co.sigmaproduce.crop.issue.CropIssue> entity = cropIssueRepository.findById(id);
        return transformEntity(transform, entity.get());
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.crop.issue.CropIssue get(java.lang.String id)
    {
        return (bw.co.sigmaproduce.crop.issue.CropIssue)this.get(TRANSFORM_NONE, id);
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
                "CropIssue.load - 'id' can not be null");
        }
        java.util.Optional<bw.co.sigmaproduce.crop.issue.CropIssue> entity = cropIssueRepository.findById(id);
        return transformEntity(transform, entity.get());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.crop.issue.CropIssue load(java.lang.String id)
    {
        return (bw.co.sigmaproduce.crop.issue.CropIssue)this.load(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public java.util.Collection<bw.co.sigmaproduce.crop.issue.CropIssue> loadAll()
    {
        return (java.util.Collection<bw.co.sigmaproduce.crop.issue.CropIssue>) this.loadAll(bw.co.sigmaproduce.crop.issue.CropIssueDao.TRANSFORM_NONE);
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
        return this.loadAll(bw.co.sigmaproduce.crop.issue.CropIssueDao.TRANSFORM_NONE, pageNumber, pageSize);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.Collection<?> loadAll(final int transform, final int pageNumber, final int pageSize)
    {
		
        final java.util.Collection<?> results = cropIssueRepository.findAll();
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
     * @param cropIssue bw.co.sigmaproduce.crop.issue.CropIssue
     */
    protected void _prePersist(final bw.co.sigmaproduce.crop.issue.CropIssue cropIssue)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postPersist event - This method is called after creating the entity
     * @param cropIssue bw.co.sigmaproduce.crop.issue.CropIssue
     */
    protected void _postPersist(final bw.co.sigmaproduce.crop.issue.CropIssue cropIssue)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preUpdate event - This method is called before updating the entity
     * @param cropIssue bw.co.sigmaproduce.crop.issue.CropIssue
     */
    protected void _preUpdate(final bw.co.sigmaproduce.crop.issue.CropIssue cropIssue)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postUpdate event - This method is called after updating the entity
     * @param cropIssue bw.co.sigmaproduce.crop.issue.CropIssue
     */
    protected void _postUpdate(final bw.co.sigmaproduce.crop.issue.CropIssue cropIssue)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preRemove event - This method is called before deleting the entity
     * @param cropIssue bw.co.sigmaproduce.crop.issue.CropIssue
     */
    protected void _preRemove(final bw.co.sigmaproduce.crop.issue.CropIssue cropIssue)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postRemove event - This method is called after deleting the entity
     * @param cropIssue bw.co.sigmaproduce.crop.issue.CropIssue
     */
    protected void _postRemove(final bw.co.sigmaproduce.crop.issue.CropIssue cropIssue)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.crop.issue.CropIssue create(bw.co.sigmaproduce.crop.issue.CropIssue cropIssue)
    {
        return (bw.co.sigmaproduce.crop.issue.CropIssue)this.create(bw.co.sigmaproduce.crop.issue.CropIssueDao.TRANSFORM_NONE, cropIssue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(final int transform, bw.co.sigmaproduce.crop.issue.CropIssue cropIssue)
    {
        if (cropIssue == null)
        {
            throw new IllegalArgumentException(
                "CropIssue.create - 'cropIssue' can not be null");
        }

        //prePersist event
        _prePersist(cropIssue);

        cropIssue = this.cropIssueRepository.save(cropIssue);

        //postPersist event
        _postPersist(cropIssue);

        return this.transformEntity(transform, cropIssue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public java.util.Collection<bw.co.sigmaproduce.crop.issue.CropIssue> create(final java.util.Collection<bw.co.sigmaproduce.crop.issue.CropIssue> entities)
    {
        return (java.util.Collection<bw.co.sigmaproduce.crop.issue.CropIssue>) create(bw.co.sigmaproduce.crop.issue.CropIssueDao.TRANSFORM_NONE, entities);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.Collection<?> create(final int transform, final java.util.Collection<bw.co.sigmaproduce.crop.issue.CropIssue> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "CropIssue.create - 'entities' can not be null");
        }
        java.util.Collection<Object> transformed = new java.util.ArrayList<Object>();
        for (bw.co.sigmaproduce.crop.issue.CropIssue entity : entities)
        {
            transformed.add(create(transform, entity));
        }
        return transformed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.crop.issue.CropIssue create(
        java.lang.String createdBy,
        java.lang.String updatedBy,
        java.time.LocalDateTime updatedDate,
        java.time.LocalDateTime createdDate,
        java.lang.String name,
        java.lang.String scientificName,
        java.util.Collection<java.io.File> images,
        java.lang.String description,
        bw.co.sigmaproduce.crop.issue.CropIssueType issue)
    {
        return (bw.co.sigmaproduce.crop.issue.CropIssue)this.create(bw.co.sigmaproduce.crop.issue.CropIssueDao.TRANSFORM_NONE, createdBy, updatedBy, updatedDate, createdDate, name, scientificName, images, description, issue);
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
        java.lang.String scientificName,
        java.util.Collection<java.io.File> images,
        java.lang.String description,
        bw.co.sigmaproduce.crop.issue.CropIssueType issue)
    {
        bw.co.sigmaproduce.crop.issue.CropIssue entity = new bw.co.sigmaproduce.crop.issue.CropIssue();
        entity.setCreatedBy(createdBy);
        entity.setUpdatedBy(updatedBy);
        entity.setUpdatedDate(updatedDate);
        entity.setCreatedDate(createdDate);
        entity.setName(name);
        entity.setScientificName(scientificName);
        entity.setImages(images);
        entity.setDescription(description);
        entity.setIssue(issue);
        return this.create(transform, entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(bw.co.sigmaproduce.crop.issue.CropIssue cropIssue)
    {
        if (cropIssue == null)
        {
            throw new IllegalArgumentException(
                "CropIssue.update - 'cropIssue' can not be null");
        }

        //preUpdate event
        _preUpdate(cropIssue);

        cropIssue = this.cropIssueRepository.save(cropIssue);

        //postUpdate event
        _postUpdate(cropIssue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final java.util.Collection<bw.co.sigmaproduce.crop.issue.CropIssue> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "CropIssue.update - 'entities' can not be null");
        }
        for (bw.co.sigmaproduce.crop.issue.CropIssue entity : entities)
        {
            update(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(bw.co.sigmaproduce.crop.issue.CropIssue cropIssue)
    {
        if (cropIssue == null)
        {
            throw new IllegalArgumentException(
                "CropIssue.remove - 'cropIssue' can not be null");
        }
        //preRemove event
        _preRemove(cropIssue);

        this.cropIssueRepository.delete(cropIssue);

        //postRemove event
        _postRemove(cropIssue);
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
                "CropIssue.remove - 'id' can not be null");
        }
        bw.co.sigmaproduce.crop.issue.CropIssue entity = this.get(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(java.util.Collection<bw.co.sigmaproduce.crop.issue.CropIssue> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "CropIssue.remove - 'entities' can not be null");
        }
        for (bw.co.sigmaproduce.crop.issue.CropIssue entity : entities)
        {
            //preRemove event
            _preRemove(entity);

            this.cropIssueRepository.delete(entity);

            //postRemove event
            _postRemove(entity);
        }
    }
    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>bw.co.sigmaproduce.crop.issue.CropIssueDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link bw.co.sigmaproduce.crop.issue.CropIssue} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link bw.co.sigmaproduce.crop.issue.CropIssueVO} - {@link #TRANSFORM_CROPISSUEVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link bw.co.sigmaproduce.crop.issue.CropIssueDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see bw.co.sigmaproduce.crop.issue.CropIssueDao#transformEntity(int, bw.co.sigmaproduce.crop.issue.CropIssue)
     */
    @Override
    public Object transformEntity(final int transform, final bw.co.sigmaproduce.crop.issue.CropIssue entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_CROPISSUEVO :
                    target = toCropIssueVO(entity);
                    break;
                case bw.co.sigmaproduce.crop.issue.CropIssueDao.TRANSFORM_NONE : // fall-through
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
            case TRANSFORM_CROPISSUEVO :
                org.apache.commons.collections4.CollectionUtils.transform(entities, this.CROPISSUEVO_TRANSFORMER);
                break;
            case bw.co.sigmaproduce.crop.issue.CropIssueDao.TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see bw.co.sigmaproduce.crop.issue.CropIssueDao#toEntities(java.util.Collection)
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
     * (which result in an array of entities) to {@link bw.co.sigmaproduce.crop.issue.CropIssue}
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
                else if (input instanceof bw.co.sigmaproduce.crop.issue.CropIssue)
                {
                    result = input;
                }
                return result;
            }
        };

    /**
     * @param row
     * @return bw.co.sigmaproduce.crop.issue.CropIssue
     */
    protected bw.co.sigmaproduce.crop.issue.CropIssue toEntity(Object[] row)
    {
        bw.co.sigmaproduce.crop.issue.CropIssue target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final Object object = row[ctr];
                if (object instanceof bw.co.sigmaproduce.crop.issue.CropIssue)
                {
                    target = (bw.co.sigmaproduce.crop.issue.CropIssue)object;
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
    public java.util.Collection<bw.co.sigmaproduce.crop.issue.CropIssueVO> toCropIssueVOCollection(java.util.Collection<bw.co.sigmaproduce.crop.issue.CropIssue> entities)
    {
        if (entities == null)
        {
            return null;
        }
        @SuppressWarnings("rawtypes")
        java.util.Collection result = new java.util.ArrayList(entities);
        org.apache.commons.collections4.CollectionUtils.transform(result, this.CROPISSUEVO_TRANSFORMER);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({ "unchecked" })
    public bw.co.sigmaproduce.crop.issue.CropIssueVO[] toCropIssueVOArray(java.util.Collection<?> entities)
    {
        bw.co.sigmaproduce.crop.issue.CropIssueVO[] result = null;
        if (entities != null)
        {
        @SuppressWarnings("rawtypes")
            final java.util.Collection collection = new java.util.ArrayList(entities);
            this.toCropIssueVOCollection(collection);
            result = (bw.co.sigmaproduce.crop.issue.CropIssueVO[]) collection.toArray(new bw.co.sigmaproduce.crop.issue.CropIssueVO[collection.size()]);
        }
        return result;
    }

    /**
     * Default implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link CropIssueDaoImpl} class if you intend to use reporting queries.
     * @param row
     * @return toCropIssueVO(this.toEntity(row))
     * @see bw.co.sigmaproduce.crop.issue.CropIssueDao#toCropIssueVO(bw.co.sigmaproduce.crop.issue.CropIssue)
     */
    protected bw.co.sigmaproduce.crop.issue.CropIssueVO toCropIssueVO(Object[] row)
    {
        return this.toCropIssueVO(this.toEntity(row));
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link bw.co.sigmaproduce.crop.issue.CropIssueVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private org.apache.commons.collections4.Transformer CROPISSUEVO_TRANSFORMER =
        new org.apache.commons.collections4.Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof bw.co.sigmaproduce.crop.issue.CropIssue)
                {
                    final bw.co.sigmaproduce.crop.issue.CropIssue entity = (bw.co.sigmaproduce.crop.issue.CropIssue)input;
                    result = toCropIssueVO(entity);
                }
                else if (input instanceof Object[])
                {
                    final Object[] rows = (Object[])input;
                    result = toCropIssueVO(rows);
                }
                return result;
            }
        };

    /**
     * {@inheritDoc}
     */
    @Override
    public void cropIssueVOToEntityCollection(java.util.Collection<?> instances)
    {
        if (instances != null)
        {
            for (final java.util.Iterator<?> iterator = instances.iterator(); iterator.hasNext();)
            {
                // - remove an objects that are null or not of the correct instance
                if (!(iterator.next() instanceof bw.co.sigmaproduce.crop.issue.CropIssueVO))
                {
                    iterator.remove();
                }
            }
            org.apache.commons.collections4.CollectionUtils.transform(instances, this.CropIssueVOToEntityTransformer);
        }
    }

    private final org.apache.commons.collections4.Transformer CropIssueVOToEntityTransformer =
        new org.apache.commons.collections4.Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                return cropIssueVOToEntity((bw.co.sigmaproduce.crop.issue.CropIssueVO)input);
            }
        };


    /**
     * {@inheritDoc}
     */
    @Override
    public void toCropIssueVO(
        bw.co.sigmaproduce.crop.issue.CropIssue source,
        bw.co.sigmaproduce.crop.issue.CropIssueVO target)
    {
        target.setId(source.getId());
        target.setCreatedBy(source.getCreatedBy());
        target.setUpdatedBy(source.getUpdatedBy());
        target.setCreatedDate(source.getCreatedDate());
        target.setUpdatedDate(source.getUpdatedDate());
        target.setName(source.getName());
        target.setScientificName(source.getScientificName());
        if(org.apache.commons.collections4.CollectionUtils.isNotEmpty(target.getImages())){
            target.getImages().clear();
        } else {
            target.setImages(new java.util.ArrayList<>());
        }
        
        if(null!=source.getImages()) {
            target.getImages().addAll(source.getImages());
        }
        target.setDescription(source.getDescription());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public bw.co.sigmaproduce.crop.issue.CropIssueVO toCropIssueVO(final bw.co.sigmaproduce.crop.issue.CropIssue entity)
    {
        bw.co.sigmaproduce.crop.issue.CropIssueVO target = null;
        if (entity != null)
        {
            target =  new bw.co.sigmaproduce.crop.issue.CropIssueVO();
            this.toCropIssueVO(entity, target);
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cropIssueVOToEntity(
        bw.co.sigmaproduce.crop.issue.CropIssueVO source,
        bw.co.sigmaproduce.crop.issue.CropIssue target,
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
        if (copyIfNull || source.getScientificName() != null)
        {
            target.setScientificName(source.getScientificName());
        }
        if (copyIfNull || source.getImages() != null)
        {
            if(org.apache.commons.collections4.CollectionUtils.isNotEmpty(target.getImages())){
                target.getImages().clear();
            } else {
                target.setImages(new java.util.ArrayList<>());
            }
            if(null != source.getImages()) {
                target.getImages().addAll(source.getImages());
            }
        }
        if (copyIfNull || source.getDescription() != null)
        {
            target.setDescription(source.getDescription());
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
    public bw.co.sigmaproduce.crop.issue.CropIssue searchUniqueName(final java.lang.String name)
    {

        org.springframework.data.jpa.domain.Specification<bw.co.sigmaproduce.crop.issue.CropIssue> spec = bw.co.sigmaproduce.SigmaproduceSpecifications.<bw.co.sigmaproduce.crop.issue.CropIssue, java.lang.String>findByAttribute(name, "name");
        java.util.List<bw.co.sigmaproduce.crop.issue.CropIssue> entities = cropIssueRepository.findAll(spec, org.springframework.data.domain.Sort.by("name"));
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
        final bw.co.sigmaproduce.crop.issue.CropIssue entity=this.searchUniqueName(name);
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
    public bw.co.sigmaproduce.crop.issue.CropIssue searchUniqueScientificName(final java.lang.String scientificName)
    {

        org.springframework.data.jpa.domain.Specification<bw.co.sigmaproduce.crop.issue.CropIssue> spec = bw.co.sigmaproduce.SigmaproduceSpecifications.<bw.co.sigmaproduce.crop.issue.CropIssue, java.lang.String>findByAttribute(scientificName, "scientificName");
        java.util.List<bw.co.sigmaproduce.crop.issue.CropIssue> entities = cropIssueRepository.findAll(spec, org.springframework.data.domain.Sort.by("scientificName"));
        if(org.apache.commons.collections4.CollectionUtils.isEmpty(entities)) {
            return null;
        }

        return entities.get(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object searchUniqueScientificName(final int transform, final java.lang.String scientificName)
    {
        final bw.co.sigmaproduce.crop.issue.CropIssue entity=this.searchUniqueScientificName(scientificName);
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
    public bw.co.sigmaproduce.crop.issue.CropIssue searchUniqueIssue(final bw.co.sigmaproduce.crop.issue.CropIssueType issue)
    {

        org.springframework.data.jpa.domain.Specification<bw.co.sigmaproduce.crop.issue.CropIssue> spec = bw.co.sigmaproduce.SigmaproduceSpecifications.<bw.co.sigmaproduce.crop.issue.CropIssue, bw.co.sigmaproduce.crop.issue.CropIssueType>findByAttribute(issue, "issue");
        java.util.List<bw.co.sigmaproduce.crop.issue.CropIssue> entities = cropIssueRepository.findAll(spec, org.springframework.data.domain.Sort.by("issue"));
        if(org.apache.commons.collections4.CollectionUtils.isEmpty(entities)) {
            return null;
        }

        return entities.get(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object searchUniqueIssue(final int transform, final bw.co.sigmaproduce.crop.issue.CropIssueType issue)
    {
        final bw.co.sigmaproduce.crop.issue.CropIssue entity=this.searchUniqueIssue(issue);
        if(entity == null)
        {
            return null;
        }
        return transformEntity(transform, entity);
    }


    /**
     * Create or Update the <code>cropIssue</code> instance in the persistent store.
     * @param cropIssue
     */
    @Override
    public bw.co.sigmaproduce.crop.issue.CropIssue createOrUpdate(bw.co.sigmaproduce.crop.issue.CropIssue cropIssue)
    {
        if(cropIssue.getId() == null)
        {
            return (bw.co.sigmaproduce.crop.issue.CropIssue)this.create(TRANSFORM_NONE,cropIssue);
        }
        this.update(cropIssue);
        return cropIssue;
    }

    // spring-hibernate-dao-base merge-point
}
