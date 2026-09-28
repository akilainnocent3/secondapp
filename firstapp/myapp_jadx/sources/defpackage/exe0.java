package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class exe0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public exe0(String str, boolean z, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exe0)) {
            return false;
        }
        exe0 exe0Var = (exe0) obj;
        return Intrinsics.g(this.a, exe0Var.a) && this.b == exe0Var.b && this.c == exe0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TGLeftRightState(value=");
        sb.append(this.a);
        sb.append(", leftEnable=");
        sb.append(this.b);
        sb.append(", rightEnable=");
        return ruw.a(sb, this.c, ')');
    }

    public exe0() {
        this(0);
    }

    public /* synthetic */ exe0(int i) {
        this("", false, false);
    }
}
