package legoset;


import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {

    @XmlAttribute
    private int count;

    @XmlValue
    private String minifigs;

    public Minifig() {}

    public Minifig(int count, String minifigs) {
        this.count = count;
        this.minifigs = minifigs;
    }
}
