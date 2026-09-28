package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ewd0 implements l4h {
    public final l4h a;
    public final long b;

    public ewd0(l4h l4hVar, long j) {
        this.a = l4hVar;
        ly0.b(l4hVar.getPosition() >= j);
        this.b = j;
    }

    @Override // defpackage.l4h
    public final boolean b(int i, boolean z) {
        return this.a.b(i, true);
    }

    @Override // defpackage.l4h
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        return this.a.c(bArr, i, i2, z);
    }

    @Override // defpackage.l4h
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.l4h
    public final boolean f(byte[] bArr, int i, int i2, boolean z) {
        return this.a.f(bArr, 0, i2, z);
    }

    @Override // defpackage.l4h
    public final long getLength() {
        return this.a.getLength() - this.b;
    }

    @Override // defpackage.l4h
    public final long getPosition() {
        return this.a.getPosition() - this.b;
    }

    @Override // defpackage.l4h
    public final long h() {
        return this.a.h() - this.b;
    }

    @Override // defpackage.l4h
    public final void i(int i) {
        this.a.i(i);
    }

    @Override // defpackage.l4h
    public final int j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.l4h
    public final int k(byte[] bArr, int i, int i2) {
        return this.a.k(bArr, i, i2);
    }

    @Override // defpackage.l4h
    public final void l(int i) {
        this.a.l(i);
    }

    @Override // defpackage.l4h
    public final void m(byte[] bArr, int i, int i2) {
        this.a.m(bArr, i, i2);
    }

    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }

    @Override // defpackage.l4h
    public final void readFully(byte[] bArr, int i, int i2) {
        this.a.readFully(bArr, i, i2);
    }
}
