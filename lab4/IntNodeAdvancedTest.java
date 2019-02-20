public class IntNodeAdvancedTest {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        IntNode myList1 = new IntNode(0,null);
        IntNode myList2 = new IntNode(0,null);
        IntNode myListNull = null;
        for (int i=0;i<15;i++) myList1.addNodeAfterThis(i);
        for (int i=1;i<12;i++) myList2.addToEnd(i);
        System.out.println("I created two linked list as following. \nThe new list is this " +myList1 );
        System.out.println("The new list is this " +myList2 );
        System.out.println("#1. Test the listEvenNumber method. \nThere are " + IntNode.listEvenNumber(myList1)+" even numer in myList1.");
        System.out.println("#1. Test the listEvenNumber method. \nThere are " + IntNode.listEvenNumber(myList2)+" even numer in myList2.");
        System.out.println("#1. Test the listEvenNumber method. \nThere are " + IntNode.listEvenNumber(myListNull)+" even numer in myListNull.");
        System.out.println("The length of the list myList1 is "+IntNode.listLength(myList1));
        
        System.out.println("\n#2. Test the addToEnd method. \nBefore applying addToEnd method to myList1, the list is "+myList1);
        myList1.addToEnd(-10);
        System.out.println("#2. Test the addToEnd method. \nAfter applying addToEnd method to myList1, the list is "+myList1);
        
        for (int i=0; i <8;i++) {
            System.out.println("\n#3. Test the sumLast method.\nThe sum of the last " + i + " elements in myList1 is:"+ IntNode.sumLast(myList1, i));
        }
         
        //System.out.println("\n#3. Test the sumLast method. \nThe sum of the last 1 elements in myList1 is "+ IntNode.sumLast(myList1, 11));
        //System.out.println("The sum of the last 6 elements in myList1 is "+ IntNode.sumLast(myList1, 6));
        //IntNode myOddList = IntNode.copyOdd(myList1);
        IntNode copied = IntNode.copyOdd(myList1);
        System.out.println("\n#4. Test the copyOdd method. \nThe odd elements in myList1 is "+copied);
        System.out.println("\n#4. Test the copyOdd method. \nThe odd elements in myListNull is "+IntNode.copyOdd(myListNull));
        myList1.addNodeAfterThis(1);
        myList1.addNodeAfterThis(1);
        System.out.println("The values in myList1 are "+myList1);
        System.out.println("\nTest removeAll method. \nBefore remove value 1, myList1 is "+myList1);
        IntNode remove1MyList1 = IntNode.removeAll(myList1, 1);
        System.out.println("\nAfter remove value 1, myList1 is "+remove1MyList1);
        System.out.println("\n#6. Test the reverse method. \nBefore reverse myList1 is "+ myList1);
        IntNode reverseMyList1 = IntNode.reverse(myList1);
        System.out.println("\n#6. Test the reverse method. \nAfter reverse myList1 is "+ reverseMyList1);
        System.out.println("\n#6. Test the reverse method.\nBefore reverse myList2 is "+ myList2);
        IntNode reverseMyList2 = IntNode.reverse(myList2);
        System.out.println("\n#6. Test the reverse method.\nBefore reverse myList2 is "+ reverseMyList2);
             
       IntNode a1 = new IntNode(1,null);
       IntNode a2 = new IntNode(2,a1);
       IntNode a3 = new IntNode(3,a2);
       System.out.println("The a3 is "+ a3);
       IntNode a4 = new IntNode(4,a3);
       a1.setLink(a4);
       
       System.out.println("\n#7. Test hasCycle method. \nIs there a cycle in a4 "+ IntNode.hasCycle(a4));
       System.out.println("\n#7. Test hasCycle method. \nIs there a cycle in myList1 "+ IntNode.hasCycle(myList1));       
}

