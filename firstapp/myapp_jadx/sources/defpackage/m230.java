package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m230 {
    public static final m230 d = new m230(0.0f, new gt7(0.0f, 0.0f), 0);
    public final float a;
    public final gt7 b;
    public final int c;

    public m230(float f, gt7 gt7Var, int i) {
        this.a = f;
        this.b = gt7Var;
        this.c = i;
        if (Float.isNaN(f)) {
            hb5.a("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m230)) {
            return false;
        }
        m230 m230Var = (m230) obj;
        return this.a == m230Var.a && Intrinsics.g(this.b, m230Var.b) && this.c == m230Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return rr1.b(sb, this.c, ')');
    }
}
