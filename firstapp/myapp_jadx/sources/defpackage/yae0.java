package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yae0 extends wcf {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final k90 e;

    public yae0(float f, float f2, int i, int i2, k90 k90Var, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        k90Var = (i3 & 16) != 0 ? null : k90Var;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = k90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yae0)) {
            return false;
        }
        yae0 yae0Var = (yae0) obj;
        return this.a == yae0Var.a && this.b == yae0Var.b && this.c == yae0Var.c && this.d == yae0Var.d && Intrinsics.g(this.e, yae0Var.e);
    }

    public final int hashCode() {
        int iA = gpp.a(this.d, gpp.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        k90 k90Var = this.e;
        return iA + (k90Var != null ? k90Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i = this.c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
