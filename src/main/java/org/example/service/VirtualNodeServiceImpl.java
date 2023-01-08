package org.example.service;

import org.example.model.VirtualNode;
import org.example.repository.VirtualNodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  Service class for the controller
 */

@Service
public class VirtualNodeServiceImpl implements VirtualNodeService{
    @Autowired
    private VirtualNodeRepository virtualNodeRepository;
    public void save(VirtualNode node){
         virtualNodeRepository.save(node);
    }

    public String getConnectionId(String nodeId){
       String connectionId = virtualNodeRepository.findConnectionIdBySourceNodeIdOrDestinationNodeIdNative(nodeId);
       System.out.println("ConnectionId = " + connectionId);
       return connectionId;
    }
}
