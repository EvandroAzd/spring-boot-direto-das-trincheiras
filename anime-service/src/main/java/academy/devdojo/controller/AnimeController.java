package academy.devdojo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/anime")
public class AnimeController {

    @GetMapping
    public List<String> listAll(){
        return List.of("Demon Slayer", "Naruto");
    }
}
