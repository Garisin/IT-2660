//File name is FinalProject
//Written by Garrison Konschak
//Written on 5/3/2022
package finalproject;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
public class FinalProject
{
    private final Map<Integer, List<Integer>> adjList;
    public FinalProject(int v)
    {
        adjList = new HashMap<>();
        for (int i = 1; i <= v; i++)
        adjList.put(i, new LinkedList<>());
    }
    public void setEdge(int to, int from)
    {
        if (to > adjList.size() || from > adjList.size())
        System.out.println("The vertices do not exist");
            List<Integer> toList = adjList.get(to);
        toList.add(from);
        List<Integer> fromList = adjList.get(from);
        fromList.add(to);
    }
    public List<Integer> getEdge(int to)
    {
        if (to > adjList.size())
        {
            System.out.println("The vertices do not exist");
            return null;
        }
    return adjList.get(to);
    }
    public static void main(String args[])
    {
        System.out.println("Enter the number of edges: ");
        try
        (Scanner edges = new Scanner(System.in)) 
        {
            int eNum = edges.nextInt();
            try
            {
                int vertMin = (int) Math.ceil((1 + Math.sqrt(1 + 8 * eNum)) / 2);
                int vertMax = eNum + 1;
                Random random = new Random();
                int verticies = Math.abs(random.nextInt(vertMax - vertMin) + vertMin);
                System.out.println("Random graph has " + verticies + " vertices");
                FinalProject reg = new FinalProject(verticies);
                int count = 1, to, from;
                while (count <= eNum)
                {
                    to = Math.abs(random.nextInt(verticies + 1 - 1) + 1);
                    from = Math.abs(random.nextInt(verticies + 1 - 1) + 1);
                    reg.setEdge(to, from);
                    count++;
                }
                System.out.println("The adjacency list representation of the random graph is: ");
                for (int i = 1; i <= verticies; i++)
                {
                    System.out.print(i + " >> ");
                    List<Integer> edgeList = reg.getEdge(i);
                    if (edgeList.isEmpty())
                        System.out.print("null");
                    else
                    {
                        for (int j = 1;; j++)
                        {
                            if (j != edgeList.size())
                                System.out.print(edgeList.get(j - 1) + " >> ");
                            else
                            {
                                System.out.print(edgeList.get(j - 1));
                                break;
                            }
                        }
                    }
                    System.out.println();
                }
            }
            catch (Exception E)
            {
                System.out.println("Something went wrong :(");
            }
}
}
}

public void BFS(int s)
{
    boolean visited[] = new boolean[V];
    LinkedList<Integer> queue = new LinkedList<Integer>();
    visited[s]=true;
    queue.add(s);
    while (queue.size() != 0)
    {
        s = queue.poll();
        System.out.print(s+" ");
        Iterator<Integer> i = adj[s].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
            {       
                visited[n] = true;
                queue.add(n);
            }
        }
    }
}

public void Graph::DFSUtil(int v, bool visited[])
{
    visited[v] = true;
    cout << v << " ";
    list<int>::iterator i;
    for (i = adj[v].begin(); i != adj[v].end(); ++i)
        if (!visited[*i])
            DFSUtil(*i, visited);
}

public void Graph::DFS(int v)
{
    bool *visited = new bool[V];
    for (int i = 0; i < V; i++)
        visited[i] = false;
    DFSUtil(v, visited);
}

class ShortestPath
{
    int V = 0;
    int minDistance(int distance[], Boolean spSet[])
    {
        int min = Integer.MAX_VALUE, min_index=-1;
        for (int v = 0; v < V; v++)
        if (spSet[v] == false && distance[v] <= min)
        {
            min = distance[v];
            min_index = v;
        }
        return min_index;
    }
    void printSolution(int distance[], int n)
    {
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" tt "+ distance[i]);
    }
    void dijkstra(int graph[][], int source, int v)
    {
        int distance[] = new int[V];
        Boolean spaceSet[] = new Boolean[V];
        for (int i = 0; i < V; i++)
        {
            distance[i] = Integer.MAX_VALUE;
            spaceSet[i] = false;
        }
        distance[source] = 0;
        for (int count = 0; count < V-1; count++)
        {
            int u = minDistance(distance, spaceSet);
            spaceSet[u] = true;
            for (int v = 0; v < V; v++)
                distance[u] != Integer.MAX_VALUE &&;
                distance[u] + graph[u][v] < distance[v]);
                distance[v] = distance[u] + graph[u][v];
        }
printSolution(distance, V);
}
}