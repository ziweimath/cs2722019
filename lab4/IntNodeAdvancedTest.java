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
		System.out.println("Before reverse myList2 is "+ myList2);
		System.out.println("Before reverse myList2 is "+ myList2.getValue());
		IntNode newNode = new IntNode(myList2.getValue(),null);
		IntNode newNode1 = new IntNode(1,newNode);
		System.out.println("The newNode has value is " + newNode.getValue());
		System.out.println("The newNode1 is " + newNode1);
		newNode1.addToEnd(5);
		newNode1.addToEnd(10);
		System.out.println("The newNode2 is "+ newNode1);
		System.out.println("The newNode3 is "+ newNode1);
		//IntNode newNode3 = IntNode.reverse(newNode2);
		//System.out.pritnln("The reversed newNode2 is " + newNode3); 
		//int leng = IntNode.listLength(newNode3);
		//System.out.println("The length of newNode3 is "+ leng);
		//IntNode lastplace = IntNode.listPosition(newNode3, 4);
		//System.out.println("The lastplace point to the value is " + lastplace.getValue());
		System.out.println("The reversed newNode1 is "+ IntNode.reverse(newNode1));
		System.out.println("The reversed newNode1 is "+ IntNode.reverse(newNode1.getLink()));
		System.out.println("The reversed newNode1 is "+ IntNode.reverse(newNode1.getLink().getLink()));
		
		
		
		
		
	}
		
}

