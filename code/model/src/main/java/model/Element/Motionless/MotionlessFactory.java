package model.Element.Motionless;

import java.util.*;

public abstract class MotionlessFactory {

	private ArrayList<MotionlessElement> motionlessElements;
	private static WallH wallH = new WallH();
	private static WallV wallV = new WallV();
	private static OpenedDoor openedDoor = new OpenDoor();
	private static ClosedDoor closedDoor = new ClosedDoor();
	private static Purse purse = new Purse();
	private static CrystalBall crystalBall = new CrystalBall();
	private static Intersection intersection = new Intersection();

	public static MotionlessElement createWallH() {
		// TODO - implement MotionlessFactory.createWallH
		throw new UnsupportedOperationException();
	}

	public static MotionlessElement createWallV() {
		// TODO - implement MotionlessFactory.createWallV
		throw new UnsupportedOperationException();
	}

	public static MotionlessElement createOpenDoor() {
		// TODO - implement MotionlessFactory.createOpenDoor
		throw new UnsupportedOperationException();
	}

	public static MotionlessElement createClosedDoor() {
		// TODO - implement MotionlessFactory.createClosedDoor
		throw new UnsupportedOperationException();
	}

	public static MotionlessElement createPurse() {
		// TODO - implement MotionlessFactory.createPurse
		throw new UnsupportedOperationException();
	}

	public static MotionlessElement createCrystalBall() {
		// TODO - implement MotionlessFactory.createCrystalBall
		throw new UnsupportedOperationException();
	}

	public static MotionlessElement createIntersection() {
		// TODO - implement MotionlessFactory.createIntersection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fileSymbol
	 */
	public static MotionlessElement getFromFileSymbol(char fileSymbol) {
		// TODO - implement MotionlessFactory.getFromFileSymbol
		throw new UnsupportedOperationException();
	}

}