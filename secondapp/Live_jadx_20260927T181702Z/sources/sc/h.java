package sc;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f129841c = new h(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f129842d = new h(a.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f129843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f129844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f129845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f129846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f129847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f129848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f129849k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f129850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f129851b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f129843e = new h(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f129844f = new h(aVar2, bVar);
        f129845g = new h(a.xMaxYMax, bVar);
        f129846h = new h(a.xMidYMin, bVar);
        f129847i = new h(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f129848j = new h(aVar, bVar2);
        f129849k = new h(aVar2, bVar2);
    }

    public h(a aVar, b bVar) {
        this.f129850a = aVar;
        this.f129851b = bVar;
    }

    public static h c(String str) {
        try {
            return p.w0(str);
        } catch (o e10) {
            throw new IllegalArgumentException(e10.getMessage());
        }
    }

    public a a() {
        return this.f129850a;
    }

    public b b() {
        return this.f129851b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f129850a == hVar.f129850a && this.f129851b == hVar.f129851b;
    }

    public String toString() {
        return this.f129850a + " " + this.f129851b;
    }
}
