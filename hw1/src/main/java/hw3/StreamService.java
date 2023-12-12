package hw3;

import java.util.List;

public class StreamService {
    private List<Stream> streams;

    public StreamService(List<Stream> stream) {
        this.streams = stream;
    }

    public List<Stream> getStreams() {
        return streams;
    }

    public List<Stream> getSortedStreamByCount() {
        this.streams.sort(new StreamComparator());
        return streams;
    }
}
