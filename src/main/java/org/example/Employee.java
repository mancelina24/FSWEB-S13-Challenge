package org.example;
import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private  String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlan(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name){
        if (healthPlans == null) {
            System.out.println("Health plans array is not initialized.");
            return;
        }
        if (index >= 0 && index < healthPlans.length) {
            if (healthPlans[index] == null) {
                healthPlans[index] = name;
                System.out.println(name + " health plan added at index " + index);
            } else {
                System.out.println("Index " + index + " is already filled with " + healthPlans[index]);
            }
        } else {
            System.out.println("Invalid index: " + index + ". Index out of bounds for health plans array.");
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
