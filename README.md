# ConnectNodesProject
Assumptions -: The first API saves the connection name, source node id and destination node id, so for creating a particular
connection this API has to be called repeatedly until all the relations are exhausted for the connection.
The second API takes a virtual node id and returns the corresponding connection name.
This application is a spring boot application running on port 8090 and using h2 database for persistence.
