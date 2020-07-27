import java.io.*;
class DirectoryFileCount
{
	public static void main(String[] args) {
		int i,j,countFile=0,countDirectory=0;
		File f = new File(".");
		System.out.println(f.getAbsolutePath());
		if (f.isDirectory()==true) {
			String fd[]=f.list();
			File  f1;
			for (i=0;i<fd.length ;i++ ) {
				f1 = new File(fd[i]);
				if(f1.isDirectory()==true)
				{
					System.out.println(f1.getName() + " isDirectory");
					countDirectory++;
				} 
				if(f1.isFile()==true)
				{
					System.out.println(f1.getName() + " isFile");
					countFile++;
				}
			}
		}
		else
		{
			System.out.print("Invalid Name");
		}
		System.out.println(countFile + " File");
		System.out.println(countDirectory + " Directory");
	}
}