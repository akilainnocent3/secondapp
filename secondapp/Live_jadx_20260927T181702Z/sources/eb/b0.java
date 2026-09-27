package eb;

import android.graphics.PointF;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b0 implements n0<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f80658a = new b0();

    @Override // eb.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(fb.c cVar, float f10) throws IOException {
        fb.c.b bVarY = cVar.y();
        if (bVarY == fb.c.b.BEGIN_ARRAY) {
            return s.e(cVar, f10);
        }
        if (bVarY == fb.c.b.BEGIN_OBJECT) {
            return s.e(cVar, f10);
        }
        if (bVarY == fb.c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.o()) * f10, ((float) cVar.o()) * f10);
            while (cVar.m()) {
                cVar.G();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarY);
    }
}
