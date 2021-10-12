import java.io.*;

class ReadAndWrite {
    public static void main(String args[]) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("exampleFileRead.txt");
            fw = new FileWriter("exampleFileWrite.txt");
            int c = fr.read();
            while (c != -1) {
                fw.write(c);
                c = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(fr);
            close(fw);
        }
    }

    public static void close(Closeable stream) {
        try {
            if (stream != null) {
                stream.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}