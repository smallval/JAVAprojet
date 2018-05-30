package model.Element.Mobile;

import model.Element.*;
import Contract.*;

public abstract class Mobile extends Element implements IMobile {

	private IMap map;
	private Point position;
	private Boolean alive = true;
	private int board = IBoard;

	/**
	 * 
	 * @param sprite
	 * @param map
	 * @param permeability
	 */
	public Mobile(Sprite sprite, IMap map, Permeability permeability) {
		// TODO - implement Mobile.Mobile
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param sprite
	 * @param map
	 * @param permeability
	 */
	public Mobile(int x, int y, Sprite sprite, IMap map, Permeability permeability) {
		// TODO - implement Mobile.Mobile
		throw new UnsupportedOperationException();
	}

	public Point getPosition() {
		return this.position;
	}

	/**
	 * 
	 * @param position
	 */
	public void setPosition(Point position) {
		this.position = position;
	}

	public Boolean getAlive() {
		return this.alive;
	}

	/**
	 * 
	 * @param alive
	 */
	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

	protected IBoard getBoard() {
		// TODO - implement Mobile.getBoard
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param board
	 */
	public void setBoard(int board) {
		this.board = board;
	}

	public void moveUp() {
		// TODO - implement Mobile.moveUp
		throw new UnsupportedOperationException();
	}

	public void moveDown() {
		// TODO - implement Mobile.moveDown
		throw new UnsupportedOperationException();
	}

	public void moveLeft() {
		// TODO - implement Mobile.moveLeft
		throw new UnsupportedOperationException();
	}

	public void moveRight() {
		// TODO - implement Mobile.moveRight
		throw new UnsupportedOperationException();
	}

	public void moveUpLeft() {

	}

	public void moveUpRight() {

	}

	public void moveDownLeft() {

	}

	public void moveDownRight() {

	}

	public void doNothing() {
		// TODO - implement Mobile.doNothing
		throw new UnsupportedOperationException();
	}

	protected void die() {
		// TODO - implement Mobile.die
		throw new UnsupportedOperationException();
	}

	public Boolean isDead() {
		// TODO - implement Mobile.isDead
		throw new UnsupportedOperationException();
	}

	public IMap getMap() {
		return this.map;
	}

	public void setHasMoved() {
		// TODO - implement Mobile.setHasMoved
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nextXPosition
	 * @param nextYPosition
	 */
	public void checkNextPosition(int nextXPosition, int nextYPosition) {
		// TODO - implement Mobile.checkNextPosition
		throw new UnsupportedOperationException();
	}

}