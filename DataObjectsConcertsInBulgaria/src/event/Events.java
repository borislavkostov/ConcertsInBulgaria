
package event;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;


public class Events {
private List<Event> events = new ArrayList<Event>();
    public Events() {
    }
    @XmlElement(name="event")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }
    
    
}
