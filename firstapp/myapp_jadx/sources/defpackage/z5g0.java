package defpackage;

import androidx.compose.runtime.a;
import java.text.DecimalFormat;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class z5g0 {
    public static final Pair a(Double d, long j, a aVar, int i) {
        long j2;
        x5a0 x5a0Var = (x5a0) wag0.m;
        boolean zM = aVar.M(((wag0.a) x5a0Var.getValue()).a) | aVar.M(((wag0.a) x5a0Var.getValue()).b) | ((((i & 14) ^ 6) > 4 && aVar.M(d)) || (i & 6) == 4);
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (zM || objY == c0042a) {
            String str = ((wag0.a) x5a0Var.getValue()).b;
            String str2 = "0.00x";
            if (Intrinsics.g(str, "ROUND_ONGOING") || Intrinsics.g(str, "ROUND_END_WAIT")) {
                String str3 = ((wag0.a) x5a0Var.getValue()).a;
                Double dH = str3 != null ? b.h(str3) : null;
                if (dH != null) {
                    str2 = new DecimalFormat("0.00").format(dH.doubleValue()) + 'x';
                }
            } else if (str == null && d != null) {
                str2 = new DecimalFormat("0.00").format(d.doubleValue()) + 'x';
            }
            objY = str2;
            aVar.r(objY);
        }
        String str4 = (String) objY;
        boolean zM2 = aVar.M(((wag0.a) x5a0Var.getValue()).b) | ((((i & 112) ^ 48) > 32 && aVar.e(j)) || (i & 48) == 32);
        Object objY2 = aVar.y();
        if (zM2 || objY2 == c0042a) {
            String str5 = ((wag0.a) x5a0Var.getValue()).b;
            if (Intrinsics.g(str5, "ROUND_ONGOING")) {
                j2 = b6g0.h;
            } else if (Intrinsics.g(str5, "ROUND_END_WAIT")) {
                j2 = b6g0.g;
            } else {
                j58 j58Var = nbh0.a(j, j58.l) ? null : new j58(j);
                j2 = j58Var != null ? j58Var.a : b6g0.h;
            }
            objY2 = new j58(j2);
            aVar.r(objY2);
        }
        j58 j58Var2 = (j58) objY2;
        long j3 = j58Var2.a;
        return new Pair(str4, j58Var2);
    }
}
