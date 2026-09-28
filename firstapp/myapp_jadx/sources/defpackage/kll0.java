package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class kll0 extends yqk0 {
    public final /* synthetic */ sll0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kll0(sll0 sll0Var, zal0 zal0Var) {
        super(zal0Var);
        this.e = sll0Var;
    }

    @Override // defpackage.yqk0
    public final void a() {
        sll0 sll0Var = this.e;
        wll0 wll0Var = sll0Var.d;
        wll0Var.g();
        k8l0 k8l0Var = wll0Var.a;
        k8l0Var.k.getClass();
        sll0Var.a(SystemClock.elapsedRealtime(), false, false);
        hwk0 hwk0Var = k8l0Var.n;
        k8l0.j(hwk0Var);
        k8l0Var.k.getClass();
        hwk0Var.j(SystemClock.elapsedRealtime());
    }
}
