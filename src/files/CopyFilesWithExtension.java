package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFilesWithExtension {

	/**
	 * Copy all the files in a folder with specific extension to another folder.
	 * Both the folders are specified on the command line. The program currently
	 * uses .java extension as filter.
	 **/

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Command usage: java CopyFilesWithExtension sourcedirectory targetdirectory");
		}

		String sourceFolder = "C:\\Users\\gd\\Downloads\\MPI\\rtt bag files";
		String targetFolder = "D:\\rapiscan\\malibu\\input";

		File sFile = new File(sourceFolder);
		// Find files with specified extension
		File[] sourceFiles = sFile.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if (name.endsWith(".vol") && name.endsWith(".vol.txt")) {// change this to your extension
					return true;
				} else {
					return false;
				}
			}
		});

		// let us copy each file to the target folder
		for (File fSource : sourceFiles) {
			File fTarget = new File(new File(targetFolder), fSource.getName());
			copyFileUsingStream(fSource, fTarget);
			// fSource.delete(); // Uncomment this line if you want source file deleted
		}

	}

	/**
	 * Copies a file using the File streams
	 * 
	 * @param source
	 * @param dest
	 */
	private static void copyFileUsingStream(File source, File dest) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[2048];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} catch (Exception ex) {
			System.out.println("Unable to copy file:" + ex.getMessage());
		} finally {
			try {
				is.close();
				os.close();
			} catch (Exception ex) {
			}
		}
	}

}
