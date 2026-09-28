package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Parcelable;
import com.google.gson.reflect.TypeToken;
import com.sporty.android.common.data.ErrorResponse;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class ui8 {
    public static final String a(Context context) {
        context.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        packageName.getClass();
        try {
            zi50.a aVar = zi50.b;
            return Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(packageName).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(packageName);
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
            return null;
        }
    }

    public static final Intent b(Context context, Intent intent, String str) {
        context.getClass();
        str.getClass();
        Set setB = wi80.b("com.sportybet.android.gp.tz");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            if (setB.contains(componentName.getPackageName())) {
                linkedHashSet.add(componentName);
            }
        }
        if (str.length() == 0) {
            str = null;
        }
        return Intent.createChooser(intent, str).putExtra("android.intent.extra.EXCLUDE_COMPONENTS", (Parcelable[]) linkedHashSet.toArray(new ComponentName[0])).setFlags(268435456);
    }

    public static final String c(ResponseBody responseBody) {
        if (responseBody == null) {
            return "";
        }
        try {
            String causeMsg = ((ErrorResponse) new eal().d(responseBody.charStream(), TypeToken.get(ErrorResponse.class))).getCauseMsg();
            return !StringsKt.U(causeMsg) ? causeMsg : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
