package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class mit {
    public final String a;
    public final String b;

    public mit(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mit)) {
            return false;
        }
        mit mitVar = (mit) obj;
        return this.a.equals(mitVar.a) && this.b.equals(mitVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("LoginFailureExceptionMetadata(exceptionType=", this.a, ", exceptionCategory=", this.b, ")");
    }
}
