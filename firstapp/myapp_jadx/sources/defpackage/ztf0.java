package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ztf0 {
    public final Integer a;
    public final Integer b;
    public final boolean c;
    public final boolean d;

    public ztf0(Integer num, Integer num2, boolean z, boolean z2) {
        this.a = num;
        this.b = num2;
        this.c = z;
        this.d = z2;
    }

    public static ztf0 a(ztf0 ztf0Var, Integer num, Integer num2, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            num = ztf0Var.a;
        }
        if ((i & 2) != 0) {
            num2 = ztf0Var.b;
        }
        if ((i & 4) != 0) {
            z = ztf0Var.c;
        }
        if ((i & 8) != 0) {
            z2 = ztf0Var.d;
        }
        ztf0Var.getClass();
        return new ztf0(num, num2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztf0)) {
            return false;
        }
        ztf0 ztf0Var = (ztf0) obj;
        return Intrinsics.g(this.a, ztf0Var.a) && Intrinsics.g(this.b, ztf0Var.b) && this.c == ztf0Var.c && this.d == ztf0Var.d;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return Boolean.hashCode(this.d) + mtg0.a((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeAlertManagerState(timeAlertLimit=");
        sb.append(this.a);
        sb.append(", consumedTime=");
        sb.append(this.b);
        sb.append(", isLoggedIn=");
        return lng.a(", isAppInForeground=", ")", sb, this.c, this.d);
    }

    public /* synthetic */ ztf0(int i) {
        this(null, null, false, false);
    }

    public ztf0() {
        this(0);
    }
}
