package defpackage;

import androidx.compose.ui.layout.y;

/* JADX INFO: loaded from: classes.dex */
public final class oiv implements vhv {
    public final mzo a;
    public final qiv b;
    public final riv c;

    public oiv(mzo mzoVar, qiv qivVar, riv rivVar) {
        this.a = mzoVar;
        this.b = qivVar;
        this.c = rivVar;
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
        riv rivVar = riv.a;
        mzo mzoVar = this.a;
        riv rivVar2 = this.c;
        qiv qivVar = this.b;
        if (rivVar2 == rivVar) {
            return new piv(qivVar == qiv.b ? mzoVar.b0(kxa.h(j)) : mzoVar.a0(kxa.h(j)), kxa.d(j) ? kxa.h(j) : 32767);
        }
        return new piv(kxa.e(j) ? kxa.i(j) : 32767, qivVar == qiv.b ? mzoVar.x(kxa.i(j)) : mzoVar.R(kxa.i(j)));
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
