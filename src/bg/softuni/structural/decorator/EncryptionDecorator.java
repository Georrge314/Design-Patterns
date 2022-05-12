package bg.softuni.structural.decorator;

import java.io.IOException;
import java.util.zip.DataFormatException;

public class EncryptionDecorator extends DataSourceDecorator {
    final String secretKey = "ssshhhhhhhhhhh!!!!";

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) throws IOException {
        super.writeData(AES.encrypt(data, secretKey));
    }

    @Override
    public String readData() throws IOException, DataFormatException {
        return AES.decrypt(super.readData(), secretKey);
    }
}
