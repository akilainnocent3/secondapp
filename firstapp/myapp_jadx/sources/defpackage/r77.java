package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r77 extends q6n {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final q6n[] g;

    public r77(String str, int i, int i2, long j, long j2, q6n[] q6nVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = q6nVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r77.class != obj.getClass()) {
            return false;
        }
        r77 r77Var = (r77) obj;
        return this.c == r77Var.c && this.d == r77Var.d && this.e == r77Var.e && this.f == r77Var.f && this.b.equals(r77Var.b) && Arrays.equals(this.g, r77Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
