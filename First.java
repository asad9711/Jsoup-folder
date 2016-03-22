import java.io.IOException;  
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;
import org.jsoup.*;  
import org.jsoup.nodes.*;  

import org.jsoup.nodes.Document;  
class First
{
		static int count=0;
	public static void main(String s[])throws IOException
	{
		Document doc=Jsoup.connect("http://www.javatpoint.com").get();
		// Elements link=(Elements)doc.select("img[src]");
		// Elements imagelink=doc.getElementsByTag("img");
		// Elements imagelink=doc.getElementsByAttribute("src");
		// Elements imagelink=doc.getElementsByAttributeValueEnding("src",".png");
		Elements imagelink=doc.getElementsByAttributeValueContaining("src","http");

   


		for(Element links:imagelink)
		{
			String temp=Integer.toString(links);
			if(temp.contains("script"))
				continue;
			System.out.println("link is "+links.attr("src"));
			// System.out.println("link is "+links);
			// System.out.println("text is "+links.text());
			count++;
		}

		System.out.println("count is"+"  "+count);
	}
}
