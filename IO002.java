package lianxi2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class IO002 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String epline=null,nline=null,ep3=null;
			int t=0;
			try {
			Scanner in=new Scanner(System.in);
			Scanner in1=new Scanner(System.in);
			Scanner in2=new Scanner(System.in);
			System.out.println("输入文件的路径及名称:");
			String input=in.nextLine();
			System.out.println("输出文件的路径及名称:");
			String output=in1.nextLine();
			System.out.println("请指定省份输出信息(不指定则输出所有省信息):");
			String pro="";
			pro=in2.nextLine();
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input)));
			File txt=new File(output);
			FileOutputStream fos=new FileOutputStream(txt);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			if(!txt.exists())
				{
					txt.createNewFile();
				}
			if(pro.length()==0)
			{
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
			}
			else 
			{
				for (String line = br.readLine(); line != null; line = br.readLine()) {
					nline=line.substring(0,3);
					ep3=line.substring(4);
					if(nline.equalsIgnoreCase(pro)&&t==0) 
					{
						t=1;
						epline=nline;	
						bw.write(nline);
						bw.newLine();
					}
					else if(t==1)
					{
						if(!nline.equalsIgnoreCase(pro))
						{
							break;
						}
						bw.write(ep3);
						bw.newLine();
					}
					}
				
			
			}
			br.close();
			bw.close();
			in.close();
			in1.close();
			in2.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
		}


}
