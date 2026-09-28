package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class er1 {
    public final ijf0 a;
    public final uxs b;
    public final boolean c;

    public /* synthetic */ er1(int i) {
        this(new ijf0((String) null, 0L, 7), uxs.DISABLE, false);
    }

    public static er1 a(er1 er1Var, ijf0 ijf0Var, uxs uxsVar, int i) {
        if ((i & 1) != 0) {
            ijf0Var = er1Var.a;
        }
        if ((i & 2) != 0) {
            uxsVar = er1Var.b;
        }
        boolean z = (i & 4) != 0 ? er1Var.c : true;
        er1Var.getClass();
        ijf0Var.getClass();
        uxsVar.getClass();
        return new er1(ijf0Var, uxsVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er1)) {
            return false;
        }
        er1 er1Var = (er1) obj;
        return Intrinsics.g(this.a, er1Var.a) && this.b == er1Var.b && this.c == er1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + y45.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BVNUiState(bvn=");
        sb.append(this.a);
        sb.append(", verifiable=");
        sb.append(this.b);
        sb.append(", isBVNVerified=");
        return mq0.a(sb, this.c, ")");
    }

    public er1(ijf0 ijf0Var, uxs uxsVar, boolean z) {
        this.a = ijf0Var;
        this.b = uxsVar;
        this.c = z;
    }

    public er1() {
        this(0);
    }
}
