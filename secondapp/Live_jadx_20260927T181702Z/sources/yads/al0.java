package yads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class al0 implements m73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f146844a = new byte[4096];

    @Override // yads.m73
    public final void a(long j10, int i10, int i11, int i12, l73 l73Var) {
    }

    @Override // yads.m73
    public /* synthetic */ int b(l30 l30Var, int i10, boolean z10) {
        return v54.a(this, l30Var, i10, z10);
    }

    @Override // yads.m73
    public final void a(mx0 mx0Var) {
    }

    @Override // yads.m73
    public /* synthetic */ void b(int i10, jb2 jb2Var) {
        v54.b(this, i10, jb2Var);
    }

    @Override // yads.m73
    public final int a(l30 l30Var, int i10, boolean z10) throws EOFException {
        int i11 = l30Var.read(this.f146844a, 0, Math.min(this.f146844a.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // yads.m73
    public final void a(int i10, jb2 jb2Var) {
        jb2Var.e(jb2Var.f151002b + i10);
    }
}
