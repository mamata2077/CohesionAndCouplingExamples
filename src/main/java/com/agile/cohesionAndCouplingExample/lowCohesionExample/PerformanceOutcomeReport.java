package com.agile.cohesionAndCouplingExample.lowCohesionExample;
//Low cohesion class where all operations are carried out in a single class and is difficult to maintain 
public class PerformanceOutcomeReport {

    public void connectToDatabase(){
        System.out.println("Connected with DB successfully");
    }

    public void generateOutcomeReport(){
        System.out.println("outcome report generated");
    }

    public void saveToFile(){
        System.out.println("Report saved to file");

    }

    public void print(){
        System.out.println("report printed");
    }
    
    public static void main(String args[]){
        PerformanceOutcomeReport report = new PerformanceOutcomeReport();
        report.connectToDatabase();
        report.generateOutcomeReport();
        report.saveToFile();
        report.print();

    }
}