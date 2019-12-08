import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    static boolean continueTheProgram = true;

    public static String getInput() {
        //Ask the user for the name of employee and keep it in a string
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("quit")){
            continueTheProgram = false;
        }
        return input;
    }

    public static void showEmployeeNamesMenu(EpamArmenia epam) {
        System.out.println("Here are some epam employees");
        epam.showEmployeeNames();
        System.out.println();
        System.out.println("Please enter the full name of epam employee");
        //Show all the names of epam employees
        //ask the user to enter the name he wants to search

    }

    public static void showMenu() {
        System.out.println("What info would you like to search about him?");
        System.out.println("hometown");
        System.out.println("topSkills");
        System.out.println("favoritePhrase");
        System.out.println("University");
        System.out.println("Lecturing subject");
        System.out.println("workingInEpam");
        System.out.println("Birthday");
    }

    public static EpamEmployee[] instantiateObjects() {
        //add all employee info
        //store employees in the epamEmployees array
        //instantiate EpamArmenia class
        EpamEmployee[] employees = new EpamEmployee[5];

        employees[0] = new EpamEmployee("Narek Musakhanyan", "Goris",
                "Java, JavaScript, JavaServer Faces", " ",
                "Version control with Git", "since August 2017",
                "YSU", "");

        employees[1] = new EpamEmployee("Edik Mkoyan", "Gyumri",
                "Linux, Python, Networking", "Tak vot",
                "Data Networking for developers", "since July 2019", "SEUA", "Jan 27");

        employees[2] = new EpamEmployee("Hayk Sargsyan", "Yerevan",
                "Java Script, NodeJs, Angular", "",
                "SEUA", "Web Technologies", "since February 2019", "Oct 4");

        employees[3] = new EpamEmployee("Artem Sukiasyan", "yerevan",
                "SoftwareDevelopement, Web Applications", "",
                "Java", "since May 2019", "SEUA", "June 17");

        employees[4] = new EpamEmployee("Artur Arutuynyan", "Yerevan",
                "Java, Linux", "By the way",
                "Java", "since August 2019",
                "AUA, Yerevan state conservatory after Komitas, Yerevan Northern University", "");

        return employees;
    }

    public static void main(String[] args) {
        int index;
        boolean breakLoop = false;
        EpamEmployee[] employees = instantiateObjects();

        EpamArmenia epam = new EpamArmenia(employees, 5, "Some features");
        while (continueTheProgram){
            EpamEmployee employee = null;
            boolean validName = false;
            System.out.println("To exit the application type quit");
            while (!validName) {
                showEmployeeNamesMenu(epam);//then it goes to getInput and now we have input
                scanner = new Scanner(System.in);
                String fullName = getInput();
                if (fullName.equals("quit")){
                    breakLoop = true;
                    break ;
                }
                employee = epam.getByFullName(fullName);
                if (employee == null) {
                    System.out.println("Employee with the full name " + fullName + " was not found");
                    System.out.println("Please type valid name");
                } else {
                    validName = true;
                }
            }
            if (breakLoop){
                break;
            }
            showMenu();
            String infoType = getInput();
            if (infoType.equals("quit")){
                break;
            }
            showInfo(infoType, employee);
        }
    }

    //Show what info we can show, enumerating it with (a,b,c)
    //ask the user for a letter
    //add a switch with the user input for info type as argument
    //show output for that input
    public static void showInfo(String choice, EpamEmployee employee) {
        switch (choice) {
            case ("hometown"):
                System.out.println(employee.getHometown());
                break;
            case ("topSkills"):
                System.out.println(employee.getTopSkills());
                break;
            case ("favoritePhrase"):
                System.out.println(employee.getFavoritePhrase());
                break;
            case ("University"):
                System.out.println(employee.getUniversity());
                break;
            case ("Lecturing subject"):
                System.out.println(employee.getLecturingSubject());
                break;
            case ("workingInEpam"):
                System.out.println(employee.getWorkingInEpam());
                break;
            case ("Birthday"):
                System.out.println(employee.getBirthday());
                break;
            default:
                System.out.println("No such info about "+employee.getFullName());
                break;
        }
    }
}
