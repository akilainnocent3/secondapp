package fx;

import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@cs.j(name = "-InflaterSourceExtensions")
public final class h {
    @oy.l
    public static final f0 a(@oy.l d1 d1Var, @oy.l Inflater inflater) {
        kotlin.jvm.internal.m0.p(d1Var, "<this>");
        kotlin.jvm.internal.m0.p(inflater, "inflater");
        return new f0(d1Var, inflater);
    }

    public static /* synthetic */ f0 b(d1 d1Var, Inflater inflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inflater = new Inflater();
        }
        kotlin.jvm.internal.m0.p(d1Var, "<this>");
        kotlin.jvm.internal.m0.p(inflater, "inflater");
        return new f0(d1Var, inflater);
    }
}
