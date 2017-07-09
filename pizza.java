class pizza
{
public static void main (String[] args)
{
	int d;
Scanner s = new Scanner(System.in);
System.out.println("enter the day (0-6):");
d=s.nextInt();
switch(d)
{
case 0:
System.out.println("Free Personal Pizza on purchase of medium Pizza");
break;
case 1:
System.out.println("\nRs.101 OFF on a bill of Rs.400 and above");
break;
case 2:
System.out.println("\nFree Plain Garlic Bread on another medium pizza");
break;
case 3:
System.out.println("\nBuy 1 Get 1 Free on any medium pizza");
break;
case 4:
System.out.println("\nBuy any medium pizza and get 50% off on another medium pizza");
break;
case 5:
System.out.println("\nTastiest pizza 20% off on bill of Rs.399 or above");
break;
case 6:
System.out.println("\nGet Together Offer Free Garlic Bread and Dip on a min bill of Rs.350");
break;
}