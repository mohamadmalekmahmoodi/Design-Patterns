package ir.patterns.strategy;

import java.io.File;

public interface CompressionStrategy {
    void compress(File file);
}
