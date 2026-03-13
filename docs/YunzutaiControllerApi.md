# YunzutaiControllerApi

All URIs are relative to *http://127.0.0.1:8082*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getYunzutaiList**](YunzutaiControllerApi.md#getYunzutaiList) | **POST** /api/yunzutai/getYunzutaiList |  |


<a id="getYunzutaiList"></a>
# **getYunzutaiList**
> String getYunzutaiList(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.YunzutaiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://127.0.0.1:8082");
    
    // Configure API key authorization: tlinkAppId
    ApiKeyAuth tlinkAppId = (ApiKeyAuth) defaultClient.getAuthentication("tlinkAppId");
    tlinkAppId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tlinkAppId.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: Authenticate
    OAuth Authenticate = (OAuth) defaultClient.getAuthentication("Authenticate");
    Authenticate.setAccessToken("YOUR ACCESS TOKEN");

    YunzutaiControllerApi apiInstance = new YunzutaiControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getYunzutaiList(requestBody);
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
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |

### Return type

**String**

### Authorization

[tlinkAppId](../README.md#tlinkAppId), [Authenticate](../README.md#Authenticate)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

