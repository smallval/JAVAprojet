package model;

import Contract.*;
import model.dao.*;

public class Map implements IMap {

	private MapDAO mapString;
	private int width;
	private int height;
	private String[][] mapLayout;

	/**
	 * 
	 * @param getMapString
	 */
	public Map(String getMapString) {
		// TODO - implement Map.Map
		throw new UnsupportedOperationException();
	}

	public int getWidth() {
		return this.width;
	}

	/**
	 * 
	 * @param width
	 */
	private void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	/**
	 * 
	 * @param height
	 */
	private void setHeight(int height) {
		this.height = height;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public IElement getOnMapXY(int x, int y) {
		// TODO - implement Map.getOnMapXY
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param element
	 * @param x
	 * @param y
	 */
	private void setOnMapXY(IElement element, int x, int y) {
		// TODO - implement Map.setOnMapXY
		throw new UnsupportedOperationException();
	}

	public void setMobileHasChanged() {
		// TODO - implement Map.setMobileHasChanged
		throw new UnsupportedOperationException();
	}

	public Observable getObservable() {
		// TODO - implement Map.getObservable
		throw new UnsupportedOperationException();
	}

	public String[][] getMapLayout() {
		return this.mapLayout;
	}

	/**
	 * 
	 * @param mapLayout
	 */
	public void setMapLayout(String[][] mapLayout) {
		this.mapLayout = mapLayout;
	}

}