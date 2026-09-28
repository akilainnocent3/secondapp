package defpackage;

import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class aii0 {
    public final qcn<fgi0> a;
    public final qcn<dhi0> b;
    public final qcn<ggi0> c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public aii0(qcn qcnVar, qcn qcnVar2, qcn qcnVar3, String str, boolean z, boolean z2) {
        qcnVar.getClass();
        qcnVar2.getClass();
        qcnVar3.getClass();
        this.a = qcnVar;
        this.b = qcnVar2;
        this.c = qcnVar3;
        this.d = z;
        this.e = z2;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aii0)) {
            return false;
        }
        aii0 aii0Var = (aii0) obj;
        return Intrinsics.g(this.a, aii0Var.a) && Intrinsics.g(this.b, aii0Var.b) && Intrinsics.g(this.c, aii0Var.c) && this.d == aii0Var.d && this.e == aii0Var.e && Intrinsics.g(this.f, aii0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + mtg0.a(mtg0.a(shu.a(this.c, shu.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualLobbyGameUiState(banners=");
        sb.append(this.a);
        sb.append(", entrances=");
        sb.append(this.b);
        sb.append(", broadcasts=");
        sb.append(this.c);
        sb.append(", shouldShowGetStartedIcon=");
        sb.append(this.d);
        sb.append(oLsIjJCWb.hiort);
        return nyf.a(", playNowLabel=", this.f, ")", sb, this.e);
    }
}
