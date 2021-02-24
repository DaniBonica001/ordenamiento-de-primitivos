import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
	public static double []caseArray;
	public final static String SPLIT=" ";
	public final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
	

	public static void main(String[] args) throws IOException{		

		
		bw.write("Indique la cantidad de casos que serán entregados: ");
		bw.flush();
		int cases = br.read();
		
		receiveCases();
		caseArray= returnArrayDouble();	
		bw.flush();
		bw.write(organizeArray(caseArray));
		/*
		int counter=0;
		while(counter<cases) {
			//bw.write("+++++++++++"+counter);
			receiveCases();
			caseArray= returnArrayDouble();			
			counter++;
		}
		*/
				
		br.close();
		bw.close();
	}
	
	
	public static String [] receiveCases() throws IOException {
		bw.write("Ingrese el caso de prueba, cada numero separado por espacios:");
		String ageCase= br.readLine();
		bw.flush();
		String[] parts= ageCase.split(SPLIT);		
		return parts;		
	}
	
	public static double[] returnArrayDouble() throws IOException {
		String [] ageString = receiveCases();
		double []ages= new double [ageString.length];
		for (int i=0;i<ages.length;i++) {
			if (ageString[i]!=" ") {
				ages[i]=Double.parseDouble(ageString[i]);
			}
		}
		return ages;		
	}

	public static String organizeArray(double[]array) {
		int amountChanges=0;
		int pasadas=0;
		for (int i=1;i<array.length;i++) {
			int changes=0;			
			for (int j=0;j<array.length-i;j++) {
				if (array[j]>array[j+1]) {
					double temp = array[j]; 
					array[j]=array[j+1];
					array[j+1]=temp;
					changes++;					
				}				
								
				System.out.println("\n"+Arrays.toString(array));
				System.out.println("changes: "+changes);
				
			}
			amountChanges+=changes;
			pasadas++;
			System.out.println("amountChanges:"+amountChanges);
			System.out.println("pasadas:"+pasadas);
			
		}
		double average = (double) amountChanges/pasadas;	
		
		return average+"-"+Arrays.toString(array);	
	}

}
