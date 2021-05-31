package com.example.menu;

import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;

@EnableWs
@Configuration
@ComponentScan
public class MenuConfiguracion extends WsConfigurerAdapter {
    @Bean
    public XsdSchema menuSchema() {
        return new SimpleXsdSchema(new ClassPathResource("menu.xsd"));
    }

    @Bean

    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext)

    {

        MessageDispatcherServlet servlet = new MessageDispatcherServlet();

        servlet.setApplicationContext(applicationContext);

        servlet.setTransformWsdlLocations(true);

        return new ServletRegistrationBean(servlet, "/ws/*");

    }

    @Bean(name = "menu")

    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema menuSchema)

    {

        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();

        wsdl11Definition.setPortTypeName("menuPort");

        wsdl11Definition.setLocationUri("/ws/menu");

        wsdl11Definition.setTargetNamespace("http://tell.me/menu");

        wsdl11Definition.setSchema(menuSchema);

        return wsdl11Definition;
    }

}