package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m00 implements zmv {
    public final n54.a a;
    public final n54.a b;
    public final int c;

    public m00(n54.a aVar, n54.a aVar2, int i) {
        this.a = aVar;
        this.b = aVar2;
        this.c = i;
    }

    @Override // defpackage.zmv
    public final int a(owo owoVar, long j, int i, asr asrVar) {
        int iA = this.b.a(0, owoVar.d(), asrVar);
        int i2 = -this.a.a(0, i, asrVar);
        asr asrVar2 = asr.a;
        int i3 = this.c;
        if (asrVar != asrVar2) {
            i3 = -i3;
        }
        return owoVar.a + iA + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m00)) {
            return false;
        }
        m00 m00Var = (m00) obj;
        return this.a.equals(m00Var.a) && this.b.equals(m00Var.b) && this.c == m00Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + tvh.a(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return rr1.b(sb, this.c, ')');
    }
}
