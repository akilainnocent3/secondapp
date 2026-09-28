package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ph4 {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public ph4(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph4)) {
            return false;
        }
        ph4 ph4Var = (ph4) obj;
        return Intrinsics.g(this.a, ph4Var.a) && this.b == ph4Var.b && Intrinsics.g(this.c, ph4Var.c) && this.d == ph4Var.d;
    }

    public final int hashCode() {
        int iA = mtg0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupAnimationCommand(animationName=");
        sb.append(this.a);
        sb.append(", loop=");
        sb.append(this.b);
        sb.append(", followUpAnimationName=");
        sb.append(this.c);
        sb.append(", followUpLoops=");
        return ruw.a(sb, this.d, ')');
    }
}
