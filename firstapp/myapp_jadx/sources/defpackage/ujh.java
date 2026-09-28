package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class ujh extends qz1 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public static final class a implements zpc.a {
        @Override // zpc.a
        public final zpc a() {
            return new ujh(false);
        }
    }

    public static class b extends dqc {
    }

    @Override // defpackage.zpc
    public final long a(gqc gqcVar) throws b {
        Uri uri = gqcVar.a;
        long j = gqcVar.f;
        this.f = uri;
        p(gqcVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = gqcVar.g;
                if (length == -1) {
                    length = this.e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new b(null, null, 2008);
                }
                this.h = true;
                q(gqcVar);
                return this.g;
            } catch (IOException e) {
                throw new b(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbA = ux5.a("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbA.append(fragment);
            throw new b(sbA.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new b(e3, 2006);
        } catch (RuntimeException e4) {
            throw new b(e4, 2000);
        }
    }

    @Override // defpackage.zpc
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    o();
                }
            } catch (IOException e) {
                throw new b(e, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                o();
            }
            throw th;
        }
    }

    @Override // defpackage.zpc
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) throws b {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            String str = jrh0.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.g -= (long) i3;
                n(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new b(e, 2000);
        }
    }
}
