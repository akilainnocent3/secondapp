package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xkf0 {
    public final String a;
    public final String b;

    public xkf0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkf0)) {
            return false;
        }
        xkf0 xkf0Var = (xkf0) obj;
        return this.a.equals(xkf0Var.a) && this.b.equals(xkf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("TextLink(url=", this.a, ", urlText=", this.b, ")");
    }
}
