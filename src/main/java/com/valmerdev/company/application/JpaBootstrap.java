package com.valmerdev.company.application;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaBootstrap  {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("orderManagementPU");
        System.out.println("EntityManagerFactory criado com sucesso: " +emf);
        emf.close();
    }
}
