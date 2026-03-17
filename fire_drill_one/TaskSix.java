

public class TaskSix{

	public static void main (String[] arg){
		
	int i = 0;
	while(i++ < 10){
		int remainder = i%4;
		if(remainder == 0){

			int j = 0;
			int multiple = 1;

			while(j++ < 5){
			multiple = multiple * i;
					
		System.out.printf("%d ", multiple);

			}
		}
	}


	
	}


}