package overloadingoverridingdemo;

/*
 * Overloading a method refers to methods with same name and different number of parameters
 * 
 * */
public class Overloadingdemo {
	
	//Here I declare a method to display my name with one parameter
	 public void display(String name)
	    {
	         System.out.println("In first method named display with one parameter " + name);
	    }
	 
	 //Here I overload the same method give it different number of parameters
	    public void display(String name, int age)  
	    {
	         System.out.println("In second method named display with two parameters "+ name+" "+age);
	    }

}
