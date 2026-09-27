package ku;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class w {
    @oy.l
    public static final wt.b a(@oy.l tt.c cVar, int i10) {
        m0.p(cVar, "<this>");
        wt.b bVarF = wt.b.f(cVar.a(i10), cVar.b(i10));
        m0.o(bVarF, "fromString(getQualifiedC… isLocalClassName(index))");
        return bVarF;
    }

    @oy.l
    public static final wt.f b(@oy.l tt.c cVar, int i10) {
        m0.p(cVar, "<this>");
        wt.f fVarE = wt.f.e(cVar.getString(i10));
        m0.o(fVarE, "guessByFirstCharacter(getString(index))");
        return fVarE;
    }
}
