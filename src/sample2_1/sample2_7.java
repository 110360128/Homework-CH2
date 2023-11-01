package sample2_1;

import java.io.BufferedReader;
import java.io.*;

public class sample2_7
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問你是男生嗎?");
		System.out.println("請輸入Y或N");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0);
		
		if(letter =='Y'||letter =='y')
		{
			System.out.println("你是男生");
		}	
		else if(letter =='N'||letter =='n')	
		{
			System.out.println("妳是女生");					
		}
		else
		{
				System.out.println("請輸入Y或N");
		}
	}
}