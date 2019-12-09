public class EpamArmenia {
    public EpamEmployee[] employees;
    public int numberOfEmployees;
    public String location;
    public String features;

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

    public void showEmployeeNames() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ". " + employees[i].getFullName());
        }
    }

    public EpamEmployee getByFullName(String fullName) {
        for (EpamEmployee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                return employee;
            }
        }
        return null;
    }

    public int numberOfEmployees() {
        return employees.length;
    }

    //Shows How many people came from the same town
    public void demographics() {
        String[] arr = new String[numberOfEmployees()];
        int arrIndex = 0;
        int count = 0;
        boolean sameHomeTown = false;
        for (int i = 0; i < employees.length; i++) {
            for (int j = i; j < employees.length; j++) {
                for (String a : arr) {
                    if (employees[i].getHometown().equals(a)) {
                        sameHomeTown = true;
                        break;
                    } else {
                        arr[arrIndex++] = employees[i].getHometown();
                        sameHomeTown = false;
                    }
                }
                if (!sameHomeTown) {
                    break;
                }
                count++;
            }
            System.out.println(arr[arrIndex] + " :" + count);
            count = 0;
        }
    }
}

