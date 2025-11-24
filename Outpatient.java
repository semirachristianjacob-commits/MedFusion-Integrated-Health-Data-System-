

public class Outpatient extends Patient {
    private String appointmentDate;

    public Outpatient (String id, String name, int age, String diagnosis, String appointmentDate) {
        super(id, name, age, diagnosis);
        this.appointmentDate = appointment Date;
    }

    public void showInfo() {
        System.out.println("[Outpatient]");
        System.out.println("ID: " + getId());
        System.out.println("Name: + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Appointment Date: + appointmentDate);
    }

  }


