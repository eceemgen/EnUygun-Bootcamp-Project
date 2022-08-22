import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import jdk.nashorn.api.scripting.ScriptObjectMirror;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.http.HttpResponse;



public class findbyIDTest {
  private ScriptObjectMirror Unirest;

    @Test
    public void VerifySuccessfullfindingbyID() throws UnirestException {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.get("https://petstore.swagger.io/v2/pet/100")
                .asString();


        Assert.assertEquals(200,response.getClass());
    }

    private class HttpResponse<T> {
    }

    private class UnirestException extends Exception {
    }
}
}