package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;

/* JADX INFO: loaded from: classes.dex */
public final class z1f0 {
    public final float a;
    public final float b;
    public final float c;

    public z1f0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1f0)) {
            return false;
        }
        z1f0 z1f0Var = (z1f0) obj;
        return g7f.b(this.a, z1f0Var.a) && g7f.b(this.b, z1f0Var.b) && g7f.b(this.c, z1f0Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + tvh.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        String str = qUnCRF.kIEZujdpr;
        float f = this.a;
        k35.a(f, str, sb);
        float f2 = this.b;
        sb.append((Object) g7f.c(f + f2));
        sb.append(", width=");
        sb.append((Object) g7f.c(f2));
        sb.append(", contentWidth=");
        sb.append((Object) g7f.c(this.c));
        sb.append(')');
        return sb.toString();
    }
}
