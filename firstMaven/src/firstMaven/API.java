package firstMaven;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.StringEntity;


public class API 
{
	public void sendReuest() 
	{
		try {
			Request.Post("https://api.fullcontact.com/v3/person.enrich")
			.addHeader("Authorization","Bearer HDfFJd94algVnKoMaU5u5EeVRJU21tX1")
			.body(new StringEntity("{" +
			   "\"email\":\"bart@fullcontact.com\"," +
			"}"))
			.execute()
			.returnContent();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}

