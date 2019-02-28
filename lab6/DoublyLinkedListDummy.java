
	/*
	 * #1 Define the DoublyLinkedListDummy class
	 */

public class DoublyLinkedListDummy{
	private DIntNode  head;  
	private DIntNode tail;  
	
	
	/*
	 * #2 getter, setter methods for head, tail of this doubly linked list. 
	 */
	public DIntNode getHead() {
		return head;
	}
	
	 public DIntNode getTail() {
		 return tail;
	 }

	 public void setHead(DIntNode node) {
		 head = node;
	 }

	 public void setTail(DIntNode node) {
		 tail = node;
	 }
	 
	 /*
	  * #3 The no-argument constructor
	  */
	 public DoublyLinkedListDummy() {
			head = new DIntNode(0,null,null);
			tail = new DIntNode(0,null,null);
			head.setNext(tail);
			tail.setPrev(head);
		}
	 
	 /*
	  * #4 The add method
	  */
	 public void addEnd(int element) {
		 DIntNode newNode = new DIntNode(element,null,null);
		 //this.setTail(newNode);
		 newNode.setPrev(tail.getPrev());
		 tail.getPrev().setNext(newNode);
		 newNode.setNext(tail);
		 tail.setPrev(newNode);
		 //this.setHead(newNode);
		 
	 }
	 /**
	  * #5 The removeFromHead method
	  * 
	  * 
	  */
	 public void removeFromHead() {
		 
		 head.getNext().getNext().setPrev(head);
		 head = head.getNext();
	 }
	 
	 /**
	  * #6 toString method
	  * 
	  */
	 public String toString() {
		 String allValues = Integer.toString(getHead().getData());
         DIntNode pointer = head.getNext();
         while (pointer.getNext()!=null) {
             allValues = allValues + "<->" + pointer.getData();
             pointer = pointer.getNext();
         }
         
         String allValues1 = Integer.toString(getTail().getPrev().getData());
         DIntNode pointer1 = tail.getPrev().getPrev();
         while (pointer1.getPrev()!=null) {
             allValues1 = allValues1 + "<->" + pointer1.getData();
             pointer1 = pointer1.getPrev();
         }
         String allValues2 ="\nForward "+allValues +"\nBackward "+ allValues1; 
         return allValues2;  
	 }
	 
	 /**
	  * #7 countOccurrence method
	  *
	  */
	 public int countOccurence(int e) {
		int answer = 0;
		DIntNode pointer = head;
		while (pointer.getNext()!=null) {
			if (pointer.getData()==e) {
				answer++;
				pointer = pointer.getNext();
			}
		}
		 
		 return answer;
		 
	 }
}
