package u4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.a f139059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f139060b;

    public w0(androidx.media3.common.a aVar, long j10) {
        zi.l0.e(aVar.F != null, "format colorInfo must be set");
        int i10 = aVar.f13649w;
        zi.l0.k(i10 > 0, "format width must be positive, but is: %s", i10);
        int i11 = aVar.f13650x;
        zi.l0.k(i11 > 0, "format height must be positive, but is: %s", i11);
        this.f139059a = aVar;
        this.f139060b = j10;
    }
}
