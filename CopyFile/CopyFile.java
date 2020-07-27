import java.io.*;
class CopyFile
{
	public static void main(String[] args) {
		String source = args[0];
		//String destination = args[1];
		FileInputStream fIS;
		FileOutputStream fOS;
		try
		{
			File fileread = new File(source);
			fIS = new FileInputStream(fileread);
			File filewrite = new File("copyfile.png");
			fOS = new FileOutputStream(filewrite);
			byte[] dataChunk = new byte[300];
			while(fIS.read(dataChunk)!=-1)
			{
				fOS.write(dataChunk);
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch (Exception e) {
			System.out.print("Exception");	
		}
	}
}