package bg.softuni.structural.decorator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class FileDataSource implements DataSource {
    private final Path path;

    public FileDataSource(String fileName) {
        path = Path.of(Objects.requireNonNullElse(fileName, "data.txt"));
    }

    @Override
    public void writeData(String data) throws IOException {
        Files.write(path, data.getBytes());
    }

    @Override
    public String readData() throws IOException {
        return Files.readString(path);
    }
}
