package bg.softuni.structural.decorator;

import java.io.IOException;
import java.util.zip.DataFormatException;

public interface DataSource {
    void writeData(String data) throws IOException;
    String readData() throws IOException, DataFormatException;
}
