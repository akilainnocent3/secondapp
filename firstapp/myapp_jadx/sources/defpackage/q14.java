package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q14 {
    public final r6e0 a;
    public final p6e0 b;

    public q14(r6e0 r6e0Var, p6e0 p6e0Var) {
        r6e0Var.getClass();
        p6e0Var.getClass();
        this.a = r6e0Var;
        this.b = p6e0Var;
    }

    public static q14 a(q14 q14Var, r6e0 r6e0Var, p6e0 p6e0Var, int i) {
        if ((i & 1) != 0) {
            r6e0Var = q14Var.a;
        }
        if ((i & 2) != 0) {
            p6e0Var = q14Var.b;
        }
        q14Var.getClass();
        r6e0Var.getClass();
        p6e0Var.getClass();
        return new q14(r6e0Var, p6e0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q14)) {
            return false;
        }
        q14 q14Var = (q14) obj;
        return Intrinsics.g(this.a, q14Var.a) && Intrinsics.g(this.b, q14Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BettingStreakHistoryUiState(contentState=" + this.a + ", bottomSheetState=" + this.b + ")";
    }

    public q14() {
        this((r6e0.c) null, 3);
    }

    public /* synthetic */ q14(r6e0.c cVar, int i) {
        this((i & 1) != 0 ? r6e0.b.a : cVar, p6e0.b.a);
    }
}
