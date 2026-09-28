package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class h0y {
    public final String a;
    public final String b;

    public h0y(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0y)) {
            return false;
        }
        h0y h0yVar = (h0y) obj;
        return this.a.equals(h0yVar.a) && this.b.equals(h0yVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("Notification(title=", this.a, ", text=", this.b, ")");
    }
}
