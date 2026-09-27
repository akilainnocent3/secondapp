package pw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @cs.g
    public final int f121124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @cs.g
    public final long f121125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @cs.g
    public final int f121126c;

    public a() {
        this(0, 0L, 0, 7, null);
    }

    public a(int i10, long j10, int i11) {
        this.f121124a = i10;
        this.f121125b = j10;
        this.f121126c = i11;
    }

    public /* synthetic */ a(int i10, long j10, int i11, int i12, kotlin.jvm.internal.x xVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 60000L : j10, (i12 & 4) != 0 ? 100 : i11);
    }
}
