package gab.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/platform", produces = "application/json")
@CrossOrigin("*")
@AllArgsConstructor
public class PlatformController {

}
