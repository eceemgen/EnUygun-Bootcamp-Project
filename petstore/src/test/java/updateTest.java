import com.google.common.eventbus.EventBus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class updateTest {

    @Test
    public <HttpResponse> updateTest() throws UnirestException {
        EventBus Unirest;
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response;
        response = Unirest.post("https://petstore.swagger.io/v2/pet/100?name=ozbdnjphnq&status=pending")
                .asString();

        Assert.assertEquals(200,response.getClass());
    }

    private class UnirestException extends Exception {
    }
}
}