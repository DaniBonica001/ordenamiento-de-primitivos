import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static double []caseArray;
	public final static String SPLIT=" ";
	public final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
	

	public static void main(String[] args) throws IOException{		

		
		bw.write("Indique la cantidad de casos que serán entregados: ");
		bw.flush();
		int cases = br.read();
		
		/*
		int counter=0;
		while(counter<cases) {
			//bw.write("+++++++++++"+counter);
			receiveCases();
			caseArray= returnArrayDouble();			
			counter++;
		}
		*/
				
		bw.write("Bye :(");
		br.close();
		bw.close();
	}
	
	
	public static String [] receiveCases() throws IOException {
		bw.write("Ingrese el caso de prueba, cada numero separado por espacios: ");
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

}
