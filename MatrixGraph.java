import java.util.*;
 
public class MatrixGraph{
     ArrayList<Vertex> vertices; 
     private static int matrix [] [];

    MatrixGraph(int size){
        vertices = new ArrayList<>();
        matrix = new int[size][size];
    } //end constructor 

    public void addNode(Vertex vertices){ 
        vertices.add(vertices); 
    } //end addNode

    public void addEdge(int intial, int target){
        matrix[intial][target] = 1; 
    } //end addEdge

    public boolean checkEdge(int intial, int target){
        if (matrix[intial][target] == 1){ 
            return true;
        }
        else{
            return false;
        }
    }//end checkEdge

    void BFS(int start, int numbvertex)         //is this supposed to be the getBreadthTraversal
    {
        boolean[] examined = new boolean[numbvertex];
        Arrays.fill(examined, false);
        List<Integer> queue = new ArrayList<>();
        queue.add(start);
 
        examined[start] = true;
 
        int temp;
        while (!queue.isEmpty()){

            temp = queue.get(0);
 
            System.out.print(temp + " ");
            queue.remove(queue.get(0));
 
            for(int i = 0; i < numbvertex; i++) {

                if (matrix[temp][i] == 1 && (!examined[i])) {
                    queue.add(i);

                    examined[i] = true;
                }
            }
        }
    }

    void DFS(int start, int numbvertex){

    }

    public print(){
        System.out.println("The adjacency matrix for the given graph is: ");
        for(int i=1; i<=9; i++){
            System.out.print(i + " ");
        }

        for(int i=1; i<=9; i++){
            System.out.print(i + " ");
                for(int j=1; j<=9; j++){
                    System.out.print(graph.getEdge(i, j) + " ");
                }
        }
    }
/*
      System.out.println("The adjacency matrix for the given graph is: ");
            System.out.print("  ");
            for (int i = 1; i <= 9; i++)
                System.out.print(i + " ");
            System.out.println();

            for (int i = 1; i <= 9; i++)
            {
                System.out.print(i + " ");
                for (int j = 1; j <= 9; j++)
                    System.out.print(graph.getEdge(i, j) + " ");
                System.out.println();
            }

        }  print should look something like this
*/
/*
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

 */
}
