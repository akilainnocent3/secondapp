package yads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cv0 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f147918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f147919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f147920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f147921h;

    public cv0() {
        super(false);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws bv0 {
        Uri uri = u30Var.f156234a;
        this.f147919f = uri;
        e();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f147918e = randomAccessFile;
            try {
                randomAccessFile.seek(u30Var.f156239f);
                long length = u30Var.f156240g;
                if (length == -1) {
                    length = this.f147918e.length() - u30Var.f156239f;
                }
                this.f147920g = length;
                if (length < 0) {
                    throw new bv0(null, null, 2008);
                }
                this.f147921h = true;
                b(u30Var);
                return this.f147920g;
            } catch (IOException e10) {
                throw new bv0(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new bv0(e11, (ib3.f150516a < 21 || !zu0.a(e11.getCause())) ? 2005 : 2006);
            }
            throw new bv0("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e11, 1004);
        } catch (SecurityException e12) {
            throw new bv0(e12, 2006);
        } catch (RuntimeException e13) {
            throw new bv0(e13, 2000);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f147919f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f147918e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f147918e = null;
                if (this.f147921h) {
                    this.f147921h = false;
                    d();
                }
            } catch (IOException e10) {
                throw new bv0(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f147918e = null;
            if (this.f147921h) {
                this.f147921h = false;
                d();
            }
            throw th2;
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f147919f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws bv0 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f147920g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f147918e;
            int i12 = ib3.f150516a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f147920g -= (long) i13;
                c(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new bv0(e10, 2000);
        }
    }
}
