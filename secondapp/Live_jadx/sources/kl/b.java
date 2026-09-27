package kl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f102667a;

    public static b a() {
        if (f102667a == null) {
            f102667a = new b();
        }
        return f102667a;
    }

    @Override // kl.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
