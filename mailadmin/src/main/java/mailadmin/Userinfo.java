
package mailadmin;
import java.util.*;
public class Userinfo {
    




    private String firstName;
    private String lasttName;
    private String department;
    
    
    
    
    
    
    // recieve first&last name through constructor
    public Userinfo(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lasttName=lastName;
        System.out.println("your email is:" + firstName+lastName+"@gmail.com");
        this.department = setDepartment();
        System.out.println("Department is" +  this.department);
    }
    
    //department choices
    
    private String setDepartment()
    {
    System.out.print("choose department\n1 development\n2 finance\n3 sales");
    Scanner sc = new Scanner(System.in);
    int dep = sc.nextInt();
    if(dep==1)
    {
        return "development";
    }
    else if(dep==2)
    {
        return "finance";
    }
    else if(dep==3)
    {
        return "sales";
    }
    else
    {
        return "none";
    }
}
}

