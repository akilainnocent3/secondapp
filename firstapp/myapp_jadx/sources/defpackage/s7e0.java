package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s7e0 {
    public final String a;
    public final qcn<n4e0> b;

    public s7e0(qcn qcnVar, String str) {
        str.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7e0)) {
            return false;
        }
        s7e0 s7e0Var = (s7e0) obj;
        return Intrinsics.g(this.a, s7e0Var.a) && Intrinsics.g(this.b, s7e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StreakWeekDisplayData(weekLabel=" + this.a + ", days=" + this.b + ")";
    }
}
