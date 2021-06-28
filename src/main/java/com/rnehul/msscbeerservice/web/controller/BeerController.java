package com.rnehul.msscbeerservice.web.controller;

import com.rnehul.msscbeerservice.web.model.BeerDto;
import com.sun.net.httpserver.Headers;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.ServerRequest;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.*;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    /**
     * Method to get beer using id;
     * @param beerId - beer id
     * @return - beerDto
     */
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        //todo impl here
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    /**
     * Method to update beer by id
     * @param beerId - beer id to be updated
     * @param beerDto - BeerDto object with updated values
     * @return - updated BeerDto object
     */
    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeerById(@PathVariable String beerId,@RequestBody BeerDto beerDto){
     // todo impl here
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Method to create new BeerDto object
     * @param beerDto - BeerDto object to be created
     * @return - BeerDto object created uuid
     */
    @PostMapping
    public ResponseEntity<BeerDto> saveBeer(@RequestBody BeerDto beerDto){
        //todo impl here
        Headers headers = new Headers();
        headers.add("Location","/api/v1/beer/"+beerDto.getBeerId());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * Method to delete BeerDto using beerId
     * @param beerId - beerId for which BeerDto need to be deleted
     * @return BeerDto
     */
    @DeleteMapping("/{beerId}")
    public ResponseEntity<BeerDto> deleteBeerById(@PathVariable("beerId") UUID beerId){
        //todo impl here
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
