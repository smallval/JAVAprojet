package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.Controller;
import model.LorannModel;


import view.view;

/**
 * 
 * @author Romain
 * 
 */
public abstract class Main 
{

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException 
     * 		Signals that an I/O exception has occurred.
     * @throws SQLException 
     * 		Signals that an SQL exception has occurred.
     * @throws InterruptedException 
     * 		the interrupted exception
     */
    public static void main(final String[] args) throws IOException, SQLException, InterruptedException
    {
    	final LorannModel model = new LorannModel();
    	final view view = new view(model.getMap());
        final Controller controller = new Controller(view, model,model.getMap());
        view.setOrderPerformer(controller.getOrderPeformer());
        
            controller.start();
      
            
   
    }

}
