package x5;

import c7.s;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends c7.i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f144524p;

    public b(String str, s sVar) {
        super(str);
        this.f144524p = sVar;
    }

    @Override // c7.i
    public c7.j x(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f144524p.reset();
        }
        return this.f144524p.c(bArr, 0, i10);
    }
}
