package model;

import java.util.Observable;


@SuppressWarnings("deprecation")
public interface IMap {

	/**
	 * @return Height
	 */
	int getHeight();
	
	/**
	 * @return Width
	 */
	int getWidth();
	
	
	
	/**
	 * @param position
	 * 			position of element
	 * @return
	 * 			Element on the map
	 */
	char getOnMap(int position);
	
	/**
	 * @param position
	 * 				position element
	 * @param element
	 * 				element
	 * @return
	 * 		set element on the map
	 */			
	char setOnMap(int position, char element);
	/**
	 * @return message of end game
	 */
	String EndGame();
	/**
	 *  notify Observer
	 */
	void setMobileHasChanged();
	/**
	 * @param hero
	 * 			hero
	 */
	void setHero(IMobile hero);
	/**
	 * @param score
	 * 			score
	 */
	void Purse(int score);

	
	/**
	 * @return observable
	 */
	Observable getObservable();

}