// BibleBook array assignment by Kristopher Smolarek (CSC250)
// Read New Testament books from file "New Testament.dat" to array

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class book_call2
	{
	public static void main(String[] args)
		{
		try
			{
				Scanner fileIn = new Scanner(new File(System.getProperty("user.dir") + "/src/New_Testament.dat"))
				.useDelimiter(":");
			
				// create ArrayList (book_list), type String
				List<String> book_list = new ArrayList<String>();
				
				while(fileIn.hasNext())
					{
						String items = fileIn.next();
						book_list.add(items);
					}
						fileIn.close();
						
					// create String array from book_list
					String[] bookListarray = new String[book_list.size()];
					book_list.toArray(bookListarray);
					// print array from New Testament file
					// System.out.println(Arrays.toString(bookListarray));
					
					for (int i = 0; i < bookListarray.length; i = i +3)
					{
						BibleBook_array add_book = new BibleBook_array(bookListarray[i]);
						add_book.num_chapters(bookListarray[i+1]);
						add_book.theme(bookListarray[i+2]);
						add_book.display();
					}
				}
		catch(Exception e)
			{
				System.err.println(e.toString());
			}
		}
	}