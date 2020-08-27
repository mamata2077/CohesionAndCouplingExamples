package com.agile.cohesionAndCouplingExample.highCohesionExample;

public class PerformanceOutcomeReport {
    public void generateReport(){
        System.out.println("Report generated succesfully");
    }

    public static void main(String args[]){
        ConnectToDB connectUtility = new ConnectToDB();
        connectUtility.connectToDatabase("HRDB");
        PerformanceOutcomeReport report = new PerformanceOutcomeReport();
        report.generateReport();
        PrintingUtility printUtility = new PrintingUtility();
        printUtility.print("HRPrinter");
        StorageUtility storageUtility = new StorageUtility();
        storageUtility.save("HRRecords.pdf");

    }
    
}