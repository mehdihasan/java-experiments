package practice.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageMetadataRequests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 

            URL url = new URL("https://images.dn.no/image/vUfPNlWxs%2F92T%2FSeFywgDA%3D%3D/nhst/binary/236e6f4c668f25279a49fa5b35014a1f/metadata"); 
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); 
            connection.setDoOutput(true); 
            connection.setInstanceFollowRedirects(false); 
            connection.setRequestMethod("GET"); 
            connection.setRequestProperty("Content-Type", "application/json"); 

            OutputStream os = connection.getOutputStream(); 
           //how do I get json object and print it as string
            os.flush(); 
            
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (connection.getInputStream()))); // Getting the response from the webservice

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            
//            Gson g = new Gson(); 
//            Player p = g.fromJson(jsonString, Player.class)

            connection.getResponseCode(); 
            connection.disconnect(); 
        } catch(Exception e) { 
            throw new RuntimeException(e); 
        } 
	}

}
