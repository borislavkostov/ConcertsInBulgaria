package event;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

    @Override
    public LocalDateTime unmarshal(String v) throws Exception {
        DateTimeFormatter format =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.parse(v,format);
    }

    @Override
    public String marshal(LocalDateTime v) throws Exception {
        return v.toString();
    }

}
