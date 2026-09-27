package a5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class j extends e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f3723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Uri f3724t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public byte[] f3725u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3726v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3727w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3728x;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        byte[] a(Uri uri) throws IOException;
    }

    public j(final byte[] bArr) {
        this(new a() { // from class: a5.i
            @Override // a5.j.a
            public final byte[] a(Uri uri) {
                return j.a(bArr, uri);
            }
        });
        zi.l0.d(bArr.length > 0);
    }

    @Override // a5.r
    public void close() {
        if (this.f3728x) {
            this.f3728x = false;
            transferEnded();
        }
        this.f3724t = null;
        this.f3725u = null;
    }

    @Override // a5.r
    @Nullable
    public Uri getUri() {
        return this.f3724t;
    }

    @Override // a5.r
    public long open(z zVar) throws IOException {
        transferInitializing(zVar);
        Uri uri = zVar.f3834a;
        this.f3724t = uri;
        byte[] bArrA = this.f3723s.a(uri);
        this.f3725u = bArrA;
        long j10 = zVar.f3840g;
        if (j10 > bArrA.length) {
            throw new w(2008);
        }
        this.f3726v = (int) j10;
        int length = bArrA.length - ((int) j10);
        this.f3727w = length;
        long j11 = zVar.f3841h;
        if (j11 != -1) {
            this.f3727w = (int) Math.min(length, j11);
        }
        this.f3728x = true;
        transferStarted(zVar);
        long j12 = zVar.f3841h;
        return j12 != -1 ? j12 : this.f3727w;
    }

    @Override // u4.c0
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f3727w;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(zi.l0.E(this.f3725u), this.f3726v, bArr, i10, iMin);
        this.f3726v += iMin;
        this.f3727w -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }

    public j(a aVar) {
        super(false);
        this.f3723s = (a) zi.l0.E(aVar);
    }

    public static /* synthetic */ byte[] a(byte[] bArr, Uri uri) {
        return bArr;
    }
}
