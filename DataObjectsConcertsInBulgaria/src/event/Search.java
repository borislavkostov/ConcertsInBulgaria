
package event;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Search {
    private int totalItems;
    private Events events;

    public int getTotalItems() {
        return totalItems;
    }
    @XmlElement(name="total_items")
    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public Events getEvents() {
        return events;
    }
    @XmlElement(name="events")
    public void setEvents(Events events) {
        this.events = events;
    }
    
    
}
