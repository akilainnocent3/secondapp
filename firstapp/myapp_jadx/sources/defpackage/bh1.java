package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class bh1 extends ktb.c {
    public final String a;
    public final String b;

    public bh1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // ktb.c
    public final String a() {
        return this.a;
    }

    @Override // ktb.c
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.c)) {
            return false;
        }
        ktb.c cVar = (ktb.c) obj;
        return this.a.equals(cVar.a()) && this.b.equals(cVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return uf80.a(sb, this.b, "}");
    }
}
