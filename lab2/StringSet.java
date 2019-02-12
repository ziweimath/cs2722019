
public class StringSet {
	private int capacity;
	private int size=0;
	private String[] data;
	
/**
* #2 Test no argument constructor	
**/
	
	public StringSet() {
		capacity = 2;
		data = new String[capacity];
	}
/**
 * #3 Test on 1 argument constructor, given capacity
 * 
 */
	public StringSet(int _capacity) {
		capacity = _capacity;
		data = new String[capacity];
	}
	
/**
 * #4 copy constructor
 * @param args
 */
	public StringSet(Object obj) {
		if (obj != null && obj instanceof StringSet)
		{
			StringSet obj_StringSet = (StringSet) obj;
			capacity = obj_StringSet.capacity;
			size = obj_StringSet.size;
			data = new String[capacity];
			for(int i =0; i < obj_StringSet.capacity;i++) {
				data[i]= obj_StringSet.data[i];
			}
		}
	}
/**
	 *  #5 return the actual number of elements in this collection
	 * @param args
	 * 
*/
		public int size() {
			int temp=0;
			for (int i=0;i<this.capacity;i++) {
				if (this.data[i]!=null) temp++;
			}
			return temp;
		}
	
	
/**
 *  #6 return the actual number of elements in this collection
 * @param args
 */
	public int capacity() {
		return capacity;
	}

/**
 * # 7 add method
 * @param args
 */
	public void add (String a) {
		if (a!=null) {
			if(this.size()<this.capacity()) 
				for (int i=0; i<this.capacity;i++) {
					if (this.data[i]==null) {
						this.data[i]=a;
						break;
					}
				}
			this.size++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test the no-argument constructor
		StringSet S1 = new StringSet();
		System.out.println("Test the no-argument constructor. \n S1 is " + S1 );
		
		
		// Test the 1 argument constructor
		StringSet S2 = new StringSet(5);
		System.out.println("Test the 1-argument constructor. \n S2 is " + S2.data.length );
		// Test the copy constructor
		
		StringSet S3 = new StringSet(S1);
		StringSet S4 = new StringSet(S2);
		System.out.println("Test the no-argument constructor. \n S3 is " + S3.capacity );
		System.out.println("Test the no-argument constructor. \n S4 is " + S4.capacity );
		
		// Test the size method
		System.out.println("Test the no-argument constructor. \n S4 is " + S4.size() );
		
		// Test the capacity method
		System.out.println("Test the no-argument constructor. \n S4 is " + S4.capacity() );
		
		// Test the add method
		S4.add("Adams");
		S4.add("Eve");
		System.out.println("Test the no-argument constructor. \n S4 is " + S4.size());
	}
		
}
