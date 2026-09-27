package xb;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f144777f = "DiskLruCacheWrapper";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f144778g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f144779h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static e f144780i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f144782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f144783c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pb.b f144785e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f144784d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f144781a = new m();

    @Deprecated
    public e(File file, long j10) {
        this.f144782b = file;
        this.f144783c = j10;
    }

    public static a d(File file, long j10) {
        return new e(file, j10);
    }

    @Deprecated
    public static synchronized a e(File file, long j10) {
        try {
            if (f144780i == null) {
                f144780i = new e(file, j10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f144780i;
    }

    @Override // xb.a
    public File a(tb.f fVar) {
        String strB = this.f144781a.b(fVar);
        if (Log.isLoggable(f144777f, 2)) {
            Log.v(f144777f, "Get: Obtained: " + strB + " for for Key: " + fVar);
        }
        try {
            pb.b.e eVarF = f().F(strB);
            if (eVarF != null) {
                return eVarF.b(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable(f144777f, 5)) {
                return null;
            }
            Log.w(f144777f, "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // xb.a
    public void b(tb.f fVar, a.b bVar) {
        String strB = this.f144781a.b(fVar);
        this.f144784d.a(strB);
        try {
            if (Log.isLoggable(f144777f, 2)) {
                Log.v(f144777f, "Put: Obtained: " + strB + " for for Key: " + fVar);
            }
            try {
                pb.b bVarF = f();
                if (bVarF.F(strB) == null) {
                    pb.b.c cVarY = bVarF.y(strB);
                    if (cVarY == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                    }
                    try {
                        if (bVar.a(cVarY.f(0))) {
                            cVarY.e();
                        }
                        cVarY.b();
                    } catch (Throwable th2) {
                        cVarY.b();
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable(f144777f, 5)) {
                    Log.w(f144777f, "Unable to put to disk cache", e10);
                }
            }
            this.f144784d.b(strB);
        } catch (Throwable th3) {
            this.f144784d.b(strB);
            throw th3;
        }
    }

    @Override // xb.a
    public void c(tb.f fVar) {
        try {
            f().Y(this.f144781a.b(fVar));
        } catch (IOException e10) {
            if (Log.isLoggable(f144777f, 5)) {
                Log.w(f144777f, "Unable to delete from disk cache", e10);
            }
        }
    }

    @Override // xb.a
    public synchronized void clear() {
        try {
            try {
                f().r();
            } catch (IOException e10) {
                if (Log.isLoggable(f144777f, 5)) {
                    Log.w(f144777f, "Unable to clear disk cache or disk cache cleared externally", e10);
                }
            }
            g();
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }

    public final synchronized pb.b f() throws IOException {
        try {
            if (this.f144785e == null) {
                this.f144785e = pb.b.N(this.f144782b, 1, 1, this.f144783c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f144785e;
    }

    public final synchronized void g() {
        this.f144785e = null;
    }
}
