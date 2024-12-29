// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::district::DistrictService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.district;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.district.DistrictService
 */
@Service("districtService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class DistrictServiceImpl
    extends DistrictServiceBase
{
    public DistrictServiceImpl(
        DistrictDao districtDao,
        DistrictRepository districtRepository,
        MessageSource messageSource
    ) {
        
        super(
            districtDao,
            districtRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#findById(Long)
     */
    @Override
    protected DistrictVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  DistrictVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.district.DistrictService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#getAll()
     */
    @Override
    protected Collection<DistrictVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<DistrictVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.district.DistrictService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#save(DistrictVO)
     */
    @Override
    protected DistrictVO handleSave(DistrictVO district)
        throws Exception
    {
        // TODO implement protected  DistrictVO handleSave(DistrictVO district)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.district.DistrictService.handleSave(DistrictVO district) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.district.DistrictService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.district.DistrictService#search(String)
     */
    @Override
    protected Collection<DistrictVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<DistrictVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.district.DistrictService.handleSearch(String criteria) Not implemented!");
    }

}