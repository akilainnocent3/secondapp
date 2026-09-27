package androidx.mediarouter.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.media.MediaRouter2;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Iterator;
import k.t;
import k.t0;
import p7.c1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17985a = "com.android.systemui";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f17986b = "com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17987c = "com.android.settings.panel.action.MEDIA_OUTPUT";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f17988d = "package_name";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17989e = "com.android.settings.panel.extra.PACKAGE_NAME";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(30)
    public static class a {
        @t
        public static MediaRouter2 a(Context context) {
            return MediaRouter2.getInstance(context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(34)
    public static class b {
        @t
        public static boolean a(MediaRouter2 mediaRouter2) {
            return mediaRouter2.showSystemOutputSwitcher();
        }
    }

    public static boolean a(@NonNull Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static boolean b(@NonNull Context context) {
        ApplicationInfo applicationInfo;
        Intent intentPutExtra = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra(c1.f120427j, true).putExtra(c1.f120428k, 1);
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intentPutExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                context.startActivity(intentPutExtra);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    public static boolean c(@NonNull Context context) {
        boolean zD;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            zD = f(context);
        } else if (i10 >= 31) {
            if (e(context) || d(context)) {
                zD = true;
            } else {
                zD = false;
            }
        } else if (i10 == 30) {
            zD = d(context);
        } else {
            zD = false;
        }
        if (zD) {
            return true;
        }
        return a(context) && b(context);
    }

    public static boolean d(@NonNull Context context) {
        ApplicationInfo applicationInfo;
        Intent intentPutExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intentPutExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                context.startActivity(intentPutExtra);
                return true;
            }
        }
        return false;
    }

    public static boolean e(@NonNull Context context) {
        ApplicationInfo applicationInfo;
        Intent intentPutExtra = new Intent().setAction(f17986b).setPackage("com.android.systemui").putExtra("package_name", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(intentPutExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                context.sendBroadcast(intentPutExtra);
                return true;
            }
        }
        return false;
    }

    public static boolean f(@NonNull Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            return false;
        }
        MediaRouter2 mediaRouter2A = a.a(context);
        if (i10 >= 34) {
            return b.a(mediaRouter2A);
        }
        return false;
    }
}
