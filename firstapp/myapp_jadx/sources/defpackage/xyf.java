package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xyf {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static final void a(lsw lswVar, int i) {
        if (lswVar.b == 0 || !(lswVar.c(0) == i || lswVar.c(lswVar.b - 1) == i)) {
            int i2 = lswVar.b;
            lswVar.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = lswVar.c(i3);
                if (i <= iC) {
                    break;
                }
                lswVar.f(i2, iC);
                i2 = i3;
            }
            lswVar.f(i2, i);
        }
    }

    public static final int b(lsw lswVar) {
        int iC;
        int i = lswVar.b;
        int iC2 = lswVar.c(0);
        while (lswVar.b != 0 && lswVar.c(0) == iC2) {
            lswVar.f(0, lswVar.d());
            lswVar.e(lswVar.b - 1);
            int i2 = lswVar.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iC3 = lswVar.c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iC4 = lswVar.c(i6);
                if (i5 < i2 && (iC = lswVar.c(i5)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    lswVar.f(i4, iC);
                    lswVar.f(i5, iC3);
                    i4 = i5;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    lswVar.f(i4, iC4);
                    lswVar.f(i6, iC3);
                    i4 = i6;
                }
            }
        }
        return iC2;
    }
}
