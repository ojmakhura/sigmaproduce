// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.sigmaproduce::farm::post::PostService
 * STEREOTYPE:  Service
 */
package bw.co.sigmaproduce.farm.post;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.sigmaproduce.farm.post.PostService
 */
@Service("postService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class PostServiceImpl
    extends PostServiceBase
{
    public PostServiceImpl(
        PostDao postDao,
        PostRepository postRepository,
        MessageSource messageSource
    ) {
        
        super(
            postDao,
            postRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#getAll(Integer, Integer)
     */
    @Override
    protected Page<PostVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page<PostVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.post.PostService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#getAll()
     */
    @Override
    protected Collection<PostVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<PostVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.post.PostService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.post.PostService.handleRemove(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#findById(String)
     */
    @Override
    protected PostVO handleFindById(String id)
        throws Exception
    {
        // TODO implement protected  PostVO handleFindById(String id)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.post.PostService.handleFindById(String id) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#save(PostVO)
     */
    @Override
    protected PostVO handleSave(PostVO post)
        throws Exception
    {
        // TODO implement protected  PostVO handleSave(PostVO post)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.post.PostService.handleSave(PostVO post) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#getFarmPosts(String)
     */
    @Override
    protected PostVO handleGetFarmPosts(String farmId)
        throws Exception
    {
        // TODO implement protected  PostVO handleGetFarmPosts(String farmId)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.post.PostService.handleGetFarmPosts(String farmId) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#getFarmPosts(String, Integer, Integer)
     */
    @Override
    protected Page<PostVO> handleGetFarmPosts(String farmId, Integer pageSize, Integer pageNumber)
        throws Exception
    {
        // TODO implement protected  Page<PostVO> handleGetFarmPosts(String farmId, Integer pageSize, Integer pageNumber)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.post.PostService.handleGetFarmPosts(String farmId, Integer pageSize, Integer pageNumber) Not implemented!");
    }

}