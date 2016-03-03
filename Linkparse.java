import java.io.IOException;  
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;
import org.jsoup.*;  
import org.jsoup.nodes.*; 
import java.io.*; 

import org.jsoup.nodes.Document;  
class Linkparse
{
	public static void main(String s[])throws IOException
	{
		Document doc=Jsoup.connect("http://www.javatpoint.com").get();
		Elements link=(Elements)doc.select("a[href]");
try{
           	FileOutputStream fos=new FileOutputStream(new File("F:\\fol.txt"));

		for(Element links:link)
		{
           String str=links.attr("href");
           // System.out.println(str);
           byte ch[]=str.getBytes();
           for(int i=0;i<ch.length;i++)
           	   fos.write(ch[i]);
           	// fos.write("\n");
           	  // System.out.println(ch);
           	// System.out.println();
			// System.out.println("link is "+links.attr("href"));
			// System.out.println("text is "+links.text());
		// fos.write(links.attr("href").toString()+"\n");
		}
		fos.close();
	}catch(Exception e)
	{
	}
	
}
}
