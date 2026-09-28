package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x420 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public x420(boolean z, boolean z2, boolean z3, l380 l380Var, boolean z4) {
        chf chfVar = u90.a;
        int i = !z ? 262152 : 262144;
        i = l380Var == l380.b ? i | 8192 : i;
        i = z4 ? i : i | 512;
        boolean z5 = l380Var == l380.a;
        this.a = i;
        this.b = z5;
        this.c = z2;
        this.d = z3;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x420)) {
            return false;
        }
        x420 x420Var = (x420) obj;
        return this.a == x420Var.a && this.b == x420Var.b && this.c == x420Var.c && this.d == x420Var.d && this.e == x420Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public x420(int i, boolean z) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0, (i & 4) != 0, l380.a, (i & 8) != 0);
    }
}
