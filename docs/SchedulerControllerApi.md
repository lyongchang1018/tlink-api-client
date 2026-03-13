# SchedulerControllerApi

All URIs are relative to *http://127.0.0.1:8082*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activeScheduler**](SchedulerControllerApi.md#activeScheduler) | **POST** /api/scheduler/activeScheduler |  |
| [**addScheduler**](SchedulerControllerApi.md#addScheduler) | **POST** /api/scheduler/addScheduler |  |
| [**deleteScheduler**](SchedulerControllerApi.md#deleteScheduler) | **POST** /api/scheduler/deleteScheduler |  |
| [**getScheduler**](SchedulerControllerApi.md#getScheduler) | **GET** /api/scheduler/getScheduler |  |
| [**updateScheduler**](SchedulerControllerApi.md#updateScheduler) | **POST** /api/scheduler/updateScheduler |  |


<a id="activeScheduler"></a>
# **activeScheduler**
> String activeScheduler(body)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.SchedulerControllerApi;

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

    SchedulerControllerApi apiInstance = new SchedulerControllerApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.activeScheduler(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerControllerApi#activeScheduler");
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
| **body** | **String**|  | |

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

<a id="addScheduler"></a>
# **addScheduler**
> String addScheduler(body)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.SchedulerControllerApi;

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

    SchedulerControllerApi apiInstance = new SchedulerControllerApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.addScheduler(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerControllerApi#addScheduler");
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
| **body** | **String**|  | |

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

<a id="deleteScheduler"></a>
# **deleteScheduler**
> String deleteScheduler(body)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.SchedulerControllerApi;

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

    SchedulerControllerApi apiInstance = new SchedulerControllerApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.deleteScheduler(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerControllerApi#deleteScheduler");
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
| **body** | **String**|  | |

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

<a id="getScheduler"></a>
# **getScheduler**
> String getScheduler(jsonStr)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.SchedulerControllerApi;

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

    SchedulerControllerApi apiInstance = new SchedulerControllerApi(defaultClient);
    String jsonStr = "jsonStr_example"; // String | 
    try {
      String result = apiInstance.getScheduler(jsonStr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerControllerApi#getScheduler");
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
| **jsonStr** | **String**|  | |

### Return type

**String**

### Authorization

[tlinkAppId](../README.md#tlinkAppId), [Authenticate](../README.md#Authenticate)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateScheduler"></a>
# **updateScheduler**
> String updateScheduler(body)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.SchedulerControllerApi;

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

    SchedulerControllerApi apiInstance = new SchedulerControllerApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.updateScheduler(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulerControllerApi#updateScheduler");
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
| **body** | **String**|  | |

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

