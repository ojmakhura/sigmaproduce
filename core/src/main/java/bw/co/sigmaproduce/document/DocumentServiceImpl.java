// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::document::DocumentService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.document;

import bw.co.sigmaproduce.TargetEntity;
import java.io.File;
import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.document.DocumentService
 */
@Service("documentService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class DocumentServiceImpl
    extends DocumentServiceBase
{
    public DocumentServiceImpl(
        DocumentDao documentDao,
        DocumentRepository documentRepository,
        MessageSource messageSource
    ) {
        
        super(
            documentDao,
            documentRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.document.DocumentService#findById(String)
     */
    @Override
    protected DocumentDTO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  DocumentDTO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.DocumentService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.DocumentService#save(DocumentDTO)
     */
    @Override
    protected DocumentDTO handleSave(DocumentDTO document)
        throws Exception
    {
        // TODO implement protected  DocumentDTO handleSave(DocumentDTO document)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.DocumentService.handleSave(DocumentDTO document) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.DocumentService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.DocumentService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.DocumentService#getAll()
     */
    @Override
    protected Collection<DocumentDTO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<DocumentDTO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.DocumentService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.DocumentService#search(String)
     */
    @Override
    protected Collection<DocumentDTO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<DocumentDTO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.DocumentService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.DocumentService#getAll(Integer, Integer)
     */
    @Override
    protected Page<DocumentDTO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<DocumentDTO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.DocumentService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.DocumentService#findByDocumentType(String)
     */
    @Override
    protected Collection<DocumentDTO> handleFindByDocumentType(String documentTypeId)
        throws Exception
    {
        // TODO implement protected  Collection<DocumentDTO> handleFindByDocumentType(String documentTypeId)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.DocumentService.handleFindByDocumentType(String documentTypeId) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.DocumentService#upload(TargetEntity, String, String, File)
     */
    @Override
    protected DocumentDTO handleUpload(TargetEntity target, String targetId, String documentTypeId, File url)
        throws Exception
    {
        // TODO implement protected  DocumentDTO handleUpload(TargetEntity target, String targetId, String documentTypeId, File url)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.DocumentService.handleUpload(TargetEntity target, String targetId, String documentTypeId, File url) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.document.DocumentService#findByTarget(TargetEntity, String)
     */
    @Override
    protected Collection<DocumentDTO> handleFindByTarget(TargetEntity target, String targetId)
        throws Exception
    {
        // TODO implement protected  Collection<DocumentDTO> handleFindByTarget(TargetEntity target, String targetId)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.document.DocumentService.handleFindByTarget(TargetEntity target, String targetId) Not implemented!");
    }

}