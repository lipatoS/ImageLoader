public class FileAdapter implements FileReader {


    AdvancedFileReader advancedFilesReader;

    public FileAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("png")) {
            advancedFilesReader = new ReaderPng();
        } else if (audioType.equalsIgnoreCase("jpg")) {
            advancedFilesReader = new ReaderJpg();
        }
    }

    @Override
    public void read(String fileType, String fileName) {

        if (fileType.equalsIgnoreCase("png")) {
            advancedFilesReader.readPng(fileName);
        } else if (fileType.equalsIgnoreCase("jpg")) {
            advancedFilesReader.readJpg(fileName);
        }
    }
}
