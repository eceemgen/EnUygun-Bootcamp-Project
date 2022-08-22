import jdk.nashorn.api.scripting.ScriptObjectMirror;
import org.testng.Assert;
import org.testng.annotations.Test;

;

@SuppressWarnings("JoinDeclarationAndAssignmentJava")
public class delete {
    @Test
    public void delete() throws UnirestException {
        ScriptObjectMirror Unirest;
        Unirest.setTimeouts(0, 0);
        HttpResponse <String> response;
        response = Unirest.delete("https://petstore.swagger.io/v2/pet/100")
                .asString();


        Assert.assertEquals(200,response.getClass());

    }

    private class HttpResponse<T> {
    }

    private class UnirestException extends Exception {
    }
}