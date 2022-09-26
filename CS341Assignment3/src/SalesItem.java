
	/**
	 * Takes input value and makes it a node for the queue.
	 * 
	 * @author Aman Bhatnagar
	 * 
	 * @version 1.0
	 */

public class SalesItem {
	private String n;
	private String str;
	private String cos;
	public SalesItem next;
	
	
	/**
	 * Initializing the input values for a node in the queue
	 * 
	 * @param next : SalesItem parameter pointing to next in queue
	 * @param str : String parameter representing inputed name
	 * @param n : String parameter representing inputed quantity
	 * @param cos : String parameter representing inputed cost
	 *  
	 */
	
	
	public SalesItem() {
		next = null;
		n = null;
		str = null;
		cos = null;
	}
	
	public SalesItem(String in1, String in2, String in3) {
		str = in1;
		n = in2;
		cos = in3;
	}
	
	/**
	 * Returns Stored name Value
	 * 
	 * @param str
	 * 
	 */
	
	public String getStr() {
		return str;
	}
	
	/**
	 * Sets Stored name Value
	 * 
	 * @param str
	 * 
	 */
	
	public void setStr(String str) {
		this.str = str;
	}
	
	/**
	 * Returns Stored cost Value
	 * 
	 * @param cos
	 * 
	 */
	
	public String getCos() {
		return cos;
	}
	
	/**
	 * sets Stored cost Value
	 * 
	 * @param cos
	 * 
	 */
	
	public void setCos(String cos) {
		this.cos = cos;
	}
	
	/**
	 * Returns Stored Quantity Value
	 * 
	 * @param n
	 * 
	 */
	
	public String getN() {
		return n;
	}
	
	/**
	 * sets Stored Quantity Value
	 * 
	 * @param Input
	 * 
	 */
	
	
	public void setN(String n) {
		this.n = n;
	} 
	
	
	
	/**
	 * Returns the queue
	 * 
	 * @param getStr() 
	 * @param getN()
	 * @param getCos()
	 *  
	 */
	
	public String toString (){
        return  "    "+ getStr() + "    " + getN() + "    " + "$" +getCos();
    }
	
	/**
	 * Returns Next in queue
	 * 
	 * @param next
	 * 
	 */
	
	public SalesItem getNext() {
		return next;
	}
	
	/**
	 * sets Stored Quantity Value
	 * 
	 * @param next
	 * 
	 */
	

	public void setNext(SalesItem next) {
		this.next = next;
	}
	
}
