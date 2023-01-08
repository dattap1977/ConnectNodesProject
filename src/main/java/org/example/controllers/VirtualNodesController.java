package org.example.controllers;

import org.example.model.VirtualNode;
import org.example.service.VirtualNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Controller class for Spring Boot Application
 */

@RestController
public class VirtualNodesController {
    @Autowired
    private VirtualNodeService virtualNodeService;

    /**
     * REST api for inserting connectionn id, source node id and destination node id
     * @param node
     * @return
     */

    @PostMapping("/api/createVirtualNodes")
    public ResponseEntity<?> createVirtualNode(@RequestBody VirtualNode node){
           virtualNodeService.save(node);
           Map<String,Object> map = new LinkedHashMap<>();
           map.put("status","1");
           map.put("message","VirtualNode created successfully");
           return new ResponseEntity<>(map, HttpStatus.CREATED);

    }

    /**
     * REST api for returning the connection name when a given virtual node is passed
     * @param nodeId
     * @return
     */

    @GetMapping("/api/getConnectionId/{nodeId}")
    public ResponseEntity<?> getConnectionId(@PathVariable String nodeId){

        String connectionId = virtualNodeService.getConnectionId(nodeId);
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("status","1");
        map.put("message","Connection name = " + connectionId);
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }
}
