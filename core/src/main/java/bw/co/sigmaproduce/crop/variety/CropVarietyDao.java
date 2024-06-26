// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringDao.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.crop.variety;

import bw.co.sigmaproduce.crop.Crop;
import java.io.File;
import java.time.LocalDateTime;
import java.util.Collection;
import org.springframework.data.domain.Page;

/**
 * TODO: Model Documentation for CropVariety
 * @see CropVariety
 */
public interface CropVarietyDao
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
     * Transforms the given results to a collection of {@link CropVariety}
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
     * {@link CropVarietyVO}.
     */
    public static final int TRANSFORM_CROPVARIETYVO = 1;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toCropVarietyVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     * @param source
     * @param target
     */
    public void toCropVarietyVO(
        CropVariety source,
        CropVarietyVO target);

    /**
     * Converts this DAO's entity to an object of type {@link CropVarietyVO}.
     * @param entity
     * @return CropVarietyVO
     */
    public CropVarietyVO toCropVarietyVO(CropVariety entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link CropVarietyVO}.
     * @param entities
     * @return Collection<CropVarietyVO>
     */
    public Collection<CropVarietyVO> toCropVarietyVOCollection(Collection<CropVariety> entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link CropVarietyVO}.
     * @param entities
     * @return CropVarietyVO[]
     */
    public CropVarietyVO[] toCropVarietyVOArray(Collection<?> entities);

    /**
     * Copies the fields of {@link CropVarietyVO} to the specified entity.
     * @param source
     * @param target
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void cropVarietyVOToEntity(
        CropVarietyVO source,
        CropVariety target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link CropVarietyVO} to this DAO's entity.
     * @param cropVarietyVO
     * @return CropVariety
     */
    public CropVariety cropVarietyVOToEntity(CropVarietyVO cropVarietyVO);

    /**
     * Converts a Collection of instances of type {@link CropVarietyVO} to this
     * DAO's entity.
     * @param instances
     */
    public void cropVarietyVOToEntityCollection(Collection<?> instances);

    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes entities must be transformed into objects of type
     * {@link CropVarietyList}.
     */
    public static final int TRANSFORM_CROPVARIETYLIST = 2;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toCropVarietyList(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     * @param source
     * @param target
     */
    public void toCropVarietyList(
        CropVariety source,
        CropVarietyList target);

    /**
     * Converts this DAO's entity to an object of type {@link CropVarietyList}.
     * @param entity
     * @return CropVarietyList
     */
    public CropVarietyList toCropVarietyList(CropVariety entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link CropVarietyList}.
     * @param entities
     * @return Collection<CropVarietyList>
     */
    public Collection<CropVarietyList> toCropVarietyListCollection(Collection<CropVariety> entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link CropVarietyList}.
     * @param entities
     * @return CropVarietyList[]
     */
    public CropVarietyList[] toCropVarietyListArray(Collection<?> entities);

    /**
     * Copies the fields of {@link CropVarietyList} to the specified entity.
     * @param source
     * @param target
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void cropVarietyListToEntity(
        CropVarietyList source,
        CropVariety target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link CropVarietyList} to this DAO's entity.
     * @param cropVarietyList
     * @return CropVariety
     */
    public CropVariety cropVarietyListToEntity(CropVarietyList cropVarietyList);

    /**
     * Converts a Collection of instances of type {@link CropVarietyList} to this
     * DAO's entity.
     * @param instances
     */
    public void cropVarietyListToEntityCollection(Collection<?> instances);

    /**
     * Gets an instance of CropVariety from the persistent store.
     * @param id
     * @return CropVariety
     */
    public CropVariety get(String id);

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
     * Loads an instance of CropVariety from the persistent store.
     * @param id
     * @return CropVariety
     */
    public CropVariety load(String id);

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
     * Loads all entities of type {@link CropVariety}.
     *
     * @return the loaded entities.
     */
    public Collection<CropVariety> loadAll();

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
     * Creates an instance of CropVariety and adds it to the persistent store.
     * @param cropVariety
     * @return CropVariety
     */
    public CropVariety create(CropVariety cropVariety);

    /**
     * <p>
     * Does the same thing as {@link #create(CropVariety)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param cropVariety
     * @return Object
     */
    public Object create(int transform, CropVariety cropVariety);

    /**
     * Creates a new instance of CropVariety and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of CropVariety
     * instances to create.
     *
     * @return the created instances.
     */
    public Collection<CropVariety> create(Collection<CropVariety> entities);

    /**
     * <p>
     * Does the same thing as {@link #create(CropVariety)} with an
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
    public Collection<?> create(int transform, Collection<CropVariety> entities);

    /**
     * <p>
     * Creates a new <code>CropVariety</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     * @param createdBy TODO: Model Documentation for CropVariety.createdBy
     * @param updatedBy TODO: Model Documentation for CropVariety.updatedBy
     * @param updatedDate TODO: Model Documentation for CropVariety.updatedDate
     * @param createdDate TODO: Model Documentation for CropVariety.createdDate
     * @param code TODO: Model Documentation for CropVariety.code
     * @param name TODO: Model Documentation for CropVariety.name
     * @param description TODO: Model Documentation for CropVariety.description
     * @param images TODO: Model Documentation for CropVariety.images
     * @return CropVariety
     */
    public CropVariety create(
        String createdBy,
        String updatedBy,
        LocalDateTime updatedDate,
        LocalDateTime createdDate,
        String code,
        String name,
        String description,
        Collection<File> images);

    /**
     * <p>
     * Does the same thing as {@link #create(String, String, LocalDateTime, LocalDateTime, String, String, String, File)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param createdBy TODO: Model Documentation for CropVariety.createdBy
     * @param updatedBy TODO: Model Documentation for CropVariety.updatedBy
     * @param updatedDate TODO: Model Documentation for CropVariety.updatedDate
     * @param createdDate TODO: Model Documentation for CropVariety.createdDate
     * @param code TODO: Model Documentation for CropVariety.code
     * @param name TODO: Model Documentation for CropVariety.name
     * @param description TODO: Model Documentation for CropVariety.description
     * @param images TODO: Model Documentation for CropVariety.images
     * @return CropVariety
     */
    public Object create(
        int transform,
        String createdBy,
        String updatedBy,
        LocalDateTime updatedDate,
        LocalDateTime createdDate,
        String code,
        String name,
        String description,
        Collection<File> images);

    /**
     * <p>
     * Creates a new <code>CropVariety</code>
     * instance from only <strong>required</strong> properties (attributes
     * and association ends) and adds it to the persistent store.
     * </p>
     * @param code
     * @param createdBy
     * @param createdDate
     * @param crop
     * @param name
     * @return CropVariety
     */
    public CropVariety create(
        String code,
        String createdBy,
        LocalDateTime createdDate,
        Crop crop,
        String name);

    /**
     * <p>
     * Does the same thing as {@link #create(String, LocalDateTime, String, String)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform flag to determine transformation type.
     * @param code
     * @param createdBy
     * @param createdDate
     * @param crop
     * @param name
     * @return Object
     */
    public Object create(
        int transform,
        String code,
        String createdBy,
        LocalDateTime createdDate,
        Crop crop,
        String name);

    /**
     * Updates the <code>cropVariety</code> instance in the persistent store.
     * @param cropVariety
     */
    public void update(CropVariety cropVariety);

    /**
     * Create or Update the <code>cropVariety</code> instance in the persistent store.
     * @param cropVariety
     * @return CropVariety
     */
    public CropVariety createOrUpdate(CropVariety cropVariety);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     * @param entities
     */
    public void update(Collection<CropVariety> entities);

    /**
     * Removes the instance of CropVariety from the persistent store.
     * @param cropVariety
     */
    public void remove(CropVariety cropVariety);

    /**
     * Removes the instance of CropVariety having the given
     * <code>identifier</code> from the persistent store.
     * @param id
     */
    public void remove(String id);

    /**
     * Removes all entities in the given <code>entities</code> collection.
     * @param entities
     */
    public void remove(Collection<CropVariety> entities);

    /**
     * TODO: Model Documentation for CropVariety.findByCriteria
     * @param criteria TODO: Model Documentation for CropVariety.findByCriteria(criteria)
     * @return Collection<CropVariety>
     */
    public Collection<CropVariety> findByCriteria(String criteria);

    /**
     * TODO: Model Documentation for CropVariety.findByCriteriaPaged
     * @param criteria TODO: Model Documentation for
CropVariety.findByCriteriaPaged(criteria)
     * @param pageSize TODO: Model Documentation for
CropVariety.findByCriteriaPaged(pageSize)
     * @param pageNumber TODO: Model Documentation for
CropVariety.findByCriteriaPaged(pageNumber)
     * @return Page<CropVariety>
     */
    public Page<CropVariety> findByCriteriaPaged(String criteria, Integer pageSize, Integer pageNumber);


    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>bw.co.sigmaproduce.crop.variety.CropVarietyDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link CropVariety} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link CropVarietyVO} - {@link #TRANSFORM_CROPVARIETYVO}</li>
     *   <li>{@link CropVarietyList} - {@link #TRANSFORM_CROPVARIETYLIST}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link bw.co.sigmaproduce.crop.variety.CropVarietyDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,Collection)
     */
    public Object transformEntity(final int transform, final CropVariety entity);

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,CropVariety)}
     * method. This method does not instantiate a new collection.
     * <p>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>bw.co.sigmaproduce.crop.variety.CropVarietyDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,CropVariety)
     */
    public void transformEntities(final int transform, final Collection<?> entities);

    /**
     * Searches for a single instance of CropVariety.
     * @param code the unique code to be used in the search.'
     * @return a single instance of CropVariety.
     */
    public CropVariety searchUniqueCode(final String code);

    /**
     * Searches for a single instance of CropVariety.
     * @param transform the transformation flag.
     * @param code the unique code to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueCode(final int transform, final String code);

    /**
     * Searches for a single instance of CropVariety.
     * @param name the unique name to be used in the search.'
     * @return a single instance of CropVariety.
     */
    public CropVariety searchUniqueName(final String name);

    /**
     * Searches for a single instance of CropVariety.
     * @param transform the transformation flag.
     * @param name the unique name to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueName(final int transform, final String name);

    /**
     * Searches for a single instance of CropVariety.
     * @param images the unique images to be used in the search.'
     * @return a single instance of CropVariety.
     */
    public CropVariety searchUniqueImages(final File images);

    /**
     * Searches for a single instance of CropVariety.
     * @param transform the transformation flag.
     * @param images the unique images to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueImages(final int transform, final File images);


    // spring-dao merge-point
}