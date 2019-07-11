package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrawling {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
            System.out.println(doc.html());
            Elements result = doc.select("[id:realTrimeRankFavorite > li > a");
            List<String> list = result.eachText();
            //for(            )
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
