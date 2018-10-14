import java.util.*;
import java.io.*;

public class HelloWorld {
	
	public static void main(String[] args){
		
		try{
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			while (stdin.ready()){
				System.out.println("Hello World This is TDTU");
				System.out.println("Hello World I am" + stdin.readLine() );
			}
		}
		catch (Exception e){
			System.err.println("Error!! ");
		}
		
	}
	
}
