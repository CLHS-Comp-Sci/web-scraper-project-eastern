import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
public class App {
    public static void main(String[] args) throws Exception {
        final String url= "https://en.wikipedia.org/wiki/Billboard_Year-End_Hot_100_singles_of_2024";
        try{
            final Document document= Jsoup.connect(url).get();
            int i=-1;
           for ( Element row : document.select("#mw-content-text > div.mw-content-ltr.mw-parser-output > table > tbody tr"))
           {
                final String songName= row.select("a").text();
                i++;
                if(i>0)
                {
                    System.out.print(i+".");  
                }
                System.out.println(songName);
            } 
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
