package yads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zi extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f158818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f158819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f158820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f158821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f158822i;

    public zi(Context context) {
        super(false);
        this.f158818e = context.getAssets();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws yi {
        try {
            Uri uri = u30Var.f156234a;
            this.f158819f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(to.c.userBaseDel)) {
                path = path.substring(1);
            }
            e();
            InputStream inputStreamOpen = this.f158818e.open(path, 1);
            this.f158820g = inputStreamOpen;
            if (inputStreamOpen.skip(u30Var.f156239f) < u30Var.f156239f) {
                throw new yi(null, 2008);
            }
            long j10 = u30Var.f156240g;
            if (j10 != -1) {
                this.f158821h = j10;
            } else {
                long jAvailable = this.f158820g.available();
                this.f158821h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f158821h = -1L;
                }
            }
            this.f158822i = true;
            b(u30Var);
            return this.f158821h;
        } catch (yi e10) {
            throw e10;
        } catch (IOException e11) {
            throw new yi(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f158819f = null;
        try {
            try {
                InputStream inputStream = this.f158820g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f158820g = null;
                if (this.f158822i) {
                    this.f158822i = false;
                    d();
                }
            } catch (IOException e10) {
                throw new yi(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f158820g = null;
            if (this.f158822i) {
                this.f158822i = false;
                d();
            }
            throw th2;
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f158819f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws yi {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f158821h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new yi(e10, 2000);
            }
        }
        InputStream inputStream = this.f158820g;
        int i12 = ib3.f150516a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f158821h;
        if (j11 != -1) {
            this.f158821h = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
