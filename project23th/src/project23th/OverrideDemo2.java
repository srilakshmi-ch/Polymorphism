package project23th;
import java.lang.String;
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
}
public class OverrideDemo2 {
 public static void main(String args[])
 {
	 Sports obj=new Sports();
	 System.out.println(obj.getName());
	 obj.getNumberOfTeamMembers();
	 Soccer obj1=new Soccer();
	 System.out.println(obj1.getName());
	 obj1.getNumberOfTeamMembers();
	 
 }
}
