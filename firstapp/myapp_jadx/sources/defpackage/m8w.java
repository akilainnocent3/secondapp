package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m8w {

    public static class a {
        public int a;
        public long b;
        public int c;
    }

    public static int a(msz mszVar, int i, int i2, int i3) {
        ly0.b(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        ewo.a(ewo.a(i4, i5), 1 << i3);
        if (mszVar.b() < i) {
            return -1;
        }
        int iG = mszVar.g(i);
        if (iG == i4) {
            if (mszVar.b() < i2) {
                return -1;
            }
            int iG2 = mszVar.g(i2);
            iG += iG2;
            if (iG2 == i5) {
                if (mszVar.b() < i3) {
                    return -1;
                }
                return mszVar.g(i3) + iG;
            }
        }
        return iG;
    }

    public static void b(msz mszVar) {
        mszVar.o(3);
        mszVar.o(8);
        boolean zF = mszVar.f();
        boolean zF2 = mszVar.f();
        if (zF) {
            mszVar.o(5);
        }
        if (zF2) {
            mszVar.o(6);
        }
    }

    public static void c(msz mszVar) {
        int iG;
        int iG2 = mszVar.g(2);
        if (iG2 == 0) {
            mszVar.o(6);
            return;
        }
        int iA = a(mszVar, 5, 8, 16) + 1;
        if (iG2 == 1) {
            mszVar.o(iA * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = mszVar.f();
            int i = zF ? 1 : 5;
            int i2 = zF ? 7 : 5;
            int i3 = zF ? 8 : 6;
            int i4 = 0;
            while (i4 < iA) {
                if (mszVar.f()) {
                    mszVar.o(7);
                    iG = 0;
                } else {
                    if (mszVar.g(2) == 3 && mszVar.g(i2) * i != 0) {
                        mszVar.n();
                    }
                    iG = mszVar.g(i3) * i;
                    if (iG != 0 && iG != 180) {
                        mszVar.n();
                    }
                    mszVar.n();
                }
                if (iG != 0 && iG != 180 && mszVar.f()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
