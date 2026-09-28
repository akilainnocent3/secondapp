package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xwq {
    public final lk50<Unit> a;
    public final dvq b;

    public xwq(lk50<Unit> lk50Var, dvq dvqVar) {
        lk50Var.getClass();
        dvqVar.getClass();
        this.a = lk50Var;
        this.b = dvqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwq)) {
            return false;
        }
        xwq xwqVar = (xwq) obj;
        return Intrinsics.g(this.a, xwqVar.a) && Intrinsics.g(this.b, xwqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNMyNumberUpdateResult(apiResult=" + this.a + ", newMyNumber=" + this.b + ")";
    }
}
