public class EpamArmenia {
    public EpamEmployee employees[];
    public int numberOfEmployees;
    public String location;
    public  String features;

    public EpamArmenia(EpamEmployee[] employees, int numberOfEmployees, String features) {
        this.employees = employees;
        this.numberOfEmployees = numberOfEmployees;
        this.location = "Elite Plaza business center";
        this.features = features;
    }

    public EpamEmployee[] getEmployees() {
        return employees;
    }

    public void setEmployees(EpamEmployee[] employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
}
