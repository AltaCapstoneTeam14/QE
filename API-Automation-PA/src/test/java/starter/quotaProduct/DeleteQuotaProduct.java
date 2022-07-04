package starter.quotaProduct;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteQuotaProduct {

    String base_url = "http://44.201.153.46:8081/api-dev/v1/products/quota/";
    String token, IdQuotaProduct;

    @Step("I set an endpoint for delete quota product")
    public String setAnEndpointForDeleteQuotaProduct() throws IOException {
        //      * Catch ID Quota Product
        this.IdQuotaProduct = FileUtils.readFileToString(new File(System.getProperty("user.dir") +
                "/src/test/resources/filejson/idQuotaProduct.json"), StandardCharsets.UTF_8);
        System.out.println(this.IdQuotaProduct);

        return base_url + this.IdQuotaProduct;
    }

    @Step("I request {string} DELETE quota product")
    public void seRequestDELETEQuotaProduct(String input) throws IOException {
        if (input.equals("validToken")){
            JSONObject requestBody = new JSONObject();
//           * Catch Token
            this.token = FileUtils.readFileToString(new File(System.getProperty("user.dir") +
                    "/src/test/resources/filejson/tokenAdmin.json"), StandardCharsets.UTF_8);
            System.out.println(this.token);
//           * Put Token in header
            SerenityRest.given().header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + this.token)
                    .body(requestBody.toJSONString()).delete(setAnEndpointForDeleteQuotaProduct());
        }else {
            JSONObject requestBody = new JSONObject();
            SerenityRest.given().header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + "invalidToken")
                    .body(requestBody.toJSONString()).delete(setAnEndpointForDeleteQuotaProduct());
        }
    }

    @Step("validate the data detail {string} after delete quota product")
    public void setValidateTheDataDetailAfterDeleteQuotaProduct(String message) {
        if (message.equals("DeleteProvider")){
            restAssuredThat(response -> response.body("message", Matchers.equalTo("Delete quota product success")));
            restAssuredThat(response -> response.body("code", Matchers.equalTo("201")));
        }else {
            restAssuredThat(response -> response.body("message", Matchers.equalTo("Full authentication is required to access this resource")));
            restAssuredThat(response -> response.body("'status'", Matchers.equalTo(401)));
        }
    }

}
