package controller;

/**
 * 
 * @author Romain
 * 
 */
public interface IController
{
	/**
     * Gets the order peformer.
     *
     * @return the order peformer
     */

     IOrderPerformer getOrderPeformer();
     /**
      * Start.
      *
      * @throws InterruptedException
      *             the interrupted exception
      */
	void start() throws InterruptedException;
     
}
