package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ps6 {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;

    public ps6(int i, String str, String str2, boolean z) {
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps6)) {
            return false;
        }
        ps6 ps6Var = (ps6) obj;
        return this.a.equals(ps6Var.a) && this.b == ps6Var.b && Intrinsics.g(this.c, ps6Var.c) && this.d == ps6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashoutUiModel(buttonState=");
        sb.append(this.a);
        sb.append(", betIndex=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", shouldShowWaitingMsg=");
        return ruw.a(sb, this.d, ')');
    }
}
