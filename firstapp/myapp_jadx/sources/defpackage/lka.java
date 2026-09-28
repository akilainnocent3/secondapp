package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.f;
import androidx.compose.runtime.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lka {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [u4s] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l00] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List a(h hVar, Integer num, int i, Integer num2) {
        int iE;
        etw<Object> etwVarB;
        if (hVar.w || hVar.o() == 0) {
            return m2g.a;
        }
        ?? a8k0Var = new a8k0(1);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = hVar.v;
            if (iE < 0) {
                iE = hVar.E(hVar.b, i);
            }
        }
        if (num == 0) {
            int iN = hVar.i - hVar.N(hVar.b, hVar.q(i));
            msw<etw<Object>> mswVar = hVar.s;
            num = Integer.valueOf(iN + ((mswVar == null || (etwVarB = mswVar.b(i)) == null) ? 0 : etwVarB.b));
        }
        while (i >= 0) {
            a8k0Var.d(hVar.O(i), num);
            num = hVar.b(i);
            if (iE >= 0) {
                int i2 = iE;
                iE = hVar.E(hVar.b, iE);
                i = i2;
            } else {
                i = iE;
            }
        }
        return a8k0Var.a;
    }

    public static final Integer b(f fVar, mma mmaVar, int i, int i2) {
        Integer numB;
        int[] iArr = fVar.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (fVar.j(i) && fVar.i(i) == 206 && Intrinsics.g(fVar.p(iArr, i), c.e)) {
                Object objH = fVar.h(i, 0);
                b.a aVar = objH instanceof b.a ? (b.a) objH : null;
                if (aVar != null && aVar.a == mmaVar) {
                    return Integer.valueOf(i);
                }
            }
            if (fVar.d(i) && (numB = b(fVar, mmaVar, i + 1, i3)) != null) {
                return Integer.valueOf(numB.intValue());
            }
            i = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [s340, u4s] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList c(f fVar, int i, Integer num) {
        ?? s340Var = new s340(fVar);
        i = fVar.q(i);
        l00 l00VarA = fVar.a(i);
        while (i >= 0) {
            s340Var.d(fVar.a.h(i), num);
            if (i >= 0) {
                l00 l00Var = l00VarA;
                l00VarA = fVar.a(i);
                i = fVar.q(i);
                num = l00Var;
            } else {
                num = l00VarA;
            }
        }
        return s340Var.a;
    }
}
