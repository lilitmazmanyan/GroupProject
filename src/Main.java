import java.util.Scanner;

public class Main {
    public static EpamEmployee[] epamEmployees;

    public static String getInput() {
        //Ask the user for the name of employee and keep it in a string
        Scanner input = new Scanner(System.in);
        String name = input.next();
        return name;
    }

    public static void showEmployeeNamesMenu() {
        System.out.println("Here are some epam employees");
        System.out.println("Narek Musakhanyan");
        System.out.println("Edik Mkoyan");
        System.out.println("Hayk Sargsyan");
        System.out.println("Artem Sukiasyan");
        System.out.println("Artur Arutyunyan");
        System.out.println();
        System.out.println("Please enter the full name of epam employee");
        getInput();
        //Show all the names of epam employees
        //ask the user to enter the name he wants to search

    }

    public static int recognizeEmployee(String name) {
        //call getInput() and keep the string in a variable
        //search the value in the employees array
        //if there's a match return that employee's index
        //else return -1
        for (int i = 0; i < epamEmployees.length; i++) {
            if (epamEmployees[i].equals(name)) {
                return i;
            }
        }
        return -1;
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

        String choice = getInput();
        switch (choice) {
            case ("hometown"): {

                break;
            }
            case ("topSkills"): {
                // ;
                break;
            }
            case ("favoritePhrase"): {
                //  ;
                break;
            }
            case ("University"): {
                //  ;
                break;
            }
            case ("Lecturing subject"): {
                //  ;
                break;
            }
            case ("workingInEpam"): {
                //  ;
                break;
            }
            case ("Birthday"): {
                //  ;
                break;
            }

        }
        //Show what info we can show, enumerating it with (a,b,c)
        //ask the user for a letter
        //add a switch with the letter as argument
        //show output for that input
    }

    public static void instantiateObjects() {
        //add all employee info
        //store employees in the epamEmployees array
        //instantiate EpamArmenia class

        EpamEmployee Narek = new EpamEmployee("Narek Musakhanyan", "Goris",
                "Java, JavaScript, JavaServer Faces", " ",
                "Version control with Git", "since August 2017",
                "YSU", "");

        EpamEmployee Edik = new EpamEmployee("Edik Mkoyan", "Gyumri",
                "Linux, Python, Networking", "Tak vot",
                "Data Networking for developers", "since July 2019", "SEUA", "Jan 27");

        EpamEmployee Hayk = new EpamEmployee("Hayk Sargsyan", "Yerevan",
                "Java Script, NodeJs, Angular", "",
                "Web Technologies", "since February 2019", "SEUA", "Oct 4");

        EpamEmployee Artem = new EpamEmployee("Artem Sukiasyan", "yerevan",
                "SoftwareDevelopement, Web Applications", "",
                "Java", "since May 2019", "SEUA", "June 17");

        EpamEmployee Artur = new EpamEmployee("Artem Arutuynyan", "Yerevan",
                "Java, Linux", "By the way",
                "Java", "since August 2019",
                "AUA, Yerevan state conservatory after Komitas, Yerevan Northern University", "");


    }

    public static void main(String[] args) {
        boolean continueTheProgram = true;
        int index;

        showEmployeeNamesMenu();//then it goes to getInput and now we have input
        recognizeEmployee(getInput());


        showMenu();
    }
}
