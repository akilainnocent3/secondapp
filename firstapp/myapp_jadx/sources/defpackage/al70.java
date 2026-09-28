package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class al70 {
    public final String a;
    public final String b;
    public final qcn<gfh0> c;

    public al70(qcn qcnVar, String str, String str2) {
        qcnVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al70)) {
            return false;
        }
        al70 al70Var = (al70) obj;
        return this.a.equals(al70Var.a) && this.b.equals(al70Var.b) && Intrinsics.g(this.c, al70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ts3.a(ux5.a("ScheduledFootballUniversalSpecifierBottomSheetState(matchdayId=", this.a, ", marketType=", this.b, ", cellStates="), this.c, ")");
    }
}
