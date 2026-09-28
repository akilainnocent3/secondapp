package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e3i0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public e3i0(String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3i0)) {
            return false;
        }
        e3i0 e3i0Var = (e3i0) obj;
        return Intrinsics.g(this.a, e3i0Var.a) && Intrinsics.g(this.b, e3i0Var.b) && this.c == e3i0Var.c && this.d == e3i0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return b7f.a(ux5.a("Video(type=", this.a, ", url=", this.b, ", width="), this.c, ", height=", this.d, ")");
    }
}
