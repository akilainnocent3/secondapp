package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class tce {
    public static final p80 c = p80.d();
    public static tce d;
    public volatile SharedPreferences a;
    public final ExecutorService b;

    public tce(ExecutorService executorService) {
        this.b = executorService;
    }

    public static Context a() {
        try {
            yoh.c();
            yoh yohVarC = yoh.c();
            yohVarC.a();
            return yohVarC.a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized tce b() {
        tce tceVar;
        tceVar = d;
        if (tceVar == null) {
            tceVar = new tce(Executors.newSingleThreadExecutor());
            d = tceVar;
        }
        return tceVar;
    }

    public final synchronized void c(final Context context) {
        if (this.a == null && context != null) {
            this.b.execute(new Runnable() { // from class: sce
                @Override // java.lang.Runnable
                public final void run() {
                    tce tceVar = this.a;
                    Context context2 = context;
                    if (tceVar.a != null || context2 == null) {
                        return;
                    }
                    tceVar.a = context2.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                }
            });
        }
    }

    public final void d(double d2, String str) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
    }

    public final void e(long j, String str) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, j).apply();
    }

    public final void f(String str, String str2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        SharedPreferences sharedPreferences = this.a;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putBoolean(str, z).apply();
    }
}
