package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dnh0 extends q6n {
    public final String b;
    public final String c;

    public dnh0(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dnh0.class != obj.getClass()) {
            return false;
        }
        dnh0 dnh0Var = (dnh0) obj;
        return this.a.equals(dnh0Var.a) && Objects.equals(this.b, dnh0Var.b) && this.c.equals(dnh0Var.c);
    }

    public final int hashCode() {
        int iA = gmf0.a(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.q6n
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
