package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class owa0 implements jsa.b, paj {
    public final /* synthetic */ zwa0 a;

    public owa0(zwa0 zwa0Var) {
        this.a = zwa0Var;
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(0, this.a, zwa0.class, "onConfirmWithdrawClicked", "onConfirmWithdrawClicked()V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof jsa.b) && (obj instanceof paj)) {
            return Intrinsics.g(c(), ((paj) obj).c());
        }
        return false;
    }

    @Override // jsa.b
    public final void h() {
        zwa0 zwa0Var = this.a;
        if (zwa0Var.w.a()) {
            zwa0Var.y1(xwa0.o.a);
        } else {
            zwa0Var.A1();
        }
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
