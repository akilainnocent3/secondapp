package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class luh0 {
    public static final kuh0 a = new kuh0(mly.a.a, 0, 0);

    public static final wsg0 a(uni0 uni0Var, nk0 nk0Var) {
        wsg0 wsg0VarA = uni0Var.a(nk0Var);
        int length = nk0Var.b.length();
        nk0 nk0Var2 = wsg0VarA.a;
        mly mlyVar = wsg0VarA.b;
        int length2 = nk0Var2.b.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(mlyVar.b(i), length2, i);
        }
        b(mlyVar.b(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(mlyVar.a(i2), length, i2);
        }
        c(mlyVar.a(length2), length, length2);
        return new wsg0(nk0Var2, new kuh0(mlyVar, nk0Var.b.length(), nk0Var2.b.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbA = dy5.a("OffsetMapping.originalToTransformed returned invalid mapping: ", i3, i, " -> ", " is not in range of transformed text [0, ");
        sbA.append(i2);
        sbA.append(']');
        zkn.c(sbA.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbA = dy5.a("OffsetMapping.transformedToOriginal returned invalid mapping: ", i3, i, " -> ", " is not in range of original text [0, ");
        sbA.append(i2);
        sbA.append(']');
        zkn.c(sbA.toString());
    }
}
