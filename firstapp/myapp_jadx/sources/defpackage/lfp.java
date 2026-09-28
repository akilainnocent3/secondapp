package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lfp {
    public static final hep.a a = hep.a.a("x", "y");

    public static int a(hep hepVar) {
        hepVar.d();
        int iF = (int) (hepVar.F() * 255.0d);
        int iF2 = (int) (hepVar.F() * 255.0d);
        int iF3 = (int) (hepVar.F() * 255.0d);
        while (hepVar.o()) {
            hepVar.Z();
        }
        hepVar.g();
        return Color.argb(255, iF, iF2, iF3);
    }

    public static PointF b(hep hepVar, float f) {
        int iOrdinal = hepVar.J().ordinal();
        if (iOrdinal == 0) {
            hepVar.d();
            float F = (float) hepVar.F();
            float F2 = (float) hepVar.F();
            while (hepVar.J() != hep.b.b) {
                hepVar.Z();
            }
            hepVar.g();
            return new PointF(F * f, F2 * f);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                hoc.a(hepVar.J(), "Unknown point starts with ");
                return null;
            }
            float F3 = (float) hepVar.F();
            float F4 = (float) hepVar.F();
            while (hepVar.o()) {
                hepVar.Z();
            }
            return new PointF(F3 * f, F4 * f);
        }
        hepVar.f();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (hepVar.o()) {
            int iV = hepVar.V(a);
            if (iV == 0) {
                fD = d(hepVar);
            } else if (iV != 1) {
                hepVar.Y();
                hepVar.Z();
            } else {
                fD2 = d(hepVar);
            }
        }
        hepVar.l();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(hep hepVar, float f) {
        ArrayList arrayList = new ArrayList();
        hepVar.d();
        while (hepVar.J() == hep.b.a) {
            hepVar.d();
            arrayList.add(b(hepVar, f));
            hepVar.g();
        }
        hepVar.g();
        return arrayList;
    }

    public static float d(hep hepVar) {
        hep.b bVarJ = hepVar.J();
        int iOrdinal = bVarJ.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) hepVar.F();
            }
            z9l.a(bVarJ, "Unknown value for token of type ");
            return 0.0f;
        }
        hepVar.d();
        float F = (float) hepVar.F();
        while (hepVar.o()) {
            hepVar.Z();
        }
        hepVar.g();
        return F;
    }
}
