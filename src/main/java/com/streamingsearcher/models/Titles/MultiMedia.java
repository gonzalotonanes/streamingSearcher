package com.streamingsearcher.models.Titles;



import com.google.gson.annotations.SerializedName;


public class MultiMedia  {

    public MultiMedia() {
    }

    @SerializedName("i")
    private Image image;

    @SerializedName("id")
    private String id;

    @SerializedName("l")
    private String title;

    @SerializedName("q")
    private String type;

    @SerializedName("qid")
    private String qid;

    @SerializedName("rank")
    private Integer rank;

    @SerializedName("s")
    private String synopsis;

    @SerializedName("y")
    private Integer year;
    
    @SerializedName("yr")
    private String yearFromYearUntil;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getYearFromYearUntil() {
        return yearFromYearUntil;
    }

    public void setYearFromYearUntil(String yearFromYearUntil) {
        this.yearFromYearUntil = yearFromYearUntil;
    }
}
