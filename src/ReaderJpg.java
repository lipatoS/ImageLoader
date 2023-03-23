public class ReaderJpg implements AdvancedFileReader{

    @Override
    public void readJpg(String fileName) {
        System.out.println("Read jpg file: " + fileName);
    }

    @Override
    public void readPng(String fileName) {

    }
}
