package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if(giro<0){
            System.out.println("Giro cannot be negative. Setting giro to 0.");
            this.giro=0;
        } else {
            this.giro=giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
    public void addEmployee(int index, String name) {
        if (developerNames == null) {
            System.out.println("Developer names array is not initialized.");
            return;
        }
        if (index >= 0 && index < developerNames.length) {
            if (developerNames[index] == null) {
                developerNames[index] = name;
                System.out.println(name + " added as developer at index " + index);
            } else {
                System.out.println("Index " + index + " is already filled with " + developerNames[index]);
            }
        } else {
            System.out.println("Invalid index: " + index + ". Index out of bounds for developer names array.");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
