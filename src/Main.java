import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerFind customerFind= new CustomerFind();
        while (true){
            System.out.println("Select option \n"+
                    "1.Add\n"+
                    "2.Find\n"+
                    "3.Delete \n");
            Scanner sc = new Scanner(System.in);
            int menu= sc.nextInt();
            if (menu==1){
                sc= new Scanner(System.in);
                String name=sc.nextLine();
                String surname= sc.nextLine();
                String fincode = sc.nextLine();
                String job = sc.nextLine();
                Customer customer = new Customer();
                customer.setName(name);
                customer.setSurname(surname);
                customer.setFinCode(fincode);
                customer.setJob(job);
                customerFind.saveCustomer(customer);

            } else if (menu==2) {
                sc = new Scanner(System.in);
                String fincode = sc.nextLine();
                customerFind.customersfindall();


            } else if (menu ==3) {
                sc = new Scanner(System.in);
                String fincode = sc.nextLine();
                customerFind.deleteFincode(fincode);


            }


        }


    }
}