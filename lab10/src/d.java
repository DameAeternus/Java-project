import java.util.Scanner;

public class GraphCreate {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        in.next();

        int nodes = in.nextInt();

        Graph graf = new Graph(nodes);

        for (int i=0; i<n; ++i) {
            String red = in.nextLine();
            String del[] = red.split(" ");

            switch(del[0]) {

                case "ADDEDGE": graf.addEdge(Integer.parseInt(del[1]), Integer.parseInt(del[2]));
                    break;
                case "DELETEEDGE": graf.deleteEdge(Integer.parseInt(del[1]), Integer.parseInt(del[2]));
                    break;
                case "ADJACENT": System.out.println(graf.adjacent(Integer.parseInt(del[1]), Integer.parseInt(del[2])));
                    break;
                case "PRINTMATRIX": graf.printMatrix();
                    break;
                case "PRINTNODE": System.out.println(graf.get_node_value(Integer.parseInt(del[1])));
            }
        }
    }
}

class Graph {

    int num_nodes; // broj na jazli
    Character nodes[];    // informacija vo jazlite - moze i ne mora?
    int adjMat[][];  // matrica na sosednost


    @SuppressWarnings("unchecked")
    public Graph(int num_nodes) {
        this.num_nodes = num_nodes;
        nodes = new Character[num_nodes];
        for (int i=0; i< num_nodes; ++i)
            nodes[i] = (char)(i + 'A');
        adjMat = new int[num_nodes][num_nodes];

        for(int i=0;i<this.num_nodes;i++)
            for(int j=0;j<this.num_nodes;j++)
                adjMat[i][j]=0;
    }


    int adjacent(int x,int y)
    {
        // proveruva dali ima vrska od jazelot so
        // indeks x do jazelot so indeks y
        return (adjMat[x][y]!=0)?1:0;
    }

    void addEdge(int x,int y,float tezina){
        // dodava vrska od jazelot so indeks x do jazelot so indeks y so tezina
        if(adjList[x].containsNeighbor(adjList[y])){
            adjList[x].updateNeighborWeight(adjList[y], tezina);
        }
        else
            adjList[x].addNeighbor(adjList[y], tezina);
    }



    void deleteEdge(int x,int y)
    {
        // ja brise vrskata megu jazlite so indeksi x i y
        adjMat[x][y]=0;
        adjMat[y][x]=0;
    }

    // Moze i ne mora?
    Character get_node_value(int x)
    {  // ja vraka informacijata vo jazelot so indeks x
        return nodes[x];
    }

    // Moze i ne mora?
    void set_node_value(int x, Character a)
    {  // ja postavuva informacijata vo jazelot so indeks na a
        nodes[x]=a;
    }


    public int getNum_nodes() {
        return num_nodes;
    }

    public void setNum_nodes(int num_nodes) {
        this.num_nodes = num_nodes;
    }


    void printMatrix() {
        for (int i=0; i < adjMat.length; ++i) {
            for (int j=0; j < adjMat[0].length; ++j)
                System.out.print(adjMat[i][j] + " ");
            System.out.println();
        }
    }
}