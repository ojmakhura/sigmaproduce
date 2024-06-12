// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringServiceBase.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
/**
 * TEMPLATE:    SpringServiceBase.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::crop::type::CropTypeService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.crop.type;

import bw.co.sigmaproduce.PrincipalStore;
import bw.co.sigmaproduce.crop.CropDao;
import bw.co.sigmaproduce.crop.CropRepository;
import java.security.Principal;
import java.util.Collection;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;

/**
 * <p>
 * Spring Service base class for <code>CropTypeService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see CropTypeService
 */
public abstract class CropTypeServiceBase
    implements CropTypeService
{
    protected Logger logger = LoggerFactory.getLogger(CropTypeService.class);
    protected final CropTypeDao cropTypeDao;
    protected final CropTypeRepository cropTypeRepository;
    protected final CropDao cropDao;
    protected final CropRepository cropRepository;
    protected final MessageSource messageSource;

    public CropTypeServiceBase(
        CropTypeDao cropTypeDao,
        CropTypeRepository cropTypeRepository,
        CropDao cropDao,
        CropRepository cropRepository,
        MessageSource messageSource
    ) {
        this.cropTypeDao = cropTypeDao;
        this.cropTypeRepository = cropTypeRepository;
        this.cropDao = cropDao;
        this.cropRepository = cropRepository;
        this.messageSource = messageSource;
    }

	/**
     * Gets the reference to <code>cropType</code>'s DAO.
     * @return cropTypeDao
     */
    protected CropTypeDao getCropTypeDao()
    {
        return this.cropTypeDao;
    }

    /**
     * Gets the reference to <code>cropType</code>'s repository.
     * @return cropTypeRepository
     */
    public CropTypeRepository getCropTypeRepository() {
        return cropTypeRepository;
    }

	/**
     * Gets the reference to <code>crop</code>'s DAO.
     * @return cropDao
     */
    protected CropDao getCropDao()
    {
        return this.cropDao;
    }

    /**
     * Gets the reference to <code>crop</code>'s repository.
     * @return cropRepository
     */
    public CropRepository getCropRepository() {
        return cropRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CropTypeVO findById(final String id)
    {
        if (id == null || id.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.type.CropTypeService.findById(String id) - 'id' can not be null or empty");
        }
        try
        {
            return this.handleFindById(id);
        }
        catch (Throwable th)
        {
            throw new CropTypeServiceException(
                "Error performing 'CropTypeService.findById(String id)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #findById(String)}
     * @param id String TODO: Model Documentation for CropTypeService.findById(id)
     * @return CropTypeVO
     * @throws Exception
     */
    protected abstract CropTypeVO handleFindById(String id)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<CropTypeVO> getAll()
    {
        try
        {
            return this.handleGetAll();
        }
        catch (Throwable th)
        {
            throw new CropTypeServiceException(
                "Error performing 'CropTypeService.getAll()' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #getAll()}
     * @return Collection<CropTypeVO>
     * @throws Exception
     */
    protected abstract Collection<CropTypeVO> handleGetAll()
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean remove(final String id)
    {
        if (id == null || id.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.type.CropTypeService.remove(String id) - 'id' can not be null or empty");
        }
        try
        {
            return this.handleRemove(id);
        }
        catch (Throwable th)
        {
            throw new CropTypeServiceException(
                "Error performing 'CropTypeService.remove(String id)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #remove(String)}
     * @param id String TODO: Model Documentation for CropTypeService.remove(id)
     * @return boolean
     * @throws Exception
     */
    protected abstract boolean handleRemove(String id)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public CropTypeVO save(final CropTypeVO cropType)
    {
        if (cropType == null)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.type.CropTypeService.save(CropTypeVO cropType) - 'cropType' can not be null");
        }
        if (cropType.getCode() == null || cropType.getCode().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.type.CropTypeService.save(CropTypeVO cropType) - 'cropType.code' can not be null or empty");
        }
        if (cropType.getName() == null || cropType.getName().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.type.CropTypeService.save(CropTypeVO cropType) - 'cropType.name' can not be null or empty");
        }
        try
        {
            return this.handleSave(cropType);
        }
        catch (Throwable th)
        {
            throw new CropTypeServiceException(
                "Error performing 'CropTypeService.save(CropTypeVO cropType)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #save(CropTypeVO)}
     * @param cropType CropTypeVO TODO: Model Documentation for CropTypeService.save(cropType)
     * @return CropTypeVO
     * @throws Exception
     */
    protected abstract CropTypeVO handleSave(CropTypeVO cropType)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<CropTypeVO> search(final String criteria)
    {
        try
        {
            return this.handleSearch(criteria);
        }
        catch (Throwable th)
        {
            throw new CropTypeServiceException(
                "Error performing 'CropTypeService.search(String criteria)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #search(String)}
     * @param criteria String TODO: Model Documentation for CropTypeService.search(criteria)
     * @return Collection<CropTypeVO>
     * @throws Exception
     */
    protected abstract Collection<CropTypeVO> handleSearch(String criteria)
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