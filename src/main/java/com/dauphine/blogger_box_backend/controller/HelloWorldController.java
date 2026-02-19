package com.dauphine.blogger_box_backend.controller;

import com.dauphine.blogger_box_backend.entities.ElementRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(
        name="Hello world API",
        description = "My first hello word endpoints"
)
public class HelloWorldController {

    @GetMapping("/v1/hello/{name}")
    @Operation(
            summary = "Hello by name endpoint",
            description = "Returns 'Hello {name}' by path variable"
    )
    public String sayHi(
            @Parameter(description = "Name to greet")
            @PathVariable String name) {
        return "Hi " + name;
    }
    //http://localhost:7575/hello/arnaud

    @GetMapping("/v1/hello")
    public String sayHiV2(@RequestParam String name) {
        return "v2 - Hi " + name;
    }
    //http://localhost:7575/hello?name=Arnaud pour testeGetMapping

    @PostMapping("/v1/elements")
    public String create(@RequestBody ElementRequest body) {
        return "Create new element with title '%s'".formatted(body.getDescription());
    }

    @PutMapping("/v1/elements/{id}")
    public String update(@PathVariable String id, @RequestBody ElementRequest body) {
        return "Update element with title '%s'".formatted(id, body.getDescription());
    }

    @PatchMapping("/v1/element/{id}/description")
    public String updateDescription(@PathVariable String id,
                                    @RequestBody ElementRequest body) {
        return "Update element with title '%s'".formatted(id, body.getDescription());
    }

    @DeleteMapping("/v1/element/{id}")
    public String delete(@PathVariable String id) {
        return "Delete element with title '%s'".formatted(id);
    }

}
