package lianxi2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IO001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String epline=null,nline=null,ep3=null;
		try {	
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\3kdi44\\Desktop\\201831104076”‡∫Ë—Ó\\yq_in.txt")));
		File txt=new File("C:\\Users\\3kdi44\\Desktop\\201831104076”‡∫Ë—Ó\\IO001.txt");
		FileOutputStream fos=new FileOutputStream(txt);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		if(!txt.exists())
			{
				txt.createNewFile();
			}
		for (String line = br.readLine(); line != null; line = br.readLine()) {
			nline=line.substring(0,3);
			ep3=line.substring(4);
			if(!nline.equalsIgnoreCase(epline)) 
			{
				if(epline!=null)
				{
					bw.newLine();
				}
				epline=nline;	
				bw.write(nline);
				bw.newLine();
			}
			else
			{
				bw.write(ep3);
				bw.newLine();
			}
		}
		br.close();
		bw.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
}
