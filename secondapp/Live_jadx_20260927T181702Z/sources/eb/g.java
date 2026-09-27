package eb;

import android.graphics.Color;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g implements n0<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f80668a = new g();

    @Override // eb.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(fb.c cVar, float f10) throws IOException {
        boolean z10 = cVar.y() == fb.c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.d();
        }
        double dO = cVar.o();
        double dO2 = cVar.o();
        double dO3 = cVar.o();
        double dO4 = cVar.y() == fb.c.b.NUMBER ? cVar.o() : 1.0d;
        if (z10) {
            cVar.k();
        }
        if (dO <= 1.0d && dO2 <= 1.0d && dO3 <= 1.0d) {
            dO *= 255.0d;
            dO2 *= 255.0d;
            dO3 *= 255.0d;
            if (dO4 <= 1.0d) {
                dO4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dO4, (int) dO, (int) dO2, (int) dO3));
    }
}
