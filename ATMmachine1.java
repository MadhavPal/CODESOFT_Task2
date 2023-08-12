import java.util.Scanner;
class ATMmachine1 extends userbankaccount
{   
     public void withdraw(double amount)
    {
        if(amount<=accountbalance)
        {
             accountbalance=accountbalance-amount;
             System.out.println("Amount is withdrawl");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void deposit(double amount)
    {   
        accountbalance=accountbalance+amount;
        System.out.println("Amount is deposited");
    } 
    public void checkBalance()
    {
        System.out.println("Your Current Balance is "+accountbalance);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 for withdraw, 2 for depositing, 3 for checkBalance");
        int n=sc.nextInt();
        System.out.println("Enter the amount");
        double amount=sc.nextDouble();
        ATMmachine1 at= new ATMmachine1();
        switch(n)
        {
            case 1:
            at.withdraw(amount);
            break;
            case 2:
            at.deposit(amount);
            break;
            case 3:
            at.checkBalance();
            break;
            default:
            System.out.println("Invalid choice");
        }  
    }
}
class userbankaccount
{
      double accountbalance=100000;
}

