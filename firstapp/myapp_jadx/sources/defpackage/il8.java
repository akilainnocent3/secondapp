package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class il8 {
    public final vnj0 a;

    public il8(vnj0 vnj0Var) {
        this.a = vnj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof il8) && Intrinsics.g(this.a, ((il8) obj).a);
    }

    public final int hashCode() {
        vnj0 vnj0Var = this.a;
        if (vnj0Var == null) {
            return 0;
        }
        return vnj0Var.hashCode();
    }

    public final String toString() {
        return "CommonWithdrawDialogsState(withdrawResult=" + this.a + ")";
    }

    public il8() {
        this(null);
    }
}
