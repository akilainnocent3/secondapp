package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class rfi0 extends yil {
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public boolean D0 = false;
    public int E0 = 0;
    public int F0 = 0;
    public final n92.a G0 = new n92.a();
    public n92.b H0 = null;

    @Override // defpackage.yil
    public final void Z() {
        for (int i = 0; i < this.w0; i++) {
            ixa ixaVar = this.v0[i];
            if (ixaVar != null) {
                ixaVar.H = true;
            }
        }
    }

    public final void b0(ixa ixaVar, ixa.a aVar, int i, ixa.a aVar2, int i2) {
        n92.b bVar;
        ixa ixaVar2;
        while (true) {
            bVar = this.H0;
            if (bVar != null || (ixaVar2 = this.W) == null) {
                break;
            } else {
                this.H0 = ((jxa) ixaVar2).z0;
            }
        }
        n92.a aVar3 = this.G0;
        aVar3.a = aVar;
        aVar3.b = aVar2;
        aVar3.c = i;
        aVar3.d = i2;
        bVar.b(ixaVar, aVar3);
        ixaVar.T(aVar3.e);
        ixaVar.O(aVar3.f);
        ixaVar.F = aVar3.h;
        ixaVar.K(aVar3.g);
    }

    public void a0(int i, int i2, int i3, int i4) {
    }
}
