package com.streamingsearcher.models.Titles;


import com.google.gson.annotations.SerializedName;



public class Image {


    @SerializedName("height")
    private Integer height;
    @SerializedName("imageUrl")
    private String imageUrl;
    @SerializedName("width")
    private Integer width;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
