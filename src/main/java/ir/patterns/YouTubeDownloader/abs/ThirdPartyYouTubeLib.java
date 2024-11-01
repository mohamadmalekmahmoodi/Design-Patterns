package ir.patterns.YouTubeDownloader.abs;

import ir.patterns.YouTubeDownloader.model.Video;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
