package eb;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g0 implements n0<hb.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f80669a = new g0();

    @Override // eb.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public hb.k a(fb.c cVar, float f10) throws IOException {
        boolean z10 = cVar.y() == fb.c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.d();
        }
        float fO = (float) cVar.o();
        float fO2 = (float) cVar.o();
        while (cVar.m()) {
            cVar.G();
        }
        if (z10) {
            cVar.k();
        }
        return new hb.k((fO / 100.0f) * f10, (fO2 / 100.0f) * f10);
    }
}
