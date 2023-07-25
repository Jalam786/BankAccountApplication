

package bankaccountapplication;
//import java.lang.String;

public abstract class Account implements IntRate {
    
    static int index=10000;
      // common properties that will inherit to both savings and checking accounts
    String name;
    String sSN;
    double balance;
    
    String accountNumber;
 
    
    
    
   // constructor to initialize common properties of both accounts
    
    public Account(String name,String sSN,double initDeposit)
    {
    
    this.name =name;
    this.sSN=sSN;
    balance = initDeposit;
    
    //set account num of 11 digits 
    index++;
    
    this.accountNumber=setAccNum();
}
    
private String setAccNum()
{
    String last2sSN= sSN.substring(sSN.length()-2,sSN.length());
    int uniqueId=index;
    int random = (int) (Math.random()*Math.pow(10,3));
    return last2sSN+uniqueId+random;
}
}
