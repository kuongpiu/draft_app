package draft.note.demoartifact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DraftController {
    @GetMapping
    public String getDumbMessage() {
        return "Hi there. Thanks for never give up !";
    }
}
