package fx;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class j0 extends t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final FileChannel f85638f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(boolean z10, @oy.l FileChannel fileChannel) {
        super(z10);
        kotlin.jvm.internal.m0.p(fileChannel, "fileChannel");
        this.f85638f = fileChannel;
    }

    @Override // fx.t
    public synchronized void D(long j10, @oy.l byte[] array, int i10, int i11) {
        kotlin.jvm.internal.m0.p(array, "array");
        this.f85638f.position(j10);
        this.f85638f.write(ByteBuffer.wrap(array, i10, i11));
    }

    @Override // fx.t
    public synchronized void p() {
        this.f85638f.close();
    }

    @Override // fx.t
    public synchronized void q() {
        this.f85638f.force(true);
    }

    @Override // fx.t
    public synchronized int r(long j10, @oy.l byte[] array, int i10, int i11) {
        kotlin.jvm.internal.m0.p(array, "array");
        this.f85638f.position(j10);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, i10, i11);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.f85638f.read(byteBufferWrap);
            if (i13 == -1) {
                if (i12 != 0) {
                    break;
                }
                return -1;
            }
            i12 += i13;
        }
        return i12;
    }

    @Override // fx.t
    public synchronized void t(long j10) throws Throwable {
        try {
            try {
                long size = size();
                long j11 = j10 - size;
                if (j11 > 0) {
                    int i10 = (int) j11;
                    D(size, new byte[i10], 0, i10);
                } else {
                    this.f85638f.truncate(j10);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // fx.t
    public synchronized long y() {
        return this.f85638f.size();
    }
}
