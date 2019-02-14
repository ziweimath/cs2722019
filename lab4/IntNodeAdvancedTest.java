
public class IntNodeAdvancedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntNode myList1 = new IntNode(0,null);
		IntNode myList2 = new IntNode(0,null);
		for (int i=0;i<15;i++) myList1.addNodeAfterThis(i);
		for (int i=1;i<15;i++) myList2.addToEnd(i);
		System.out.println("The new list is this " +myList1 );
		System.out.println("The new list is this " +myList2 );
		//System.out.println("There are " + IntNode.listEvenNumber(myList1)+" even numer in myList1.");
		System.out.println("The length of the list myList1 is "+IntNode.listLength(myList1));
		myList1.addToEnd(-10);
		//myList1.addToEnd(-20);
		//System.out.println("The length of the list myList1 is "+IntNode.listLength(myList1));
		//System.out.println("The last node of myList1 has value "+IntNode.listPosition(myList1, IntNode.listLength(myList1)).getValue());
		//System.out.println("If we added -10 to the end. \nThen the new list is this " +myList1 );
		for (int i=0; i <8;i++) {
			System.out.println("The sum of the last " + i + " elements in myList1 is:"+ IntNode.sumLast(myList1, i));
		}
		
		//System.out.println("The sum of the last 1 elements in myList1 is "+ IntNode.sumLast(myList1, 11));
		//System.out.println("The sum of the last 6 elements in myList1 is "+ IntNode.sumLast(myList1, 6));
		//IntNode myOddList = IntNode.copyOdd(myList1);
		System.out.println("The odd elements in myList1 is "+IntNode.copyOdd(myList1));
		System.out.println("Before reverse myList1 is "+ myList1);
		System.out.println("The reversed myList1 is "+ IntNode.reverse(myList1.getLink()));
	}
		
}
