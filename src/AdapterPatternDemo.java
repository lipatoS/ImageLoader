public class AdapterPatternDemo {
    public static void main(String[] args) {
        ReadFiles readFiles = new ReadFiles();
        readFiles.read("jpg","cats.jpg");
        readFiles.read("png","forest.png");
        readFiles.read("bmp","apple.bmp");
    }
}
