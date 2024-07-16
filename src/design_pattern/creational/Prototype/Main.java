package design_pattern.creational.Prototype;

public class Main {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        // april batch
        Student aprBatch = new Student();
        aprBatch.setBatchName("apr-batch-2024");
        aprBatch.setAvgPSP(80.8);
        aprBatch.setYearOfEnrollment(2024);
        // save to registry
        registry.put("apr-batch-2024", aprBatch);

        // may batch
        Student mayBatch = new Student();
        mayBatch.setBatchName("may-batch-2024");
        mayBatch.setAvgPSP(70.8);
        mayBatch.setYearOfEnrollment(2024);
        registry.put("may-batch-2024", mayBatch);

        Student MarBatch = new Student();
        MarBatch.setBatchName("Mar-batch-2024");
        MarBatch.setAvgPSP(90.8);
        MarBatch.setYearOfEnrollment(2024);
        registry.put("Mar-batch-2024", MarBatch);


        Student aprBatchStudent1 = registry.get("apr-batch-2024").clone();
        Student mayBatchStudent2 = registry.get("may-batch-2024").clone();

        System.out.println(aprBatchStudent1);
        System.out.println(mayBatchStudent2);
    }
}
