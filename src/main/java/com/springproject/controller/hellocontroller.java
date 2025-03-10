package com.springproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")//class seviyesinde
public class hellocontroller {

    //GET : Veri görüntülemek için                                  @GetMapping
    //POST : Veri kaydetmek için                                    @PostMapping
    //PUT : Veri güncellemek için                                   @PutMapping
    //PATCH : Verinin bir bölümünü güncellemek istediğimiz zaman    @PatchMapping
    //  Orn : Parola güncellemek gibi
    //DELETE : Veri silmek için                                      @DeleteMapping

    // localhost:8080/hello
  //  @GetMapping(path="/hello")
    @RequestMapping(path="/hello" , method = RequestMethod.GET)//method seviyesinde
    public String sayHello(){
        return "Hello World";
    }

    @PostMapping("/post")
    public String save(){
        return "Data saved";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Data deleted";
    }

    @PutMapping("/put")
    public String put(){
        return "Data putted";
    }

}
