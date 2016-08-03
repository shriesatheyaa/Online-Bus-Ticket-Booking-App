/**
 * 
 */
package com.i2i.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.i2i.exception.DatabaseException;
import com.i2i.model.Route;

/**
 * <p>Dao which permits all tasks related to Route related database tasks using Hibernate.
 * </p>
 * @author Shrie Satheyaa
 * @created 2016-08-01
 */
@Repository("routeDao")
public class RouteDao extends GenericDao {
	
	/**
     * <p>
     * Retrieves a specific Route record from the database.
     * </p>
     *
     * @param sourceCityName 
     *     Name of the source city of the route which is to be retrieved. 
     * 
     * @param destinationCityName 
     *     Name of the destination city of the route which is to be retrieved. 
     *     
     * @throws DatabaseException 
     *     If there is any interruption occurred in the database.
     */
	public List<Route> retrieveRoute (String sourceCityName, String destinationCityName) throws DatabaseException {
		Route route = null;
        Session session = createSession();
        Transaction transaction = null;
        List<Route> routes = null;
        try{
            transaction = session.beginTransaction();
            String hql = "FROM " + Route.class.getName() + " route WHERE route.sourceCity.name =:sourceCityName "+
                          "and route.destinationCity.name =:destinationCityName";
            Query query = session.createQuery(hql);
            query.setParameter("sourceCityName", sourceCityName);
            query.setParameter("destinationCityName", destinationCityName);
            routes = query.list();
            transaction.commit();
        } catch (HibernateException e) {
            throw new DatabaseException("Some problem occured while retrieving route records with "+
                                        sourceCityName +" and "+ destinationCityName + " records", e);
        }
        return routes;
	}
}
