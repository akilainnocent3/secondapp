package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class vri0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public vri0(String str, boolean z, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vri0)) {
            return false;
        }
        vri0 vri0Var = (vri0) obj;
        return Intrinsics.g(this.a, vri0Var.a) && this.b == vri0Var.b && this.c == vri0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WDLeftRightState(value=");
        sb.append(this.a);
        sb.append(", leftEnable=");
        sb.append(this.b);
        sb.append(", rightEnable=");
        return ruw.a(sb, this.c, ')');
    }

    public /* synthetic */ vri0(int i) {
        this("", false, false);
    }
}
