package model.dao;

/**
 * <h1>The Class ExampleDAO.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class MapDAO extends AbstractDAO {

	/**
	 * The sql example by id.
	 */
	private static String sqlMapById = "{call findMapById(?)}";
	/**
	 * The id column index.
	 */
	private static int idColumnIndex = 1;
	/**
	 * The name column index.
	 */
	private static int layoutColumnIndex = 2;
	private static String mapString;

	/**
	 * Gets the example by id.
	 * @param id the id
	 */
	public static void getMapById(final int id) throws java.sql.SQLException {
		// TODO - implement MapDAO.getMapById
		throw new UnsupportedOperationException();
	}

	public static String getMapString() {
		return this.mapString;
	}

	/**
	 * 
	 * @param mapString
	 */
	public static void setMapString(String mapString) {
		this.mapString = mapString;
	}

}