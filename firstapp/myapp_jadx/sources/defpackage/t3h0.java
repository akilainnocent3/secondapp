package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t3h0 {
    public final wgn a;
    public final tzs b;
    public final tzs c;
    public final p3h0 d;
    public final c330 e;

    public t3h0(wgn wgnVar, tzs tzsVar, tzs tzsVar2, p3h0 p3h0Var, c330 c330Var) {
        wgnVar.getClass();
        tzsVar.getClass();
        tzsVar2.getClass();
        p3h0Var.getClass();
        c330Var.getClass();
        this.a = wgnVar;
        this.b = tzsVar;
        this.c = tzsVar2;
        this.d = p3h0Var;
        this.e = c330Var;
    }

    public static t3h0 a(t3h0 t3h0Var, wgn wgnVar, tzs tzsVar, tzs tzsVar2, p3h0 p3h0Var, c330 c330Var, int i) {
        if ((i & 1) != 0) {
            wgnVar = t3h0Var.a;
        }
        wgn wgnVar2 = wgnVar;
        if ((i & 2) != 0) {
            tzsVar = t3h0Var.b;
        }
        tzs tzsVar3 = tzsVar;
        if ((i & 4) != 0) {
            tzsVar2 = t3h0Var.c;
        }
        tzs tzsVar4 = tzsVar2;
        if ((i & 8) != 0) {
            p3h0Var = t3h0Var.d;
        }
        p3h0 p3h0Var2 = p3h0Var;
        if ((i & 16) != 0) {
            c330Var = t3h0Var.e;
        }
        c330 c330Var2 = c330Var;
        t3h0Var.getClass();
        wgnVar2.getClass();
        tzsVar3.getClass();
        tzsVar4.getClass();
        p3h0Var2.getClass();
        c330Var2.getClass();
        return new t3h0(wgnVar2, tzsVar3, tzsVar4, p3h0Var2, c330Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3h0)) {
            return false;
        }
        t3h0 t3h0Var = (t3h0) obj;
        return Intrinsics.g(this.a, t3h0Var.a) && Intrinsics.g(this.b, t3h0Var.b) && Intrinsics.g(this.c, t3h0Var.c) && Intrinsics.g(this.d, t3h0Var.d) && Intrinsics.g(this.e, t3h0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TxDetailsUiStateV2(initUiState=" + this.a + ", refreshUiState=" + this.b + ", loadingUiState=" + this.c + ", txDetailsState=" + this.d + ", fixStatusButtonState=" + this.e + ")";
    }
}
