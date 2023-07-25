
package bankaccountapplication;


public class Checking extends Account {
    // checking account properties
    int debitCardNum;
    int debitCardPIN; 
    
    
    
      public Checking(String name,String sSN,double initDeposit)
    {
    super(name,sSN,initDeposit);
    accountNumber ="2" + accountNumber;
}

    private void setDebitCard()
    {
        debitCardNum =(int) (Math.random() * Math.pow(10,12)) ;
        debitCardPIN = (int) (Math.random() * Math.pow(10,4)) ;
    }
    
    
}
