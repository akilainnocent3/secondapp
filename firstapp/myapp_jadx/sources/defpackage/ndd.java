package defpackage;

import androidx.compose.ui.layout.y;

/* JADX INFO: loaded from: classes.dex */
public final class ndd implements vhv {
    public final mzo a;
    public final ozo b;
    public final szo c;

    public ndd(mzo mzoVar, ozo ozoVar, szo szoVar) {
        this.a = mzoVar;
        this.b = ozoVar;
        this.c = szoVar;
    }

    @Override // defpackage.mzo
    public final int R(int i) {
        return this.a.R(i);
    }

    @Override // defpackage.mzo
    public final int a0(int i) {
        return this.a.a0(i);
    }

    @Override // defpackage.mzo
    public final int b0(int i) {
        return this.a.b0(i);
    }

    @Override // defpackage.vhv
    public final y d0(long j) {
        szo szoVar = szo.a;
        mzo mzoVar = this.a;
        szo szoVar2 = this.c;
        ozo ozoVar = this.b;
        if (szoVar2 == szoVar) {
            return new wth(ozoVar == ozo.b ? mzoVar.b0(kxa.h(j)) : mzoVar.a0(kxa.h(j)), kxa.d(j) ? kxa.h(j) : 32767);
        }
        return new wth(kxa.e(j) ? kxa.i(j) : 32767, ozoVar == ozo.b ? mzoVar.x(kxa.i(j)) : mzoVar.R(kxa.i(j)));
    }

    @Override // defpackage.mzo
    public final Object g() {
        return this.a.g();
    }

    @Override // defpackage.mzo
    public final int x(int i) {
        return this.a.x(i);
    }
}
