public class Artist extends Person {
    private String specialization;
    private int experienceYears;

    public Artist(String name, int age, String specialization, int experienceYears) {
        super(name, age);
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return super.toString() + ", specialization='" + specialization + '\'' + ", experienceYears=" + experienceYears;
    }
}