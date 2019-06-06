package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
public class FilesCopy {
	
	public static final String SRC_DIR_PATH = "C:\\Users\\gd\\Downloads\\MPI\\rtt_bag _files";
	public static final String TEMP_DIR_PATH = "D:\\rapiscan\\malibu\\tempDir";
	public static final String DEST_DIR_PATH = "D:\\rapiscan\\malibu\\input";
	public static void main(String[] args) throws IOException {
			File srcDirectory = new File(SRC_DIR_PATH);
			File tempDir = new File(TEMP_DIR_PATH);
			File destinationDir = null;
			if(new File(DEST_DIR_PATH).exists()) {
				FileUtils.forceDelete(new File(DEST_DIR_PATH));
			}
			destinationDir = new File(DEST_DIR_PATH);
			//Copy specific extension files to Temp Folder
			selectAndCopyFilesToTempFolder(srcDirectory, tempDir);			
			//Move selected file from TEMP Folder to Destination Folder
			FileUtils.moveDirectory(tempDir, destinationDir);
		}

		public static void selectAndCopyFilesToTempFolder(File srcDir, File tempDir) {
			try {
			String[] extensions = new String[] {"vol", "vol.txt"};
			System.out.println("Getting all vol and vol.txt files in " + srcDir.getCanonicalPath());
			List<File> files = (List<File>) FileUtils.listFiles(srcDir, extensions, true);
			System.out.println("Selected files Count = " + files.size());
			for (File file : files) {
				System.out.println("file: " + file.getCanonicalPath());
				//Copy each selected file to Temp Folder
				FileUtils.copyFileToDirectory(file, tempDir);
			}
			} catch (Exception e) {
				System.out.print("Exception Occurred while copying files to Temp Folder");
			}
		}
}
