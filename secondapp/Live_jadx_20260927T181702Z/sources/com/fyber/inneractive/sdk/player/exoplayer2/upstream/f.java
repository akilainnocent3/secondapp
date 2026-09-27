package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f47018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f47019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f47020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AssetFileDescriptor f47021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FileInputStream f47022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f47023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47024g;

    public f(Context context, m mVar) {
        this.f47018a = context.getContentResolver();
        this.f47019b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws e {
        try {
            Uri uri = kVar.f47032a;
            this.f47020c = uri;
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f47018a.openAssetFileDescriptor(uri, "r");
            this.f47021d = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f47020c);
            }
            this.f47022e = new FileInputStream(this.f47021d.getFileDescriptor());
            long startOffset = this.f47021d.getStartOffset();
            if (this.f47022e.skip(kVar.f47034c + startOffset) - startOffset != kVar.f47034c) {
                throw new EOFException();
            }
            long j10 = kVar.f47035d;
            if (j10 != -1) {
                this.f47023f = j10;
            } else {
                long length = this.f47021d.getLength();
                this.f47023f = length;
                if (length == -1) {
                    long jAvailable = this.f47022e.available();
                    this.f47023f = jAvailable;
                    if (jAvailable == 0) {
                        this.f47023f = -1L;
                    }
                }
            }
            this.f47024g = true;
            m mVar = this.f47019b;
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
            return this.f47023f;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f47020c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f47022e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f47022e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f47021d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f47021d = null;
                        if (this.f47024g) {
                            this.f47024g = false;
                            m mVar = this.f47019b;
                            if (mVar != null) {
                                mVar.a();
                            }
                        }
                    } catch (IOException e10) {
                        throw new e(e10);
                    }
                } catch (Throwable th2) {
                    this.f47021d = null;
                    if (this.f47024g) {
                        this.f47024g = false;
                        m mVar2 = this.f47019b;
                        if (mVar2 != null) {
                            mVar2.a();
                        }
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                throw new e(e11);
            }
        } catch (Throwable th3) {
            this.f47022e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f47021d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f47021d = null;
                    if (this.f47024g) {
                        this.f47024g = false;
                        m mVar3 = this.f47019b;
                        if (mVar3 != null) {
                            mVar3.a();
                        }
                    }
                    throw th3;
                } catch (IOException e12) {
                    throw new e(e12);
                }
            } catch (Throwable th4) {
                this.f47021d = null;
                if (this.f47024g) {
                    this.f47024g = false;
                    m mVar4 = this.f47019b;
                    if (mVar4 != null) {
                        mVar4.a();
                    }
                }
                throw th4;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws e {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f47023f;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new e(e10);
            }
        }
        int i12 = this.f47022e.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f47023f == -1) {
                return -1;
            }
            throw new e(new EOFException());
        }
        long j11 = this.f47023f;
        if (j11 != -1) {
            this.f47023f = j11 - ((long) i12);
        }
        m mVar = this.f47019b;
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
        return this.f47020c;
    }
}
