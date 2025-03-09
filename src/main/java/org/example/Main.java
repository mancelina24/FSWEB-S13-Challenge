package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        runProject();
    }

    public static void runProject() {
        Healthplan basicPlan = new Healthplan(1, "Basic Plan", Plan.BASIC);
        Healthplan standardPlan = new Healthplan(2, "Standart Plan", Plan.STANDARD);


        Employee employee1 = new Employee(101, "Feyza Türkay", "feza@gmail.com", "pass123", new String[3]);
        employee1.addHealthPlan(0, basicPlan.getName());
        employee1.addHealthPlan(0, standardPlan.getName()); // Dolu index mesajı
        employee1.addHealthPlan(1, standardPlan.getName());
        employee1.addHealthPlan(5, "Premium Plan"); // Geçersiz index mesajı

        // Company objesi oluşturma
        Company company1 = new Company(1001, "TechCorp", 150000, new String[5]);
        company1.setGiro(-1000); // Negatif giro değeri denemesi
        company1.addEmployee(0, "Ahmet Demir");
        company1.addEmployee(0, "Mehmet Yılmaz"); // Dolu index mesajı
        company1.addEmployee(2, "Canan Türk");
        company1.addEmployee(6, "Veli Can"); // Geçersiz index mesajı

        // Sonuçları yazdırma (toString metodu çağırımı)
        System.out.println("\n--- Healthplan Objects ---");
        System.out.println(basicPlan);
        System.out.println(standardPlan);

        System.out.println("\n--- Employee Object ---");
        System.out.println(employee1);

        System.out.println("\n--- Company Object ---");
        System.out.println(company1);

    }
}
