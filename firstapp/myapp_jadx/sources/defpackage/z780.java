package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class z780 {
    public static final s780 a(cw90 cw90Var, n65 n65Var) {
        j780 j780Var = cw90Var.c;
        boolean z = cw90Var.a() == e3c.a;
        return new s780(b(j780Var, z, true, 1, n65Var), b(j780Var, z, false, 1, n65Var), z);
    }

    public static final s780.a b(j780 j780Var, boolean z, boolean z2, int i, n65 n65Var) {
        long j;
        int i2 = z2 ? j780Var.a : j780Var.b;
        j780Var.getClass();
        if (i != 1) {
            return j780Var.a(i2);
        }
        long jA = n65Var.a(j780Var, i2);
        if (z ^ z2) {
            int i3 = ulf0.c;
            j = jA >> 32;
        } else {
            int i4 = ulf0.c;
            j = 4294967295L & jA;
        }
        return j780Var.a((int) j);
    }

    public static final s780.a c(s780.a aVar, j780 j780Var, int i) {
        return new s780.a(j780Var.d.a(i), i, aVar.c);
    }

    public static final s780.a d(final cw90 cw90Var, final j780 j780Var, s780.a aVar) {
        e3c e3cVar;
        boolean z = cw90Var.a;
        final int i = z ? j780Var.a : j780Var.b;
        j780Var.getClass();
        int i2 = j780Var.a;
        int i3 = j780Var.b;
        ukf0 ukf0Var = j780Var.d;
        int i4 = j780Var.c;
        a1s a1sVar = a1s.c;
        final ttr ttrVarA = hwr.a(a1sVar, new Function0() { // from class: x780
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(j780Var.d.b.d(i));
            }
        });
        final int i5 = z ? i3 : i2;
        ttr ttrVarA2 = hwr.a(a1sVar, new Function0() { // from class: y780
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iIntValue = ((Number) ttrVarA.getValue()).intValue();
                cw90 cw90Var2 = cw90Var;
                boolean z2 = cw90Var2.a;
                boolean z3 = cw90Var2.a() == e3c.a;
                j780 j780Var2 = j780Var;
                ukf0 ukf0Var2 = j780Var2.d;
                int i6 = i;
                long jL = ukf0Var2.l(i6);
                ukf0 ukf0Var3 = j780Var2.d;
                zjw zjwVar = ukf0Var3.b;
                int i7 = ulf0.c;
                int i8 = (int) (jL >> 32);
                int i9 = zjwVar.f;
                if (zjwVar.d(i8) != iIntValue) {
                    i8 = iIntValue >= i9 ? ukf0Var3.i(i9 - 1) : ukf0Var3.i(iIntValue);
                }
                int iC = (int) (jL & 4294967295L);
                if (zjwVar.d(iC) != iIntValue) {
                    iC = iIntValue >= i9 ? zjwVar.c(i9 - 1, false) : zjwVar.c(iIntValue, false);
                }
                int i10 = i5;
                if (i8 == i10) {
                    return j780Var2.a(iC);
                }
                if (iC == i10) {
                    return j780Var2.a(i8);
                }
                if (!(z2 ^ z3) ? i6 >= i8 : i6 > iC) {
                    i8 = iC;
                }
                return j780Var2.a(i8);
            }
        });
        if (1 != aVar.c) {
            return (s780.a) ttrVarA2.getValue();
        }
        if (i == i4) {
            return aVar;
        }
        if (((Number) ttrVarA.getValue()).intValue() != ukf0Var.b.d(i4)) {
            return (s780.a) ttrVarA2.getValue();
        }
        int i6 = aVar.b;
        long jL = ukf0Var.l(i6);
        if (i4 != -1) {
            if (i != i4) {
                if (i2 < i3) {
                    e3cVar = e3c.b;
                } else {
                    e3cVar = i2 > i3 ? e3c.a : e3c.c;
                }
                if (!((e3cVar == e3c.a) ^ z)) {
                }
            }
            return j780Var.a(i);
        }
        int i7 = ulf0.c;
        return (i6 == ((int) (jL >> 32)) || i6 == ((int) (4294967295L & jL))) ? (s780.a) ttrVarA2.getValue() : j780Var.a(i);
    }
}
