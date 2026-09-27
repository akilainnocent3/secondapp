package com.applovin.shadow.okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class NioFileSystemFileHandle extends FileHandle {

    @oy.l
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z10, @oy.l FileChannel fileChannel) {
        super(z10);
        m0.p(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedClose() {
        this.fileChannel.close();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedFlush() {
        this.fileChannel.force(true);
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized int protectedRead(long j10, @oy.l byte[] array, int i10, int i11) {
        m0.p(array, "array");
        this.fileChannel.position(j10);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, i10, i11);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.fileChannel.read(byteBufferWrap);
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

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedResize(long j10) throws Throwable {
        try {
            try {
                long size = size();
                long j11 = j10 - size;
                if (j11 > 0) {
                    int i10 = (int) j11;
                    protectedWrite(size, new byte[i10], 0, i10);
                } else {
                    this.fileChannel.truncate(j10);
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

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized long protectedSize() {
        return this.fileChannel.size();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedWrite(long j10, @oy.l byte[] array, int i10, int i11) {
        m0.p(array, "array");
        this.fileChannel.position(j10);
        this.fileChannel.write(ByteBuffer.wrap(array, i10, i11));
    }
}
