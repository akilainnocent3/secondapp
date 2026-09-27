package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static r f20300a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20301b = "WM-";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f20302c = 23;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20303d = 20;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20304e;

        public a(int loggingLevel) {
            super(loggingLevel);
            this.f20304e = loggingLevel;
        }

        @Override // androidx.work.r
        public void a(String tag, String message, Throwable... throwables) {
            if (this.f20304e <= 3) {
                if (throwables == null || throwables.length < 1) {
                    Log.d(tag, message);
                } else {
                    Log.d(tag, message, throwables[0]);
                }
            }
        }

        @Override // androidx.work.r
        public void b(String tag, String message, Throwable... throwables) {
            if (this.f20304e <= 6) {
                if (throwables == null || throwables.length < 1) {
                    Log.e(tag, message);
                } else {
                    Log.e(tag, message, throwables[0]);
                }
            }
        }

        @Override // androidx.work.r
        public void d(String tag, String message, Throwable... throwables) {
            if (this.f20304e <= 4) {
                if (throwables == null || throwables.length < 1) {
                    Log.i(tag, message);
                } else {
                    Log.i(tag, message, throwables[0]);
                }
            }
        }

        @Override // androidx.work.r
        public void g(String tag, String message, Throwable... throwables) {
            if (this.f20304e <= 2) {
                if (throwables == null || throwables.length < 1) {
                    Log.v(tag, message);
                } else {
                    Log.v(tag, message, throwables[0]);
                }
            }
        }

        @Override // androidx.work.r
        public void h(String tag, String message, Throwable... throwables) {
            if (this.f20304e <= 5) {
                if (throwables == null || throwables.length < 1) {
                    Log.w(tag, message);
                } else {
                    Log.w(tag, message, throwables[0]);
                }
            }
        }
    }

    public r(int loggingLevel) {
    }

    public static synchronized r c() {
        try {
            if (f20300a == null) {
                f20300a = new a(3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f20300a;
    }

    public static synchronized void e(r logger) {
        f20300a = logger;
    }

    public static String f(@NonNull String tag) {
        int length = tag.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(f20301b);
        int i10 = f20303d;
        if (length >= i10) {
            sb2.append(tag.substring(0, i10));
        } else {
            sb2.append(tag);
        }
        return sb2.toString();
    }

    public abstract void a(String tag, String message, Throwable... throwables);

    public abstract void b(String tag, String message, Throwable... throwables);

    public abstract void d(String tag, String message, Throwable... throwables);

    public abstract void g(String tag, String message, Throwable... throwables);

    public abstract void h(String tag, String message, Throwable... throwables);
}
