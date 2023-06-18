package br.com.sw2you.realmeet.api.facade;

import br.com.sw2you.realmeet.api.ApiClient;

import br.com.sw2you.realmeet.api.model.Error;
import br.com.sw2you.realmeet.api.model.Room;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-24T14:39:05.030149+01:00[Europe/Lisbon]")
@Component("br.com.sw2you.realmeet.api.facade.RoomApi")
public class RoomApi {
    private ApiClient apiClient;

    public RoomApi() {
        this(new ApiClient());
    }

    @Autowired
    public RoomApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Return rooms
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param id ID of the room (optional)
     * @return Room
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Room listRooms(Long id) throws RestClientException {
        return listRoomsWithHttpInfo(id).getBody();
    }

    /**
     * Return rooms
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param id ID of the room (optional)
     * @return ResponseEntity&lt;Room&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Room> listRoomsWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/rooms", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Room> returnType = new ParameterizedTypeReference<Room>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
