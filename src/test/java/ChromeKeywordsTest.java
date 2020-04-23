
import javax.json.JsonObject;

import org.junit.Test;

import step.functions.io.Output;
import step.handlers.javahandler.KeywordRunner;
import step.handlers.javahandler.KeywordRunner.ExecutionContext;

public class ChromeKeywordsTest {
	@Test
	public void createAndNavigateTest() throws Exception {
		ExecutionContext ctx = KeywordRunner.getExecutionContext(ChromeKeywords.class);
		Output<JsonObject> output = ctx.run("createAndNavigate", "{\"url\" : \"http://localhost:8080/\",\"plan\" : \"plan2\",\"username\" : \"admin\",\"password\" : \"init\"}");
		System.out.println(output.getPayload());
	}
}
