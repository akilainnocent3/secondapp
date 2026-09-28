package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hwu {
    public final pl6 a;
    public final boolean b;

    public hwu(pl6 pl6Var, boolean z) {
        this.a = pl6Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwu)) {
            return false;
        }
        hwu hwuVar = (hwu) obj;
        return Intrinsics.g(this.a, hwuVar.a) && this.b == hwuVar.b;
    }

    public final int hashCode() {
        pl6 pl6Var = this.a;
        return Boolean.hashCode(this.b) + ((pl6Var == null ? 0 : pl6Var.hashCode()) * 31);
    }

    public final String toString() {
        return "MatchBriefViewHolderData(cashOutItemWrapper=" + this.a + ", updateBg=" + this.b + ")";
    }

    public hwu() {
        this(0);
    }

    public /* synthetic */ hwu(int i) {
        this(null, true);
    }
}
