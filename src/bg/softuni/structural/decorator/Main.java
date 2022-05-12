package bg.softuni.structural.decorator;

import java.io.IOException;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) throws IOException, DataFormatException {
        DataSource source = new FileDataSource("data.txt");
        source.writeData("This is my first text!");
        System.out.println(source.readData());

        source = new EncryptionDecorator(source);
        source.writeData("Encrypted text.");
        System.out.println(source.readData());

        source = new FileDataSource("data.txt");
        source = new CompressionDecorator(source);
        source.writeData("Compressed text.");
        System.out.println(source.readData());
    }
}
