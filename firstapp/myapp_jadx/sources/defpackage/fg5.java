package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fg5 {
    public final eg5 a;
    public final boolean b;

    public fg5(eg5 eg5Var, boolean z) {
        eg5Var.getClass();
        this.a = eg5Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg5)) {
            return false;
        }
        fg5 fg5Var = (fg5) obj;
        return Intrinsics.g(this.a, fg5Var.a) && this.b == fg5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BuildAndGoRunningPageSheetState(screenHeight=" + this.a + ", showFastBet=" + this.b + ")";
    }

    public fg5() {
        this(0);
    }

    public /* synthetic */ fg5(int i) {
        this(eg5.c.a, false);
    }
}
