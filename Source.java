import java.io.*;
import java.io.PrintWriter;
import java.io.File;
import javax.swing.JLabel;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.JFrame;
import java.util.*;
public class SourceViewer {

    public static void main(String[] argv) throws Exception
    {
       
        int startSubString = -10;
        int endSubString = -10;   
      
        //input for originating link
        System.out.println("This program is made to view, store, and search through web data.");  
        System.out.print("Enter webpage URL: ");
        
        Scanner linkInput = new Scanner(System.in);
            String link = linkInput.next();//User inputs link 
                URL webpage = new URL("https://" + link);//User does not need to insert "https://" before link. In the below code, will this become a problem?
                        URLConnection connector = webpage.openConnection();//Returns a connection that is referred to by the URL 
                InputStream input2 = connector.getInputStream();//Used to read and write to the data represented by the URL
            BufferedReader in = new BufferedReader(new InputStreamReader(input2));   
 
        String source;
        PrintWriter webdata = new PrintWriter("webSource.txt");

        System.out.println();
        int lineCounter = 1;//Declaring a lineCounter for the links
        BufferedReader inFile0;
 
        while ((source = in.readLine()) != null) {
            startSubString = source.indexOf("\"http");
            if(startSubString > 0) {
                endSubString = source.indexOf("\"", startSubString+1);
                System.out.println(lineCounter++ + " result: " + source.substring(startSubString, endSubString+1));
        }
    }
            webdata.close();
    }
}
