package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g0o {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final qcn<t0o> d;
    public final qcn<String> e;
    public final qcn<u0o> f;
    public final qcn<w1o> g;
    public final String h;

    public g0o(String str, boolean z, boolean z2, qcn<t0o> qcnVar, qcn<String> qcnVar2, qcn<u0o> qcnVar3, qcn<w1o> qcnVar4, String str2) {
        qcnVar.getClass();
        qcnVar2.getClass();
        qcnVar3.getClass();
        qcnVar4.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = qcnVar;
        this.e = qcnVar2;
        this.f = qcnVar3;
        this.g = qcnVar4;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0o)) {
            return false;
        }
        g0o g0oVar = (g0o) obj;
        return this.a.equals(g0oVar.a) && this.b == g0oVar.b && this.c == g0oVar.c && Intrinsics.g(this.d, g0oVar.d) && Intrinsics.g(this.e, g0oVar.e) && Intrinsics.g(this.f, g0oVar.f) && Intrinsics.g(this.g, g0oVar.g) && this.h.equals(g0oVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + shu.a(this.g, shu.a(this.f, shu.a(this.e, shu.a(this.d, mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("InstantRacingRaceContentState(ticketId=", this.a, ", isRunning=", ", isWin=", this.b);
        sbA.append(this.c);
        sbA.append(", racerStates=");
        sbA.append(this.d);
        sbA.append(", resultTrack=");
        sbA.append(this.e);
        sbA.append(", rankStates=");
        sbA.append(this.f);
        sbA.append(", mySelectionStates=");
        sbA.append(this.g);
        sbA.append(", totalReturnWithCurrencyText=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
