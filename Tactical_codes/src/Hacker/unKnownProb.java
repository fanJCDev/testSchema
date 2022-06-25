package Hacker;

import java.util.*;

public class unKnownProb {
    public static final int oo = (int) 2e5;
    public static final int mod = (int) 1e9 + 7;

    public static int dist[] = new int[oo];
    public static boolean used[] = new boolean[oo];

    public static List<List<Integer>> graph = new ArrayList<List<Integer>>();
    public static List<List<Integer>> dst = new ArrayList<List<Integer>>();

    public static Queue<Integer> Q = new LinkedList<>();
    ;
    public static int n, q, a, b, t, x;
    public static int tmp[] = new int[oo];

    public static void clear() {
        for (int i = 0; i < oo; i++) {
            used[i] = false;
            dist[i] = -1;
        }
        while (!Q.isEmpty())
            Q.remove();
    }

    public static void bfs(int node, int sz) {
        Q.add(node);
        used[node] = true;
        dist[node] = 0;
        while (!Q.isEmpty()) {
            int cur = Q.peek();
            Q.remove();
            for (int j = 0; j < graph.get(cur).size(); j++) {
                if (!used[graph.get(cur).get(j)]) {
                    used[graph.get(cur).get(j)] = true;
                    Q.add(graph.get(cur).get(j));
                    dist[graph.get(cur).get(j)] = dist[cur] + 1;
                }
            }

        }
        for (int j = 0; j < sz; j++) dst.get(node).add(dist[j]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            a--;
            b--;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 0; i < n; i++) {
            clear();
            bfs(i, n);
        }

        for (int i = 0; i < q; i++) {
            t = sc.nextInt();
            for (int j = 0; j < t; j++) tmp[j] = sc.nextInt();
            ;
            int ans = 0;
            if (t < 2) {
                System.out.println(0);
                continue;
            }
            for (int j = 0; j < t; j++) {
                for (int k = j + 1; k < t; k++)
                    ans = (ans + tmp[j] * tmp[k] * dst.get(tmp[j] - 1).get(tmp[k] - 1)) % mod;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
