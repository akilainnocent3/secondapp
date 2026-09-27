package v4;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class a0 extends z {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray<b0> f139986i = new SparseArray<>();

    @Override // v4.z
    public x.a e(x.a aVar) throws x.c {
        if (!u.a(aVar)) {
            throw new x.c(aVar);
        }
        b0 b0Var = this.f139986i.get(aVar.f140149b);
        if (b0Var != null) {
            return b0Var.m() ? x.a.f140147e : new x.a(aVar.f140148a, b0Var.j(), aVar.f140150c);
        }
        throw new x.c("No mixing matrix for input channel count", aVar);
    }

    public void k(b0 b0Var) {
        this.f139986i.put(b0Var.h(), b0Var);
    }

    @Override // v4.x
    public void queueInput(ByteBuffer byteBuffer) {
        b0 b0Var = (b0) zi.l0.E(this.f139986i.get(this.f140155b.f140149b));
        int iRemaining = byteBuffer.remaining() / this.f140155b.f140151d;
        ByteBuffer byteBufferJ = j(this.f140156c.f140151d * iRemaining);
        u.f(byteBuffer, this.f140155b, byteBufferJ, this.f140156c, b0Var, iRemaining, false, true);
        byteBufferJ.flip();
    }
}
