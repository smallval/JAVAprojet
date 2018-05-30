package model;

import Contract.*;

public class LorannModel implements ILorannModel {

	private IMap map;

	/**
	 * 
	 * @param DBLevel
	 */
	public LorannModel(List<character> DBLevel) {
		// TODO - implement LorannModel.LorannModel
		throw new UnsupportedOperationException();
	}

	public IMap getMap() {
		return this.map;
	}

	/**
	 * 
	 * @param map
	 */
	private void setMap(IMap map) {
		this.map = map;
	}

}