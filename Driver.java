public class Driver{
    public static void main(String[] args){
        MatrixGraph graph = new MatrixGraph(9);
        graph.addNode(new Vertex("A"));
        graph.addNode(new Vertex("B"));
        graph.addNode(new Vertex("C"));
        graph.addNode(new Vertex("D"));
        graph.addNode(new Vertex("E"));
        graph.addNode(new Vertex("F"));
        graph.addNode(new Vertex("G"));
        graph.addNode(new Vertex("H"));
        graph.addNode(new Vertex("I"));

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(3, 6);
        graph.addEdge(4, 5);
        graph.addEdge(4, 7);
        graph.addEdge(6, 7);
        graph.addEdge(5, 2);
        graph.addEdge(5, 7);
        graph.addEdge(7, 8);
        graph.addEdge(2, 1);
        graph.addEdge(8, 5);
        graph.BFS(0,9);
        System.out.println();
        boolean[] examined = new boolean [9];
        graph.DFS(0, examined);
    }
}