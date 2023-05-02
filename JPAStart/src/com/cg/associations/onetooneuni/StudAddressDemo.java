package com.cg.associations.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudAddressDemo {

	public static void main(String[] args) {
		try
		{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		/*
		 * Address a1=new Address(101, "Dipali Nagar", "Nashik", "Maharashtra",
		 * "422009");  em.persist(a1); Student s1=new
		 * Student(1,"Amol",a1); em.persist(s1);
		 */
		
		System.out.println("Student details added.....");
		int id=101;
		Address a=em.find(Address.class, id);
		if (a!=null)
		{
			a.setZipcode("422011");
			em.merge(a);
			System.out.println("Address updated...");
		}
		else
			System.out.println("can't find address");
		em.getTransaction().commit();
		em.close();
		factory.close();
		}
		catch(Exception e)
		{
			System.out.println("error occurred..."+e);
		}
	}

}

