
class AccountTest

{

int acc_no;

String name; double balance; void getdata(int a, String b, double d)

{

acc_no=a;

name=b; balance=d;

} void putdata()

System.out.println("Account no is "+acc_no); System.out.println("Name is "+name);

System.out.println("Balance is "+balance);

}

public static void main(String args[])

{

AccountTest x=new AccountTest(); x.getdata(1, "Sohan", 1000); x.putdata();


}
