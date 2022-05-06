public QueueInterface<T> getdepthFirstTraversal(T origin){
    //assumes graph is not empty
    resetVertices();
    QueueInterface<T> traversalOrder = new LinkedQueue<T>();
    StackInterface<VertexInterface<T>> vertexStack = new LinkedStack<>();

    VertexInterface<T> originVertex = vertices.getValue(origin);
    originVertex.visit();
    traversalOrder.enqueue(origin);     //enqueue vertex label
    vertexStack.push(originVertex);     //enqueue vertex

    while(!VertexStack.isEmpty()){
        VertexInterface<T> topVertex = vertexStack.peek();
        VertexInterface<T> nextNeighbor = topVertex.getUnvisitedNeighbor();

        if(nextNeighbor != null){
            nextNeighbor.visit();
            traversalOrder.enqueue(nextNeighbor.getLabel());
            vertexStack.push(nextNeighbor);
        }else{//All neighbors are visited
            vertexStack.pop();
        }
    }//end while

    return traversalOrder;
}//end getDepthFirstTraversal