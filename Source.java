import java.io.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.util.Scanner;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;
import java.lang.Object;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

public class Source 
{
 public static void main(String args[]) throws Exception 
 {  
  System.out.println("Website URL Search Engine");
    
    //Create a file reader to print the file to terminal
    BufferedReader txtFile = new BufferedReader(new FileReader("google.txt"));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   
    //While loop prints each file line instead of one
    while (txtFile.readLine() != null) {
        System.out.println(txtFile.readLine());
    }
    in.close();
    
    //Converting the file content into a byte array for easy tasks
    String fileArray[] = (txtFile.toArray());


 }
}
