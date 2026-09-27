package ck;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24837c = "FirebaseCrashlytics";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f24838d = new g(f24837c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24840b = 4;

    public g(String str) {
        this.f24839a = str;
    }

    public static g f() {
        return f24838d;
    }

    public final boolean a(int i10) {
        return this.f24840b <= i10 || Log.isLoggable(this.f24839a, i10);
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f24839a, str, th2);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f24839a, str, th2);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th2) {
        if (a(4)) {
            Log.i(this.f24839a, str, th2);
        }
    }

    public void i(int i10, String str) {
        j(i10, str, false);
    }

    public void j(int i10, String str, boolean z10) {
        if (z10 || a(i10)) {
            Log.println(i10, this.f24839a, str);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th2) {
        if (a(2)) {
            Log.v(this.f24839a, str, th2);
        }
    }

    public void m(String str) {
        n(str, null);
    }

    public void n(String str, Throwable th2) {
        if (a(5)) {
            Log.w(this.f24839a, str, th2);
        }
    }
}
