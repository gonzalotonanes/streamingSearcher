package com.streamingsearcher.services;

import com.streamingsearcher.models.Titles.ContentTitles;

public interface TitleService {
    ContentTitles findTitles(String name);
}
