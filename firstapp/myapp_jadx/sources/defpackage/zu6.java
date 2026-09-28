package defpackage;

import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes.dex */
public final class zu6 {
    public static void b(long j, nsz nszVar, njg0[] njg0VarArr) {
        int iW = nszVar.w();
        if ((iW & 64) != 0) {
            nszVar.J(1);
            int i = (iW & 31) * 3;
            int i2 = nszVar.b;
            for (njg0 njg0Var : njg0VarArr) {
                nszVar.I(i2);
                njg0Var.f(i, nszVar);
                ly0.f(j != -9223372036854775807L);
                njg0Var.a(j, 1, i, 0, null);
            }
        }
    }

    public static void a(long j, nsz nszVar, njg0[] njg0VarArr) {
        int i;
        int iJ;
        boolean z;
        int iW;
        while (true) {
            boolean z2 = true;
            if (nszVar.a() > 1) {
                int i2 = 0;
                while (true) {
                    if (nszVar.a() == 0) {
                        i = -1;
                        break;
                    }
                    int iW2 = nszVar.w();
                    i2 += iW2;
                    if (iW2 != 255) {
                        i = i2;
                        break;
                    }
                }
                int i3 = 0;
                do {
                    if (nszVar.a() == 0) {
                        i3 = -1;
                        break;
                    } else {
                        iW = nszVar.w();
                        i3 += iW;
                    }
                } while (iW == 255);
                int i4 = nszVar.b + i3;
                if (i3 != -1 && i3 <= nszVar.a()) {
                    if (i == 4 && i3 >= 8) {
                        int iW3 = nszVar.w();
                        int iC = nszVar.C();
                        if (iC == 49) {
                            iJ = nszVar.j();
                        } else {
                            iJ = 0;
                        }
                        int iW4 = nszVar.w();
                        if (iC == 47) {
                            nszVar.J(1);
                        }
                        if (iW3 == 181 && ((iC == 49 || iC == 47) && iW4 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (iC == 49) {
                            if (iJ != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            b(j, nszVar, njg0VarArr);
                        }
                    }
                } else {
                    cft.g("CeaUtil", Chyeyik.oqFcbkRiGe);
                    i4 = nszVar.c;
                }
                nszVar.I(i4);
            } else {
                return;
            }
        }
    }
}
