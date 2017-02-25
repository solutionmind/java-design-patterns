package singelton.design.pattern;

import singelton.design.pattern.model.DataSource;
import singelton.design.pattern.model.Session;

public class SessionFactorySingelton implements Cloneable {
	
	private static SessionFactorySingelton sessionFactory;
	
	private static class SessionManager{
		DataSource dataSource;
		
		SessionManager(DataSource dataSource){
			this.dataSource = dataSource;
		}
		
		Session getSession(){
			if(dataSource != null){
				return new Session();
			}
			return null;
			
		}
	}
	
	public Session getSession(DataSource ds){
		SessionManager sessionManager = new SessionManager(ds);
		return sessionManager.getSession();
	}
	
	private SessionFactorySingelton(){
		
	}
	
	public static SessionFactorySingelton getSessionFactory() {
		synchronized (SessionFactorySingelton.class) {
			if (sessionFactory == null) {
				sessionFactory =  new SessionFactorySingelton();
			}
			return sessionFactory;
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 * overriding the clone to make sure same instance and no duplicate instance returned
	 */
	public SessionFactorySingelton clone(){
		return getSessionFactory();
	}

}
