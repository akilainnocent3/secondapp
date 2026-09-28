package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class v7j0 implements anv {
    public final n54.b a;
    public final int b;

    public v7j0(n54.b bVar, int i) {
        this.a = bVar;
        this.b = i;
    }

    @Override // defpackage.anv
    public final int a(owo owoVar, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? Math.round(((i2 - i) / 2.0f) * 1.0f) : f.e(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7j0)) {
            return false;
        }
        v7j0 v7j0Var = (v7j0) obj;
        return this.a.equals(v7j0Var.a) && this.b == v7j0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return rr1.b(sb, this.b, ')');
    }
}
