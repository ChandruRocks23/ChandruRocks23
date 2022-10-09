class Home
{
public static void main(String[] args) // args
{
Home home = new Home(); 
double amount = home.read_eb(100); //300.0
System.out.println("EB Reading amount "+ amount);
System.out.println("In Line 8 "+ amount);
return; 
}
double read_eb(int consumed_units)
{   // Execute
float units = 150.8f; 
System.out.println("In Line 14 "+ units); 
float amount = (float)units * 2; //Type Casting: 
System.out.println("You have to pay "+ amount);
return units; 
}

}


