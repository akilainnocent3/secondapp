package x3;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import androidx.appcompat.widget.c;
import androidx.leanback.widget.q2;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f144145c = "Settings";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f144146d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f144147e = "android.support.v17.leanback.action.PARTNER_CUSTOMIZATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f144148f = "PREFER_STATIC_SHADOWS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f144149g = "OUTLINE_CLIPPING_DISABLED";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f144150h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f144151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f144152b;

    /* JADX INFO: renamed from: x3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C1520a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Resources f144153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f144154b;

        public C1520a(Resources resources, String str) {
            this.f144153a = resources;
            this.f144154b = str;
        }

        public boolean a(String str, boolean z10) {
            int identifier = this.f144153a.getIdentifier(str, "bool", this.f144154b);
            return identifier > 0 ? this.f144153a.getBoolean(identifier) : z10;
        }
    }

    public a(Context context) {
        a(c(context), context);
    }

    public static a d(Context context) {
        if (f144150h == null) {
            f144150h = new a(context);
        }
        return f144150h;
    }

    public static boolean g(ResolveInfo resolveInfo) {
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return (activityInfo == null || (activityInfo.applicationInfo.flags & 1) == 0) ? false : true;
    }

    public final void a(C1520a c1520a, Context context) {
        if (q2.e()) {
            this.f144151a = false;
            if (c1520a != null) {
                this.f144151a = c1520a.a("leanback_prefer_static_shadows", false);
            }
        } else {
            this.f144151a = true;
        }
        boolean zIsLowRamDevice = ((ActivityManager) context.getSystemService(c.f6970r)).isLowRamDevice();
        this.f144152b = zIsLowRamDevice;
        if (c1520a != null) {
            this.f144152b = c1520a.a("leanback_outline_clipping_disabled", zIsLowRamDevice);
        }
    }

    public boolean b(String str) {
        return e(str, false, false);
    }

    public final C1520a c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Resources resourcesForApplication = null;
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(new Intent(f144147e), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (str2 != null && g(resolveInfo)) {
                try {
                    resourcesForApplication = packageManager.getResourcesForApplication(str2);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (resourcesForApplication != null) {
                str = str2;
                break;
            }
            str = str2;
        }
        if (resourcesForApplication == null) {
            return null;
        }
        return new C1520a(resourcesForApplication, str);
    }

    public boolean e(String str, boolean z10, boolean z11) {
        if (str.compareTo(f144148f) == 0) {
            if (!z10) {
                return this.f144151a;
            }
            this.f144151a = z11;
            return z11;
        }
        if (str.compareTo(f144149g) != 0) {
            throw new IllegalArgumentException("Invalid key");
        }
        if (!z10) {
            return this.f144152b;
        }
        this.f144152b = z11;
        return z11;
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public boolean f() {
        return this.f144152b;
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public boolean h() {
        return this.f144151a;
    }

    public void i(String str, boolean z10) {
        e(str, true, z10);
    }
}
