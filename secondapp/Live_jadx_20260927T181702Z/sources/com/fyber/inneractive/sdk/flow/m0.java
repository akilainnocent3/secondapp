package com.fyber.inneractive.sdk.flow;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f44766a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, long j10) {
        super(j10, 1000L);
        this.f44766a = p0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        m0 m0Var = this.f44766a.f44862v;
        if (m0Var != null) {
            m0Var.cancel();
        }
        this.f44766a.d(false);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        int i10 = ((int) j10) / 1000;
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f44766a.f44851k;
        if (eVar != null) {
            eVar.updateCloseCountdown(i10);
        }
    }
}
