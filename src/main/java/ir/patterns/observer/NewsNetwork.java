package ir.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsNetwork {

    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void attach(Channel channel) {
        channels.add(channel);
    }

    public void detach(Channel channel) {
        channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        notifyChannels();
    }

    public void notifyChannels() {
        for (Channel channel : channels) {
            channel.update(this.news);
        }
    }
}
