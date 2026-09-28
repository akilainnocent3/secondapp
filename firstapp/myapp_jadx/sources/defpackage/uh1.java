package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uh1 extends ktb.e.d.AbstractC0793e.b {
    public final String a;
    public final String b;

    public uh1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // ktb.e.d.AbstractC0793e.b
    public final String a() {
        return this.a;
    }

    @Override // ktb.e.d.AbstractC0793e.b
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.d.AbstractC0793e.b)) {
            return false;
        }
        ktb.e.d.AbstractC0793e.b bVar = (ktb.e.d.AbstractC0793e.b) obj;
        return this.a.equals(bVar.a()) && this.b.equals(bVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return uf80.a(sb, this.b, "}");
    }
}
