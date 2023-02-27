package org.example.Grafo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph<V> {
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    public boolean addVertex(V v){
        return true; //Este código hay que modificarlo.
    }

    public boolean addEdge(V v1, V v2){
        return true; //Este código hay que modificarlo.
    }

    public Set<V> obtainAdjacents(V v) throws Exception{ return null; //Este código hay que modificarlo.
    }

    public boolean containsVertex(V v){
        return true; //Este código hay que modificarlo.
    }

    public List<V> onePath(V v1, V v2){
        return null; //Este código hay que modificarlo.
    }
}
