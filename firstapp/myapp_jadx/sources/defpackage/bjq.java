package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bjq {
    public final lk50<ygq> a;
    public final chq b;

    public bjq(lk50<ygq> lk50Var, chq chqVar) {
        lk50Var.getClass();
        chqVar.getClass();
        this.a = lk50Var;
        this.b = chqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjq)) {
            return false;
        }
        bjq bjqVar = (bjq) obj;
        return Intrinsics.g(this.a, bjqVar.a) && Intrinsics.g(this.b, bjqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNHistoryDetailState(contentState=" + this.a + ", dialogState=" + this.b + ")";
    }

    public bjq() {
        this(0);
    }

    public /* synthetic */ bjq(int i) {
        this(lk50.b.a, chq.a.a);
    }
}
