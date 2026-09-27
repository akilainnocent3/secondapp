package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f47079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RandomAccessFile f47080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f47081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f47082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47083e;

    public s(m mVar) {
        this.f47079a = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws r {
        try {
            this.f47081c = kVar.f47032a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.f47032a.getPath(), "r");
            this.f47080b = randomAccessFile;
            randomAccessFile.seek(kVar.f47034c);
            long length = kVar.f47035d;
            if (length == -1) {
                length = this.f47080b.length() - kVar.f47034c;
            }
            this.f47082d = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f47083e = true;
            m mVar = this.f47079a;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (mVar.f47044b == 0) {
                            mVar.f47045c = SystemClock.elapsedRealtime();
                        }
                        mVar.f47044b++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f47082d;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f47081c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f47080b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f47080b = null;
                if (this.f47083e) {
                    this.f47083e = false;
                    m mVar = this.f47079a;
                    if (mVar != null) {
                        mVar.a();
                    }
                }
            } catch (IOException e10) {
                throw new r(e10);
            }
        } catch (Throwable th2) {
            this.f47080b = null;
            if (this.f47083e) {
                this.f47083e = false;
                m mVar2 = this.f47079a;
                if (mVar2 != null) {
                    mVar2.a();
                }
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws r {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f47082d;
        if (j10 == 0) {
            return -1;
        }
        try {
            int i12 = this.f47080b.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                long j11 = i12;
                this.f47082d -= j11;
                m mVar = this.f47079a;
                if (mVar != null) {
                    synchronized (mVar) {
                        mVar.f47046d += j11;
                    }
                    return i12;
                }
            }
            return i12;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f47081c;
    }
}
