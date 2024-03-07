public class Doctor extends Person {

    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}
