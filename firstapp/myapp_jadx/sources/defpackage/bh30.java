package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bh30 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public bh30(int i, String str, String str2, boolean z) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public static bh30 a(bh30 bh30Var, boolean z) {
        int i = bh30Var.a;
        String str = bh30Var.b;
        String str2 = bh30Var.c;
        bh30Var.getClass();
        str.getClass();
        return new bh30(i, str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh30)) {
            return false;
        }
        bh30 bh30Var = (bh30) obj;
        return this.a == bh30Var.a && Intrinsics.g(this.b, bh30Var.b) && this.c.equals(bh30Var.c) && this.d == bh30Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return x9d.a(this.c, ", isSelected=", ")", uqe0.a(this.a, "QuickInputUI(id=", ", value=", this.b, ", valueFormatted="), this.d);
    }
}
