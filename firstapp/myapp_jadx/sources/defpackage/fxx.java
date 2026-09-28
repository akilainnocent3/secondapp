package defpackage;

import androidx.compose.ui.layout.y;

/* JADX INFO: loaded from: classes.dex */
public final class fxx implements vhv {
    public final mzo a;
    public final hxx b;
    public final ixx c;

    public fxx(mzo mzoVar, hxx hxxVar, ixx ixxVar) {
        this.a = mzoVar;
        this.b = hxxVar;
        this.c = ixxVar;
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
        ixx ixxVar = ixx.a;
        mzo mzoVar = this.a;
        ixx ixxVar2 = this.c;
        hxx hxxVar = this.b;
        if (ixxVar2 == ixxVar) {
            return new gxx(hxxVar == hxx.b ? mzoVar.b0(kxa.h(j)) : mzoVar.a0(kxa.h(j)), kxa.d(j) ? kxa.h(j) : 32767);
        }
        return new gxx(kxa.e(j) ? kxa.i(j) : 32767, hxxVar == hxx.b ? mzoVar.x(kxa.i(j)) : mzoVar.R(kxa.i(j)));
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
