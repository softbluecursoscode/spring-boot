# RoomApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listRooms**](RoomApi.md#listRooms) | **GET** /rooms | Return rooms



## listRooms

> Room listRooms(id)

Return rooms

### Example

```java
// Import classes:
import br.com.sw2you.realmeet.api.ApiClient;
import br.com.sw2you.realmeet.api.ApiException;
import br.com.sw2you.realmeet.api.Configuration;
import br.com.sw2you.realmeet.api.models.*;
import br.com.sw2you.realmeet.api.facade.RoomApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        RoomApi apiInstance = new RoomApi(defaultClient);
        Long id = 56L; // Long | ID of the room
        try {
            Room result = apiInstance.listRooms(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomApi#listRooms");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the room | [optional]

### Return type

[**Room**](Room.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

