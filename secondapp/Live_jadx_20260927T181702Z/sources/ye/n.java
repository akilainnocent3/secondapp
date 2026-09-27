package ye;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class n extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j.a<n> f159247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ByteBuffer f159248f;

    public n(j.a<n> aVar) {
        this.f159247e = aVar;
    }

    @Override // ye.a
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f159248f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // ye.j
    public void l() {
        this.f159247e.a(this);
    }

    public ByteBuffer m(long j10, int i10) {
        this.f159206c = j10;
        ByteBuffer byteBuffer = this.f159248f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f159248f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        }
        this.f159248f.position(0);
        this.f159248f.limit(i10);
        return this.f159248f;
    }
}
