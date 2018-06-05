package controller;

import java.io.IOException;
/**
 * 
 * 
 * @author Romain
 * 
 */
public interface IOrderPerformer {

    /**
     * Order perform.
     *
     * @param userOrder
     *            the user order
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
	 void orderPerform(Order userOrder) throws IOException;
}
