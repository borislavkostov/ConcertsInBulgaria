package dataaccesslayerconcertsinbulgaria;

import event.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class DataAccessLayerConcertsInBulgaria {

    public static void main(String[] args) throws MalformedURLException, JAXBException {
        String url = "http://api.eventful.com/rest/events/search?c=music&app_key=Tm9vvdLvvQvkZ6KF&page_number=1&date=Future&location=Bulgaria";
        URL xml = new URL(url);
        Search sr = new Search();
        JAXBContext jc = JAXBContext.newInstance(Search.class);
        Unmarshaller u = jc.createUnmarshaller();
        sr = (Search) u.unmarshal(xml);
        Events ev = sr.getEvents();
        System.out.println(sr.getTotalItems());
        for (Event event : ev.getEvents()) {
            System.out.println(event.getTitle());
            System.out.println("****************");
            
        }
        
    }

}
