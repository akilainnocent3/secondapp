package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dr.i0 f153474a = dr.k0.b(nf.f153035b);

    public static String a(long j10) {
        if (j10 < 1024) {
            return j10 + "B";
        }
        if (j10 < 1048576) {
            return (j10 / 1024) + "KB";
        }
        if (j10 < sc.k.Q) {
            return (j10 / 1048576) + "MB";
        }
        return (j10 / sc.k.Q) + "GB";
    }
}
