package bb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.h f21072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ab.d f21073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21074d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, ab.h hVar, ab.d dVar, boolean z10) {
        this.f21071a = aVar;
        this.f21072b = hVar;
        this.f21073c = dVar;
        this.f21074d = z10;
    }

    public a a() {
        return this.f21071a;
    }

    public ab.h b() {
        return this.f21072b;
    }

    public ab.d c() {
        return this.f21073c;
    }

    public boolean d() {
        return this.f21074d;
    }
}
