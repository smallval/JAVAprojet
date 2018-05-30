package model.Element;

public class Sprite {

	private Image image;
	private String imageName;
	private char consoleImage;
	private boolean imageLoaded;

	/**
	 * 
	 * @param character
	 * @param imageName
	 */
	public Sprite(char character, String imageName) {
		// TODO - implement Sprite.Sprite
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param character
	 */
	public Sprite(char character) {
		// TODO - implement Sprite.Sprite
		throw new UnsupportedOperationException();
	}

	public Image getImage() {
		return this.image;
	}

	/**
	 * 
	 * @param image
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	public String getImageName() {
		return this.imageName;
	}

	/**
	 * 
	 * @param imageName
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public char getConsoleImage() {
		return this.consoleImage;
	}

	/**
	 * 
	 * @param consoleImage
	 */
	public void setConsoleImage(char consoleImage) {
		this.consoleImage = consoleImage;
	}

	/**
	 * 
	 * @param isImageLoaded
	 */
	public void setImageLoaded(boolean isImageLoaded) {
		this.imageLoaded = isImageLoaded;
	}

	public void loadImage() {
		// TODO - implement Sprite.loadImage
		throw new UnsupportedOperationException();
	}

	public boolean isImageLoaded() {
		return this.imageLoaded;
	}

}