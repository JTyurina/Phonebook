import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    private static HashMap<String, ArrayList> phbook;

    public static HashMap<String, ArrayList> getPhbook() {
        return phbook;
    }

    public static void setPhbook() {
        Phonebook.phbook = new HashMap<String, ArrayList>();
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("+8 800 2000 500");
        arr1.add("+8 800 200 600");

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("+8 800 2000 700");

        ArrayList<String> arr3 = new ArrayList<String>();
        arr3.add("+8 800 2000 800");
        arr3.add("+8 800 2000 900");
        arr3.add("+8 800 2000 000");

        phbook.put("Иванов И.И.", arr1);
        phbook.put("Петров П.П.", arr2);
        phbook.put("Сидоров С.С.", arr3);
    }


    public Phonebook() {
        setPhbook();
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phbook = phonebook.getPhbook();
        System.out.println("Введите ФИО абонента:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        if (phbook.containsKey(name)) {
            ArrayList<String> phoneNumb = phbook.get(name);
            for (String elem : phoneNumb) {
                System.out.println(elem + ";");
            }
        } else {
            System.out.println("Абонент не найден в базе");
        }

    }
}




