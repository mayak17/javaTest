package com.test.javatestsv;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;

@Configuration
public class HibernateConfiguration {


        private static SessionFactory hibernateFactory;
        private Session postgresqlSession;


        @Autowired
        public HibernateConfiguration(EntityManagerFactory factory) {
            if(factory.unwrap(SessionFactory.class) == null){
                throw new NullPointerException("factory is not a hibernate factory");
            }
            if (hibernateFactory == null) {
                hibernateFactory = factory.unwrap(SessionFactory.class);
                this.postgresqlSession = hibernateFactory.openSession();
            }
        }

        private SessionFactory getHibernateFactory() {
            return hibernateFactory;
        }

        public Session getPostgresqlSession() {

            try {
                this.postgresqlSession = this.getHibernateFactory().getCurrentSession();
            } catch (HibernateException e) {
                this.postgresqlSession = this.getHibernateFactory().openSession();
            }

            return postgresqlSession;
        }
}
