package com.itheima;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) ctx.getBean("accountService");
        Account ac = accountService.findById(1);
        System.out.println(ac);
        System.out.println( "Hello World!" );
    }
}
