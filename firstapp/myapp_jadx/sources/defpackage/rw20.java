package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rw20 extends q6n {
    public final String b;
    public final byte[] c;

    public rw20(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rw20.class != obj.getClass()) {
            return false;
        }
        rw20 rw20Var = (rw20) obj;
        return this.b.equals(rw20Var.b) && Arrays.equals(this.c, rw20Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + gmf0.a(527, 31, this.b);
    }

    @Override // defpackage.q6n
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
