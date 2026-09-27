package cv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum x implements j {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ sr.a f77331l = sr.c.c(g());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77333c;

    x(int i10, int i11) {
        this.f77332b = i10;
        this.f77333c = i11;
    }

    @oy.l
    public static sr.a<x> h() {
        return f77331l;
    }

    @Override // cv.j
    public int d() {
        return this.f77333c;
    }

    @Override // cv.j
    public int getValue() {
        return this.f77332b;
    }

    /* synthetic */ x(int i10, int i11, int i12, kotlin.jvm.internal.x xVar) {
        this(i10, (i12 & 2) != 0 ? i10 : i11);
    }
}
