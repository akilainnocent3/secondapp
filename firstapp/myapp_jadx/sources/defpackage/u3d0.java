package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u3d0 {
    public static final u3d0 h;
    public final fqo a;
    public final h3d0 b;
    public final qcn<q3d0> c;
    public final boolean d;
    public final x1d0 e;
    public final r2d0 f;
    public final String g;

    static {
        n1a0 n1a0Var = n1a0.c;
        r2d0.a.getClass();
        h = new u3d0(null, null, n1a0Var, false, x1d0.d, r2d0.a.b, null);
    }

    public u3d0(fqo fqoVar, h3d0 h3d0Var, qcn<q3d0> qcnVar, boolean z, x1d0 x1d0Var, r2d0 r2d0Var, String str) {
        qcnVar.getClass();
        r2d0Var.getClass();
        this.a = fqoVar;
        this.b = h3d0Var;
        this.c = qcnVar;
        this.d = z;
        this.e = x1d0Var;
        this.f = r2d0Var;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3d0)) {
            return false;
        }
        u3d0 u3d0Var = (u3d0) obj;
        return Intrinsics.g(this.a, u3d0Var.a) && Intrinsics.g(this.b, u3d0Var.b) && Intrinsics.g(this.c, u3d0Var.c) && this.d == u3d0Var.d && this.e.equals(u3d0Var.e) && Intrinsics.g(this.f, u3d0Var.f) && Intrinsics.g(this.g, u3d0Var.g);
    }

    public final int hashCode() {
        fqo fqoVar = this.a;
        int iHashCode = (fqoVar == null ? 0 : fqoVar.hashCode()) * 31;
        h3d0 h3d0Var = this.b;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + mtg0.a(shu.a(this.c, (iHashCode + (h3d0Var == null ? 0 : h3d0Var.hashCode())) * 31, 31), 31, this.d)) * 31)) * 31;
        String str = this.g;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyPenaltySettlementUiState(topAppBarState=");
        sb.append(this.a);
        sb.append(", scorePanelState=");
        sb.append(this.b);
        sb.append(", mySelectState=");
        sb.append(this.c);
        sb.append(", isMySelectionsExpanded=");
        sb.append(this.d);
        sb.append(", kickAnimationTypeState=");
        sb.append(this.e);
        sb.append(", playbackState=");
        sb.append(this.f);
        sb.append(", totalReturnWithCurrencyText=");
        return uf80.a(sb, this.g, ")");
    }
}
