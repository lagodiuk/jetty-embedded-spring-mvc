package com.sjl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	private WebServer server;
    
    public Main() {
        server = new WebServer(8000);        
    }
    
    public void start() throws Exception {
        server.start();        
        server.join();
    }
    
    public static void main(String... anArgs) throws Exception {
        // new Main().start();
    	new ClassPathXmlApplicationContext("app.xml");
    }
}
