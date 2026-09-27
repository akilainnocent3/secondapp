package androidx.navigation;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    @oy.l
    public static final a.c a(@oy.m d1.e eVar, int i10) {
        a.c.C0137a c0137a = new a.c.C0137a();
        if (eVar != null) {
            c0137a.c(eVar);
        }
        c0137a.a(i10);
        return c0137a.b();
    }

    public static /* synthetic */ a.c b(d1.e eVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = null;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return a(eVar, i10);
    }
}
