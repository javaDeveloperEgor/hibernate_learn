package com.intro;

import com.intro.entity.User;
import com.intro.persistence.HibernateUtil;
import org.hibernate.Session;

public class EnterPoint {

  public static void main(String[] args) {
    Session session = HibernateUtil.getSessionFactory().openSession();

    session.beginTransaction();
    User user = new User();

    user.setFirstName("Marfa");
    user.setLastName("Pukhat");

    session.save(user);
    session.getTransaction().commit();
  }

}
