package ll;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import f1.d;
import k.h1;
import yk.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f104720e = "com.google.firebase.common.prefs:";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @h1
    public static final String f104721f = "firebase_data_collection_default_enabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f104723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f104724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f104725d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f104722a = contextA;
        this.f104723b = contextA.getSharedPreferences(f104720e + str, 0);
        this.f104724c = cVar;
        this.f104725d = c();
    }

    public static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : d.createDeviceProtectedStorageContext(context);
    }

    public synchronized boolean b() {
        return this.f104725d;
    }

    public final boolean c() {
        return this.f104723b.contains(f104721f) ? this.f104723b.getBoolean(f104721f, true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f104722a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f104722a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f104721f)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(f104721f);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f104723b.edit().remove(f104721f).apply();
                f(d());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f104723b.edit().putBoolean(f104721f, zEquals).apply();
                f(zEquals);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void f(boolean z10) {
        if (this.f104725d != z10) {
            this.f104725d = z10;
            this.f104724c.c(new yk.a<>(sj.c.class, new sj.c(z10)));
        }
    }
}
