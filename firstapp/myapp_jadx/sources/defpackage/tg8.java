package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg8 implements w780 {
    @Override // defpackage.w780
    public s780 a(cw90 cw90Var) {
        s780.a aVarD;
        s780.a aVarD2;
        boolean z;
        s780 s780Var = cw90Var.b;
        if (s780Var == null) {
            return z780.a(cw90Var, w780.a.b.a);
        }
        s780.a aVar = s780Var.b;
        s780.a aVar2 = s780Var.a;
        boolean z2 = cw90Var.a;
        j780 j780Var = cw90Var.c;
        if (z2) {
            aVarD2 = z780.d(cw90Var, j780Var, aVar2);
            aVarD = aVar;
            aVar = aVar2;
            aVar2 = aVarD2;
        } else {
            aVarD = z780.d(cw90Var, j780Var, aVar);
            aVarD2 = aVarD;
        }
        if (Intrinsics.g(aVarD2, aVar)) {
            return s780Var;
        }
        boolean z3 = false;
        s780 s780Var2 = new s780(aVar2, aVarD, cw90Var.a() == e3c.a || (cw90Var.a() == e3c.c && aVar2.b > aVarD.b));
        s780 s780Var3 = cw90Var.b;
        j780 j780Var2 = cw90Var.c;
        boolean z4 = cw90Var.a;
        s780.a aVar3 = s780Var2.a;
        long j = aVar3.c;
        s780.a aVar4 = s780Var2.b;
        if (j == aVar4.c) {
            z = aVar3.b == aVar4.b;
        } else {
            boolean z5 = s780Var2.c;
            if ((z5 ? aVar3 : aVar4).b == 0) {
                if (j780Var2.d.a.a.b.length() == (z5 ? aVar4 : aVar3).b) {
                    new yp40().a = true;
                }
            }
        }
        if (!z) {
            return s780Var2;
        }
        String str = j780Var2.d.a.a.b;
        if (s780Var3 == null || str.length() == 0) {
            return s780Var2;
        }
        String str2 = j780Var2.d.a.a.b;
        int i = j780Var2.a;
        int length = str2.length();
        if (i == 0) {
            int iA = j020.a(0, str2);
            return z4 ? s780.a(s780Var2, z780.c(aVar3, j780Var2, iA), null, true, 2) : s780.a(s780Var2, null, z780.c(aVar4, j780Var2, iA), false, 1);
        }
        if (i == length) {
            int iB = j020.b(length, str2);
            return z4 ? s780.a(s780Var2, z780.c(aVar3, j780Var2, iB), null, false, 2) : s780.a(s780Var2, null, z780.c(aVar4, j780Var2, iB), true, 1);
        }
        if (s780Var3 != null && s780Var3.c) {
            z3 = true;
        }
        int iB2 = z4 ^ z3 ? j020.b(i, str2) : j020.a(i, str2);
        return z4 ? s780.a(s780Var2, z780.c(aVar3, j780Var2, iB2), null, z3, 2) : s780.a(s780Var2, null, z780.c(aVar4, j780Var2, iB2), z3, 1);
    }
}
