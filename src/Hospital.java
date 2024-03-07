public class Hospital {

    private Doctor doctor;
    private Patient patient;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital Details:");
        if (doctor != null) {
            doctor.displayDetails();
        } else {
            System.out.println("Doctor not assigned yet.");
        }
        if (patient != null) {
            patient.displayDetails();
        } else {
            System.out.println("Patient not admitted yet.");
        }
    }
}
