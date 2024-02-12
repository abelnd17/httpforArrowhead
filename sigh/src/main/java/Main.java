import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import javax.net.ssl.*;

public class Main {
    public static void main(String[] args) throws IOException, KeyStoreException, CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException {
        /*KeyStore clientStore = KeyStore.getInstance("PKCS12");
        clientStore.load(new FileInputStream("C:\\Users\\zezu0\\OneDrive\\Asztali gép\\certificates\\fasdvfsdbfb.fhsdcfngfgn\\choreographer.p12"), "123456".toCharArray());

        KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        kmf.init(clientStore, "123456".toCharArray());
        KeyManager[] kms = kmf.getKeyManagers();

        KeyStore trustStore = KeyStore.getInstance("JKS");
        trustStore.load(new FileInputStream("C:\\Program Files\\Java\\jdk-17.0.3\\lib\\security\\cacerts"), "changeit".toCharArray());

        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(trustStore);
        TrustManager[] tms = tmf.getTrustManagers();

        SSLContext sslContext = null;
        sslContext = SSLContext.getInstance("TLS");
        sslContext.init(kms, tms, new SecureRandom());

        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
        URL url = new URL("https://172.17.208.1:8457/choreographer/echo");

        HttpsURLConnection urlConn = (HttpsURLConnection) url.openConnection();

        urlConn.setRequestMethod("GET");

        // Get the response code
        int responseCode = urlConn.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        // Read the response
        BufferedReader in = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Print the response
        System.out.println("Response Body: " + response.toString());

        // Close the connection
        urlConn.disconnect();*/

        //System.setProperty("javax.net.ssl.trustStore", "choreokeystore");
        //System.setProperty("javax.net.ssl.trustStorePassword", "123456");
        String string = JSONConverter.convert("execute",1);
        /*HttpClient httpClient    = HttpClientBuilder.create().build();
        HttpGet     post          = new HttpGet("http://172.17.208.1:8457/choreographer/echo");
        StringEntity postingString = new StringEntity(string);//gson.tojson() converts your pojo to json
        HttpResponse  response = httpClient.execute(post);
        System.out.println(response); */
        /*try {
            // Create URL object
            URL url = new URL("http://172.17.208.1:8457/choreographer/echo");

            // Open connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Set the request method (GET, POST, etc.)
            conn.setRequestMethod("GET");

            // Set headers if needed
            //conn.setRequestProperty("Content-Type", "application/json");

            // Get the response code
            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the response
            System.out.println("Response Body: " + response.toString());

            // Close the connection
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        try {
            // Create URL object
            URL url = new URL("http://172.17.208.1:8457/choreographer/echo");

            // Open connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Set the request method (GET)
            conn.setRequestMethod("GET");

            // Get the response code
            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the response
            System.out.println("Response Body: " + response.toString());

            // Close the connection
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
