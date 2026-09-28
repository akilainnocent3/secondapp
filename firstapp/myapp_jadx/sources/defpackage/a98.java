package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a98 extends q6n {
    public final String b;
    public final String c;
    public final String d;

    public a98(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a98.class != obj.getClass()) {
            return false;
        }
        a98 a98Var = (a98) obj;
        return this.c.equals(a98Var.c) && this.b.equals(a98Var.b) && Objects.equals(this.d, a98Var.d);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(527, 31, this.b), 31, this.c);
        String str = this.d;
        return iA + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.q6n
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
