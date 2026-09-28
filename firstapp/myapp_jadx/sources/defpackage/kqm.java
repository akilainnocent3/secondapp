package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kqm {
    public static final void a(Context context) {
        context.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName()));
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 1);
        listQueryIntentActivities.getClass();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            String str = resolveInfo.activityInfo.applicationInfo.packageName;
            if (Intrinsics.g(str, "com.huawei.appmarket")) {
                intent.addFlags(337641472);
                intent.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
                context.startActivity(intent);
                return;
            }
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        String str2 = Intrinsics.g(packageName, "com.sportybet.android.ag.za") ? "114902855" : null;
        if (str2 != null) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://appgallery.huawei.com/app/C".concat(str2))));
        }
    }
}
