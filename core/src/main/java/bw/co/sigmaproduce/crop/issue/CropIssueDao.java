// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringDao.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.crop.issue;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 * TODO: Model Documentation for CropIssue
 * @see CropIssue
 */
public interface CropIssueDao
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
     * Transforms the given results to a collection of {@link CropIssue}
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
     * {@link CropIssueVO}.
     */
    public static final int TRANSFORM_CROPISSUEVO = 1;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toCropIssueVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     * @param source
     * @param target
     */
    public void toCropIssueVO(
        CropIssue source,
        CropIssueVO target);

    /**
     * Converts this DAO's entity to an object of type {@link CropIssueVO}.
     * @param entity
     * @return CropIssueVO
     */
    public CropIssueVO toCropIssueVO(CropIssue entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link CropIssueVO}.
     * @param entities
     * @return Collection<CropIssueVO>
     */
    public Collection<CropIssueVO> toCropIssueVOCollection(Collection<CropIssue> entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link CropIssueVO}.
     * @param entities
     * @return CropIssueVO[]
     */
    public CropIssueVO[] toCropIssueVOArray(Collection<?> entities);

    /**
     * Copies the fields of {@link CropIssueVO} to the specified entity.
     * @param source
     * @param target
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void cropIssueVOToEntity(
        CropIssueVO source,
        CropIssue target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link CropIssueVO} to this DAO's entity.
     * @param cropIssueVO
     * @return CropIssue
     */
    public CropIssue cropIssueVOToEntity(CropIssueVO cropIssueVO);

    /**
     * Converts a Collection of instances of type {@link CropIssueVO} to this
     * DAO's entity.
     * @param instances
     */
    public void cropIssueVOToEntityCollection(Collection<?> instances);

    /**
     * Gets an instance of CropIssue from the persistent store.
     * @param id
     * @return CropIssue
     */
    public CropIssue get(String id);

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
     * Loads an instance of CropIssue from the persistent store.
     * @param id
     * @return CropIssue
     */
    public CropIssue load(String id);

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
     * Loads all entities of type {@link CropIssue}.
     *
     * @return the loaded entities.
     */
    public Collection<CropIssue> loadAll();

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
     * Creates an instance of CropIssue and adds it to the persistent store.
     * @param cropIssue
     * @return CropIssue
     */
    public CropIssue create(CropIssue cropIssue);

    /**
     * <p>
     * Does the same thing as {@link #create(CropIssue)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param cropIssue
     * @return Object
     */
    public Object create(int transform, CropIssue cropIssue);

    /**
     * Creates a new instance of CropIssue and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of CropIssue
     * instances to create.
     *
     * @return the created instances.
     */
    public Collection<CropIssue> create(Collection<CropIssue> entities);

    /**
     * <p>
     * Does the same thing as {@link #create(CropIssue)} with an
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
    public Collection<?> create(int transform, Collection<CropIssue> entities);

    /**
     * <p>
     * Creates a new <code>CropIssue</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     * @param createdBy TODO: Model Documentation for CropIssue.createdBy
     * @param updatedBy TODO: Model Documentation for CropIssue.updatedBy
     * @param updatedDate TODO: Model Documentation for CropIssue.updatedDate
     * @param createdDate TODO: Model Documentation for CropIssue.createdDate
     * @param name TODO: Model Documentation for CropIssue.name
     * @param scientificName TODO: Model Documentation for CropIssue.scientificName
     * @param images TODO: Model Documentation for CropIssue.images
     * @param description TODO: Model Documentation for CropIssue.description
     * @param issue TODO: Model Documentation for CropIssue.issue
     * @return CropIssue
     */
    public CropIssue create(
        String createdBy,
        String updatedBy,
        LocalDateTime updatedDate,
        LocalDateTime createdDate,
        String name,
        String scientificName,
        Collection<File> images,
        String description,
        CropIssueType issue);

    /**
     * <p>
     * Does the same thing as {@link #create(String, String, LocalDateTime, LocalDateTime, String, String, File, String, CropIssueType)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param createdBy TODO: Model Documentation for CropIssue.createdBy
     * @param updatedBy TODO: Model Documentation for CropIssue.updatedBy
     * @param updatedDate TODO: Model Documentation for CropIssue.updatedDate
     * @param createdDate TODO: Model Documentation for CropIssue.createdDate
     * @param name TODO: Model Documentation for CropIssue.name
     * @param scientificName TODO: Model Documentation for CropIssue.scientificName
     * @param images TODO: Model Documentation for CropIssue.images
     * @param description TODO: Model Documentation for CropIssue.description
     * @param issue TODO: Model Documentation for CropIssue.issue
     * @return CropIssue
     */
    public Object create(
        int transform,
        String createdBy,
        String updatedBy,
        LocalDateTime updatedDate,
        LocalDateTime createdDate,
        String name,
        String scientificName,
        Collection<File> images,
        String description,
        CropIssueType issue);


    /**
     * Updates the <code>cropIssue</code> instance in the persistent store.
     * @param cropIssue
     */
    public void update(CropIssue cropIssue);

    /**
     * Create or Update the <code>cropIssue</code> instance in the persistent store.
     * @param cropIssue
     * @return CropIssue
     */
    public CropIssue createOrUpdate(CropIssue cropIssue);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     * @param entities
     */
    public void update(Collection<CropIssue> entities);

    /**
     * Removes the instance of CropIssue from the persistent store.
     * @param cropIssue
     */
    public void remove(CropIssue cropIssue);

    /**
     * Removes the instance of CropIssue having the given
     * <code>identifier</code> from the persistent store.
     * @param id
     */
    public void remove(String id);

    /**
     * Removes all entities in the given <code>entities</code> collection.
     * @param entities
     */
    public void remove(Collection<CropIssue> entities);


    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>bw.co.sigmaproduce.crop.issue.CropIssueDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link CropIssue} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link CropIssueVO} - {@link #TRANSFORM_CROPISSUEVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link bw.co.sigmaproduce.crop.issue.CropIssueDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,Collection)
     */
    public Object transformEntity(final int transform, final CropIssue entity);

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,CropIssue)}
     * method. This method does not instantiate a new collection.
     * <p>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>bw.co.sigmaproduce.crop.issue.CropIssueDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,CropIssue)
     */
    public void transformEntities(final int transform, final Collection<?> entities);

    /**
     * Searches for a single instance of CropIssue.
     * @param name the unique name to be used in the search.'
     * @return a single instance of CropIssue.
     */
    public CropIssue searchUniqueName(final String name);

    /**
     * Searches for a single instance of CropIssue.
     * @param transform the transformation flag.
     * @param name the unique name to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueName(final int transform, final String name);

    /**
     * Searches for a single instance of CropIssue.
     * @param scientificName the unique scientificName to be used in the search.'
     * @return a single instance of CropIssue.
     */
    public CropIssue searchUniqueScientificName(final String scientificName);

    /**
     * Searches for a single instance of CropIssue.
     * @param transform the transformation flag.
     * @param scientificName the unique scientificName to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueScientificName(final int transform, final String scientificName);

    /**
     * Searches for a single instance of CropIssue.
     * @param issue the unique issue to be used in the search.'
     * @return a single instance of CropIssue.
     */
    public CropIssue searchUniqueIssue(final CropIssueType issue);

    /**
     * Searches for a single instance of CropIssue.
     * @param transform the transformation flag.
     * @param issue the unique issue to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueIssue(final int transform, final CropIssueType issue);


    // spring-dao merge-point
}