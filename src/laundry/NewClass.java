/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laundry;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vicsoft
 */
public class NewClass {
 public static void main(String[] args) {
		String[][] data = {
			{ "Housewares", "$1275.00" },
			{ "Pets", "$125.00" },
			{ "Electronics", "$2533.00" },
			{ "Menswear", "$497.00" }

		};
		String[] headers = { "Department", "Daily Revenue" };
		
		JFrame frame = new JFrame("JTable to Excel Hack");
		DefaultTableModel model = new DefaultTableModel(data,headers);
		final JTable table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);

		JButton export = new JButton("Export");
		export.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

		try {                
			ExcelExporter exp = new ExcelExporter(); 
			exp.exportTable(table, new File("results.xls"));
		} catch (IOException ex) {
			System.out.println("there's error"+ex.getMessage());
			ex.printStackTrace();

		}
			}
		});

		frame.getContentPane().add("Center",scroll);
		frame.getContentPane().add("South",export);
		frame.pack();
		frame.setVisible(true);
	}   
}
