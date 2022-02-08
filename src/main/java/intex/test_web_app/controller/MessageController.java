package intex.test_web_app.controller;

import intex.test_web_app.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @GetMapping("getMessage")
    public ResponseEntity<String> getMessage (){
        return ResponseEntity.status(HttpStatus.OK)
                .body(messageService.getMessage());
    }
}
