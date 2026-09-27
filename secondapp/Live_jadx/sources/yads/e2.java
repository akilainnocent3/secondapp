package yads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f148465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f148466c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f148467a = new v1();

    static {
        String str = "com.yandex.mobile.ads.common.AdActivity";
        f148465b = str;
        f148466c = "There is no presence of " + str + " activity in AndroidManifest file.";
    }

    public final void a(Context context) {
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), f148465b), 0);
            this.f148467a.getClass();
            v1.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = f148466c;
            throw new ub1(str, str);
        }
    }
}
