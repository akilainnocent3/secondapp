package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mfj0 {
    public final eej0 a;
    public final qcn<pbj0> b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public mfj0(eej0 eej0Var, qcn<? extends pbj0> qcnVar, int i) {
        qcnVar.getClass();
        this.a = eej0Var;
        this.b = qcnVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfj0)) {
            return false;
        }
        mfj0 mfj0Var = (mfj0) obj;
        return this.a.equals(mfj0Var.a) && Intrinsics.g(this.b, mfj0Var.b) && this.c == mfj0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shu.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinningPopupMyEventsState(eventInfoState=");
        sb.append(this.a);
        sb.append(", betOddsState=");
        sb.append(this.b);
        sb.append(", toggleIconResId=");
        return zk1.a(this.c, ")", sb);
    }
}
