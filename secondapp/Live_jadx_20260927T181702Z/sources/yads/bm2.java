package yads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bm2 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f147271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f147272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f147273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f147274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FileInputStream f147275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f147276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f147277k;

    public bm2(Context context) {
        super(false);
        this.f147271e = context.getResources();
        this.f147272f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // yads.p30
    public final long a(u30 u30Var) throws am2 {
        int identifier;
        String str;
        Uri uri = u30Var.f156234a;
        this.f147273g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme())) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                lastPathSegment.getClass();
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new am2("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                String lastPathSegment2 = uri.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uri.getLastPathSegment();
                    lastPathSegment3.getClass();
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new am2("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith(to.c.userBaseDel)) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb2.append(str);
            sb2.append(path);
            identifier = this.f147271e.getIdentifier(sb2.toString(), "raw", this.f147272f);
            if (identifier == 0) {
                throw new am2("Resource not found.", null, 2005);
            }
        }
        e();
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f147271e.openRawResourceFd(identifier);
            this.f147274h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new am2("Resource is compressed: " + uri, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f147275i = fileInputStream;
            if (length != -1) {
                try {
                    if (u30Var.f156239f > length) {
                        throw new am2(null, null, 2008);
                    }
                } catch (am2 e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw new am2(null, e11, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(u30Var.f156239f + startOffset) - startOffset;
            if (jSkip != u30Var.f156239f) {
                throw new am2(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f147276j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f147276j = size;
                    if (size < 0) {
                        throw new am2(null, null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f147276j = j10;
                if (j10 < 0) {
                    throw new q30(2008);
                }
            }
            long jMin = u30Var.f156240g;
            if (jMin != -1) {
                long j11 = this.f147276j;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f147276j = jMin;
            }
            this.f147277k = true;
            b(u30Var);
            long j12 = u30Var.f156240g;
            return j12 != -1 ? j12 : this.f147276j;
        } catch (Resources.NotFoundException e12) {
            throw new am2(null, e12, 2005);
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
            r5.f147273g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f147275i     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f147275i = r0
            android.content.res.AssetFileDescriptor r3 = r5.f147274h     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f147274h = r0
            boolean r0 = r5.f147277k
            if (r0 == 0) goto L2b
            r5.f147277k = r2
            r5.d()
        L2b:
            return
        L2c:
            yads.am2 r4 = new yads.am2     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f147274h = r0
            boolean r0 = r5.f147277k
            if (r0 == 0) goto L3d
            r5.f147277k = r2
            r5.d()
        L3d:
            throw r1
        L3e:
            yads.am2 r4 = new yads.am2     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f147275i = r0
            android.content.res.AssetFileDescriptor r4 = r5.f147274h     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f147274h = r0
            boolean r0 = r5.f147277k
            if (r0 == 0) goto L5d
            r5.f147277k = r2
            r5.d()
        L5d:
            throw r3
        L5e:
            yads.am2 r4 = new yads.am2     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f147274h = r0
            boolean r0 = r5.f147277k
            if (r0 == 0) goto L6f
            r5.f147277k = r2
            r5.d()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.bm2.close():void");
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f147273g;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws am2 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f147276j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new am2(null, e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f147275i;
        int i12 = ib3.f150516a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            if (this.f147276j == -1) {
                return -1;
            }
            throw new am2("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f147276j;
        if (j11 != -1) {
            this.f147276j = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
