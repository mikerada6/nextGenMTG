package rad.axiom.mtg.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public
class AliveController {

    @Value( "${rad.axiom.version}" )
    private String version;

    @GetMapping("/alive")
    public
    ResponseEntity<String> alive() {
        log.info("is alive");
        return ResponseEntity.status(HttpStatus.OK).body("alive");
    }
    @GetMapping("/version")
    public
    ResponseEntity<String> version() {
        log.info("is version");
        return ResponseEntity.status(HttpStatus.OK).body(version);
    }
}
