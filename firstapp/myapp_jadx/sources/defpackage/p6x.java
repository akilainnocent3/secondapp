package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p6x {
    public final ijf0 a;
    public final ijf0 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final String i;

    public /* synthetic */ p6x(int i) {
        this(new ijf0((String) null, 0L, 7), new ijf0((String) null, 0L, 7), 0, false, false, false, false, 0, "");
    }

    public static p6x a(p6x p6xVar, ijf0 ijf0Var, ijf0 ijf0Var2, int i, boolean z, boolean z2, boolean z3, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            ijf0Var = p6xVar.a;
        }
        ijf0 ijf0Var3 = ijf0Var;
        if ((i3 & 2) != 0) {
            ijf0Var2 = p6xVar.b;
        }
        ijf0 ijf0Var4 = ijf0Var2;
        if ((i3 & 4) != 0) {
            i = p6xVar.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            z = p6xVar.d;
        }
        boolean z4 = z;
        if ((i3 & 16) != 0) {
            z2 = p6xVar.e;
        }
        boolean z5 = z2;
        boolean z6 = (i3 & 32) != 0 ? p6xVar.f : z3;
        boolean z7 = (i3 & 64) != 0 ? p6xVar.g : true;
        int i5 = (i3 & 128) != 0 ? p6xVar.h : i2;
        String str2 = (i3 & 256) != 0 ? p6xVar.i : str;
        p6xVar.getClass();
        ijf0Var3.getClass();
        ijf0Var4.getClass();
        str2.getClass();
        return new p6x(ijf0Var3, ijf0Var4, i4, z4, z5, z6, z7, i5, str2);
    }

    public final boolean b() {
        int i = this.h;
        return (i == 0 || i == 12703 || i == 12704 || i == 10000) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6x)) {
            return false;
        }
        p6x p6xVar = (p6x) obj;
        return Intrinsics.g(this.a, p6xVar.a) && Intrinsics.g(this.b, p6xVar.b) && this.c == p6xVar.c && this.d == p6xVar.d && this.e == p6xVar.e && this.f == p6xVar.f && this.g == p6xVar.g && this.h == p6xVar.h && Intrinsics.g(this.i, p6xVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + gpp.a(this.h, mtg0.a(mtg0.a(mtg0.a(mtg0.a(gpp.a(this.c, ey1.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NINVerificationState(textFieldValue=");
        sb.append(this.a);
        sb.append(", previousTextFieldValue=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", isNameUpdateOn=");
        sb.append(this.d);
        sb.append(", showUnexpectedError=");
        nng.a(", isLoading=", ", isSuccessful=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", bizCode=");
        sb.append(this.h);
        sb.append(", message=");
        return uf80.a(sb, this.i, ")");
    }

    public p6x(ijf0 ijf0Var, ijf0 ijf0Var2, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str) {
        this.a = ijf0Var;
        this.b = ijf0Var2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = i2;
        this.i = str;
    }

    public p6x() {
        this(0);
    }
}
