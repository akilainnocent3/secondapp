package a5;

import android.media.MediaDataSource;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public class m1 extends e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MediaDataSource f3748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Uri f3749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f3750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f3751v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3752w;

    public m1(MediaDataSource mediaDataSource, boolean z10) {
        super(z10);
        this.f3748s = mediaDataSource;
    }

    @Override // a5.r
    public void close() throws IOException {
        this.f3749t = null;
        if (this.f3752w) {
            this.f3752w = false;
            transferEnded();
        }
    }

    @Override // a5.r
    @Nullable
    public Uri getUri() {
        return this.f3749t;
    }

    @Override // a5.r
    public long open(z zVar) throws IOException {
        this.f3749t = zVar.f3834a;
        this.f3750u = zVar.f3840g;
        transferInitializing(zVar);
        if (this.f3748s.getSize() != -1 && this.f3750u > this.f3748s.getSize()) {
            throw new w(2008);
        }
        if (this.f3748s.getSize() == -1) {
            this.f3751v = -1L;
        } else {
            this.f3751v = this.f3748s.getSize() - this.f3750u;
        }
        long jMin = zVar.f3841h;
        if (jMin != -1) {
            long j10 = this.f3751v;
            if (j10 != -1) {
                jMin = Math.min(j10, jMin);
            }
            this.f3751v = jMin;
        }
        this.f3752w = true;
        transferStarted(zVar);
        long j11 = zVar.f3841h;
        return j11 != -1 ? j11 : this.f3751v;
    }

    @Override // u4.c0
    public int read(byte[] bArr, int i10, int i11) throws w {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f3751v;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            i11 = (int) Math.min(j10, i11);
        }
        try {
            int at2 = this.f3748s.readAt(this.f3750u, bArr, i10, i11);
            if (at2 == -1) {
                return -1;
            }
            long j11 = at2;
            this.f3750u += j11;
            long j12 = this.f3751v;
            if (j12 != -1) {
                this.f3751v = j12 - j11;
            }
            bytesTransferred(at2);
            return at2;
        } catch (IOException e10) {
            throw new w(e10, 2000);
        }
    }
}
