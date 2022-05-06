public QueueInterface<T> getBreadthFirstTraversal(T origin){
    resetVertices();
    QueueInterface<T> traversalOrder = new LinkedQueue<T>();
    QueueInterface<VertexInterface<T>> vertexQueue = new LinkedQueue<VertexInterface<T>>();
    VertexInterface<T> originVertex = vertices.getValue(origin);
    originVertex.visit();
    traversalOrder.enqueue(origin);         //enqueue vertex label
    vertexQueue.enqueue(originVertex);      //emqueue vertex

    while(!vertexQueue.isEmpty()){
        VertexInterface<T> frontVertex = vertexQueue.dequeue();
        Iterator<VertexInterface<T>> neighbors = frontVertex.getNeighborIterator();
        while(neighbors.hasNext()){
            VertexInterface<T> nextNeighbor = neighbors.next();
            if(!nextNeighbor.isVisited()){
                nextNeighbor.visited();
                traversalOrder.enqueue(nextNeighbor.getLabel());
                vertexQueue.enqueue(nextNeighbor);
            }//end if
        }//end while
    }//end while

    return traversalOrder;
}//end getBreadthFirstTraversal