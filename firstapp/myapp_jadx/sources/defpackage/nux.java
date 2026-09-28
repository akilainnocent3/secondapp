package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes8.dex */
public final class nux extends bkh {
    public final FileChannel d;

    public nux(FileChannel fileChannel) {
        this.d = fileChannel;
    }

    @Override // defpackage.bkh
    public final synchronized void d() {
        this.d.close();
    }

    @Override // defpackage.bkh
    public final synchronized int f(long j, byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.d.position(j);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = this.d.read(byteBufferWrap);
            if (i4 == -1) {
                if (i3 != 0) {
                    break;
                }
                return -1;
            }
            i3 += i4;
        }
        return i3;
    }

    @Override // defpackage.bkh
    public final synchronized long g() {
        return this.d.size();
    }
}
