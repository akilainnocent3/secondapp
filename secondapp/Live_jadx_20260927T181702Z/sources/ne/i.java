package ne;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@he.a
@he.g
@he.f({"javax.inject.Named"})
public final class i implements he.c<Integer> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f116467a = new i();
    }

    public static i a() {
        return a.f116467a;
    }

    public static int c() {
        return f.e();
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
