package arrayofobject;

import java.io.*;

public class ArrayOfObject {

    static int size = 0;
    static int main_select = 0;
    static int count = 0;
    static int rem_count=0;
    static int size_count = 0;
    static Employee[] emp = new Employee[100];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        for (int main_loop = 0; main_loop == 0;) {
            System.out.println("[1]>>Display");
            System.out.println("[2]>>Input");
            System.out.println("[3]>>Add");
            System.out.println("[4]>>Remove");
            System.out.println("[5]Exit");
            System.out.print("Enter selection: ");
            main_select = Integer.parseInt(br.readLine());
            while (main_select < 1 || main_select > 5) {
                System.out.println("[1]>>Display");
                System.out.println("[2]>>Input");
                System.out.println("[3]>>Add");
                System.out.println("[4]>>Remove");
                System.out.println("[5]Exit");
                System.out.print("Enter selection: ");
                main_select = Integer.parseInt(br.readLine());
            }
            switch (main_select) {
                case 1:
                    if (count == 0) {
                        System.out.println("input first!");
                    } else {
                        display();
                        
                    }   break;
                case 2:
                    input();
                    break;
                case 3:
                    if (size == 0) {
                        System.out.println("input first!");
                    } else {
                        add();
                    }
                     break;
                case 4:
                    if (size == 0) {
                        System.out.println("input first!");
                    } else {
                        remove();
                    }   break;
                case 5:
                    main_loop = 1;
                    break;
                default:
                    break;
            }
            main_select = 0;
        }
    }

    public static void input() throws IOException {
        main_select = 0;
        if(size_count>0){
            size = 0;
        }
        System.out.println("How_many? ");
        int many = Integer.parseInt(br.readLine());
        for (int x = 0; x < many; x++) {
            System.out.println("# "+(x+1));
            System.out.print("Enter id_number: ");
            int id_a = Integer.parseInt(br.readLine());
            System.out.print("Enter name: ");
            String n_a = br.readLine();
            System.out.print("Enter age: ");
            int ag_a = Integer.parseInt(br.readLine());
            emp[size++] = new Employee(id_a, n_a, ag_a);
        }
        count++;
        size_count++;
        
    }

    public static void display() throws IOException{
        main_select = 0;
        for (int x = 0; x < size; x++) {
            System.out.println(emp[x].toString());
        }
    }

    public static void add() throws IOException {
        main_select = 0;
        for (int x = 0; x < 1; x++) {
            System.out.print("Enter id_number: ");
            int id_a = Integer.parseInt(br.readLine());
            System.out.print("Enter name: ");
            String n_a = br.readLine();
            System.out.print("Enter age: ");
            int ag_a = Integer.parseInt(br.readLine());
            emp[size] = new Employee(id_a, n_a, ag_a);
        }
        size++;
    }

    public static void remove() throws IOException {
        main_select = 0;
        System.out.print("id_no: ");
        int id = Integer.parseInt(br.readLine());
        int index = 0;
        for (int x = 0; x < size; x++) {
            if (id == emp[x].getId()) {
                index = x;
                rem_count = 0;
            } else {
                rem_count = 1;
            }
        }
        for (int x = 0; x < size; x++) {
            emp[x] = emp[x + 1];
        }
        if(rem_count==0){
            System.out.println("files deleted!");
        }
        else{
            System.out.println("wrong input!");
        }
        size--;

    }

}
