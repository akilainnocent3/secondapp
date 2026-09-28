package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class ymn {
    public static final ymn e = new ymn(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public static class a {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public ymn(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static ymn a(ymn ymnVar, ymn ymnVar2) {
        return c(Math.max(ymnVar.a, ymnVar2.a), Math.max(ymnVar.b, ymnVar2.b), Math.max(ymnVar.c, ymnVar2.c), Math.max(ymnVar.d, ymnVar2.d));
    }

    public static ymn b(ymn ymnVar, ymn ymnVar2) {
        return c(Math.min(ymnVar.a, ymnVar2.a), Math.min(ymnVar.b, ymnVar2.b), Math.min(ymnVar.c, ymnVar2.c), Math.min(ymnVar.d, ymnVar2.d));
    }

    public static ymn c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new ymn(i, i2, i3, i4);
    }

    public static ymn d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ymn.class != obj.getClass()) {
            return false;
        }
        ymn ymnVar = (ymn) obj;
        return this.d == ymnVar.d && this.a == ymnVar.a && this.c == ymnVar.c && this.b == ymnVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return rr1.b(sb, this.d, '}');
    }
}
