import java.util.*;

public class BankApplication
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name and id to access your account: ");
        String name = sc.nextLine();
        String id = sc.nextLine();

        Account obj = new Account(name, id);
        obj.menu();
        sc.close();
    }
}
class Account 
{
    double bal; 
    // total balance
    double prevTran;
    // to track previous transaction
    String UserName;
    String UserId;
    // pass the value of user name and id at the
    // time of instantiation
    Account(String UserName,String UserId)
    {
        this.UserName=UserName;
        this.UserId=UserId;
    }
    void deposit(double amt)
    {
        if(amt!=0)
        {
            bal+=amt;
            prevTran=amt;
        }
    }
    void withdraw(double amt)
    {
        // mimimum withdraw is 10
        if(amt>10 && bal>=amt)
        {
            bal-=amt;
            prevTran=-amt;
        }
        else
        {
            System.out.println("Bank Balance is insuffient");
        }
    }
    void preTran()
    {
        if(prevTran>0)
        {
            System.out.println("Deposited " + prevTran);
        }
        else if(prevTran<0)
        {
            System.out.println("Withdrawn " + prevTran);
        }
        else 
        {
            System.out.println("No transaction occured ");

        }
    }
    void menu()
    {
        char option;
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome " + UserName);
        System.out.println("Id: " + UserId);
        System.out.println("-------------------------");
        System.out.println("a) Check Balance ");
        System.out.println("b) Deposit Amount ");
        System.out.println("c) Withdraw Amount ");
        System.out.println("d) Previous Transaction ");
        System.out.println("e) Exit");

         do
         {
            System.out.println("---------------------");
            System.out.println("Choose an option");
            option = sc.next().charAt(0);
            switch(option)
            {
                case 'a':
                System.out.println("---------------------");
                System.out.println("Balance= " + bal);
                System.out.println("---------------------\n");
                break;
                case 'b':
                System.out.println("---------------------");
                System.out.println("Enter the amount to deposit ");
                double amt =sc.nextDouble();
                deposit(amt);
                System.out.println("---------------------\n");
                break;
                case 'c':
                System.out.println("---------------------");
                System.out.println("Enter the amount to withdraw ");
                double amtW =sc.nextDouble();
                withdraw(amtW);;
                System.out.println("---------------------\n");
                break;
                case 'd':
                System.out.println("---------------------");
                System.out.println("Previous trnsaction");
                preTran();
                System.out.println("---------------------\n");
                break;
                case 'e':
                System.out.println("---------------------\n");
                System.out.println("Thankyou Bye Bye \n");
                break;

                default:
                System.out.println("Now please! choose right option \n");



            }

         }while(option!='e');
         System.out.println("Thankyou for trying this application,Bye");
         sc.close();
    }
}