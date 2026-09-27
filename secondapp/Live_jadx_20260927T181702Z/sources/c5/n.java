package c5;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public class n extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k.a<n> f22438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ByteBuffer f22439g;

    public n(k.a<n> aVar) {
        this.f22438f = aVar;
    }

    @Override // c5.k, c5.a
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f22439g;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // c5.k
    public void l() {
        this.f22438f.a(this);
    }

    public ByteBuffer m(int i10) {
        ByteBuffer byteBuffer = (ByteBuffer) l0.E(this.f22439g);
        l0.d(i10 >= byteBuffer.limit());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i10);
        this.f22439g = byteBufferOrder;
        return byteBufferOrder;
    }

    public ByteBuffer n(long j10, int i10) {
        this.f22420c = j10;
        ByteBuffer byteBuffer = this.f22439g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f22439g = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        }
        this.f22439g.position(0);
        this.f22439g.limit(i10);
        return this.f22439g;
    }
}
