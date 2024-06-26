// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringServiceBase.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
/**
 * TEMPLATE:    SpringServiceBase.vsl in andromda-spring cartridge
 * MODEL CLASS: bocraportal::backend::bw.co.sigmaproduce::auth::AuthorisationService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.auth;

import bw.co.sigmaproduce.PrincipalStore;
import java.security.Principal;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;

/**
 * <p>
 * Spring Service base class for <code>AuthorisationService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see AuthorisationService
 */
public abstract class AuthorisationServiceBase
    implements AuthorisationService
{
    protected Logger logger = LoggerFactory.getLogger(AuthorisationService.class);
    protected final AuthorisationDao authorisationDao;
    protected final AuthorisationRepository authorisationRepository;
    protected final MessageSource messageSource;

    public AuthorisationServiceBase(
        AuthorisationDao authorisationDao,
        AuthorisationRepository authorisationRepository,
        MessageSource messageSource
    ) {
        this.authorisationDao = authorisationDao;
        this.authorisationRepository = authorisationRepository;
        this.messageSource = messageSource;
    }

	/**
     * Gets the reference to <code>authorisation</code>'s DAO.
     * @return authorisationDao
     */
    protected AuthorisationDao getAuthorisationDao()
    {
        return this.authorisationDao;
    }

    /**
     * Gets the reference to <code>authorisation</code>'s repository.
     * @return authorisationRepository
     */
    public AuthorisationRepository getAuthorisationRepository() {
        return authorisationRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorisationVO findById(final Long id)
    {
        try
        {
            return this.handleFindById(id);
        }
        catch (Throwable th)
        {
            throw new AuthorisationServiceException(
                "Error performing 'AuthorisationService.findById(Long id)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #findById(Long)}
     * @param id Long TODO: Model Documentation for AuthorisationService.findById(id)
     * @return AuthorisationVO
     * @throws Exception
     */
    protected abstract AuthorisationVO handleFindById(Long id)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorisationVO save(final AuthorisationVO authorisation)
    {
        if (authorisation == null)
        {
            throw new IllegalArgumentException(
                "AuthorisationService.save(AuthorisationVO authorisation) - 'authorisation' can not be null");
        }
        if (authorisation.getAccessPoint() == null)
        {
            throw new IllegalArgumentException(
                "AuthorisationService.save(AuthorisationVO authorisation) - 'authorisation.accessPoint' can not be null");
        }
        try
        {
            return this.handleSave(authorisation);
        }
        catch (Throwable th)
        {
            throw new AuthorisationServiceException(
                "Error performing 'AuthorisationService.save(AuthorisationVO authorisation)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #save(AuthorisationVO)}
     * @param authorisation AuthorisationVO TODO: Model Documentation for AuthorisationService.save(authorisation)
     * @return AuthorisationVO
     * @throws Exception
     */
    protected abstract AuthorisationVO handleSave(AuthorisationVO authorisation)
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
            throw new AuthorisationServiceException(
                "Error performing 'AuthorisationService.remove(Long id)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #remove(Long)}
     * @param id Long TODO: Model Documentation for AuthorisationService.remove(id)
     * @return boolean
     * @throws Exception
     */
    protected abstract boolean handleRemove(Long id)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<AuthorisationVO> getAll()
    {
        try
        {
            return this.handleGetAll();
        }
        catch (Throwable th)
        {
            throw new AuthorisationServiceException(
                "Error performing 'AuthorisationService.getAll()' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #getAll()}
     * @return Collection<AuthorisationVO>
     * @throws Exception
     */
    protected abstract Collection<AuthorisationVO> handleGetAll()
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<AuthorisationVO> search(final AuthorisationCriteria criteria)
    {
        if (criteria == null)
        {
            throw new IllegalArgumentException(
                "AuthorisationService.search(AuthorisationCriteria criteria) - 'criteria' can not be null");
        }
        try
        {
            return this.handleSearch(criteria);
        }
        catch (Throwable th)
        {
            throw new AuthorisationServiceException(
                "Error performing 'AuthorisationService.search(AuthorisationCriteria criteria)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #search(AuthorisationCriteria)}
     * @param criteria AuthorisationCriteria TODO: Model Documentation for AuthorisationService.search(criteria)
     * @return Collection<AuthorisationVO>
     * @throws Exception
     */
    protected abstract Collection<AuthorisationVO> handleSearch(AuthorisationCriteria criteria)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<AuthorisationVO> getAll(final Integer pageNumber, final Integer pageSize)
    {
        try
        {
            return this.handleGetAll(pageNumber, pageSize);
        }
        catch (Throwable th)
        {
            throw new AuthorisationServiceException(
                "Error performing 'AuthorisationService.getAll(Integer pageNumber, Integer pageSize)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #getAll(Integer, Integer)}
     * @param pageNumber Integer TODO: Model Documentation for AuthorisationService.getAll(pageNumber)
     * @param pageSize Integer TODO: Model Documentation for AuthorisationService.getAll(pageSize)
     * @return Collection<AuthorisationVO>
     * @throws Exception
     */
    protected abstract Collection<AuthorisationVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<AuthorisationVO> getAccessTypeCodeAuthorisations(final Set<String> roles, final Set<String> accessPointTypeCodes)
    {
        try
        {
            return this.handleGetAccessTypeCodeAuthorisations(roles, accessPointTypeCodes);
        }
        catch (Throwable th)
        {
            throw new AuthorisationServiceException(
                "Error performing 'AuthorisationService.getAccessTypeCodeAuthorisations(Set<String> roles, Set<String> accessPointTypeCodes)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #getAccessTypeCodeAuthorisations(Set<String>, Set<String>)}
     * @param roles String TODO: Model Documentation for
AuthorisationService.getAccessTypeCodeAuthorisations(roles)
     * @param accessPointTypeCodes String TODO: Model Documentation for
AuthorisationService.getAccessTypeCodeAuthorisations(accessPointTypeCodes)
     * @return Collection<AuthorisationVO>
     * @throws Exception
     */
    protected abstract Collection<AuthorisationVO> handleGetAccessTypeCodeAuthorisations(Set<String> roles, Set<String> accessPointTypeCodes)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorisationVO assignMenuSection(final Long authorisationId, final Long menuSectionId)
    {
        try
        {
            return this.handleAssignMenuSection(authorisationId, menuSectionId);
        }
        catch (Throwable th)
        {
            throw new AuthorisationServiceException(
                "Error performing 'AuthorisationService.assignMenuSection(Long authorisationId, Long menuSectionId)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #assignMenuSection(Long, Long)}
     * @param authorisationId Long TODO: Model Documentation for
AuthorisationService.assignMenuSection(authorisationId)
     * @param menuSectionId Long TODO: Model Documentation for
AuthorisationService.assignMenuSection(menuSectionId)
     * @return AuthorisationVO
     * @throws Exception
     */
    protected abstract AuthorisationVO handleAssignMenuSection(Long authorisationId, Long menuSectionId)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<AuthorisationVO> findByRolesAndUrl(final String url, final Set<String> roles)
    {
        if (url == null || url.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "AuthorisationService.findByRolesAndUrl(String url, Set<String> roles) - 'url' can not be null or empty");
        }
        try
        {
            return this.handleFindByRolesAndUrl(url, roles);
        }
        catch (Throwable th)
        {
            throw new AuthorisationServiceException(
                "Error performing 'AuthorisationService.findByRolesAndUrl(String url, Set<String> roles)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #findByRolesAndUrl(String, Set<String>)}
     * @param url String TODO: Model Documentation for AuthorisationService.findByRolesAndUrl(url)
     * @param roles String TODO: Model Documentation for AuthorisationService.findByRolesAndUrl(roles)
     * @return Collection<AuthorisationVO>
     * @throws Exception
     */
    protected abstract Collection<AuthorisationVO> handleFindByRolesAndUrl(String url, Set<String> roles)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<AuthorisationVO> findByUrlPrefix(final String prefix)
    {
        if (prefix == null || prefix.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "AuthorisationService.findByUrlPrefix(String prefix) - 'prefix' can not be null or empty");
        }
        try
        {
            return this.handleFindByUrlPrefix(prefix);
        }
        catch (Throwable th)
        {
            throw new AuthorisationServiceException(
                "Error performing 'AuthorisationService.findByUrlPrefix(String prefix)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #findByUrlPrefix(String)}
     * @param prefix String TODO: Model Documentation for AuthorisationService.findByUrlPrefix(prefix)
     * @return Collection<AuthorisationVO>
     * @throws Exception
     */
    protected abstract Collection<AuthorisationVO> handleFindByUrlPrefix(String prefix)
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