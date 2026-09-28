package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n00 implements anv {
    public final n54.b a;
    public final n54.b b;
    public final int c;

    public n00(n54.b bVar, n54.b bVar2, int i) {
        this.a = bVar;
        this.b = bVar2;
        this.c = i;
    }

    @Override // defpackage.anv
    public final int a(owo owoVar, long j, int i) {
        int iA = this.b.a(0, owoVar.b());
        return owoVar.b + iA + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n00)) {
            return false;
        }
        n00 n00Var = (n00) obj;
        return this.a.equals(n00Var.a) && this.b.equals(n00Var.b) && this.c == n00Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + tvh.a(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return rr1.b(sb, this.c, ')');
    }
}
