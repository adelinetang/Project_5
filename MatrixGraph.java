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
