package event;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Event {
    private String id;
    private String title;
    private String URL;
    private String description;
    private double latitude;
    private double longitude;
    private Image image;
    private LocalDateTime startTime;
    private LocalDateTime stopTime;
    private String cityName;
    private String venueName;

    public String getId() {
        return id;
    }
    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    
    public String getVenueName() {
        return venueName;
    }
    @XmlElement(name = "venue_name")
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }
    

    public String getCityName() {
        return cityName;
    }
    @XmlElement(name = "city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    

    public LocalDateTime getStopTime() {
        return stopTime;
    }
    @XmlElement(name = "stop_time")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    public void setStopTime(LocalDateTime stopTime) {
        this.stopTime = stopTime;
    }
    

    public LocalDateTime getStartTime() {
        return startTime;
    }
    
    @XmlElement(name = "start_time")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Image getImage() {
        return image;
    }
    @XmlElement(name = "image")
    public void setImage(Image image) {
        this.image = image;
    }
    
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    

    public double getLatitude() {
        return latitude;
    }

    @XmlElement(name = "latitude")
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement(name = "description")
    public void setDescription(String description) {
        this.description = description;
    }

    public String getURL() {
        return URL;
    }

    @XmlElement(name = "url")
    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
