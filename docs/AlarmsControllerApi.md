# AlarmsControllerApi

All URIs are relative to *http://127.0.0.1:8082*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activeAlarms**](AlarmsControllerApi.md#activeAlarms) | **POST** /api/alarms/activeAlarms |  |
| [**addAlarms**](AlarmsControllerApi.md#addAlarms) | **POST** /api/alarms/addAlarms |  |
| [**deleteAlarms**](AlarmsControllerApi.md#deleteAlarms) | **POST** /api/alarms/deleteAlarms |  |
| [**deleteContact**](AlarmsControllerApi.md#deleteContact) | **POST** /api/alarms/deleteContact |  |
| [**deleteContacts**](AlarmsControllerApi.md#deleteContacts) | **POST** /api/alarms/deleteContacts |  |
| [**getAlarms**](AlarmsControllerApi.md#getAlarms) | **POST** /api/alarms/getAlarms |  |
| [**getAlarmsHistory**](AlarmsControllerApi.md#getAlarmsHistory) | **POST** /api/alarms/getAlarmsHistory |  |
| [**getAllContacts**](AlarmsControllerApi.md#getAllContacts) | **POST** /api/alarms/getAllContacts |  |
| [**getContactById**](AlarmsControllerApi.md#getContactById) | **POST** /api/alarms/getContactById |  |
| [**reBindWeChat**](AlarmsControllerApi.md#reBindWeChat) | **POST** /api/alarms/reBindWeChat |  |
| [**saveContact**](AlarmsControllerApi.md#saveContact) | **POST** /api/alarms/saveContact |  |
| [**updateAlarms**](AlarmsControllerApi.md#updateAlarms) | **POST** /api/alarms/updateAlarms |  |


<a id="activeAlarms"></a>
# **activeAlarms**
> String activeAlarms(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.activeAlarms(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#activeAlarms");
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

<a id="addAlarms"></a>
# **addAlarms**
> String addAlarms(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.addAlarms(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#addAlarms");
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

<a id="deleteAlarms"></a>
# **deleteAlarms**
> String deleteAlarms(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.deleteAlarms(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#deleteAlarms");
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

<a id="deleteContact"></a>
# **deleteContact**
> String deleteContact(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.deleteContact(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#deleteContact");
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

<a id="deleteContacts"></a>
# **deleteContacts**
> String deleteContacts(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.deleteContacts(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#deleteContacts");
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

<a id="getAlarms"></a>
# **getAlarms**
> String getAlarms(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getAlarms(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#getAlarms");
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

<a id="getAlarmsHistory"></a>
# **getAlarmsHistory**
> String getAlarmsHistory(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getAlarmsHistory(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#getAlarmsHistory");
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

<a id="getAllContacts"></a>
# **getAllContacts**
> String getAllContacts(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getAllContacts(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#getAllContacts");
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

<a id="getContactById"></a>
# **getContactById**
> String getContactById(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getContactById(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#getContactById");
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

<a id="reBindWeChat"></a>
# **reBindWeChat**
> String reBindWeChat(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.reBindWeChat(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#reBindWeChat");
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

<a id="saveContact"></a>
# **saveContact**
> String saveContact(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.saveContact(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#saveContact");
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

<a id="updateAlarms"></a>
# **updateAlarms**
> String updateAlarms(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.AlarmsControllerApi;

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

    AlarmsControllerApi apiInstance = new AlarmsControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.updateAlarms(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsControllerApi#updateAlarms");
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

