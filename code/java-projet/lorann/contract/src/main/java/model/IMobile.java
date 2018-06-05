package model;





/**
 * @author Romain
 *
 */
public interface IMobile extends IElement {

	/** 
	 * method move 
	 * 
	 * @param move
	 * 		id of the move
	 */
	void move(int move);
	
	/**
	 * @throws InterruptedException
	 * 					change picture
	 */
	void doNothing() throws InterruptedException;

	/**
	 * @return alive
	 */
	Boolean isAlive();

	
	/**
	 * @return position
	 */
	int getPosition();
	
	/**
	 * @return win
	 */
	Boolean getwin();
	
	/**
	 * @return mana
	 */
	boolean getMana();
	
	/**
	 * @param mana
	 * 			mana of Hero
	 */
	void setMana(boolean mana);

	
}