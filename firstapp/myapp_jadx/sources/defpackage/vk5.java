package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class vk5 extends xv20<Byte, byte[], sk5> {
    public static final vk5 c;

    static {
        gl5.a.getClass();
        c = new vk5(il5.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        sk5 sk5Var = (sk5) obj;
        sk5Var.getClass();
        byte bI = dmaVar.i(this.b, i);
        sk5Var.b(sk5Var.d() + 1);
        byte[] bArr = sk5Var.a;
        int i2 = sk5Var.b;
        sk5Var.b = i2 + 1;
        bArr[i2] = bI;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        sk5 sk5Var = new sk5();
        sk5Var.a = bArr;
        sk5Var.b = bArr.length;
        sk5Var.b(10);
        return sk5Var;
    }

    @Override // defpackage.xv20
    public final byte[] j() {
        return new byte[0];
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        fmaVar.getClass();
        bArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fmaVar.k(this.b, i2, bArr2[i2]);
        }
    }
}
