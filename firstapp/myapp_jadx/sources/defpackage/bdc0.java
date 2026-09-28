package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bdc0 {
    public final String a;
    public final String b;
    public final qcn<lgc0> c;
    public final qcn<enc0> d;

    public bdc0(String str, String str2, qcn<lgc0> qcnVar, qcn<enc0> qcnVar2) {
        this.a = str;
        this.b = str2;
        this.c = qcnVar;
        this.d = qcnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdc0)) {
            return false;
        }
        bdc0 bdc0Var = (bdc0) obj;
        return this.a.equals(bdc0Var.a) && this.b.equals(bdc0Var.b) && Intrinsics.g(this.c, bdc0Var.c) && Intrinsics.g(this.d, bdc0Var.d);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        qcn<lgc0> qcnVar = this.c;
        int iHashCode = (iA + (qcnVar == null ? 0 : qcnVar.hashCode())) * 31;
        qcn<enc0> qcnVar2 = this.d;
        return iHashCode + (qcnVar2 != null ? qcnVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyLegendsLeagueCategoryInfoState(leagueId=", this.a, ", leagueName=", this.b, ", matches=");
        sbA.append(this.c);
        sbA.append(", teams=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
