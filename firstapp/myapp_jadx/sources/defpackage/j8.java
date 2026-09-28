package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class j8 {
    public final String a;
    public final boolean b;

    public j8(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return this.a.equals(j8Var.a) && this.b == j8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tzx.a("AccountCreatePartialFailedUi(bankName=", this.a, ", isFailed=", ")", this.b);
    }
}
