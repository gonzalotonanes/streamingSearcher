package com.streamingsearcher.models.Titles;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ContentTitles {

    public ContentTitles() {
    }

    @SerializedName("d")
    @Expose
    private List<MultiMedia> multiMedia;

    public List<MultiMedia> getMultiMedia() {
        return multiMedia;
    }

    public void setMultiMedia(List<MultiMedia> multiMedia) {
        this.multiMedia = multiMedia;
    }
}
