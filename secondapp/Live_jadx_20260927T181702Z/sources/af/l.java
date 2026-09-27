package af;

import androidx.annotation.Nullable;
import eh.t0;
import java.io.EOFException;
import java.io.IOException;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l implements g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4982d = new byte[4096];

    @Override // af.g0
    public void a(t0 t0Var, int i10, int i11) {
        t0Var.Z(i10);
    }

    @Override // af.g0
    public int d(ah.r rVar, int i10, boolean z10, int i11) throws IOException {
        int i12 = rVar.read(this.f4982d, 0, Math.min(this.f4982d.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // af.g0
    public /* synthetic */ int e(ah.r rVar, int i10, boolean z10) {
        return f0.a(this, rVar, i10, z10);
    }

    @Override // af.g0
    public /* synthetic */ void f(t0 t0Var, int i10) {
        f0.b(this, t0Var, i10);
    }

    @Override // af.g0
    public void c(n2 n2Var) {
    }

    @Override // af.g0
    public void b(long j10, int i10, int i11, int i12, @Nullable g0.a aVar) {
    }
}
