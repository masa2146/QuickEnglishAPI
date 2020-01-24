package com.bulut.quickenglishapi.controller.podcast;

import com.bulut.quickenglishapi.model.podcast.*;
import com.bulut.quickenglishapi.repository.podcast.*;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/podcast")
@AllArgsConstructor
public class PodcastController {

    private final PodcastL1Repository l1repo;
    private final PodcastL2Repository l2repo;
    private final PodcastL3Repository l3repo;
    private final PodcastLBRepository lBrepo;

    private final PodcastVoa1Repository voa1repo;
    private final PodcastVoa2Repository voa2repo;



    //Todo: level_1
    //Todo: level_2
    //Todo: level_3
    //Todo: level_business
    //Todo: level_voa_level_1
    //Todo: level_voa_level_2


    // GET DATA WITH PAGEABLE

    /**
     * get level1 data with page
     * */
    @GetMapping("/level_1")
    public ResponseEntity<Page<PodcastL1>> getLevel1WithPage(@RequestParam("page") int page){
        Pageable pageable = PageRequest.of(page,10);
        Page<PodcastL1> foundData = l1repo.findAll(pageable);
        if (foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * get level2 data with page
     * */
    @GetMapping("/level_2")
    public ResponseEntity<Page<PodcastL2>> getLevel2WithPage(@RequestParam("page") int page){
        Pageable pageable = PageRequest.of(page,10);
        Page<PodcastL2> foundData = l2repo.findAll(pageable);
        if (foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * get level3 data with page
     * */
    @GetMapping("/level_3")
    public ResponseEntity<Page<PodcastL3>> getLevel3WithPage(@RequestParam("page") int page){
        Pageable pageable = PageRequest.of(page,10);
        Page<PodcastL3> foundData = l3repo.findAll(pageable);
        if (foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }


    /**
     * get level_business data with page
     * */
    @GetMapping("/level_business")
    public ResponseEntity<Page<PodcastLB>> getLevelBusinessWithPage(@RequestParam("page") int page){
        Pageable pageable = PageRequest.of(page,10);
        Page<PodcastLB> foundData = lBrepo.findAll(pageable);
        if (foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }


    /**
     * get level_voa_level_1 data with page
     * */
    @GetMapping("/level_voa_level_1")
    public ResponseEntity<Page<PodcastVoa1>> getVoa1WithPage(@RequestParam("page") int page){
        Pageable pageable = PageRequest.of(page,10);
        Page<PodcastVoa1> foundData = voa1repo.findAll(pageable);
        if (foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * get level_voa_level_2 data with page
     * */
    @GetMapping("/level_voa_level_1")
    public ResponseEntity<Page<PodcastVoa2>> getVoa2WithPage(@RequestParam("page") int page){
        Pageable pageable = PageRequest.of(page,10);
        Page<PodcastVoa2> foundData = voa2repo.findAll(pageable);
        if (foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    // GET ALL DATA

    /**
     * get all level_1 data
     * */
    @GetMapping("/level_1/all")
    public ResponseEntity<List<PodcastL1>> getAllLevel1(){
        List<PodcastL1> foundData = l1repo.findAll();
        if ( foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * get all level_2 data
     * */
    @GetMapping("/level_2/all")
    public ResponseEntity<List<PodcastL2>> getAllLevel2(){
        List<PodcastL2> foundData = l2repo.findAll();
        if ( foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * get all level_2 data
     * */
    @GetMapping("/level_3/all")
    public ResponseEntity<List<PodcastL3>> getAllLevel3(){
        List<PodcastL3> foundData = l3repo.findAll();
        if ( foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * get all level_b data
     * */
    @GetMapping("/level_business/all")
    public ResponseEntity<List<PodcastLB>> getAllLevelBusiness(){
        List<PodcastLB> foundData = lBrepo.findAll();
        if ( foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * get all level_voa_level_1 data
     * */
    @GetMapping("/level_voa_level_1/all")
    public ResponseEntity<List<PodcastVoa1>> getAllVoa1(){
        List<PodcastVoa1> foundData = voa1repo.findAll();
        if ( foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }


    /**
     * get all level_voa_level_2 data
     * */
    @GetMapping("/level_voa_level_2/all")
    public ResponseEntity<List<PodcastVoa2>> getAllVoa2(){
        List<PodcastVoa2> foundData = voa2repo.findAll();
        if ( foundData != null){
            return ResponseEntity.ok(foundData);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
