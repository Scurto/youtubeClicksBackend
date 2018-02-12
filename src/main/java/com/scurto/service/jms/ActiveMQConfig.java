package com.scurto.service.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import javax.jms.Queue;

/**
 * Created by scurto on 13.02.2018.
 */
@Configuration
@EnableJms
public class ActiveMQConfig {

    @Bean
    public Queue queue() {
        ActiveMQQueue mqQueue = new ActiveMQQueue("memory.queue");
        return mqQueue;
    }

//    @Bean
//    public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connectionFactory,
//                                                    DefaultJmsListenerContainerFactoryConfigurer configurer) {
//        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//        // This provides all boot's default to this factory, including the message converter
//        configurer.configure(factory, connectionFactory);
//        // You could still override some of Boot's default if necessary.
//        return factory;
//    }

    @Bean // Serialize message content to json using TextMessage
    public MessageConverter jacksonJmsMessageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }

    @Bean
    public JmsTemplate jmsTemplate(){
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(connectionFactory());
        template.setMessageConverter(jacksonJmsMessageConverter());
//        template.setSessionAcknowledgeMode(Session.AUTO_ACKNOWLEDGE);


        return template;
    }

    @Bean
    public ActiveMQConnectionFactory connectionFactory(){
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("vm://embedded?broker.persistent=false,useShutdownHook=false");
        connectionFactory.setPassword("admin");
        connectionFactory.setUserName("admin");

        return connectionFactory;
    }

}
