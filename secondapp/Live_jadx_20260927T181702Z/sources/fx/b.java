package fx;

import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@cs.j(name = "-DeflaterSinkExtensions")
public final class b {
    @oy.l
    public static final r a(@oy.l b1 b1Var, @oy.l Deflater deflater) {
        kotlin.jvm.internal.m0.p(b1Var, "<this>");
        kotlin.jvm.internal.m0.p(deflater, "deflater");
        return new r(b1Var, deflater);
    }

    public static /* synthetic */ r b(b1 b1Var, Deflater deflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deflater = new Deflater();
        }
        kotlin.jvm.internal.m0.p(b1Var, "<this>");
        kotlin.jvm.internal.m0.p(deflater, "deflater");
        return new r(b1Var, deflater);
    }
}
