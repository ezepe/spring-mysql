package ar.keze.spring_mysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.keze.beans.Equipo;
import ar.keze.beans.Marca;
import ar.keze.dao.DAOMarcaImpl;
import ar.keze.service.ServiceEquipo;
import ar.keze.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/ar/keze/xml/beans.xml");
		ServiceMarca sMarca = (ServiceMarca) appContext.getBean("serviceMarca");
		ServiceEquipo sEquipo = (ServiceEquipo) appContext.getBean("serviceEquipo");

		
		  Equipo aEquipo = new Equipo(); 
		  aEquipo.setId(100);
		  aEquipo.setNombre("AAAA");
		  
		  sEquipo.save(aEquipo);
		  
    }
}
