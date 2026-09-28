package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ii10 extends rfi0 {
    @Override // defpackage.rfi0
    public final void a0(int i, int i2, int i3, int i4) {
        int iS = this.B0 + this.C0;
        int iM = this.x0 + this.y0;
        if (this.w0 > 0) {
            iS += this.v0[0].s();
            iM += this.v0[0].m();
        }
        int iMax = Math.max(this.e0, iS);
        int iMax2 = Math.max(this.f0, iM);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(iMax, i2);
            } else {
                i2 = i == 0 ? iMax : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(iMax2, i4);
            } else {
                i4 = i3 == 0 ? iMax2 : 0;
            }
        }
        this.E0 = i2;
        this.F0 = i4;
        T(i2);
        O(i4);
        this.D0 = this.w0 > 0;
    }

    @Override // defpackage.ixa
    public final void c(ofs ofsVar, boolean z) {
        super.c(ofsVar, z);
        if (this.w0 > 0) {
            ixa ixaVar = this.v0[0];
            ixaVar.F();
            ixaVar.h0 = 0.5f;
            ixaVar.g0 = 0.5f;
            ewa.a aVar = ewa.a.a;
            ixaVar.f(aVar, this, aVar, 0);
            ewa.a aVar2 = ewa.a.c;
            ixaVar.f(aVar2, this, aVar2, 0);
            ewa.a aVar3 = ewa.a.b;
            ixaVar.f(aVar3, this, aVar3, 0);
            ewa.a aVar4 = ewa.a.d;
            ixaVar.f(aVar4, this, aVar4, 0);
        }
    }
}
