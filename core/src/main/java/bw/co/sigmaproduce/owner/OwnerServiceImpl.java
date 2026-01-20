// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::owner::OwnerService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.owner;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.owner.OwnerService
 */
@Service("ownerService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class OwnerServiceImpl
    extends OwnerServiceBase
{
    public OwnerServiceImpl(
        OwnerDao ownerDao,
        OwnerRepository ownerRepository,
        MessageSource messageSource
    ) {
        
        super(
            ownerDao,
            ownerRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.owner.OwnerService#findById(String)
     */
    @Override
    protected OwnerDTO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  OwnerDTO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.owner.OwnerService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.owner.OwnerService#getAll()
     */
    @Override
    protected Collection<OwnerListDTO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<OwnerDTO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.owner.OwnerService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.owner.OwnerService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.owner.OwnerService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.owner.OwnerService#save(OwnerDTO)
     */
    @Override
    protected OwnerDTO handleSave(OwnerDTO owner)
        throws Exception
    {
        // TODO implement protected  OwnerDTO handleSave(OwnerDTO owner)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.owner.OwnerService.handleSave(OwnerDTO owner) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.owner.OwnerService#search(String)
     */
    @Override
    protected Collection<OwnerListDTO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<OwnerDTO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.owner.OwnerService.handleSearch(String criteria) Not implemented!");
    }

}