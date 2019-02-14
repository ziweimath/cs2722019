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
			 this.link = new IntNode(newdata,this.link);
			
		}
		
		/**
		 * #11 search if a linked list starting with head contains a given value data
		 */
		public static boolean search(IntNode head, int data) {
			IntNode test = head;
			boolean answer = false;
			for(;test.getLink() !=null; test = test.getLink()) {
				if (test.getValue()==data) {
					answer = true;
					break;
				}
			}
			return answer;
		}
		
		/**
		 * #12 remove the current node method
		 * @param args
		 */
		public void removeNodeAfterThis() {
			if (this.getLink()==null) link=null;
			else	this.link = this.link.link;
		}
		
	/**
	 * Lab 4, #1 listEvenNumber method	
	 */
		public static int listEvenNumber(IntNode head) {
			int count = 0;
			IntNode curcor = head;
			while (curcor!=null) {
				if (curcor.getValue() % 2 ==0) count++;
				curcor = curcor.getLink() ;
			}	
			return count;
		}
		
	/**
	 *  Lab 4. #2 addToEnd method
	 */
		
		public static IntNode listPosition(IntNode head, int pos) {
			int index = 1;
			IntNode curcor = head;
			for(;(curcor!=null)&&(index<pos);index++) {
				curcor = curcor.link;
			}
			return curcor;
		}
		
		public void addToEnd(int newdata) {
			int length = IntNode.listLength(this);
			IntNode curcor = IntNode.listPosition(this,length);
			curcor.link = new IntNode(newdata,null); 
			
		}
		
		
		/**
		 * Lab 4. #3 sumLast method
		 */
		public static int sumLast(IntNode head, int num) {
			int sum = 0;
			int length= IntNode.listLength(head);
			if ( length > num) {
				int index = length - num ;
				IntNode curcor = IntNode.listPosition(head,index);
				curcor = curcor.link;
				for (int i = 0; i<num; i++) {
					sum = sum + curcor.data;
					curcor = curcor.link;
				}
			}
			else {
				for (int i =0; i<length; i++) {
					sum = sum + head.getValue();
					head = head.link;
				}
			}
			return sum;
		}
		
		/**
		 * Lab 4. #4 copyOdd method
		 */
		public static IntNode copyOdd (IntNode head) {
			IntNode answer =null;
			IntNode curcor = null;
			if (head != null) {
				for(curcor = head;curcor.link!=null;curcor=curcor.link) {
					if (curcor.getValue() % 2 != 0) {
						if (answer == null)
							answer = new IntNode(curcor.getValue(), null);
						else {
							answer.addToEnd(curcor.data);
						}
					}
				}
			}
			return answer;
		}
		
		/**
		 * Lab 4. #5 removeAll method
		 */
		public static IntNode removeAll(IntNode head, int e) {
			IntNode answer = null;
			for (IntNode temp = head;temp != null;temp = temp.link) {
				if (temp.getValue()!=e) {
					answer = new IntNode(temp.getValue(),temp.link);
					break;
				}
			}
			
			return null;
		}
		
		/**
		 * Lab 4. #6 reverse method
		 */		
		
		public static IntNode reverse (IntNode head) {
			int length = IntNode.listLength(head);
			IntNode lastPlace = IntNode.listPosition(head, length);
			IntNode answer = null;
			for (IntNode curcor =head; curcor!=null;curcor=curcor.link) {
				if(answer == null) answer = new IntNode(lastPlace.getValue(),null);
				answer.addNodeAfterThis(curcor.getValue());
			}
			return answer;
		}
		
		public static IntNode reverse1 (IntNode head) {
			int length = IntNode.listLength(head);
			IntNode lastPlace = IntNode.listPosition(head, length);
			IntNode answer =new IntNode(lastPlace.getValue(),null);
			for (IntNode curcor =head; curcor.link!=null;curcor=curcor.link) {
				//if(answer == null) answer = new IntNode(lastPlace.getValue(),null);
				answer.addNodeAfterThis(curcor.getValue());
			}
			return answer;
		}
}
