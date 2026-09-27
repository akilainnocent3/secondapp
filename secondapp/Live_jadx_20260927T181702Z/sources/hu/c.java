package hu;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f88504a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f88505b;

        static {
            d.a aVar = d.f88507c;
            f88505b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        @Override // hu.c
        public int a() {
            return f88505b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final b f88506a = new b();

        @Override // hu.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
