package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f47004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f47005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f47006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f47007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f47008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47009f;

    public d(Context context, m mVar) {
        this.f47004a = context.getAssets();
        this.f47005b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws c {
        try {
            Uri uri = kVar.f47032a;
            this.f47006c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(to.c.userBaseDel)) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.f47004a.open(path, 1);
            this.f47007d = inputStreamOpen;
            if (inputStreamOpen.skip(kVar.f47034c) < kVar.f47034c) {
                throw new EOFException();
            }
            long j10 = kVar.f47035d;
            if (j10 != -1) {
                this.f47008e = j10;
            } else {
                long jAvailable = this.f47007d.available();
                this.f47008e = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f47008e = -1L;
                }
            }
            this.f47009f = true;
            m mVar = this.f47005b;
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
            return this.f47008e;
        } catch (IOException e10) {
            throw new c(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f47006c = null;
        try {
            try {
                InputStream inputStream = this.f47007d;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f47007d = null;
                if (this.f47009f) {
                    this.f47009f = false;
                    m mVar = this.f47005b;
                    if (mVar != null) {
                        mVar.a();
                    }
                }
            } catch (IOException e10) {
                throw new c(e10);
            }
        } catch (Throwable th2) {
            this.f47007d = null;
            if (this.f47009f) {
                this.f47009f = false;
                m mVar2 = this.f47005b;
                if (mVar2 != null) {
                    mVar2.a();
                }
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws c {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f47008e;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new c(e10);
            }
        }
        int i12 = this.f47007d.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f47008e == -1) {
                return -1;
            }
            throw new c(new EOFException());
        }
        long j11 = this.f47008e;
        if (j11 != -1) {
            this.f47008e = j11 - ((long) i12);
        }
        m mVar = this.f47005b;
        if (mVar == null) {
            return i12;
        }
        synchronized (mVar) {
            mVar.f47046d += (long) i12;
        }
        return i12;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f47006c;
    }
}
