package fj;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f84625a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f84626b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f84627c = 20;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f84628d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f84629e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f84630f = "Node %s is not an element of this graph.";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f84631g = "Edge %s is not an element of this graph.";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f84632h = "Node %s that was used to generate this set is no longer in the graph.";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f84633i = "Node %s or node %s that were used to generate this set are no longer in the graph.";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f84634j = "Edge %s that was used to generate this set is no longer in the graph.";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f84635k = "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f84636l = "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f84637m = "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f84638n = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f84639o = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f84640p = "Edge %s already exists in the graph.";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f84641q = "Mismatch: endpoints' ordering is not compatible with directionality of the graph";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        EDGE_EXISTS
    }
}
