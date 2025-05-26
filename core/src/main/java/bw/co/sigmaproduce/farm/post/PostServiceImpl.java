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
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
    protected Page<PostDTO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        Page<Post> posts = this.postRepository.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(Direction.DESC, "createdDate")));

        return posts.map(post -> this.postDao.toPostDTO(post));
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#getAll()
     */
    @Override
    protected Collection<PostDTO> handleGetAll()
        throws Exception
    {

        return this.postDao.toPostDTOCollection(this.postRepository.findAll());
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#remove(String)
     */
    @Override
    protected boolean handleRemove(String id)
        throws Exception
    {

        this.postRepository.deleteById(id);

        return true;
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#findById(String)
     */
    @Override
    protected PostDTO handleFindById(String id)
        throws Exception
    {

        return this.postDao.toPostDTO(this.postRepository.getReferenceById(id));
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#save(PostDTO)
     */
    @Override
    protected PostDTO handleSave(PostDTO post)
        throws Exception
    {

        Post entity = this.postDao.postDTOToEntity(post);

        entity = this.postRepository.save(entity);

        return this.postDao.toPostDTO(entity);
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#getFarmPosts(String)
     */
    @Override
    protected PostDTO handleGetFarmPosts(String farmId)
        throws Exception
    {
        // TODO implement protected  PostDTO handleGetFarmPosts(String farmId)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.post.PostService.handleGetFarmPosts(String farmId) Not implemented!");
    }

    /**
     * @see bw.co.sigmaproduce.farm.post.PostService#getFarmPosts(String, Integer, Integer)
     */
    @Override
    protected Page<PostDTO> handleGetFarmPosts(String farmId, Integer pageSize, Integer pageNumber)
        throws Exception
    {
        // TODO implement protected  Page<PostDTO> handleGetFarmPosts(String farmId, Integer pageSize, Integer pageNumber)
        throw new UnsupportedOperationException("bw.co.sigmaproduce.farm.post.PostService.handleGetFarmPosts(String farmId, Integer pageSize, Integer pageNumber) Not implemented!");
    }

}