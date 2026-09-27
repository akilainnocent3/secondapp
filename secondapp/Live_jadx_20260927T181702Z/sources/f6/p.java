package f6;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class p implements f1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f83595d = new byte[4096];

    @Override // f6.f1
    public /* synthetic */ int a(u4.c0 c0Var, int i10, boolean z10) {
        return e1.b(this, c0Var, i10, z10);
    }

    @Override // f6.f1
    public /* synthetic */ void c(long j10) {
        e1.a(this, j10);
    }

    @Override // f6.f1
    public void d(x4.v0 v0Var, int i10, int i11) {
        v0Var.l0(i10);
    }

    @Override // f6.f1
    public /* synthetic */ void f(x4.v0 v0Var, int i10) {
        e1.c(this, v0Var, i10);
    }

    @Override // f6.f1
    public int g(u4.c0 c0Var, int i10, boolean z10, int i11) throws IOException {
        int i12 = c0Var.read(this.f83595d, 0, Math.min(this.f83595d.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // f6.f1
    public void e(androidx.media3.common.a aVar) {
    }

    @Override // f6.f1
    public void b(long j10, int i10, int i11, int i12, @Nullable f1.a aVar) {
    }
}
