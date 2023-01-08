package org.example.repository;

import org.example.model.VirtualNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Repository Interface
 */
public interface VirtualNodeRepository extends JpaRepository<VirtualNode,Long> {
    @Query(
            value = "SELECT Connection_Id FROM VIRTUAL_NODE u WHERE u.source_Node_Id = :nodeId or u.destination_Node_Id = :nodeId",
            nativeQuery = true)
    String findConnectionIdBySourceNodeIdOrDestinationNodeIdNative(@Param("nodeId") String nodeId);
}
