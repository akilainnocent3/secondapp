package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zh1 extends jhd.a {
    public final int a;
    public final int b;
    public final nv5.a<Void> c;

    public zh1(int i, int i2, nv5.a<Void> aVar) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
    }

    @Override // jhd.a
    public final nv5.a<Void> a() {
        return this.c;
    }

    @Override // jhd.a
    public final int b() {
        return this.a;
    }

    @Override // jhd.a
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jhd.a)) {
            return false;
        }
        jhd.a aVar = (jhd.a) obj;
        return this.a == aVar.b() && this.b == aVar.c() && this.c.equals(aVar.a());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
