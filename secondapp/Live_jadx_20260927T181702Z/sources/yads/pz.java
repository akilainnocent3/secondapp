package yads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pz extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f154197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f154198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f154199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f154200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f154201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f154202j;

    public pz(Context context) {
        super(false);
        this.f154197e = context.getContentResolver();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws oz {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = u30Var.f156234a;
                this.f154198f = uri;
                e();
                if ("content".equals(u30Var.f156234a.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f154197e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f154197e.openAssetFileDescriptor(uri, "r");
                }
                this.f154199g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i10 = 2000;
                    try {
                        throw new oz(new IOException("Could not open file descriptor for: " + uri), 2000);
                    } catch (IOException e10) {
                        e = e10;
                        throw new oz(e, e instanceof FileNotFoundException ? 2005 : i10);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f154200h = fileInputStream;
                if (length != -1 && u30Var.f156239f > length) {
                    throw new oz(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(u30Var.f156239f + startOffset) - startOffset;
                if (jSkip != u30Var.f156239f) {
                    throw new oz(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f154201i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f154201i = jPosition;
                        if (jPosition < 0) {
                            throw new oz(null, 2008);
                        }
                    }
                } else {
                    long j10 = length - jSkip;
                    this.f154201i = j10;
                    if (j10 < 0) {
                        throw new oz(null, 2008);
                    }
                }
                long jMin = u30Var.f156240g;
                if (jMin != -1) {
                    long j11 = this.f154201i;
                    if (j11 != -1) {
                        jMin = Math.min(j11, jMin);
                    }
                    this.f154201i = jMin;
                }
                this.f154202j = true;
                b(u30Var);
                long j12 = u30Var.f156240g;
                return j12 != -1 ? j12 : this.f154201i;
            } catch (IOException e11) {
                e = e11;
                i10 = 2000;
            }
        } catch (oz e12) {
            throw e12;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // yads.p30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f154198f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f154200h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f154200h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f154199g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f154199g = r0
            boolean r0 = r5.f154202j
            if (r0 == 0) goto L2b
            r5.f154202j = r2
            r5.d()
        L2b:
            return
        L2c:
            yads.oz r4 = new yads.oz     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f154199g = r0
            boolean r0 = r5.f154202j
            if (r0 == 0) goto L3d
            r5.f154202j = r2
            r5.d()
        L3d:
            throw r1
        L3e:
            yads.oz r4 = new yads.oz     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f154200h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f154199g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f154199g = r0
            boolean r0 = r5.f154202j
            if (r0 == 0) goto L5d
            r5.f154202j = r2
            r5.d()
        L5d:
            throw r3
        L5e:
            yads.oz r4 = new yads.oz     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f154199g = r0
            boolean r0 = r5.f154202j
            if (r0 == 0) goto L6f
            r5.f154202j = r2
            r5.d()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.pz.close():void");
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f154198f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws oz {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f154201i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new oz(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f154200h;
        int i12 = ib3.f150516a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f154201i;
        if (j11 != -1) {
            this.f154201i = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
