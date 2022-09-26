import java.util.NoSuchElementException;
/**
 * Takes input value passes to SalesItem, enqueues it and calculates the total value
 * and prints the whole Saleslist.
 * 
 * @author Aman Bhatnagar
 * 
 * @version 1.0
 */


public class SalesSlip {
	private SalesItem head;
	private SalesItem tail;
	double mul = 0;
	double sum_total = 0;
	
	

	/**
	 * Sets head and tail as null
	 * 
	 * @param head : SalesItem parameter representing the head of queue
	 * @param tail : SalesItem parameter representing the tail of queue
	 *  
	 */
	
	
	
	public SalesSlip(){
		head = null;
		tail = null;
	}
	
	
	
	/**
	 * Checks if queue is empty
	 * 
	 * @param head
	 * 
	 */
	
	
	
	public Boolean isEmpty() {
		return head == null;
	}
	
	
	
	/**
	 * Enqueues the input value, setting the head and tail values 
	 * 
	 * @param head 
	 * @param tail 
	 * @param temp: SalesItem parameter parsing the inputed values to the SalesItem class as a node
	 *  
	 */
	
	
	
	public void enqueue(String in1, String in2, String in3) { 
		SalesItem temp = new SalesItem(in1, in2, in3);
		
		if(head == null) {
			head = temp;
			tail= temp;
		}
		else {
			tail.setNext(temp);
			tail = temp;
		}
	}
	
	
	
	/**
	 * dequeues the input value at specified position, setting the head and tail values 
	 * 
	 * @param head 
	 * @param tail 
	 * @param temp: SalesItem parameter parsing the inputed values to the SalesItem class as a node
	 * @frontItem: String parameter takes the head value and removes it from the list
	 *  
	 */
	
	
	
	public Object dequeue() {
		if(isEmpty() ) {
			throw new NoSuchElementException("Runtime Exception");
		}
		else if (head == tail) {
			String frontItem = head.getStr() + head.getN() + head.getCos() ;
			head = null;
			tail = null;
			return frontItem;
		}
		else {
			String frontItem =  head.getStr() + head.getN() + head.getCos();
			head = head.getNext();
			return frontItem;
		}
	}
	
	
	
	
	/**
	 * Returns value at head of queue
	 * 
	 * @param head 
	 *  
	 */
	
	
	
	public SalesItem getHead() {
		return head;
	}
	
	
	
	/**
	 * Returns value at tail of queue
	 * 
	 * @param head 
	 * @param tail
	 *  
	 */
	
	
	
	public SalesItem getTail() {
		while (head != tail){
			  return(head);
			}
		return head.getNext();
	}
	
	
	
	/**
	 * Returns the queue
	 * 
	 * @param head 
	 * @param current: SalesItem parameter holds the head value and sends to print it while it is not null
	 * @param result: String parameter holds the final resultant string value to printout
	 *  
	 */
	
	
	
	public String toString(){
        String result = "";
        SalesItem current = head;
        while (current != null){
            result = result + current.toString() + "\n";
            current = current.getNext();
        }
        return result;
    }
	
	
	
	/**
	 * Returns the multiplied value of quantity*cost of each item
	 * 
	 * @param head 
	 * @param cur: SalesItem parameter holds the head value 
	 * @param mul: double parameter holds the quantity*cost of each item
	 * @param fin: String parameter holds the final resultant value of the sum
	 *  
	 */
	
	
	
	public String add() {
		String fin = " ";
		SalesItem cur = head;
		while (cur != null) {
			double qu = Double.parseDouble(cur.getN());
			double co = Double.parseDouble(cur.getCos());
			mul = qu * co;
			fin = Double.toString(mul);
			cur = cur.getNext();
		}
		return fin;
	}
}
