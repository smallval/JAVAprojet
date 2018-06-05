package controller;

import java.io.IOException;
import controller.IOrderPerformer;
import controller.Order;

import model.ILorannModel;
import model.IMap;

import view.IViewFacade;

/**
 * @author Romain.
 * 
 */
public class Controller implements IController , IOrderPerformer {

    /** The view. */
    private IViewFacade  viewFacade;
    
    /** The Map. */
    private IMap map ;
    
	/** The model. */
    private  ILorannModel model;

    /** The Constant speed. */
    private static int speed = 200;
    
    /** The stack order. */
    private Order stackOrder;

    /**
     * 
     * Instantiates a new controller facade.
     * 
     * @param viewFacade
     * 				the view
     * @param model
     * 				the model
     * @param map
     * 				the map.
     */
    public Controller(final IViewFacade viewFacade, final ILorannModel model,final IMap map) {
    	this.setViewFacade(viewFacade);
        this.setModel(model);
        this.setMap(map);
        this.clearStackOrder();
    }


    /**
     * 	Sets the map
     * 
     * @param map
     * 			map
     */
   
	public void setMap(IMap map) {
		this.map = map;
	}
	
	 /**
     * 	Sets the modele
     * 
     * @param model
     * 			the model to set.
     */
	private void setModel(ILorannModel model) {
		this.model = model;
	}
	
	/**
	 *  Gets the model
	 *  
	 * @return the model
	 * 
	 */
	public ILorannModel getModel() {
		return this.model;
	}
	
	 /**
     * 	Sets the view
     * 
     * @param viewfacade
     * 			the view to set.
     */
    private void setViewFacade(final IViewFacade viewfacade) {
        this.viewFacade = viewfacade;
    }
    
    /**
     * Sets the stack order.
     *
     * @param stackOrder
     *            the new stack order
     */
	public void setStackOrder(Order stackOrder) {
		this.stackOrder = stackOrder;
	}
	
	/**
     * Gets the stack order.
     *
     * @return the stack order
     */
	public Order getStackOrder() {
		return stackOrder;
	}
	
	 /**
     * Clear stack order.
     */
	private void clearStackOrder() {
	        this.stackOrder = Order.DONOTHING;
	    }
   
	/* (non-Javadoc)
	 * @see controller.IController#getOrderPeformer()
	 */
	@Override
    public IOrderPerformer getOrderPeformer() {
        return this;
    }
	
	/* (non-Javadoc)
	 * @see controller.IOrderPerformer#orderPerform(controller.Order)
	 */
	@Override
	public void orderPerform(Order userOrder) throws IOException {
		this.setStackOrder(userOrder);
	}


	/**
	 * 
	 * The methode start execute the game play when Lorann is Alive or she haven't win
	 * 
	 * @throws InterruptedException
	 * 					the interrupted exception.
	 */
	@Override
	public void start() throws InterruptedException {
		while (getModel().getHero().isAlive() && getModel().getHero().getwin()  == false ) {
            Thread.sleep(speed);  
            switch (this.getStackOrder()) {
                case RIGHT:
                   getModel().getHero().move(3);
                   break;
                   
                case LEFT:
                   getModel().getHero().move(7);
                   break;
                    
                case UP:
                    getModel().getHero().move(1);
                    break;
                case UPRIGHT:
                    getModel().getHero().move(2);
                    break;
                case UPLEFT:
                    getModel().getHero().move(8);
                    break;
                case DOWNLEFT:
                    getModel().getHero().move(6);
                    break;
                case DOWNRIGHT:
                    getModel().getHero().move(4);
                    break;
                case DOWN:
                    getModel().getHero().move(5);
                    break;
                    
                case SHOOT:
                	getModel().getHero().move(10);
                break;
                
                case DONOTHING:
                	for(int i =0 ;i < 5 ; i++) {
                	getModel().getHero().move(11);
                	}
                	break;
                	
			default:
				break;
                
            }
            
            this.clearStackOrder();
            if(getModel().getDemon1().isAlive()) {
            	 getModel().getDemon1().move(0);
            }
            if(getModel().getDemon2().isAlive()) {
            	getModel().getDemon2().move(0);
           }
            if(getModel().getDemon3().isAlive()) {
            	getModel().getDemon3().move(0);
           }
            if(getModel().getDemon4().isAlive()) {
            	 getModel().getDemon4().move(0);
           }
           
            if(getModel().getHero().getMana() == false){
            	
            getModel().getHero().move(12);
           
            }

                 }
        viewFacade.displayMessage(map.EndGame());
 
		}	
	}


