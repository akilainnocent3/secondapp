package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t7j0 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;

    public t7j0(int i, int i2, String str, int i3, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7j0)) {
            return false;
        }
        t7j0 t7j0Var = (t7j0) obj;
        return Intrinsics.g(this.a, t7j0Var.a) && this.b == t7j0Var.b && Intrinsics.g(this.c, t7j0Var.c) && this.d == t7j0Var.d && this.e == t7j0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + gpp.a(this.d, gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "WinProbabilityTeam(nameText=", this.a, ", nameTextColorResId=", ", logoUrl=");
        wxa.b(this.d, this.c, ", winProbability=", ", colorResId=", sbA);
        return zk1.a(this.e, ")", sbA);
    }
}
