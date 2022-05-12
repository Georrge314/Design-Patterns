package bg.softuni.structural.decorator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class CompressionDecorator extends DataSourceDecorator {
    private final Deflater compressor = new Deflater();
    private final Inflater decompressor = new Inflater();
    private int compressedLength;

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) throws IOException {
        byte[] input = data.getBytes(StandardCharsets.UTF_8);
        byte[] output = new byte[100];
        compressor.setInput(input);
        compressor.finish();
        compressedLength = compressor.deflate(output);
        compressor.end();
    }

    @Override
    public String readData() throws IOException, DataFormatException {
        String output = super.readData();
        decompressor.setInput(output.getBytes(), 0, compressedLength);
        byte[] result = new byte[100];
        int resultLength = decompressor.inflate(result);
        decompressor.end();
        return new String(result, 0, resultLength, StandardCharsets.UTF_8);
    }
}
