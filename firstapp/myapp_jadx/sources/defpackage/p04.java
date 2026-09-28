package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p04 {
    public final boolean a;
    public final String b;

    public p04(boolean z, String str) {
        str.getClass();
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p04)) {
            return false;
        }
        p04 p04Var = (p04) obj;
        return this.a == p04Var.a && Intrinsics.g(this.b, p04Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BettingStreakApplyToolResult(canApply=" + this.a + ", hint=" + this.b + ")";
    }
}
