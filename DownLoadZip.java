import java.net.*;
import java.io.*;
public class DownLoadZip {

	public static void main(String[] args) {
		    
	}
	public void download_zip_file(String save_to) throws IOException {
        URL url = new URL("http://pc-2011.com/downloads/test.zip");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        InputStream in = connection.getInputStream();
        FileOutputStream out = new FileOutputStream("test.zip");
        copy(in, out, 1024);
        out.close();
    }
 
    public static void copy(InputStream input, OutputStream output, int bufferSize) throws IOException {
        byte[] buf = new byte[bufferSize];
        int n = input.read(buf);
        while (n >= 0) {
            output.write(buf, 0, n);
            n = input.read(buf);
        }
        output.flush();
    }
}
