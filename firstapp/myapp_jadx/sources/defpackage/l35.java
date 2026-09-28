package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l35 {
    public final float a;
    public final ya5 b;

    public l35(float f, ya5 ya5Var) {
        this.a = f;
        this.b = ya5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l35)) {
            return false;
        }
        l35 l35Var = (l35) obj;
        return g7f.b(this.a, l35Var.a) && Intrinsics.g(this.b, l35Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        k35.a(this.a, ", brush=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
