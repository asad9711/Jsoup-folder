import java.io.IOException;  
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;
import org.jsoup.*;  
import org.jsoup.nodes.*; 
import java.io.*; 

import org.jsoup.nodes.Document;  
class Hindulinks
{
	static String arr[];
	static int count=0;
	static String link=null;
	public static void main(String s[])throws IOException
	{
	
		// Document doc=Jsoup.connect("http://www.javatpoint.com").get();
		try{
		
			Document doc=Jsoup.connect("http://www.thehindu.com").get();

Elements headers= doc.getElementsByTag("h3");

for (Element header:headers){
 
	Elements anchors=header.getElementsByTag("a");
	for(Element anchor:anchors)
	{
  // System.out.println(anchor.attr("href"));
   link=anchor.attr("href");
  System.out.println(link);
  count++;
    }
}
}catch(Exception e)
{
	System.out.println(e);
}
System.out.println("count is "+count);


		
	}
}
