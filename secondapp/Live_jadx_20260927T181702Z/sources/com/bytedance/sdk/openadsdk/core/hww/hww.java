package com.bytedance.sdk.openadsdk.core.hww;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.omn;
import java.util.ArrayList;
import java.util.List;
import z.f;
import z.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private static String hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static Boolean f36170tq;

    public static String hww(Context context) {
        String str = hww;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(h.f160173d);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                hww = null;
            } else if (TextUtils.isEmpty(str2) || hww(context, intent) || !arrayList.contains(str2)) {
                hww = (String) arrayList.get(0);
            } else {
                hww = str2;
            }
        } catch (Throwable th2) {
            omn.sd("CustomTabsHelper", th2.getMessage());
        }
        return hww;
    }

    public static int tq(Context context) {
        try {
            return !TextUtils.isEmpty(hww(context)) ? 1 : 0;
        } catch (Throwable unused) {
        }
    }

    private static boolean hww(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (listQueryIntentActivities.size() == 0) {
                return false;
            }
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        return false;
    }

    public static int hww() {
        Boolean bool = f36170tq;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void hww(Context context, String str, f fVar, Uri uri) {
        fVar.f160159a.setPackage(str);
        fVar.t(context, uri);
    }
}
