package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class q65 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public q65(Rect rect) {
        rect.getClass();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q65.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            q65 q65Var = (q65) obj;
            return this.a == q65Var.a && this.b == q65Var.b && this.c == q65Var.c && this.d == q65Var.d;
        }
        bmy.a("null cannot be cast to non-null type androidx.window.core.Bounds");
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) q65.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return zk1.a(this.d, "] }", sb);
    }
}
