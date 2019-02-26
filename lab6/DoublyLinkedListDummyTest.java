
public class DoublyLinkedListDummyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test how DIntNode constructor works
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
		
		
		
		
		
		
		
		
		
		
		
	}

}
