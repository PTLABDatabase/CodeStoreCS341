import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class SalesMain {

	private JFrame frame;
	private JTextField name;
	private JTextField quantity;
	private JButton add;
	private JTextArea list;
	private JTextArea total;
	private JTextField cost;
	public double sum1 = 0;
	//private JButton print;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesMain window = new SalesMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SalesMain() {
		initialize();
		createEvent();
	}

	private void createEvent() {
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createOutput();
			}
		});
	}
	
	private void createOutput() {
		SalesSlip q = new SalesSlip();//Declaring a salesSlip item
		q.enqueue(name.getText(),quantity.getText(),cost.getText());//adding input to the queue
		list.append(q.toString());//appending the queue to the resultant field
		String a = q.add();//getting the multiplied value of cost and quantity for each item
		double sum = Double.parseDouble(a);//parsing sum to a double
		sum1 += sum;//calculating the total sum 
		String res = "$" + Double.toString(sum1);//parsing the total sum to a string
		total.setText(res);//showing the final total sum value
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sales List");
		lblNewLabel.setBounds(184, 25, 99, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel namelb = new JLabel("name");
		namelb.setBounds(49, 78, 46, 14);
		frame.getContentPane().add(namelb);
		
		JLabel costb = new JLabel("cost");
		costb.setBounds(49, 109, 46, 14);
		frame.getContentPane().add(costb);
		
		JLabel quantitylb = new JLabel("quantity");
		quantitylb.setBounds(49, 140, 46, 14);
		frame.getContentPane().add(quantitylb);
		
		name = new JTextField();
		name.setBounds(174, 75, 86, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		quantity = new JTextField();
		quantity.setBounds(174, 137, 86, 20);
		frame.getContentPane().add(quantity);
		quantity.setColumns(10);
		
		add = new JButton("add");
		add.setBounds(316, 78, 89, 23);
		frame.getContentPane().add(add);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 174, 235, 76);
		frame.getContentPane().add(scrollPane);
		
		list = new JTextArea();
		scrollPane.setViewportView(list);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(316, 174, 108, 76);
		frame.getContentPane().add(scrollPane_1);
		
		total = new JTextArea();
		scrollPane_1.setViewportView(total);
		
		JLabel lblNewLabel_4 = new JLabel("Total");
		lblNewLabel_4.setBounds(337, 140, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		cost = new JTextField();
		cost.setBounds(174, 106, 86, 20);
		frame.getContentPane().add(cost);
		cost.setColumns(10);
		
	}
}
