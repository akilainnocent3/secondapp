package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mye {
    public final Object a;

    public mye(lq1 lq1Var) {
        lq1Var.getClass();
        this.a = lq1Var;
    }

    public static mye a(nsz nszVar) {
        String str;
        nszVar.J(2);
        int iW = nszVar.w();
        int i = iW >> 1;
        int iW2 = ((nszVar.w() >> 3) & 31) | ((iW & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        return new mye(t7l.b(iW2, iW2 < 10 ? ".0" : ".", sb));
    }

    public mye(String str) {
        this.a = str;
    }
}
