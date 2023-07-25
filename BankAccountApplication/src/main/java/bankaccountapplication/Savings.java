
package bankaccountapplication;


public class Savings extends Account {
    int safetyDepBoxID;
    int safetyDepBoxKey;
    
    
    
    
      public Savings(String name,String sSN,double initDeposit)
    {
    super(name,sSN,initDeposit);
    // properties specific to saving account
    accountNumber ="1" + accountNumber;
    setSafetyBox();
    
}
// method specific to saving account
    private void setSafetyBox(){
        safetyDepBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepBoxKey= (int) (Math.random() * Math.pow(10,4));
    }
}
