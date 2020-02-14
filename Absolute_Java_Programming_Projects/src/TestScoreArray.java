import java.util.Scanner;

public class TestScoreArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("This Console App reads 5 scores and check how each differs from the highest");
			double[] scores=new double[5];
			int i;
			double max;
			Scanner keybd=new Scanner(System.in);
			System.out.print("Enter "+ scores.length + " scores: ");
			scores[0]=keybd.nextDouble();
			max=scores[0];
			for(i=1;i<scores.length;i++) {
				scores[i]=keybd.nextDouble();
				if(scores[i]>max) {
					max=scores[i];
					//System.out.println(scores[i]);
				}
			}  System.out.print("These are the score ");
			for(i=0;i<scores.length;i++) {
				System.out.print("\t"+scores[i]);
			}System.out.print("\n"+"The highest number is "+ max);
			for(i=0;i<scores.length;i++) {
				System.out.print("\n"+scores[i]+" differs from "+max +" by "+ (max-scores[i]) );
			}
			keybd.close();
	}
			
			
			

}
