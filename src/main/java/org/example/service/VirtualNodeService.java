package org.example.service;

import org.example.model.VirtualNode;
import org.springframework.stereotype.Service;

@Service
public interface VirtualNodeService {
    public void save(VirtualNode node);
    public String getConnectionId(String nodeId);
}
