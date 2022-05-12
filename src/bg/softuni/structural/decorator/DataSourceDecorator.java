package bg.softuni.structural.decorator;

import java.io.IOException;
import java.util.zip.DataFormatException;

public class DataSourceDecorator implements DataSource {
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) throws IOException {
        wrappee.writeData(data);
    }

    @Override
    public String readData() throws IOException, DataFormatException {
        return wrappee.readData();
    }
}
