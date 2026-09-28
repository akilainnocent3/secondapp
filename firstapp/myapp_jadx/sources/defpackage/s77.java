package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s77 extends q6n {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final q6n[] f;

    public s77(String str, boolean z, boolean z2, String[] strArr, q6n[] q6nVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = q6nVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s77.class != obj.getClass()) {
            return false;
        }
        s77 s77Var = (s77) obj;
        return this.c == s77Var.c && this.d == s77Var.d && this.b.equals(s77Var.b) && Arrays.equals(this.e, s77Var.e) && Arrays.equals(this.f, s77Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
