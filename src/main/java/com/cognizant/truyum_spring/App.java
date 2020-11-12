package com.cognizant.truyum_spring;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.truyum.model.MenuItem;
/**
 * 
 * @author Priyanka Nath
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AppliactionContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
        List<MenuItem> menuItem=ctx.getBean("menuItem");
    }
}
