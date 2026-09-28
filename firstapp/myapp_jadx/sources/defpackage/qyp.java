package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qyp {
    public final pjq a;
    public final pjq b;
    public final qxq c;
    public final rjq d;

    public qyp(pjq pjqVar, pjq pjqVar2, qxq qxqVar, rjq rjqVar) {
        pjqVar.getClass();
        pjqVar2.getClass();
        qxqVar.getClass();
        rjqVar.getClass();
        this.a = pjqVar;
        this.b = pjqVar2;
        this.c = qxqVar;
        this.d = rjqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyp)) {
            return false;
        }
        qyp qypVar = (qyp) obj;
        return Intrinsics.g(this.a, qypVar.a) && Intrinsics.g(this.b, qypVar.b) && Intrinsics.g(this.c, qypVar.c) && Intrinsics.g(this.d, qypVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LNBetHistoryState(settledFilter=" + this.a + ", winFilter=" + this.b + ", orderState=" + this.c + ", filterDialog=" + this.d + ")";
    }

    public qyp() {
        this(0);
    }

    public /* synthetic */ qyp(int i) {
        this(new pjq(0), new pjq(0), qxq.d.a, rjq.a.a);
    }
}
