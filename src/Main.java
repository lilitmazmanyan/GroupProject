import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    static boolean continueTheProgram = true;

    public static String getInput() {
        //Ask the user for the name of employee and keep it in a string
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("quit")) {
            continueTheProgram = false;
            System.out.println("Thanks for trying our program");
            System.out.println("Please rate our program from 1 to 10.");
            int rating = scanner.nextInt();
            switch (rating){
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Is our program so bad?  :( ");
                    break;
                case 5:
                case 6:
                    System.out.println("Thank you anyway.Bye! :|");
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("Thank you :)");
                    break;
                case 10:
                    System.out.println("WOW Thanks. :)");
                default:
                    System.out.println("Please rate us from 1 to 10 :) ");
            }
        }
        return input;
    }

    public static void showEmployeeNamesMenu(EpamArmenia epam) {
        System.out.println("Here are some EPAM employees");
        epam.showEmployeeNames();
        System.out.println();
        System.out.println("Please enter the full name of EPAM employee");
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
                "Java, JavaScript, JavaServer Faces", "Unknown",
                "YSU", "Version control with Git",
                "Since August 2017", "Unknown");

        employees[1] = new EpamEmployee("Edik Mkoyan", "Gyumri",
                "Linux, Python, Networking", "Тк вот!",
                "NPUA", "Data Networking for developers", "Since July 2019", "Jan 27");

        employees[2] = new EpamEmployee("Hayk Sargsyan", "Yerevan",
                "Java Script, NodeJs, Angular", "Unknown",
                "NPUA", "Web Technologies", "Since February 2019", "Oct 4");

        employees[3] = new EpamEmployee("Artem Sukiasyan", "Yerevan",
                "Software Developement, Web Applications", "Unknown",
                "NPUA", "Java", "Since May 2019", "June 17");

        employees[4] = new EpamEmployee("Artur Arutyunyan", "Yerevan",
                "Java, Linux", "Bye the way",
                "AUA, Yerevan State Conservatory after Komitas, Yerevan Northern University", "Java",
                "Since August 2019", "Unknown");
        return employees;
    }

    public static void main(String[] args) {
        int index;
        boolean breakLoop = false;
        EpamEmployee[] employees = instantiateObjects();

        EpamArmenia epam = new EpamArmenia(employees, 5, "Some features");
        while (continueTheProgram) {
            EpamEmployee employee = null;
            boolean validName = false;
            System.out.println("To exit the application type quit");
            while (!validName) {
                showEmployeeNamesMenu(epam);//then it goes to getInput and now we have input
                scanner = new Scanner(System.in);
                String fullName = getInput();
                if (fullName.equals("quit")) {
                    breakLoop = true;
                    break;
                }
                employee = epam.getByFullName(fullName);
                if (employee == null) {
                    System.out.println("Employee with the full name " + fullName + " was not found");
                    System.out.println("Please type valid name");
                } else {
                    validName = true;
                }
            }
            if (breakLoop) {
                break;
            }
            showMenu();
            String infoType = getInput();
            if (infoType.equals("quit")) {
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
                System.out.println("No such info about " + employee.getFullName());
                break;
        }
    }
}
