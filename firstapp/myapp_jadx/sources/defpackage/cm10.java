package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cm10 {
    public final ao10 a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    public final Integer h;
    public final boolean i;

    public cm10(ao10 ao10Var, int i, int i2, int i3, String str, int i4, int i5, Integer num, boolean z) {
        this.a = ao10Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = i4;
        this.g = i5;
        this.h = num;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm10)) {
            return false;
        }
        cm10 cm10Var = (cm10) obj;
        return this.a == cm10Var.a && this.b == cm10Var.b && this.c == cm10Var.c && this.d == cm10Var.d && Intrinsics.g(this.e, cm10Var.e) && this.f == cm10Var.f && this.g == cm10Var.g && Intrinsics.g(this.h, cm10Var.h) && this.i == cm10Var.i;
    }

    public final int hashCode() {
        int iA = gpp.a(this.d, gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        String str = this.e;
        int iA2 = gpp.a(this.g, gpp.a(this.f, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Integer num = this.h;
        return Boolean.hashCode(this.i) + ((iA2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayTimeControlDialog(type=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", title=");
        d5d.a(sb, this.c, ", periodEndTitle=", this.d, ", period=");
        wxa.b(this.f, this.e, ", description=", ", primaryButtonText=", sb);
        sb.append(this.g);
        sb.append(", secondaryButtonText=");
        sb.append(this.h);
        sb.append(", canDismissFlow=");
        return mq0.a(sb, this.i, ")");
    }
}
