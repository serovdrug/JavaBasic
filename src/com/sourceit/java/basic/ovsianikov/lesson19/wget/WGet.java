package com.sourceit.java.basic.ovsianikov.lesson19.wget;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class WGet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String command = args[0];
		String my_url;
		String line;
		BufferedReader br;
		InputStream is = null;
		URL url;

		if (args.length == 0) {
			System.out.println("Usage: some web address");
			System.out.println("       or -i");
			System.out.println("Example: http://google.com");
			return;
		}

		if ("-i".equals(command)) {
			// TODO ask for URL
			System.out.print("Please input your URL: ");
			br = new BufferedReader(new InputStreamReader(System.in));
			my_url = br.readLine();
		} else {
			// TODO with url
			my_url = command;

		}
		System.out.println("Select what to do the next: ");
		System.out.println("1) Save page");
		System.out.println("2) Display title");
		System.out.println("3) Find the word");
		System.out.println("4) List all URL's on the page");

		br = new BufferedReader(new InputStreamReader(System.in));
		int chouse = Integer.parseInt(br.readLine());

		switch (chouse) {
		case 1:
			System.out.println("Save page");
			try {
				url = new URL(my_url);
				is = url.openStream();
				br = new BufferedReader(new InputStreamReader(is, "CP1251"));
				
				PrintWriter out = new PrintWriter(new FileWriter("myfile.html"));

				while ((line = br.readLine()) != null) {
					System.out.println(line);
					out.println(line);
					
				}
			} catch (Exception ex) {
				System.out.println("Smth. wrong" + ex);
			} finally {
				if (is != null) {
					try {
						is.close();
					} catch (IOException e) {
					}
				}
			}
			break;
		case 2:
			System.out.println("Display title");
			break;
		case 3:
			System.out.println("Find the word");
			break;
		case 4:
			System.out.println("List all URL's on the page");
			break;
		default:
			System.out.println("Invalid chouse :(");
			break;
		}
		System.out.println("Url is: " + my_url);

	}

}
