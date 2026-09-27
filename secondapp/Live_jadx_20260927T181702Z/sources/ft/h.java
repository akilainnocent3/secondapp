package ft;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static final wt.c c(wt.c cVar, String str) {
        wt.c cVarC = cVar.c(wt.f.f(str));
        m0.o(cVarC, "child(Name.identifier(name))");
        return cVarC;
    }

    public static final wt.c d(wt.d dVar, String str) {
        wt.c cVarL = dVar.c(wt.f.f(str)).l();
        m0.o(cVarL, "child(Name.identifier(name)).toSafe()");
        return cVarL;
    }
}
