/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package br.com.sw2you.realmeet.api.facade;

import br.com.sw2you.realmeet.api.model.Error;
import br.com.sw2you.realmeet.api.model.Room;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T14:39:08.394485100+01:00[Europe/Lisbon]")

@Validated
@Api(value = "rooms", description = "the rooms API")
public interface RoomsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /rooms : Return rooms
     *
     * @param id ID of the room (optional)
     * @return OK (status code 200)
     *         or Unexpected error (status code 200)
     */
    @ApiOperation(value = "Return rooms", nickname = "listRooms", notes = "", response = Room.class, tags={ "room", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Room.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/rooms",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default CompletableFuture<ResponseEntity<Room>> listRooms(@ApiParam(value = "ID of the room") @Valid @RequestParam(value = "id", required = false) Long id) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"name\" : \"name\", \"id\" : 0 }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }

}