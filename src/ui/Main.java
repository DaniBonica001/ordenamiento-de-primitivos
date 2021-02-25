package ui;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
public class Main {
	
	public static ArrayList<String>ageNumbers;
	public final static String SPLIT=" ";
	public final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
	
	public static void main(String[] args) throws IOException{		
		ageNumbers = new ArrayList<String>();
		
		//bw.write("Indique la cantidad de casos a ingresar: ");
		bw.flush();
		int cases = Integer.parseInt(br.readLine());
			
		int i=0;
		while(i<cases) {			
			receiveCases();			
			i++;
		}
		
		System.out.println("salida: "+"\n"+showOut());
				
		br.close();
		bw.close();
	}
	
	
	public static void receiveCases() throws IOException {
		String line;
		try {	
			line= br.readLine();
			if (line!=null) {				
				String []parts = line.split(SPLIT);				
				stringToDouble(parts);				
			}
		
		} catch (IOException e) {
			System.out.println("Something went wrong.");			
			e.printStackTrace();
		}		  	
	}
	
	public static void stringToDouble(String [] ageArray) throws IOException {
		if (ageArray!=null) {
			double [] ages =new double[ageArray.length];
			for (int i=0;i<ages.length;i++) {
				ages[i]=Double.parseDouble(ageArray[i]);		
			}			
			bubbleSort(ages);				
		}	
	}
	

	public static void bubbleSort(double[]numbers) {
		//System.out.println("Si uso el método bubble");
		int pasadas=0;
		int amountChanges=0;

		for (int i=1;i<numbers.length;i++) {
			int changes=0;

			for (int j=0;j<numbers.length-i;j++) {
				if (numbers[j]>numbers[j+1]) {
					double temp= numbers[j];
					numbers[j]= numbers[j+1];
					numbers[j+1]=temp;
					changes++;					
				}
			}
			amountChanges+=changes;
			pasadas++;
		}

		double average =(double) amountChanges/pasadas;
		double roundAverage = average*100;
		roundAverage = (int)roundAverage;
		roundAverage=roundAverage/100;		
		String message= roundAverage+"-"+doubleToString(numbers);		
		ageNumbers.add(message);	
	}
	
	public static String doubleToString(double[] numbers) {
		String [] ageLine = new String [numbers.length];
		for (int i=0;i<numbers.length;i++) {
			ageLine[i]= String.valueOf(numbers[i]);
		}
		String infoLine="";
		for (int j=0;j<ageLine.length;j++) {
			if (j==0) {
				infoLine= ageLine[0]+" ";
			}else if (j!=ageLine.length-1){
				infoLine+=ageLine[j]+" ";
			}else if (j==ageLine.length-1) {
				infoLine+=ageLine[j];
			}
		}
		return infoLine;
	}
	

	public static String showOut() {
		String message="";
		for (int i=0;i<ageNumbers.size();i++) {
			message+=ageNumbers.get(i)+"\n";			
		}
		return message;
	}
}