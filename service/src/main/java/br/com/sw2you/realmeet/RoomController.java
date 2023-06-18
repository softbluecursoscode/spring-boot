package br.com.sw2you.realmeet;

import br.com.sw2you.realmeet.api.facade.RoomsApi;
import br.com.sw2you.realmeet.api.model.Room;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

import static java.util.concurrent.CompletableFuture.supplyAsync;

@RestController
public class RoomController implements RoomsApi {

    @Override
    public CompletableFuture<ResponseEntity<Room>> listRooms(@Valid Long id) {
        return supplyAsync(() -> ResponseEntity.ok(new Room().id(1L).name("Room #1")));
    }
}
