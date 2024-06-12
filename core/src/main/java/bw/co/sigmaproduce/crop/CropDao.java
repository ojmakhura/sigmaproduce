// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringDao.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.crop;

import bw.co.sigmaproduce.TimePeriod;
import java.io.File;
import java.time.LocalDateTime;
import java.util.Collection;
import org.springframework.data.domain.Page;

/**
 * TODO: Model Documentation for Crop
 * @see Crop
 */
public interface CropDao
{
    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes no transformation will occur.
     */
    public static final int TRANSFORM_NONE = 0;


    /**
     * Transforms the given results to a collection of {@link Crop}
     * instances (this is useful when the returned results contains a row of data and you want just entities only).
     *
     * @param results the query results.
     */
    public void toEntities(final Collection<?> results);

    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes entities must be transformed into objects of type
     * {@link CropVO}.
     */
    public static final int TRANSFORM_CROPVO = 1;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toCropVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     * @param source
     * @param target
     */
    public void toCropVO(
        Crop source,
        CropVO target);

    /**
     * Converts this DAO's entity to an object of type {@link CropVO}.
     * @param entity
     * @return CropVO
     */
    public CropVO toCropVO(Crop entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link CropVO}.
     * @param entities
     * @return Collection<CropVO>
     */
    public Collection<CropVO> toCropVOCollection(Collection<Crop> entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link CropVO}.
     * @param entities
     * @return CropVO[]
     */
    public CropVO[] toCropVOArray(Collection<?> entities);

    /**
     * Copies the fields of {@link CropVO} to the specified entity.
     * @param source
     * @param target
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void cropVOToEntity(
        CropVO source,
        Crop target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link CropVO} to this DAO's entity.
     * @param cropVO
     * @return Crop
     */
    public Crop cropVOToEntity(CropVO cropVO);

    /**
     * Converts a Collection of instances of type {@link CropVO} to this
     * DAO's entity.
     * @param instances
     */
    public void cropVOToEntityCollection(Collection<?> instances);

    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes entities must be transformed into objects of type
     * {@link CropListVO}.
     */
    public static final int TRANSFORM_CROPLISTVO = 2;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toCropListVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     * @param source
     * @param target
     */
    public void toCropListVO(
        Crop source,
        CropListVO target);

    /**
     * Converts this DAO's entity to an object of type {@link CropListVO}.
     * @param entity
     * @return CropListVO
     */
    public CropListVO toCropListVO(Crop entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link CropListVO}.
     * @param entities
     * @return Collection<CropListVO>
     */
    public Collection<CropListVO> toCropListVOCollection(Collection<Crop> entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link CropListVO}.
     * @param entities
     * @return CropListVO[]
     */
    public CropListVO[] toCropListVOArray(Collection<?> entities);

    /**
     * Copies the fields of {@link CropListVO} to the specified entity.
     * @param source
     * @param target
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void cropListVOToEntity(
        CropListVO source,
        Crop target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link CropListVO} to this DAO's entity.
     * @param cropListVO
     * @return Crop
     */
    public Crop cropListVOToEntity(CropListVO cropListVO);

    /**
     * Converts a Collection of instances of type {@link CropListVO} to this
     * DAO's entity.
     * @param instances
     */
    public void cropListVOToEntityCollection(Collection<?> instances);

    /**
     * Gets an instance of Crop from the persistent store.
     * @param id
     * @return Crop
     */
    public Crop get(String id);

    /**
     * <p>
     * Does the same thing as {@link #get(String)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     * optionally transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform flag to determine transformation type.
     * @param id the identifier of the entity to get.
     * @return either the entity or the object transformed from the entity.
     */
    public Object get(int transform, String id);

    /**
     * Loads an instance of Crop from the persistent store.
     * @param id
     * @return Crop
     */
    public Crop load(String id);

    /**
     * <p>
     * Does the same thing as {@link #load(String)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     * optionally transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform flag to determine transformation type.
     * @param id the identifier of the entity to load.
     * @return either the entity or the object transformed from the entity.
     */
    public Object load(int transform, String id);

    /**
     * Loads all entities of type {@link Crop}.
     *
     * @return the loaded entities.
     */
    public Collection<Crop> loadAll();

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @return the loaded entities.
     */
    public Collection<?> loadAll(final int transform);

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public Collection<?> loadAll(final int pageNumber, final int pageSize);

    /**
     * <p>
     * Does the same thing as {@link #loadAll(int)} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public Collection<?> loadAll(final int transform, final int pageNumber, final int pageSize);

    /**
     * Creates an instance of Crop and adds it to the persistent store.
     * @param crop
     * @return Crop
     */
    public Crop create(Crop crop);

    /**
     * <p>
     * Does the same thing as {@link #create(Crop)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param crop
     * @return Object
     */
    public Object create(int transform, Crop crop);

    /**
     * Creates a new instance of Crop and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of Crop
     * instances to create.
     *
     * @return the created instances.
     */
    public Collection<Crop> create(Collection<Crop> entities);

    /**
     * <p>
     * Does the same thing as {@link #create(Crop)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param entities
     * @return Collection
     */
    public Collection<?> create(int transform, Collection<Crop> entities);

    /**
     * <p>
     * Creates a new <code>Crop</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     * @param createdBy TODO: Model Documentation for Crop.createdBy
     * @param updatedBy TODO: Model Documentation for Crop.updatedBy
     * @param updatedDate TODO: Model Documentation for Crop.updatedDate
     * @param createdDate TODO: Model Documentation for Crop.createdDate
     * @param name TODO: Model Documentation for Crop.name
     * @param code TODO: Model Documentation for Crop.code
     * @param images TODO: Model Documentation for Crop.images
     * @param description TODO: Model Documentation for Crop.description
     * @param maturesIn TODO: Model Documentation for Crop.maturesIn
     * @return Crop
     */
    public Crop create(
        String createdBy,
        String updatedBy,
        LocalDateTime updatedDate,
        LocalDateTime createdDate,
        String name,
        String code,
        Collection<File> images,
        String description,
        TimePeriod maturesIn);

    /**
     * <p>
     * Does the same thing as {@link #create(String, String, LocalDateTime, LocalDateTime, String, String, File, String, TimePeriod)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param createdBy TODO: Model Documentation for Crop.createdBy
     * @param updatedBy TODO: Model Documentation for Crop.updatedBy
     * @param updatedDate TODO: Model Documentation for Crop.updatedDate
     * @param createdDate TODO: Model Documentation for Crop.createdDate
     * @param name TODO: Model Documentation for Crop.name
     * @param code TODO: Model Documentation for Crop.code
     * @param images TODO: Model Documentation for Crop.images
     * @param description TODO: Model Documentation for Crop.description
     * @param maturesIn TODO: Model Documentation for Crop.maturesIn
     * @return Crop
     */
    public Object create(
        int transform,
        String createdBy,
        String updatedBy,
        LocalDateTime updatedDate,
        LocalDateTime createdDate,
        String name,
        String code,
        Collection<File> images,
        String description,
        TimePeriod maturesIn);


    /**
     * Updates the <code>crop</code> instance in the persistent store.
     * @param crop
     */
    public void update(Crop crop);

    /**
     * Create or Update the <code>crop</code> instance in the persistent store.
     * @param crop
     * @return Crop
     */
    public Crop createOrUpdate(Crop crop);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     * @param entities
     */
    public void update(Collection<Crop> entities);

    /**
     * Removes the instance of Crop from the persistent store.
     * @param crop
     */
    public void remove(Crop crop);

    /**
     * Removes the instance of Crop having the given
     * <code>identifier</code> from the persistent store.
     * @param id
     */
    public void remove(String id);

    /**
     * Removes all entities in the given <code>entities</code> collection.
     * @param entities
     */
    public void remove(Collection<Crop> entities);

    /**
     * TODO: Model Documentation for Crop.findByCriteria
     * @param criteria TODO: Model Documentation for Crop.findByCriteria(criteria)
     * @return Collection<Crop>
     */
    public Collection<Crop> findByCriteria(String criteria);

    /**
     * TODO: Model Documentation for Crop.findByCriteriaPaged
     * @param criteria TODO: Model Documentation for Crop.findByCriteriaPaged(criteria)
     * @param pageSize TODO: Model Documentation for Crop.findByCriteriaPaged(pageSize)
     * @param pageNumber TODO: Model Documentation for Crop.findByCriteriaPaged(pageNumber)
     * @return Page<Crop>
     */
    public Page<Crop> findByCriteriaPaged(String criteria, Integer pageSize, Integer pageNumber);


    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>bw.co.sigmaproduce.crop.CropDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link Crop} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link CropVO} - {@link #TRANSFORM_CROPVO}</li>
     *   <li>{@link CropListVO} - {@link #TRANSFORM_CROPLISTVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link bw.co.sigmaproduce.crop.CropDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,Collection)
     */
    public Object transformEntity(final int transform, final Crop entity);

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,Crop)}
     * method. This method does not instantiate a new collection.
     * <p>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>bw.co.sigmaproduce.crop.CropDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,Crop)
     */
    public void transformEntities(final int transform, final Collection<?> entities);

    /**
     * Searches for a single instance of Crop.
     * @param name the unique name to be used in the search.'
     * @return a single instance of Crop.
     */
    public Crop searchUniqueName(final String name);

    /**
     * Searches for a single instance of Crop.
     * @param transform the transformation flag.
     * @param name the unique name to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueName(final int transform, final String name);

    /**
     * Searches for a single instance of Crop.
     * @param code the unique code to be used in the search.'
     * @return a single instance of Crop.
     */
    public Crop searchUniqueCode(final String code);

    /**
     * Searches for a single instance of Crop.
     * @param transform the transformation flag.
     * @param code the unique code to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueCode(final int transform, final String code);

    /**
     * Searches for a single instance of Crop.
     * @param images the unique images to be used in the search.'
     * @return a single instance of Crop.
     */
    public Crop searchUniqueImages(final File images);

    /**
     * Searches for a single instance of Crop.
     * @param transform the transformation flag.
     * @param images the unique images to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueImages(final int transform, final File images);


    // spring-dao merge-point
}