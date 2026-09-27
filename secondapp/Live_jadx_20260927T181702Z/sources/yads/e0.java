package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e0 implements lx1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c0 f148427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient q f148428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient d0 f148429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient n f148430e;

    public abstract n a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lx1) {
            return ((i) this).a().equals(((i) ((lx1) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f152791d.hashCode();
    }

    public final String toString() {
        return a().f152791d.toString();
    }
}
