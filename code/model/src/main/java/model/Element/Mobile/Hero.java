package model.Element.Mobile;

import model.Element.*;
import Contract.*;

public class Hero extends Mobile {

	private Sprite spriteDownLeft;
	private Sprite spriteDown;
	private Sprite spriteLeft;
	private Sprite spriteDownRight;
	private Sprite spriteRight;
	private Sprite spriteUpLeft;
	private Sprite spriteUp;
	private Sprite spriteUpRight;
	private Sprite spriteDoNothing;
	private boolean mana;

	/**
	 * 
	 * @param x
	 * @param y
	 * @param map
	 */
	public Hero(int x, int y, IMap map) {
		// TODO - implement Hero.Hero
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param lastOrder
	 */
	public Fireball fireball(Order lastOrder) {
		// TODO - implement Hero.fireball
		throw new UnsupportedOperationException();
	}

	public boolean getMana() {
		return this.mana;
	}

	/**
	 * 
	 * @param mana
	 */
	public void setMana(boolean mana) {
		this.mana = mana;
	}

}