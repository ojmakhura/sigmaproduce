// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringDao.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.farm.cultivation.problem;

import bw.co.sigmaproduce.crop.issue.CropIssue;
import bw.co.sigmaproduce.farm.cultivation.Cultivation;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 * TODO: Model Documentation for CultivationProblem
 * @see CultivationProblem
 */
public interface CultivationProblemDao
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
     * Transforms the given results to a collection of {@link CultivationProblem}
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
     * {@link CultivationProblemVO}.
     */
    public static final int TRANSFORM_CULTIVATIONPROBLEMVO = 1;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toCultivationProblemVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     * @param source
     * @param target
     */
    public void toCultivationProblemVO(
        CultivationProblem source,
        CultivationProblemVO target);

    /**
     * Converts this DAO's entity to an object of type {@link CultivationProblemVO}.
     * @param entity
     * @return CultivationProblemVO
     */
    public CultivationProblemVO toCultivationProblemVO(CultivationProblem entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link CultivationProblemVO}.
     * @param entities
     * @return Collection<CultivationProblemVO>
     */
    public Collection<CultivationProblemVO> toCultivationProblemVOCollection(Collection<CultivationProblem> entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link CultivationProblemVO}.
     * @param entities
     * @return CultivationProblemVO[]
     */
    public CultivationProblemVO[] toCultivationProblemVOArray(Collection<?> entities);

    /**
     * Copies the fields of {@link CultivationProblemVO} to the specified entity.
     * @param source
     * @param target
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void cultivationProblemVOToEntity(
        CultivationProblemVO source,
        CultivationProblem target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link CultivationProblemVO} to this DAO's entity.
     * @param cultivationProblemVO
     * @return CultivationProblem
     */
    public CultivationProblem cultivationProblemVOToEntity(CultivationProblemVO cultivationProblemVO);

    /**
     * Converts a Collection of instances of type {@link CultivationProblemVO} to this
     * DAO's entity.
     * @param instances
     */
    public void cultivationProblemVOToEntityCollection(Collection<?> instances);

    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes entities must be transformed into objects of type
     * {@link CultivationProblemListVO}.
     */
    public static final int TRANSFORM_CULTIVATIONPROBLEMLISTVO = 2;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toCultivationProblemListVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     * @param source
     * @param target
     */
    public void toCultivationProblemListVO(
        CultivationProblem source,
        CultivationProblemListVO target);

    /**
     * Converts this DAO's entity to an object of type {@link CultivationProblemListVO}.
     * @param entity
     * @return CultivationProblemListVO
     */
    public CultivationProblemListVO toCultivationProblemListVO(CultivationProblem entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link CultivationProblemListVO}.
     * @param entities
     * @return Collection<CultivationProblemListVO>
     */
    public Collection<CultivationProblemListVO> toCultivationProblemListVOCollection(Collection<CultivationProblem> entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link CultivationProblemListVO}.
     * @param entities
     * @return CultivationProblemListVO[]
     */
    public CultivationProblemListVO[] toCultivationProblemListVOArray(Collection<?> entities);

    /**
     * Copies the fields of {@link CultivationProblemListVO} to the specified entity.
     * @param source
     * @param target
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void cultivationProblemListVOToEntity(
        CultivationProblemListVO source,
        CultivationProblem target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link CultivationProblemListVO} to this DAO's entity.
     * @param cultivationProblemListVO
     * @return CultivationProblem
     */
    public CultivationProblem cultivationProblemListVOToEntity(CultivationProblemListVO cultivationProblemListVO);

    /**
     * Converts a Collection of instances of type {@link CultivationProblemListVO} to this
     * DAO's entity.
     * @param instances
     */
    public void cultivationProblemListVOToEntityCollection(Collection<?> instances);

    /**
     * Gets an instance of CultivationProblem from the persistent store.
     * @param id
     * @return CultivationProblem
     */
    public CultivationProblem get(String id);

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
     * Loads an instance of CultivationProblem from the persistent store.
     * @param id
     * @return CultivationProblem
     */
    public CultivationProblem load(String id);

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
     * Loads all entities of type {@link CultivationProblem}.
     *
     * @return the loaded entities.
     */
    public Collection<CultivationProblem> loadAll();

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
     * Creates an instance of CultivationProblem and adds it to the persistent store.
     * @param cultivationProblem
     * @return CultivationProblem
     */
    public CultivationProblem create(CultivationProblem cultivationProblem);

    /**
     * <p>
     * Does the same thing as {@link #create(CultivationProblem)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param cultivationProblem
     * @return Object
     */
    public Object create(int transform, CultivationProblem cultivationProblem);

    /**
     * Creates a new instance of CultivationProblem and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of CultivationProblem
     * instances to create.
     *
     * @return the created instances.
     */
    public Collection<CultivationProblem> create(Collection<CultivationProblem> entities);

    /**
     * <p>
     * Does the same thing as {@link #create(CultivationProblem)} with an
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
    public Collection<?> create(int transform, Collection<CultivationProblem> entities);

    /**
     * <p>
     * Creates a new <code>CultivationProblem</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     * @param createdBy TODO: Model Documentation for
CultivationProblem.createdBy
     * @param updatedBy TODO: Model Documentation for
CultivationProblem.updatedBy
     * @param updatedDate TODO: Model Documentation for
CultivationProblem.updatedDate
     * @param createdDate TODO: Model Documentation for
CultivationProblem.createdDate
     * @param description TODO: Model Documentation for
CultivationProblem.description
     * @param photos TODO: Model Documentation for CultivationProblem.photos
     * @param dateNoticed TODO: Model Documentation for
CultivationProblem.dateNoticed
     * @return CultivationProblem
     */
    public CultivationProblem create(
        String createdBy,
        String updatedBy,
        LocalDateTime updatedDate,
        LocalDateTime createdDate,
        String description,
        Collection<File> photos,
        LocalDate dateNoticed);

    /**
     * <p>
     * Does the same thing as {@link #create(String, String, LocalDateTime, LocalDateTime, String, File, LocalDate)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param createdBy TODO: Model Documentation for
CultivationProblem.createdBy
     * @param updatedBy TODO: Model Documentation for
CultivationProblem.updatedBy
     * @param updatedDate TODO: Model Documentation for
CultivationProblem.updatedDate
     * @param createdDate TODO: Model Documentation for
CultivationProblem.createdDate
     * @param description TODO: Model Documentation for
CultivationProblem.description
     * @param photos TODO: Model Documentation for CultivationProblem.photos
     * @param dateNoticed TODO: Model Documentation for
CultivationProblem.dateNoticed
     * @return CultivationProblem
     */
    public Object create(
        int transform,
        String createdBy,
        String updatedBy,
        LocalDateTime updatedDate,
        LocalDateTime createdDate,
        String description,
        Collection<File> photos,
        LocalDate dateNoticed);

    /**
     * <p>
     * Creates a new <code>CultivationProblem</code>
     * instance from only <strong>required</strong> properties (attributes
     * and association ends) and adds it to the persistent store.
     * </p>
     * @param createdBy
     * @param createdDate
     * @param cropIssue
     * @param cultivation
     * @param dateNoticed
     * @param description
     * @return CultivationProblem
     */
    public CultivationProblem create(
        String createdBy,
        LocalDateTime createdDate,
        CropIssue cropIssue,
        Cultivation cultivation,
        LocalDate dateNoticed,
        String description);

    /**
     * <p>
     * Does the same thing as {@link #create(String, LocalDateTime, String, LocalDate)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform flag to determine transformation type.
     * @param createdBy
     * @param createdDate
     * @param cropIssue
     * @param cultivation
     * @param dateNoticed
     * @param description
     * @return Object
     */
    public Object create(
        int transform,
        String createdBy,
        LocalDateTime createdDate,
        CropIssue cropIssue,
        Cultivation cultivation,
        LocalDate dateNoticed,
        String description);

    /**
     * Updates the <code>cultivationProblem</code> instance in the persistent store.
     * @param cultivationProblem
     */
    public void update(CultivationProblem cultivationProblem);

    /**
     * Create or Update the <code>cultivationProblem</code> instance in the persistent store.
     * @param cultivationProblem
     * @return CultivationProblem
     */
    public CultivationProblem createOrUpdate(CultivationProblem cultivationProblem);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     * @param entities
     */
    public void update(Collection<CultivationProblem> entities);

    /**
     * Removes the instance of CultivationProblem from the persistent store.
     * @param cultivationProblem
     */
    public void remove(CultivationProblem cultivationProblem);

    /**
     * Removes the instance of CultivationProblem having the given
     * <code>identifier</code> from the persistent store.
     * @param id
     */
    public void remove(String id);

    /**
     * Removes all entities in the given <code>entities</code> collection.
     * @param entities
     */
    public void remove(Collection<CultivationProblem> entities);


    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link CultivationProblem} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link CultivationProblemVO} - {@link #TRANSFORM_CULTIVATIONPROBLEMVO}</li>
     *   <li>{@link CultivationProblemListVO} - {@link #TRANSFORM_CULTIVATIONPROBLEMLISTVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,Collection)
     */
    public Object transformEntity(final int transform, final CultivationProblem entity);

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,CultivationProblem)}
     * method. This method does not instantiate a new collection.
     * <p>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>bw.co.sigmaproduce.farm.cultivation.problem.CultivationProblemDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,CultivationProblem)
     */
    public void transformEntities(final int transform, final Collection<?> entities);

    /**
     * Searches for a single instance of CultivationProblem.
     * @param dateNoticed the unique dateNoticed to be used in the search.'
     * @return a single instance of CultivationProblem.
     */
    public CultivationProblem searchUniqueDateNoticed(final LocalDate dateNoticed);

    /**
     * Searches for a single instance of CultivationProblem.
     * @param transform the transformation flag.
     * @param dateNoticed the unique dateNoticed to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueDateNoticed(final int transform, final LocalDate dateNoticed);


    // spring-dao merge-point
}