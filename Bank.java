import java.util.*;
import java.lang.*;
import java.io.*;
public class Bank {

    public static void main(String[] args) throws IOException{
        
        String option, fName, lName, year, month, day, savingsAcc, checkingsAcc, delCustomer, creditAcc, sin, choosenSIN, checkingsBal = "none", credit = "none";
        int  age, savingsBal; 
        while (true){
            Scanner input = new Scanner(System.in);
            Scanner in = new Scanner(System.in);
            BufferedWriter bufferWriter;
            FileWriter  fileWriter;
    
    
            System.out.println("Welcome to the VP bank.");
            System.out.println("-----------------------");
            System.out.println("Please choose an action from the following: ");
            System.out.println("1: Add a customer");
            System.out.println("2: Delete a customer");
            System.out.println("3: Sort customers by last name, first name");
            System.out.println("4: Sort sustomers by SIN");
            System.out.println("5: Display customer summary (name, SIN)");
            System.out.println("6: Find profile by last name, first name");
            System.out.println("7: Find profile by SIN");
            System.out.println("8: Quit");
            System.out.print("Enter an option: ");
            option  = input.nextLine();

    
            // adding a customer
            if (option.equals("1") || option.equalsIgnoreCase("add a customer")){

                System.out.print("Enter first name: ");
                fName = input.nextLine();
                System.out.print("Enter last name: ");
                lName = input.nextLine();
                System.out.print("Enter your age: ");
                age = input.nextInt();

                do {
                    System.out.print("Enter SIN: ");
                    sin = in.nextLine();
                } while (sin.length() != 9);
                
                System.out.print("Enter year born: ");
                year = in.nextLine();
                System.out.print("Enter month born: ");
                month = in.nextLine();
                System.out.print("Enter day born: ");
                day = input.nextLine();
                day = input.nextLine();
                System.out.print("Would you like a savings account: ");
                savingsAcc = input.nextLine();
                if (savingsAcc.equalsIgnoreCase("yes")){
                    System.out.print("What is the balance in your savings account: ");
                    savingsBal = input.nextInt();
                } else {
                    savingsBal = Integer.parseInt("none");
                }
                
                if (age >= 18){
                    System.out.print("Would you like a checkings account: ");
                    checkingsAcc = input.nextLine();
                    checkingsAcc = input.nextLine();

                    if (checkingsAcc.equalsIgnoreCase("yes")){
                        System.out.print("what is the balance in your checkings account: ");
                        checkingsBal = input.nextLine();
                    }

                    System.out.print("Would you like a credit card account: ");
                    creditAcc = input.nextLine();
                    creditAcc = input.nextLine();

                    if (creditAcc.equalsIgnoreCase("yes")){
                        System.out.print("What do you want your credit card balance to be: ");
                        credit = input.nextLine();
                    } 
                }

                fileWriter = new FileWriter("Accounts.txt", true);
                bufferWriter = new BufferedWriter(fileWriter);

                bufferWriter.write("\n--------------" + "\n");
                bufferWriter.write(lName + "\n");
                bufferWriter.write(fName  + "\n");
                bufferWriter.write(sin + "\n");
                bufferWriter.write(year + "\n");
                bufferWriter.write(month + "\n");
                bufferWriter.write(day + "\n");
                bufferWriter.write(savingsBal + "\n");
                bufferWriter.write(checkingsBal + "\n");
                bufferWriter.write(credit + "\n");
                bufferWriter.write("----------------" + "\n");
                bufferWriter.close();

            }

            if (option.equals("2") || option.equalsIgnoreCase("Delete a customer")){

                System.out.println("What is the SIN of the account you want to delete: ");
                choosenSIN = input.nextLine();

                String temp = "temporary.txt";
                File old = new File("Accounts.txt");
                File newF = new File(temp);

                int line = 0;
                String cur;
                String current;
                int acc = 0;
                int y = 0;
                int stop = 0; 

                try {

                    BufferedWriter writer = new BufferedWriter(new FileWriter(temp, true));
                    PrintWriter printer = new PrintWriter(new FileWriter(temp));
                    BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"));
                    BufferedReader br = new BufferedReader(new FileReader("Accounts.txt"));

                    while ((cur = reader.readLine()) != null){

                        line++;
                        acc++;

                        if (choosenSIN.equals(cur)){
                            stop = acc;
                            System.out.println(stop);
                        }
                    }

                    while ((current = br.readLine()) != null){

                        y ++;
                        if (y > (stop + 7) || y < (stop -3)){
                            printer.println(current);
                        }
                    }

                    writer.close();
                    printer.close();
                    reader.close();
                    br.close();
                    
                    boolean del = old.delete();
                    File rename = new File("Accounts.txt");
                    boolean succ = newF.renameTo(rename);
                    
                    if (!succ){
                        System.out.println("It didn't rename");
                    }

                    if (!del){
                        System.out.println("It didn't delete");
                    }


                } catch (IOException err){
                    System.out.println("Problem reading file");
                }



            }


        
    }
}
    
}
