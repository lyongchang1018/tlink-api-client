package com.tlink.openapi;

import java.util.HashMap;
import java.util.Map;

import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.api.UserControllerApi;

public class Example {
  
  public static void main(String[] args) {

      //ApiClient defaultClient = Configuration.getDefaultApiClient();
      //defaultClient.setBasePath("http://127.0.0.1:8082");

      // Configure API key authorization: tlinkAppId
      //ApiKeyAuth tlinkAppId = (ApiKeyAuth) defaultClient.getAuthentication("tlinkAppId");
      //tlinkAppId.setApiKey("YOUR API KEY");
      // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
      //tlinkAppId.setApiKeyPrefix("Token");

      // Configure OAuth2 access token for authorization: Authenticate
      //OAuth Authenticate = (OAuth) defaultClient.getAuthentication("Authenticate");
      //Authenticate.setAccessToken("YOUR ACCESS TOKEN");

      Map<String, String> parameters = new HashMap<String, String>();
      parameters.put("username", "test");
      parameters.put("password", "mnkj23329978");

      String basePath = "https://app.dtuip.com";
      
      String clientId = "d3a25f47552843be8483011c12769d7f";
      String clientSecret = "dfgergwergdfawefawcafv";

      ApiClient defaultClient = new ApiClient(basePath, clientId, clientSecret, parameters);
      defaultClient.setApiKey(clientId);

      UserControllerApi apiInstance = new UserControllerApi(defaultClient);
      apiInstance.setCustomBaseUrl(basePath);

      Map<String, Object> requestBody = new HashMap<>();
      requestBody.put("userId", "223");
//      requestBody.put("currPage","1");
//      requestBody.put("pageSize", "10");

      try {
          String result = apiInstance.getUserInfo(requestBody);
          System.out.println(result);
      } catch (ApiException e) {
          System.err.println("Exception when calling YunzutaiControllerApi#getYunzutaiList");
          System.err.println("Status code: " + e.getCode());
          System.err.println("Reason: " + e.getResponseBody());
          System.err.println("Response headers: " + e.getResponseHeaders());
          e.printStackTrace();
      }
  }

}