import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int agesArray[];

	public static void main(String[] args) throws IOException{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		
		
		//bw.write("Indique la cantidad de casos que serán entregados");
		System.out.println("Indique la cantidad de casos que serán entregados");
		int cases = br.read();
		
		
		
		
		br.close();
		bw.close();
		

	}

}
