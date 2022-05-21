<<<<<<< HEAD
import java.util.*;
 
 public class MatrixGraph{
     ArrayList<Vertex> vertices; 
     private static int matrix [] [];

    MatrixGraph(int size){
=======
import java.util*;
 
 public class MatrixGraph{
     ArrayList<Node> vertices; 
     private static int matrix [] [];
     StringBuilder b = new StringBuilder();

    AdjacencyMatrixGraph(int size){
>>>>>>> 9988fefd3c152b7ad415fe1945cddc361c0395d1
        vertices = new ArrayList<>();
        matrix = new int[size][size];
    } //end constructor 

<<<<<<< HEAD
    public void addNode(Vertex vertices){ 
=======
    public void addNode(Node vertices){ 
>>>>>>> 9988fefd3c152b7ad415fe1945cddc361c0395d1
        vertices.add(vertices); 
    } //end addNode

    public void addEdge(int intial, int target){
<<<<<<< HEAD
        matrix[intial][target] = 1; 
=======
        martix[intial][target] == 1; 
>>>>>>> 9988fefd3c152b7ad415fe1945cddc361c0395d1
    } //end addEdge

    public boolean checkEdge(int intial, int target){
        if (matrix[intial][target] == 1){ 
            return true;
        }
        else{
            return false;
        }
    }//end checkEdge
<<<<<<< HEAD

    void BFS(int start, int numbvertex)
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
}
=======
 }
>>>>>>> 9988fefd3c152b7ad415fe1945cddc361c0395d1
