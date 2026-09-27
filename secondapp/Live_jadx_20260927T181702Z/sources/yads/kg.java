package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f151526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jg0 f151527b;

    public kg(Context context, jg0 jg0Var) {
        this.f151526a = context;
        this.f151527b = jg0Var;
    }

    public final m50 a() {
        PackageManager packageManager = this.f151526a.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        PackageInfo packageInfo = i10 >= 33 ? packageManager.getPackageInfo(this.f151526a.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(this.f151526a.getPackageName(), 0);
        this.f151527b.getClass();
        String strB = jg0.b();
        if (strB == null) {
            strB = "Undefined";
        }
        String str = "Android " + strB;
        String str2 = "API " + i10;
        String str3 = packageInfo.packageName;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = "";
        }
        return new m50(str3, str4, str, str2);
    }
}
