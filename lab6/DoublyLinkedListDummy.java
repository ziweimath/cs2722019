
	/*
	 * #1 Define the DoublyLinkedListDummy class
	 */

public class DoublyLinkedListDummy {
	private DIntNode head;
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
			head = new DIntNode();
			tail = new DIntNode();
			head.setNext(tail);
			tail.setPrev(head);
		}
	 
	 /*
	  * #4 The add method
	  */
	 public void addAfter(DIntNode v, int element) {
		 DIntNode newNode = new DIntNode(element,null,null);
		 newNode.setPrev(v);
		 DIntNode vNext = v.getNext();
		 newNode.setNext(v.getNext());
		 vNext.setPrev(newNode);
		 v.setNext(newNode);
		 
	 }
}
