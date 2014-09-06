package com.java.dao;

import java.util.List;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.SessionBuilder;
import org.hibernate.cfg.AnnotationConfiguration;

public class ProductDAO {
	
	SessionFactory factory = new AnnotationConfiguration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
	
	Session session = factory.openSession();
	
	Transaction trans = session.beginTransaction();
	
	public List<Product> getProducts()
	{
	
		Criteria cr = session.createCriteria(Product.class);
		return cr.list();
	}

}
