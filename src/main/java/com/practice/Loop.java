package com.practice;

public class Loop {
	
	public void Forloop()
	{
//		System.out.println("Bangladesh");
//		System.out.println("Bangladesh");
//		System.out.println("Bangladesh");
//		System.out.println("Bangladesh");
//		System.out.println("Bangladesh");
		
		int [] array = {1,2,3,5,6,7};
		
		
		
		for(int i = 0;i <array.length;i++)
		{
			System.out.println(array[i]);
			
		}
		
	}
	

	public static void main(String[] args) 
	{
		
		Loop obj = new Loop();
		obj.Forloop();
	}

}
