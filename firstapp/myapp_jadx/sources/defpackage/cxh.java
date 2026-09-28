package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.b;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class cxh {
    public static final float a(gsw gswVar, gsw gswVar2, float f) {
        int iNextInt;
        int i;
        gswVar.getClass();
        gswVar2.getClass();
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f).toString());
        }
        Iterator<Integer> it = f.n(0, gswVar.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                ibh0.a("Collection contains no element matching the predicate.");
                return 0.0f;
            }
            iNextInt = ((zvo) it).nextInt();
            float fB = gswVar.b(iNextInt);
            i = iNextInt + 1;
            float fB2 = gswVar.b(i % gswVar.b);
            if (fB2 >= fB) {
                if (fB <= f && f <= fB2) {
                    break;
                }
            } else if (f >= fB || f <= fB2) {
                break;
            }
        }
        int i2 = i % gswVar.b;
        float fD = csh0.d(gswVar.b(i2) - gswVar.b(iNextInt), 1.0f);
        return csh0.d((csh0.d(gswVar2.b(i2) - gswVar2.b(iNextInt), 1.0f) * (fD < 0.001f ? 0.5f : csh0.d(f - gswVar.b(iNextInt), 1.0f) / fD)) + gswVar2.b(iNextInt), 1.0f);
    }

    public static final void b(gsw gswVar) {
        gswVar.getClass();
        Boolean boolValueOf = Boolean.TRUE;
        float[] fArr = gswVar.a;
        int i = gswVar.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= i) {
                break;
            }
            float f = fArr[i3];
            if (!boolValueOf.booleanValue() || 0.0f > f || f > 1.0f) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
            i3++;
        }
        if (!boolValueOf.booleanValue()) {
            kb5.a("FloatMapping - Progress outside of range: ".concat(gsw.c(gswVar, 31)));
            return;
        }
        Iterable iterableN = f.n(1, gswVar.b);
        if (!(iterableN instanceof Collection) || !((Collection) iterableN).isEmpty()) {
            Iterator<Integer> it = iterableN.iterator();
            while (((mwo) it).c) {
                int iNextInt = ((zvo) it).nextInt();
                if (gswVar.b(iNextInt) < gswVar.b(iNextInt - 1) && (i2 = i2 + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        if (i2 <= 1) {
            return;
        }
        kb5.a("FloatMapping - Progress wraps more than once: ".concat(gsw.c(gswVar, 31)));
    }
}
