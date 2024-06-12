// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by DefaultServiceException.vsl in andromda-spring-cartridge on $springUtils.date. Do not modify by hand!.
//
package bw.co.sigmaproduce.farm.post;

import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * The default exception thrown for unexpected errors occurring
 * within {@link bw.co.sigmaproduce.farm.post.PostService}.
 */
public class PostServiceException
    extends RuntimeException
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 2724285843456688818L;

    /**
     * The default constructor for <code>PostServiceException</code>.
     */
    public PostServiceException()
    {
        // Documented empty block
    }

    /**
     * Constructs a new instance of <code>PostServiceException</code>.
     *
     * @param throwable the parent Throwable
     */
    public PostServiceException(Throwable throwable)
    {
        super(findRootCause(throwable));
    }

    /**
     * Constructs a new instance of <code>PostServiceException</code>.
     *
     * @param message the throwable message.
     */
    public PostServiceException(String message)
    {
        super(message);
    }

    /**
     * Constructs a new instance of <code>PostServiceException</code>.
     *
     * @param message the throwable message.
     * @param throwable the parent of this Throwable.
     */
    public PostServiceException(String message, Throwable throwable)
    {
        super(message, findRootCause(throwable));
    }

    /**
     * Finds the root cause of the parent exception
     * by traveling up the exception tree
     */
    private static Throwable findRootCause(Throwable th)
    {
        if (th != null)
        {
            // Reflectively get any exception causes.
            try
            {
                th = ExceptionUtils.getRootCause(th);
            }
            catch (Exception ex)
            {
                // just print the exception and continue
                ex.printStackTrace();
            }

            if (th.getCause() != null)
            {
                th = th.getCause();
                th = findRootCause(th);
            }
        }
        return th;
    }

    private Object[] messageArguments;

    /**
     * Gets the message arguments that can be used by message resources (in
     * something like the presentation tier)
     *
     * @return messageArguments
     */
    public Object[] getMessageArguments()
    {
        return this.messageArguments;
    }

    /**
     * Sets the message arguments that can be used by message resources (in
     * something like the presentation tier)
     *
     * @param messageArgumentsIn
     */
    public void setMessageArguments(Object[] messageArgumentsIn)
    {
        this.messageArguments = messageArgumentsIn;
    }
}