package com.sourceit.java.basic.ovsianikov.wt16.country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Country {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File f = new File("C://source_it//Country.txt");
		
		DefaultListModel model = new DefaultListModel();
		List<String> strings = new ArrayList<String>();
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(
					"C://source_it//Country.txt"));
			outputStream = new PrintWriter(new FileWriter(
					"C://source_it//Country_new.txt"));

			String l;
			while ((l = inputStream.readLine()) != null) {
				//outputStream.println(l);
				//outputStream.println("---");
				strings.add(l);
			}
		}
		catch(IOException ex){};
		Collections.sort(strings);
		
		for (int i=0; i < strings.toArray().length; i++){
			model.addElement(strings.get(i));			
		}
		
		finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}
}
