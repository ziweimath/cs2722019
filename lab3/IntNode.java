public class IntNode {
			private int data;
			private	IntNode link;
		/**
		 * #2 The no argument constructor	
		 */
		public IntNode(){
			data = 0;
			link = null;
		}
		
		/**
		 * #2 The constructor with given node value and link
		 * @param args
		 */
		public IntNode(int _data, IntNode _node) {
			data = _data;
			link = _node;
		}
		
		
		/**
		 * The getValue method
		 * @return
		 */
		public int getValue() {
			return data;
		}
		
		/**
		 * The getLink method
		 * @param args
		 */
		public IntNode getLink() {
			return link;
		}
		
		/**
		 * The set value method
		 * @param args
		 */
		public void setValue(int _data) {
			data = _data;
		}
		
		/**
		 * The set link method
		 * @param args
		 */
		public void setLink(IntNode node) {
			link=node;
		}
		
		/**
		 * The method to get the number of a list
		 * @param args
		 */
		public static int listLength(IntNode head) {
			int length =1;
			IntNode pointer = head.link;
			while (pointer!=null) {
				length++;
				pointer = pointer.link;
			}
			return length;
		}
		
		
		/**
		 * toString method
		 * @param args
		 */
		public String toString() {
				String allValues = Integer.toString(getValue());
				IntNode pointer = getLink();
				while (pointer!=null) {
					allValues = allValues + "->" + pointer.getValue();
					pointer = pointer.link;
				}
				return allValues;		
		}
		
		/**
		 * #10 add a node method
		 * @param args
		 */
		public void addNodeAfterThis(int newdata) {
			IntNode newnode = new IntNode(newdata,this.link);
			this.link = newnode;
		}
		
		/**
		 * #11 search if a linked list starting with head contains a given value data
		 */
		public static boolean search(IntNode head, int data) {
			IntNode test = new IntNode(data,head);
			boolean answer = false;
			while (test.link != null) {
				if (test.data == data) {
					answer = true;
					return answer;
				}
				else
			}
		}
		
		/**
		 * #12 remove the current node method
		 * @param args
		 */
		public void removeNodeAfterThis() {
			if (link==null) link=null;
			else	this.link = this.link.link;
		}
		
		public static void main(String[] args) {
			IntNode V1 = new IntNode();
			System.out.println("The no argument constructor creates the V1 has value "+V1.data+" and the link " + V1.link+"." );
			IntNode V2 = new IntNode(0,V1);
			System.out.println("The  constructor creates the V2 has value from V1 "+V2.data+" and the link " + V2.link+"." );
			System.out.println("The  getValue method gets value from V2, the value is "+V2.getValue() );
			System.out.println("The  getLink method gets link from V2, the link is "+V2.getLink().data );
			IntNode V3 = new IntNode();
			V3.setValue(4);
			System.out.println("The  setValue method passing value 4 to V3, the value of V3 is "+V3.getValue());
			V3.setLink(V2);
			System.out.println("The  setLink method passing link V2 to V3, the link of V3 pointing to  "+V3.getLink().data);
			System.out.println("The length of the list starting from V3 is " + V3.listLength(V3));
			System.out.println("The length of the list starting from V3 is " + V2.listLength(V2));
			System.out.println("The length of the list starting from V1 is " + V1.listLength(V1));
			System.out.println("The  value of V3 is "+V3.data );
			System.out.println("The  value of V2 is "+V3.getLink().data );
			System.out.println("The  value of V1 is "+V3.getLink().getLink().data );
			System.out.println("The  value of V3 is "+V3.getValue() );
			System.out.println("The  value of V2 is "+V3.getLink().getValue() );
			System.out.println("The  value of V1 is "+V3.getLink().getLink().getValue() );
			V3.addNodeAfterThis(15);
			System.out.println("The node following V3 has value "+V3.link.data);
			System.out.println("The node following the node after V3 has value "+ V3.link.link.data);
			V3.removeNodeAfterThis();
			System.out.println("The node following V3 has value "+V3.link.data);
			System.out.println("The node following the node after V3 has value "+ V3.link.link.data);
			//	System.our.println("The value of V3 is" + V3.getValue() +"\n and the value of V2 is " + V3.getLink().data + " \n and the value of V1 is " + V2.getLink().data);
		}
}
