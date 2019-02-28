
public class DoublyLinkedListDummyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test how DIntNode constructor works
		DoublyLinkedListDummy newDIntNodeWD = new DoublyLinkedListDummy();
		System.out.println("The dummy head points to "+newDIntNodeWD.getTail().getData() + "\nThe dummy tail points to " + newDIntNodeWD.getHead().getData());
		DIntNode newDIntNode = new DIntNode(0,null,null);
		System.out.println("The data in thos Node is "+newDIntNode.getData()+". The prev node is "+newDIntNode.getPrev()+". The next node is "+newDIntNode.getNext());
		DIntNode newDIntNode1 = new DIntNode(1,null,null);
		DIntNode newDIntNode2 = new DIntNode(2,null,null);
		DIntNode newDIntNode3 = new DIntNode(3,null,null);
		newDIntNode.setNext(newDIntNode1);
		newDIntNode1.setNext(newDIntNode2);
		newDIntNode2.setNext(newDIntNode3);
		newDIntNode1.setPrev(newDIntNode);
		newDIntNode2.setPrev(newDIntNode1);
		newDIntNode3.setPrev(newDIntNode2);
		System.out.println(newDIntNode);
		System.out.println(newDIntNode1);
		System.out.println(newDIntNode2);
		System.out.println(newDIntNode3);
		
		// #4 add method
		newDIntNodeWD.addEnd(3);
		System.out.println("The dummy head points to "+newDIntNodeWD.getHead().getNext().getData() + "\nThe dummy tail points to " + newDIntNodeWD.getTail().getPrev().getData());
		newDIntNodeWD.addEnd(4);
		System.out.println("The dummy head points to "+newDIntNodeWD.getHead().getNext().getNext().getData() + "\nThe dummy tail points to " + newDIntNodeWD.getTail().getPrev().getData());
		// #5 removeFromHead method
		newDIntNodeWD.removeFromHead();
		System.out.println("The dummy head points to "+newDIntNodeWD.getHead().getNext().getData() + "\nThe dummy tail points to " + newDIntNodeWD.getTail().getPrev().getData());
		newDIntNodeWD.addEnd(3);
		newDIntNodeWD.removeFromHead();
		System.out.println("The dummy head points to "+newDIntNodeWD.getHead().getNext().getData() + "\nThe dummy tail points to " + newDIntNodeWD.getTail().getPrev().getData());
		//System.out.println("The dummy head points to "+newDIntNodeWD.getTail().getData() + "\nThe dummy tail points to " + newDIntNodeWD.getHead().getData());
		newDIntNodeWD.addEnd(4);
		newDIntNodeWD.addEnd(3);
		newDIntNodeWD.addEnd(1);
		newDIntNodeWD.addEnd(3);
		newDIntNodeWD.addEnd(1);
		//newDIntNodeWD.removeFromHead();
		//System.out.println("The values in this doublely linked list are "+newDIntNodeWD);
		//newDIntNodeWD.removeFromHead();
		//System.out.println("The values in this doublely linked list are "+newDIntNodeWD);
		//newDIntNodeWD.removeFromHead();
		System.out.println("The values in this doublely linked list are "+newDIntNodeWD);
		// int num = newDIntNodeWD.countOccurence(3);
		System.out.println("The number of value "+ 3 +"appering in this doublely linked is ");
		
		
		
		
		
		
	}

}
