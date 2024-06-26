// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringDao.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.access;

import java.time.LocalDateTime;
import java.util.Collection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import bw.co.sigmaproduce.access.type.AccessPointType;

/**
 * TODO: Model Documentation for AccessPoint
 * @see AccessPoint
 */
@Transactional
public interface AccessPointDao
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
     * Transforms the given results to a collection of {@link AccessPoint}
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
     * {@link AccessPointVO}.
     */
    public static final int TRANSFORM_ACCESSPOINTVO = 1;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toAccessPointVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     * @param source
     * @param target
     */
    public void toAccessPointVO(
        AccessPoint source,
        AccessPointVO target);

    /**
     * Converts this DAO's entity to an object of type {@link AccessPointVO}.
     * @param entity
     * @return AccessPointVO
     */
    public AccessPointVO toAccessPointVO(AccessPoint entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link AccessPointVO}.
     * @param entities
     * @return Collection<AccessPointVO>
     */
    public Collection<AccessPointVO> toAccessPointVOCollection(Collection<AccessPoint> entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link AccessPointVO}.
     * @param entities
     * @return AccessPointVO[]
     */
    public AccessPointVO[] toAccessPointVOArray(Collection<?> entities);

    /**
     * Copies the fields of {@link AccessPointVO} to the specified entity.
     * @param source
     * @param target
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void accessPointVOToEntity(
        AccessPointVO source,
        AccessPoint target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link AccessPointVO} to this DAO's entity.
     * @param accessPointVO
     * @return AccessPoint
     */
    public AccessPoint accessPointVOToEntity(AccessPointVO accessPointVO);

    /**
     * Converts a Collection of instances of type {@link AccessPointVO} to this
     * DAO's entity.
     * @param instances
     */
    public void accessPointVOToEntityCollection(Collection<?> instances);

    /**
     * Gets an instance of AccessPoint from the persistent store.
     * @param id
     * @return AccessPoint
     */
    public AccessPoint get(Long id);

    /**
     * <p>
     * Does the same thing as {@link #get(Long)} with an
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
    public Object get(int transform, Long id);

    /**
     * Loads an instance of AccessPoint from the persistent store.
     * @param id
     * @return AccessPoint
     */
    public AccessPoint load(Long id);

    /**
     * <p>
     * Does the same thing as {@link #load(Long)} with an
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
    public Object load(int transform, Long id);

    /**
     * Loads all entities of type {@link AccessPoint}.
     *
     * @return the loaded entities.
     */
    public Collection<AccessPoint> loadAll();

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
     * Creates an instance of AccessPoint and adds it to the persistent store.
     * @param accessPoint
     * @return AccessPoint
     */
    public AccessPoint create(AccessPoint accessPoint);

    /**
     * <p>
     * Does the same thing as {@link #create(AccessPoint)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param accessPoint
     * @return Object
     */
    public Object create(int transform, AccessPoint accessPoint);

    /**
     * Creates a new instance of AccessPoint and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of AccessPoint
     * instances to create.
     *
     * @return the created instances.
     */
    public Collection<AccessPoint> create(Collection<AccessPoint> entities);

    /**
     * <p>
     * Does the same thing as {@link #create(AccessPoint)} with an
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
    public Collection<?> create(int transform, Collection<AccessPoint> entities);

    /**
     * <p>
     * Creates a new <code>AccessPoint</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     * @param createdBy TODO: Model Documentation for AccessPoint.createdBy
     * @param updatedBy TODO: Model Documentation for AccessPoint.updatedBy
     * @param name TODO: Model Documentation for AccessPoint.name
     * @param url TODO: Model Documentation for AccessPoint.url
     * @param icon TODO: Model Documentation for AccessPoint.icon
     * @param createdDate TODO: Model Documentation for AccessPoint.createdDate
     * @param updatedDate TODO: Model Documentation for AccessPoint.updatedDate
     * @return AccessPoint
     */
    public AccessPoint create(
        String createdBy,
        String updatedBy,
        String name,
        String url,
        String icon,
        LocalDateTime createdDate,
        LocalDateTime updatedDate);

    /**
     * <p>
     * Does the same thing as {@link #create(String, String, String, String, String, LocalDateTime, LocalDateTime)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param createdBy TODO: Model Documentation for AccessPoint.createdBy
     * @param updatedBy TODO: Model Documentation for AccessPoint.updatedBy
     * @param name TODO: Model Documentation for AccessPoint.name
     * @param url TODO: Model Documentation for AccessPoint.url
     * @param icon TODO: Model Documentation for AccessPoint.icon
     * @param createdDate TODO: Model Documentation for AccessPoint.createdDate
     * @param updatedDate TODO: Model Documentation for AccessPoint.updatedDate
     * @return AccessPoint
     */
    public Object create(
        int transform,
        String createdBy,
        String updatedBy,
        String name,
        String url,
        String icon,
        LocalDateTime createdDate,
        LocalDateTime updatedDate);

    /**
     * <p>
     * Creates a new <code>AccessPoint</code>
     * instance from only <strong>required</strong> properties (attributes
     * and association ends) and adds it to the persistent store.
     * </p>
     * @param accessPointType
     * @param createdBy
     * @param createdDate
     * @param name
     * @param url
     * @return AccessPoint
     */
    public AccessPoint create(
        AccessPointType accessPointType,
        String createdBy,
        LocalDateTime createdDate,
        String name,
        String url);

    /**
     * <p>
     * Does the same thing as {@link #create(String, String, String, LocalDateTime)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform flag to determine transformation type.
     * @param accessPointType
     * @param createdBy
     * @param createdDate
     * @param name
     * @param url
     * @return Object
     */
    public Object create(
        int transform,
        AccessPointType accessPointType,
        String createdBy,
        LocalDateTime createdDate,
        String name,
        String url);

    /**
     * Updates the <code>accessPoint</code> instance in the persistent store.
     * @param accessPoint
     */
    public void update(AccessPoint accessPoint);

    /**
     * Create or Update the <code>accessPoint</code> instance in the persistent store.
     * @param accessPoint
     * @return AccessPoint
     */
    public AccessPoint createOrUpdate(AccessPoint accessPoint);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     * @param entities
     */
    public void update(Collection<AccessPoint> entities);

    /**
     * Removes the instance of AccessPoint from the persistent store.
     * @param accessPoint
     */
    public void remove(AccessPoint accessPoint);

    /**
     * Removes the instance of AccessPoint having the given
     * <code>identifier</code> from the persistent store.
     * @param id
     */
    public void remove(Long id);

    /**
     * Removes all entities in the given <code>entities</code> collection.
     * @param entities
     */
    public void remove(Collection<AccessPoint> entities);

    /**
     * TODO: Model Documentation for AccessPoint.findByCriteria
     * @param criteria TODO: Model Documentation for AccessPoint.findByCriteria(criteria)
     * @return Collection<AccessPoint>
     */
    public Collection<AccessPoint> findByCriteria(AccessPointCriteria criteria);

    /**
     * <p>
     * Does the same thing as {@link #findByCriteria(AccessPointCriteria)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param criteria TODO: Model Documentation for AccessPoint.findByCriteria(criteria)
     * @return Collection<?>
     */
    public Collection<?> findByCriteria(final int transform, final AccessPointCriteria criteria);

    /**
     * <p>
     * Does the same thing as {@link #findByCriteria(int, String, AccessPointCriteria)} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     * @param
     * @param pageNumber
     * @param pageSize
     * @param criteria TODO: Model Documentation for AccessPoint.findByCriteria(criteria)
     * @return Collection<?>
     */
    public Page<AccessPoint> findByCriteria(final Pageable pageable, final AccessPointCriteria criteria);


    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>AccessPointDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link AccessPoint} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link AccessPointVO} - {@link #TRANSFORM_ACCESSPOINTVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link AccessPointDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,Collection)
     */
    public Object transformEntity(final int transform, final AccessPoint entity);

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,AccessPoint)}
     * method. This method does not instantiate a new collection.
     * <p>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>AccessPointDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,AccessPoint)
     */
    public void transformEntities(final int transform, final Collection<?> entities);

    /**
     * Searches for a single instance of AccessPoint.
     * @param name the unique name to be used in the search.'
     * @return a single instance of AccessPoint.
     */
    public AccessPoint searchUniqueName(final String name);

    /**
     * Searches for a single instance of AccessPoint.
     * @param transform the transformation flag.
     * @param name the unique name to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueName(final int transform, final String name);

    /**
     * Searches for a single instance of AccessPoint.
     * @param icon the unique icon to be used in the search.'
     * @return a single instance of AccessPoint.
     */
    public AccessPoint searchUniqueIcon(final String icon);

    /**
     * Searches for a single instance of AccessPoint.
     * @param transform the transformation flag.
     * @param icon the unique icon to be used in the search.
     * @return a value object according the transformation flag.
     */
    public Object searchUniqueIcon(final int transform, final String icon);


    // spring-dao merge-point
}