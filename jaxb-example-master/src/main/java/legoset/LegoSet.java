package legoset;

import java.time.Year;
import java.util.Set;
import java.util.List;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
//@XmlType(propOrder = {"name", "theme", "subtheme","year","pieces", "tags", "minifigs", "url", "number" })
@Data
public class LegoSet {

    private String name;
    private String theme;
    private String subtheme;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;

    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minfigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifig;
    private Weight weight;

    private String url;

    @XmlAttribute
    private String number;

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public int getPieces(int i) {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public List<Minifig> getMinifig() {
        return minifig;
    }

    public void setMinifig(List<Minifig> minifig) {
        this.minifig = minifig;
    }

    public String getName(String imperial_tie_fighter) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getSubtheme() {
        return subtheme;
    }

    public void setSubtheme(String subtheme) {
        this.subtheme = subtheme;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNumber(String s) {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }
}
