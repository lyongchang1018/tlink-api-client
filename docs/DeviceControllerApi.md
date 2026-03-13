# DeviceControllerApi

All URIs are relative to *http://127.0.0.1:8082*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDevice**](DeviceControllerApi.md#addDevice) | **POST** /api/device/addDevice |  |
| [**addDeviceGroup**](DeviceControllerApi.md#addDeviceGroup) | **POST** /api/device/addDeviceGroup |  |
| [**deleteDevice**](DeviceControllerApi.md#deleteDevice) | **POST** /api/device/deleteDevice |  |
| [**deleteDeviceGroup**](DeviceControllerApi.md#deleteDeviceGroup) | **POST** /api/device/deleteDeviceGroup |  |
| [**deviceWrite**](DeviceControllerApi.md#deviceWrite) | **POST** /api/device/deviceWrite |  |
| [**getDeviceGroup**](DeviceControllerApi.md#getDeviceGroup) | **POST** /api/device/getDeviceGroup |  |
| [**getDeviceSensorDatas**](DeviceControllerApi.md#getDeviceSensorDatas) | **POST** /api/device/getDeviceSensorDatas |  |
| [**getDevices**](DeviceControllerApi.md#getDevices) | **POST** /api/device/getDevices |  |
| [**getModbus**](DeviceControllerApi.md#getModbus) | **POST** /api/device/getModbus |  |
| [**getParams**](DeviceControllerApi.md#getParams) | **POST** /api/device/getParams |  |
| [**getProtocolLabel**](DeviceControllerApi.md#getProtocolLabel) | **POST** /api/device/getProtocolLabel |  |
| [**getSensorHistroy**](DeviceControllerApi.md#getSensorHistroy) | **POST** /api/device/getSensorHistroy |  |
| [**getSensorMapping**](DeviceControllerApi.md#getSensorMapping) | **POST** /api/device/getSensorMapping |  |
| [**getSingleDeviceDatas**](DeviceControllerApi.md#getSingleDeviceDatas) | **POST** /api/device/getSingleDeviceDatas |  |
| [**getSingleSensorDatas**](DeviceControllerApi.md#getSingleSensorDatas) | **POST** /api/device/getSingleSensorDatas |  |
| [**sendDatapoint**](DeviceControllerApi.md#sendDatapoint) | **POST** /api/device/sendDataPoint |  |
| [**setFlag**](DeviceControllerApi.md#setFlag) | **POST** /api/device/setFlag |  |
| [**setModbus**](DeviceControllerApi.md#setModbus) | **POST** /api/device/setModbus |  |
| [**setMqtt**](DeviceControllerApi.md#setMqtt) | **POST** /api/device/getFlag |  |
| [**setParams**](DeviceControllerApi.md#setParams) | **POST** /api/device/setParams |  |
| [**setProtocolLabel**](DeviceControllerApi.md#setProtocolLabel) | **POST** /api/device/setProtocolLabel |  |
| [**switcherController**](DeviceControllerApi.md#switcherController) | **POST** /api/device/switcherController |  |
| [**updateDevice**](DeviceControllerApi.md#updateDevice) | **POST** /api/device/updateDevice |  |
| [**updateDeviceGroup**](DeviceControllerApi.md#updateDeviceGroup) | **POST** /api/device/updateDeviceGroup |  |
| [**updateModbus**](DeviceControllerApi.md#updateModbus) | **POST** /api/device/updateModbus |  |
| [**updateUserInfo1**](DeviceControllerApi.md#updateUserInfo1) | **POST** /api/device/saveOrUpdateMapping |  |


<a id="addDevice"></a>
# **addDevice**
> String addDevice(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.addDevice(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#addDevice");
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

<a id="addDeviceGroup"></a>
# **addDeviceGroup**
> String addDeviceGroup(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.addDeviceGroup(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#addDeviceGroup");
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

<a id="deleteDevice"></a>
# **deleteDevice**
> String deleteDevice(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.deleteDevice(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#deleteDevice");
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

<a id="deleteDeviceGroup"></a>
# **deleteDeviceGroup**
> String deleteDeviceGroup(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.deleteDeviceGroup(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#deleteDeviceGroup");
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

<a id="deviceWrite"></a>
# **deviceWrite**
> String deviceWrite(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.deviceWrite(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#deviceWrite");
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

<a id="getDeviceGroup"></a>
# **getDeviceGroup**
> String getDeviceGroup(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getDeviceGroup(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#getDeviceGroup");
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

<a id="getDeviceSensorDatas"></a>
# **getDeviceSensorDatas**
> String getDeviceSensorDatas(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getDeviceSensorDatas(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#getDeviceSensorDatas");
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

<a id="getDevices"></a>
# **getDevices**
> String getDevices(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getDevices(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#getDevices");
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

<a id="getModbus"></a>
# **getModbus**
> String getModbus(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getModbus(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#getModbus");
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

<a id="getParams"></a>
# **getParams**
> String getParams(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getParams(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#getParams");
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

<a id="getProtocolLabel"></a>
# **getProtocolLabel**
> String getProtocolLabel(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getProtocolLabel(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#getProtocolLabel");
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

<a id="getSensorHistroy"></a>
# **getSensorHistroy**
> String getSensorHistroy(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getSensorHistroy(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#getSensorHistroy");
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

<a id="getSensorMapping"></a>
# **getSensorMapping**
> String getSensorMapping(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getSensorMapping(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#getSensorMapping");
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

<a id="getSingleDeviceDatas"></a>
# **getSingleDeviceDatas**
> String getSingleDeviceDatas(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getSingleDeviceDatas(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#getSingleDeviceDatas");
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

<a id="getSingleSensorDatas"></a>
# **getSingleSensorDatas**
> String getSingleSensorDatas(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.getSingleSensorDatas(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#getSingleSensorDatas");
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

<a id="sendDatapoint"></a>
# **sendDatapoint**
> String sendDatapoint(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.sendDatapoint(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#sendDatapoint");
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

<a id="setFlag"></a>
# **setFlag**
> String setFlag(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.setFlag(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#setFlag");
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

<a id="setModbus"></a>
# **setModbus**
> String setModbus(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.setModbus(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#setModbus");
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

<a id="setMqtt"></a>
# **setMqtt**
> String setMqtt(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.setMqtt(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#setMqtt");
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

<a id="setParams"></a>
# **setParams**
> String setParams(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.setParams(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#setParams");
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

<a id="setProtocolLabel"></a>
# **setProtocolLabel**
> String setProtocolLabel(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.setProtocolLabel(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#setProtocolLabel");
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

<a id="switcherController"></a>
# **switcherController**
> String switcherController(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.switcherController(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#switcherController");
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

<a id="updateDevice"></a>
# **updateDevice**
> String updateDevice(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.updateDevice(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#updateDevice");
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

<a id="updateDeviceGroup"></a>
# **updateDeviceGroup**
> String updateDeviceGroup(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.updateDeviceGroup(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#updateDeviceGroup");
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

<a id="updateModbus"></a>
# **updateModbus**
> String updateModbus(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.updateModbus(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#updateModbus");
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

<a id="updateUserInfo1"></a>
# **updateUserInfo1**
> String updateUserInfo1(requestBody)



### Example
```java
// Import classes:
import com.tlink.openapi.invoker.ApiClient;
import com.tlink.openapi.invoker.ApiException;
import com.tlink.openapi.invoker.Configuration;
import com.tlink.openapi.invoker.auth.*;
import com.tlink.openapi.invoker.models.*;
import com.tlink.openapi.api.DeviceControllerApi;

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

    DeviceControllerApi apiInstance = new DeviceControllerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      String result = apiInstance.updateUserInfo1(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceControllerApi#updateUserInfo1");
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

