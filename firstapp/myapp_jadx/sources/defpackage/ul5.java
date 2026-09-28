package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ul5 implements qg50<byte[]> {
    public final byte[] a;

    public ul5(byte[] bArr) {
        gm20.c(bArr, "Argument must not be null");
        this.a = bArr;
    }

    @Override // defpackage.qg50
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.qg50
    public final Class<byte[]> d() {
        return byte[].class;
    }

    @Override // defpackage.qg50
    public final byte[] get() {
        return this.a;
    }

    @Override // defpackage.qg50
    public final void c() {
    }
}
