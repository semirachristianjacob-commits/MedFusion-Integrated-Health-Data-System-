public class Inpatient extends Patient {
    private String roomNumber;

    public Inpatient(String id, String name, int age, String diagnosis, String roomNumber)
    {
        super(id, name, age, diagnosis);
        this.roomNumber = roomNumber;
    }

    public void showInfo() {
        System.out.println("[Inpatient]");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Room Number: " + roomNumber);
    }
}
