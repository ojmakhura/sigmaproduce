// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringServiceBase.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
/**
 * TEMPLATE:    SpringServiceBase.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::village::VillageService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.village;

import bw.co.sigmaproduce.PrincipalStore;
import java.security.Principal;
import java.util.Collection;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;

/**
 * <p>
 * Spring Service base class for <code>VillageService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see VillageService
 */
public abstract class VillageServiceBase
    implements VillageService
{
    protected Logger logger = LoggerFactory.getLogger(VillageService.class);
    protected final VillageDao villageDao;
    protected final VillageRepository villageRepository;
    protected final MessageSource messageSource;

    public VillageServiceBase(
        VillageDao villageDao,
        VillageRepository villageRepository,
        MessageSource messageSource
    ) {
        this.villageDao = villageDao;
        this.villageRepository = villageRepository;
        this.messageSource = messageSource;
    }

	/**
     * Gets the reference to <code>village</code>'s DAO.
     * @return villageDao
     */
    protected VillageDao getVillageDao()
    {
        return this.villageDao;
    }

    /**
     * Gets the reference to <code>village</code>'s repository.
     * @return villageRepository
     */
    public VillageRepository getVillageRepository() {
        return villageRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VillageVO findById(final Long id)
    {
        try
        {
            return this.handleFindById(id);
        }
        catch (Throwable th)
        {
            throw new VillageServiceException(
                "Error performing 'VillageService.findById(Long id)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #findById(Long)}
     * @param id Long TODO: Model Documentation for VillageService.findById(id)
     * @return VillageVO
     * @throws Exception
     */
    protected abstract VillageVO handleFindById(Long id)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<VillageVO> getAll()
    {
        try
        {
            return this.handleGetAll();
        }
        catch (Throwable th)
        {
            throw new VillageServiceException(
                "Error performing 'VillageService.getAll()' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #getAll()}
     * @return Collection<VillageVO>
     * @throws Exception
     */
    protected abstract Collection<VillageVO> handleGetAll()
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public VillageVO save(final VillageVO village)
    {
        if (village == null)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.village.VillageService.save(VillageVO village) - 'village' can not be null");
        }
        if (village.getCode() == null || village.getCode().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.village.VillageService.save(VillageVO village) - 'village.code' can not be null or empty");
        }
        if (village.getName() == null || village.getName().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.village.VillageService.save(VillageVO village) - 'village.name' can not be null or empty");
        }
        try
        {
            return this.handleSave(village);
        }
        catch (Throwable th)
        {
            throw new VillageServiceException(
                "Error performing 'VillageService.save(VillageVO village)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #save(VillageVO)}
     * @param village VillageVO TODO: Model Documentation for VillageService.save(village)
     * @return VillageVO
     * @throws Exception
     */
    protected abstract VillageVO handleSave(VillageVO village)
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
            throw new VillageServiceException(
                "Error performing 'VillageService.remove(Long id)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #remove(Long)}
     * @param id Long TODO: Model Documentation for VillageService.remove(id)
     * @return boolean
     * @throws Exception
     */
    protected abstract boolean handleRemove(Long id)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<VillageVO> search(final String criteria)
    {
        try
        {
            return this.handleSearch(criteria);
        }
        catch (Throwable th)
        {
            throw new VillageServiceException(
                "Error performing 'VillageService.search(String criteria)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #search(String)}
     * @param criteria String TODO: Model Documentation for VillageService.search(criteria)
     * @return Collection<VillageVO>
     * @throws Exception
     */
    protected abstract Collection<VillageVO> handleSearch(String criteria)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public VillageVO getDistrictVillages(final String districtId)
    {
        if (districtId == null || districtId.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.village.VillageService.getDistrictVillages(String districtId) - 'districtId' can not be null or empty");
        }
        try
        {
            return this.handleGetDistrictVillages(districtId);
        }
        catch (Throwable th)
        {
            throw new VillageServiceException(
                "Error performing 'VillageService.getDistrictVillages(String districtId)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #getDistrictVillages(String)}
     * @param districtId String TODO: Model Documentation for
VillageService.getDistrictVillages(districtId)
     * @return VillageVO
     * @throws Exception
     */
    protected abstract VillageVO handleGetDistrictVillages(String districtId)
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