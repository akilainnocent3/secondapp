package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y8n implements sih {
    public final u7n a;
    public final boolean b;
    public final bqc c;

    public y8n(u7n u7nVar, boolean z, bqc bqcVar) {
        this.a = u7nVar;
        this.b = z;
        this.c = bqcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8n)) {
            return false;
        }
        y8n y8nVar = (y8n) obj;
        return this.a.equals(y8nVar.a) && this.b == y8nVar.b && this.c == y8nVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ')';
    }
}
