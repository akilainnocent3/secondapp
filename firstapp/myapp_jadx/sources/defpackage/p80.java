package defpackage;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class p80 {
    public static volatile p80 c;
    public final bgt a;
    public boolean b = false;

    public p80() {
        bgt bgtVar;
        synchronized (bgt.class) {
            bgtVar = bgt.a;
            if (bgtVar == null) {
                bgtVar = new bgt();
                bgt.a = bgtVar;
            }
        }
        this.a = bgtVar;
    }

    public static p80 d() {
        if (c == null) {
            synchronized (p80.class) {
                try {
                    if (c == null) {
                        c = new p80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final void a(String str) {
        if (this.b) {
            this.a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.d("FirebasePerformance", str2);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.e("FirebasePerformance", str2);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.i("FirebasePerformance", str2);
        }
    }

    public final void f(String str) {
        if (this.b) {
            this.a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.w("FirebasePerformance", str2);
        }
    }
}
