package model;

/**
 * <h1>The Interface IModel.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

	/**
	 * Gets the example by id.
	 * @param id the id
	 * @return the example by id
	 * @throws SQLException the SQL exception
	 */
	String getMapById(int id) throws java.sql.SQLException;

}