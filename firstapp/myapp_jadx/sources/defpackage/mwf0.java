package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mwf0 {
    public final fwf0 a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ mwf0(int i) {
        this(new fwf0(63, null, null, null, null), false, false);
    }

    public static mwf0 a(mwf0 mwf0Var, fwf0 fwf0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            fwf0Var = mwf0Var.a;
        }
        if ((i & 2) != 0) {
            z = mwf0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = mwf0Var.c;
        }
        mwf0Var.getClass();
        fwf0Var.getClass();
        return new mwf0(fwf0Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwf0)) {
            return false;
        }
        mwf0 mwf0Var = (mwf0) obj;
        return Intrinsics.g(this.a, mwf0Var.a) && this.b == mwf0Var.b && this.c == mwf0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimitsManagerState(timeLimits=");
        sb.append(this.a);
        sb.append(", isLoggedIn=");
        sb.append(this.b);
        sb.append(", isAppInForeground=");
        return mq0.a(sb, this.c, ")");
    }

    public mwf0(fwf0 fwf0Var, boolean z, boolean z2) {
        this.a = fwf0Var;
        this.b = z;
        this.c = z2;
    }

    public mwf0() {
        this(0);
    }
}
