package eb;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fb.c.a f80704a = fb.c.a.a("x", "y");

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80705a;

        static {
            int[] iArr = new int[fb.c.b.values().length];
            f80705a = iArr;
            try {
                iArr[fb.c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80705a[fb.c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80705a[fb.c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(fb.c cVar, float f10) throws IOException {
        cVar.d();
        float fO = (float) cVar.o();
        float fO2 = (float) cVar.o();
        while (cVar.y() != fb.c.b.END_ARRAY) {
            cVar.G();
        }
        cVar.k();
        return new PointF(fO * f10, fO2 * f10);
    }

    public static PointF b(fb.c cVar, float f10) throws IOException {
        float fO = (float) cVar.o();
        float fO2 = (float) cVar.o();
        while (cVar.m()) {
            cVar.G();
        }
        return new PointF(fO * f10, fO2 * f10);
    }

    public static PointF c(fb.c cVar, float f10) throws IOException {
        cVar.h();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (cVar.m()) {
            int iE = cVar.E(f80704a);
            if (iE == 0) {
                fG = g(cVar);
            } else if (iE != 1) {
                cVar.F();
                cVar.G();
            } else {
                fG2 = g(cVar);
            }
        }
        cVar.l();
        return new PointF(fG * f10, fG2 * f10);
    }

    @k.k
    public static int d(fb.c cVar) throws IOException {
        cVar.d();
        int iO = (int) (cVar.o() * 255.0d);
        int iO2 = (int) (cVar.o() * 255.0d);
        int iO3 = (int) (cVar.o() * 255.0d);
        while (cVar.m()) {
            cVar.G();
        }
        cVar.k();
        return Color.argb(255, iO, iO2, iO3);
    }

    public static PointF e(fb.c cVar, float f10) throws IOException {
        int i10 = a.f80705a[cVar.y().ordinal()];
        if (i10 == 1) {
            return b(cVar, f10);
        }
        if (i10 == 2) {
            return a(cVar, f10);
        }
        if (i10 == 3) {
            return c(cVar, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.y());
    }

    public static List<PointF> f(fb.c cVar, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.d();
        while (cVar.y() == fb.c.b.BEGIN_ARRAY) {
            cVar.d();
            arrayList.add(e(cVar, f10));
            cVar.k();
        }
        cVar.k();
        return arrayList;
    }

    public static float g(fb.c cVar) throws IOException {
        fb.c.b bVarY = cVar.y();
        int i10 = a.f80705a[bVarY.ordinal()];
        if (i10 == 1) {
            return (float) cVar.o();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarY);
        }
        cVar.d();
        float fO = (float) cVar.o();
        while (cVar.m()) {
            cVar.G();
        }
        cVar.k();
        return fO;
    }
}
