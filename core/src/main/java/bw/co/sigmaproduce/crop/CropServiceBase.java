// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringServiceBase.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
/**
 * TEMPLATE:    SpringServiceBase.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::crop::CropService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.crop;

import bw.co.sigmaproduce.PrincipalStore;
import bw.co.sigmaproduce.crop.issue.CropIssueType;
import bw.co.sigmaproduce.crop.variety.CropVarietyDao;
import bw.co.sigmaproduce.crop.variety.CropVarietyRepository;
import java.security.Principal;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;

/**
 * <p>
 * Spring Service base class for <code>CropService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see CropService
 */
public abstract class CropServiceBase
    implements CropService
{
    protected Logger logger = LoggerFactory.getLogger(CropService.class);
    protected final CropDao cropDao;
    protected final CropRepository cropRepository;
    protected final CropVarietyDao cropVarietyDao;
    protected final CropVarietyRepository cropVarietyRepository;
    protected final MessageSource messageSource;

    public CropServiceBase(
        CropDao cropDao,
        CropRepository cropRepository,
        CropVarietyDao cropVarietyDao,
        CropVarietyRepository cropVarietyRepository,
        MessageSource messageSource
    ) {
        this.cropDao = cropDao;
        this.cropRepository = cropRepository;
        this.cropVarietyDao = cropVarietyDao;
        this.cropVarietyRepository = cropVarietyRepository;
        this.messageSource = messageSource;
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
     * Gets the reference to <code>cropVariety</code>'s DAO.
     * @return cropVarietyDao
     */
    protected CropVarietyDao getCropVarietyDao()
    {
        return this.cropVarietyDao;
    }

    /**
     * Gets the reference to <code>cropVariety</code>'s repository.
     * @return cropVarietyRepository
     */
    public CropVarietyRepository getCropVarietyRepository() {
        return cropVarietyRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CropVO findById(final String id)
    {
        if (id == null || id.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.CropService.findById(String id) - 'id' can not be null or empty");
        }
        try
        {
            return this.handleFindById(id);
        }
        catch (Throwable th)
        {
            throw new CropServiceException(
                "Error performing 'CropService.findById(String id)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #findById(String)}
     * @param id String TODO: Model Documentation for CropService.findById(id)
     * @return CropVO
     * @throws Exception
     */
    protected abstract CropVO handleFindById(String id)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<CropListVO> getAll()
    {
        try
        {
            return this.handleGetAll();
        }
        catch (Throwable th)
        {
            throw new CropServiceException(
                "Error performing 'CropService.getAll()' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #getAll()}
     * @return Collection<CropListVO>
     * @throws Exception
     */
    protected abstract Collection<CropListVO> handleGetAll()
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Page<CropListVO> getAll(final Integer pageNumber, final Integer pageSize)
    {
        try
        {
            return this.handleGetAll(pageNumber, pageSize);
        }
        catch (Throwable th)
        {
            throw new CropServiceException(
                "Error performing 'CropService.getAll(Integer pageNumber, Integer pageSize)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #getAll(Integer, Integer)}
     * @param pageNumber Integer TODO: Model Documentation for CropService.getAll(pageNumber)
     * @param pageSize Integer TODO: Model Documentation for CropService.getAll(pageSize)
     * @return Page<CropListVO>
     * @throws Exception
     */
    protected abstract Page<CropListVO> handleGetAll(Integer pageNumber, Integer pageSize)
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
                "bw.co.sigmaproduce.crop.CropService.remove(String id) - 'id' can not be null or empty");
        }
        try
        {
            return this.handleRemove(id);
        }
        catch (Throwable th)
        {
            throw new CropServiceException(
                "Error performing 'CropService.remove(String id)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #remove(String)}
     * @param id String TODO: Model Documentation for CropService.remove(id)
     * @return boolean
     * @throws Exception
     */
    protected abstract boolean handleRemove(String id)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public CropVO save(final CropVO crop)
    {
        if (crop == null)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.CropService.save(CropVO crop) - 'crop' can not be null");
        }
        if (crop.getCode() == null || crop.getCode().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.CropService.save(CropVO crop) - 'crop.code' can not be null or empty");
        }
        if (crop.getName() == null || crop.getName().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.CropService.save(CropVO crop) - 'crop.name' can not be null or empty");
        }
        if (crop.getType() == null)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.CropService.save(CropVO crop) - 'crop.type' can not be null");
        }
        try
        {
            return this.handleSave(crop);
        }
        catch (Throwable th)
        {
            throw new CropServiceException(
                "Error performing 'CropService.save(CropVO crop)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #save(CropVO)}
     * @param crop CropVO TODO: Model Documentation for CropService.save(crop)
     * @return CropVO
     * @throws Exception
     */
    protected abstract CropVO handleSave(CropVO crop)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<CropListVO> search(final String criteria)
    {
        try
        {
            return this.handleSearch(criteria);
        }
        catch (Throwable th)
        {
            throw new CropServiceException(
                "Error performing 'CropService.search(String criteria)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #search(String)}
     * @param criteria String TODO: Model Documentation for CropService.search(criteria)
     * @return Collection<CropListVO>
     * @throws Exception
     */
    protected abstract Collection<CropListVO> handleSearch(String criteria)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Page<CropListVO> search(final Integer pageNumber, final Integer pageSize, final String criteria)
    {
        if (criteria == null || criteria.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.CropService.search(Integer pageNumber, Integer pageSize, String criteria) - 'criteria' can not be null or empty");
        }
        try
        {
            return this.handleSearch(pageNumber, pageSize, criteria);
        }
        catch (Throwable th)
        {
            throw new CropServiceException(
                "Error performing 'CropService.search(Integer pageNumber, Integer pageSize, String criteria)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #search(Integer, Integer, String)}
     * @param pageNumber Integer TODO: Model Documentation for CropService.search(pageNumber)
     * @param pageSize Integer TODO: Model Documentation for CropService.search(pageSize)
     * @param criteria String TODO: Model Documentation for CropService.search(criteria)
     * @return Page<CropListVO>
     * @throws Exception
     */
    protected abstract Page<CropListVO> handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<CropListVO> findByCropTypes(final Set<String> cropTypeIds)
    {
        try
        {
            return this.handleFindByCropTypes(cropTypeIds);
        }
        catch (Throwable th)
        {
            throw new CropServiceException(
                "Error performing 'CropService.findByCropTypes(Set<String> cropTypeIds)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #findByCropTypes(Set<String>)}
     * @param cropTypeIds String TODO: Model Documentation for CropService.findByCropTypes(cropTypeIds)
     * @return Collection<CropListVO>
     * @throws Exception
     */
    protected abstract Collection<CropListVO> handleFindByCropTypes(Set<String> cropTypeIds)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<CropListVO> findByIssueType(final CropIssueType issueType)
    {
        if (issueType == null)
        {
            throw new IllegalArgumentException(
                "bw.co.sigmaproduce.crop.CropService.findByIssueType(CropIssueType issueType) - 'issueType' can not be null");
        }
        try
        {
            return this.handleFindByIssueType(issueType);
        }
        catch (Throwable th)
        {
            throw new CropServiceException(
                "Error performing 'CropService.findByIssueType(CropIssueType issueType)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #findByIssueType(CropIssueType)}
     * @param issueType CropIssueType TODO: Model Documentation for CropService.findByIssueType(issueType)
     * @return Collection<CropListVO>
     * @throws Exception
     */
    protected abstract Collection<CropListVO> handleFindByIssueType(CropIssueType issueType)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<Page<CropListVO>> findByCropTypes(final Set<String> cropTypeIds, final Integer pageNumber, final Integer pageSize)
    {
        try
        {
            return this.handleFindByCropTypes(cropTypeIds, pageNumber, pageSize);
        }
        catch (Throwable th)
        {
            throw new CropServiceException(
                "Error performing 'CropService.findByCropTypes(Set<String> cropTypeIds, Integer pageNumber, Integer pageSize)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #findByCropTypes(Set<String>, Integer, Integer)}
     * @param cropTypeIds String TODO: Model Documentation for CropService.findByCropTypes(cropTypeIds)
     * @param pageNumber Integer TODO: Model Documentation for CropService.findByCropTypes(pageNumber)
     * @param pageSize Integer TODO: Model Documentation for CropService.findByCropTypes(pageSize)
     * @return Collection<Page<CropListVO>>
     * @throws Exception
     */
    protected abstract Collection<Page<CropListVO>> handleFindByCropTypes(Set<String> cropTypeIds, Integer pageNumber, Integer pageSize)
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