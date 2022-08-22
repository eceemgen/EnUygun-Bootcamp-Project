import com.google.common.eventbus.EventBus;
import jdk.nashorn.api.scripting.ScriptObjectMirror;
import org.testng.Assert;
import org.testng.annotations.Test;
public class findbyStatusTest {
    private Object getClass;

    @SuppressWarnings("JoinDeclarationAndAssignmentJava")
    @Test
    public void VerifySuccessfullfindingbyStatus() throws UnirestException {
        ScriptObjectMirror Unirest;
        Unirest.setTimeouts(0, 0);
        HttpResponse <String> response;
                response = Unirest.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
                .asString();

        Assert.assertEquals(200,response.(getClass));
    }

    private class UnirestException extends Exception {
    }

    private class HttpResponse<T> {
    }
}