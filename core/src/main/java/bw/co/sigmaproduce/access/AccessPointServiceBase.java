// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringServiceBase.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
/**
 * TEMPLATE:    SpringServiceBase.vsl in andromda-spring cartridge
 * MODEL CLASS: bocraportal::backend::bw.co.sigmaproduce::access::AccessPointService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.access;

import bw.co.sigmaproduce.PrincipalStore;
import java.security.Principal;
import java.util.Collection;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;

/**
 * <p>
 * Spring Service base class for <code>AccessPointService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see AccessPointService
 */
public abstract class AccessPointServiceBase
    implements AccessPointService
{
    protected Logger logger = LoggerFactory.getLogger(AccessPointService.class);
    protected final AccessPointDao accessPointDao;
    protected final AccessPointRepository accessPointRepository;
    protected final MessageSource messageSource;

    public AccessPointServiceBase(
        AccessPointDao accessPointDao,
        AccessPointRepository accessPointRepository,
        MessageSource messageSource
    ) {
        this.accessPointDao = accessPointDao;
        this.accessPointRepository = accessPointRepository;
        this.messageSource = messageSource;
    }

	/**
     * Gets the reference to <code>accessPoint</code>'s DAO.
     * @return accessPointDao
     */
    protected AccessPointDao getAccessPointDao()
    {
        return this.accessPointDao;
    }

    /**
     * Gets the reference to <code>accessPoint</code>'s repository.
     * @return accessPointRepository
     */
    public AccessPointRepository getAccessPointRepository() {
        return accessPointRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessPointVO findById(final Long id)
    {
        try
        {
            return this.handleFindById(id);
        }
        catch (Throwable th)
        {
            throw new AccessPointServiceException(
                "Error performing 'AccessPointService.findById(Long id)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #findById(Long)}
     * @param id Long TODO: Model Documentation for AccessPointService.findById(id)
     * @return AccessPointVO
     * @throws Exception
     */
    protected abstract AccessPointVO handleFindById(Long id)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<AccessPointVO> getAll()
    {
        try
        {
            return this.handleGetAll();
        }
        catch (Throwable th)
        {
            throw new AccessPointServiceException(
                "Error performing 'AccessPointService.getAll()' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #getAll()}
     * @return Collection<AccessPointVO>
     * @throws Exception
     */
    protected abstract Collection<AccessPointVO> handleGetAll()
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<AccessPointVO> getAll(final Integer pageNumber, final Integer pageSize)
    {
        try
        {
            return this.handleGetAll(pageNumber, pageSize);
        }
        catch (Throwable th)
        {
            throw new AccessPointServiceException(
                "Error performing 'AccessPointService.getAll(Integer pageNumber, Integer pageSize)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #getAll(Integer, Integer)}
     * @param pageNumber Integer TODO: Model Documentation for AccessPointService.getAll(pageNumber)
     * @param pageSize Integer TODO: Model Documentation for AccessPointService.getAll(pageSize)
     * @return Collection<AccessPointVO>
     * @throws Exception
     */
    protected abstract Collection<AccessPointVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean remove(final Long id)
    {
        try
        {
            return this.handleRemove(id);
        }
        catch (Throwable th)
        {
            throw new AccessPointServiceException(
                "Error performing 'AccessPointService.remove(Long id)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #remove(Long)}
     * @param id Long TODO: Model Documentation for AccessPointService.remove(id)
     * @return boolean
     * @throws Exception
     */
    protected abstract boolean handleRemove(Long id)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessPointVO save(final AccessPointVO accessPoint)
    {
        if (accessPoint == null)
        {
            throw new IllegalArgumentException(
                "AccessPointService.save(AccessPointVO accessPoint) - 'accessPoint' can not be null");
        }
        if (accessPoint.getAccessPointType() == null)
        {
            throw new IllegalArgumentException(
                "AccessPointService.save(AccessPointVO accessPoint) - 'accessPoint.accessPointType' can not be null");
        }
        if (accessPoint.getName() == null || accessPoint.getName().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "AccessPointService.save(AccessPointVO accessPoint) - 'accessPoint.name' can not be null or empty");
        }
        if (accessPoint.getUrl() == null || accessPoint.getUrl().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "AccessPointService.save(AccessPointVO accessPoint) - 'accessPoint.url' can not be null or empty");
        }
        try
        {
            return this.handleSave(accessPoint);
        }
        catch (Throwable th)
        {
            throw new AccessPointServiceException(
                "Error performing 'AccessPointService.save(AccessPointVO accessPoint)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #save(AccessPointVO)}
     * @param accessPoint AccessPointVO TODO: Model Documentation for AccessPointService.save(accessPoint)
     * @return AccessPointVO
     * @throws Exception
     */
    protected abstract AccessPointVO handleSave(AccessPointVO accessPoint)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<AccessPointVO> search(final AccessPointCriteria criteria)
    {
        try
        {
            return this.handleSearch(criteria);
        }
        catch (Throwable th)
        {
            throw new AccessPointServiceException(
                "Error performing 'AccessPointService.search(AccessPointCriteria criteria)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #search(AccessPointCriteria)}
     * @param criteria AccessPointCriteria TODO: Model Documentation for AccessPointService.search(criteria)
     * @return Collection<AccessPointVO>
     * @throws Exception
     */
    protected abstract Collection<AccessPointVO> handleSearch(AccessPointCriteria criteria)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Page<AccessPointVO> search(final Integer pageNumber, final Integer pageSize, final AccessPointCriteria criteria)
    {
        if (criteria == null)
        {
            throw new IllegalArgumentException(
                "AccessPointService.search(Integer pageNumber, Integer pageSize, AccessPointCriteria criteria) - 'criteria' can not be null");
        }
        try
        {
            return this.handleSearch(pageNumber, pageSize, criteria);
        }
        catch (Throwable th)
        {
            throw new AccessPointServiceException(
                "Error performing 'AccessPointService.search(Integer pageNumber, Integer pageSize, AccessPointCriteria criteria)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #search(Integer, Integer, AccessPointCriteria)}
     * @param pageNumber Integer TODO: Model Documentation for AccessPointService.search(pageNumber)
     * @param pageSize Integer TODO: Model Documentation for AccessPointService.search(pageSize)
     * @param criteria AccessPointCriteria TODO: Model Documentation for AccessPointService.search(criteria)
     * @return DataPage
     * @throws Exception
     */
    protected abstract Page<AccessPointVO> handleSearch(Integer pageNumber, Integer pageSize, AccessPointCriteria criteria)
        throws Exception;

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
     * Gets the message source available to this service.
     * @return MessageSource
     */
    protected MessageSource getMessages()
    {
        return messageSource;
    }

    /**
     * Gets the message having the given <code>key</code> in the underlying message bundle.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @return String
     */
    protected String getMessage(final String key)
    {
        return this.getMessages().getMessage(key, null, null);
    }

    /**
     * Gets the message having the given <code>key</code> and <code>arguments</code> in the
     * underlying message bundle.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @param arguments any arguments to substitute when resolving the message.
     * @return String
     */
    protected String getMessage(final String key, final Object[] arguments)
    {
        return this.getMessages().getMessage(key, arguments, null);
    }

    /**
     * Gets the message having the given <code>key</code> using the given <code>arguments</code>
     * for the given <code>locale</code>.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @param arguments any arguments to substitute when resolving the message.
     * @param locale the locale of the messages to retrieve.
     * @return String
     */
    protected String getMessage(
        final String key, final Object[] arguments,
        final Locale locale)
    {
        return this.getMessages().getMessage(key, arguments, locale);
    }


// spring-service-base merge-point
}