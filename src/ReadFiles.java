public class ReadFiles implements FileReader{


    FileAdapter FileAdapter;

    @Override
    public void read(String fileType, String fileName) {

        if (fileType.equalsIgnoreCase("jpg")) {
            System.out.println("Read jpg file: " + fileName);
        }

        else if (fileType.equalsIgnoreCase("png")

        ) {
            FileAdapter = new FileAdapter(fileType);
            FileAdapter.read(fileType, fileName);
        } else {
            System.out.println("Invalid file type. " + fileType + " format not supported");
        }
    }
}
