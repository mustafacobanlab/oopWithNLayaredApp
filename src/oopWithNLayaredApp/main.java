package oopWithNLayaredApp;

import oopWithNLayaredApp.business.ProductManager;
import oopWithNLayaredApp.core.logging.DatabaseLogger;
import oopWithNLayaredApp.core.logging.FileLogger;
import oopWithNLayaredApp.core.logging.Logger;
import oopWithNLayaredApp.core.logging.MailLogger;
import oopWithNLayaredApp.dataAccess.JdbcProductDao;
import oopWithNLayaredApp.entities.Product;

public class main {

	
		public static void main(String[] args)	throws Exception {
			
		Product product1 = new Product(1,"IPhone Xr", 10000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);
	}

}

//JDBC
//Hibernate-ORM
//JPA
