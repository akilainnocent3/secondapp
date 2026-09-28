package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a7a0 {
    public final String a;
    public final float b;
    public final float c;
    public final n54 d;

    public a7a0(String str, float f, float f2, n54 n54Var) {
        str.getClass();
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = n54Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7a0)) {
            return false;
        }
        a7a0 a7a0Var = (a7a0) obj;
        return Intrinsics.g(this.a, a7a0Var.a) && Float.compare(this.b, a7a0Var.b) == 0 && g7f.b(this.c, a7a0Var.c) && this.d.equals(a7a0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + tvh.a(this.c, tvh.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SnowItem(resId=" + this.a + ", widthFraction=" + this.b + ", height=" + g7f.c(this.c) + ", alignment=" + this.d + ")";
    }
}
