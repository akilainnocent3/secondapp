package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gmj0 {
    public final String a;
    public final hmj0 b;

    public gmj0(String str, hmj0 hmj0Var) {
        this.a = str;
        this.b = hmj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmj0)) {
            return false;
        }
        gmj0 gmj0Var = (gmj0) obj;
        return Intrinsics.g(this.a, gmj0Var.a) && this.b == gmj0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "WithdrawGreylistedDialogState(message=" + this.a + ", negativeAction=" + this.b + ")";
    }
}
