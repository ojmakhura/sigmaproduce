// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::document::type::DocumentTypeService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.document.type;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.document.type.DocumentTypeService
 */
@Service("documentTypeService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class DocumentTypeServiceImpl
    extends DocumentTypeServiceBase
{
    public DocumentTypeServiceImpl(
        DocumentTypeDao documentTypeDao,
        DocumentTypeRepository documentTypeRepository,
        MessageSource messageSource
    ) {
        
        super(
            documentTypeDao,
            documentTypeRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.document.type.DocumentTypeService#findById(String)
     */
    @Override
    protected DocumentTypeDTO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  DocumentTypeDTO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.type.DocumentTypeService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.type.DocumentTypeService#save(DocumentTypeDTO)
     */
    @Override
    protected DocumentTypeDTO handleSave(DocumentTypeDTO documentType)
        throws Exception
    {
        // TODO implement protected  DocumentTypeDTO handleSave(DocumentTypeDTO documentType)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.type.DocumentTypeService.handleSave(DocumentTypeDTO documentType) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.type.DocumentTypeService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.type.DocumentTypeService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.type.DocumentTypeService#getAll()
     */
    @Override
    protected Collection<DocumentTypeDTO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<DocumentTypeDTO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.type.DocumentTypeService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.type.DocumentTypeService#search(String)
     */
    @Override
    protected Collection<DocumentTypeDTO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<DocumentTypeDTO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.type.DocumentTypeService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.type.DocumentTypeService#getAll(Integer, Integer)
     */
    @Override
    protected Page<DocumentTypeDTO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<DocumentTypeDTO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.type.DocumentTypeService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.type.DocumentTypeService#search(String, Integer, Integer)
     */
    @Override
    protected Page<DocumentTypeDTO> handleSearch(String criteria, Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<DocumentTypeDTO> handleSearch(String criteria, Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.type.DocumentTypeService.handleSearch(String criteria, Integer pageNumber, Integer pageSize) Not implemented!");
    }

}