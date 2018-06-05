package model;

public interface ILorannModel {

	/**
	 * @return map
	 */
	IMap getMap();

	/**
	 * @return Hero
	 */
	IMobile getHero();
	/**
	 * @return Demon1
	 */
	IMobile getDemon1();
	/**
	 * @return Demon2
	 */
	IMobile getDemon2();
	/**
	 * @return Demon3
	 */
	IMobile getDemon3();
	/**
	 * @return Demon4
	 */
	IMobile getDemon4();
	/**
	 * @param her
	 * 			hero
	 */
	void setHero(IMobile her);
	
}