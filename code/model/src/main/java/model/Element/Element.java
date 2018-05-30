package model.Element;

import Contract.*;

public abstract class Element implements IElement {

	private Permeability permeability;
	private Sprite sprite;

	/**
	 * 
	 * @param sprite
	 * @param permeability
	 */
	public Element(Sprite sprite, Permeability permeability) {
		// TODO - implement Element.Element
		throw new UnsupportedOperationException();
	}

	public Sprite getSprite() {
		return this.sprite;
	}

	/**
	 * 
	 * @param sprite
	 */
	protected void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	public Permeability getPermeability() {
		return this.permeability;
	}

	/**
	 * 
	 * @param permeability
	 */
	private void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	public Image getImage() {
		// TODO - implement Element.getImage
		throw new UnsupportedOperationException();
	}

}