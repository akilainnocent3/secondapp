package sg.bigo.ads.common.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.unity3d.services.core.fid.Constants;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f132890a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f132891b = true;

    @NonNull
    public static String a(@NonNull Context context) {
        if (!TextUtils.isEmpty(f132890a) || !f132891b) {
            return f132890a;
        }
        try {
            Class<?> cls = Class.forName("com.appsflyer.AppsFlyerLib");
            Object objInvoke = cls.getMethod("getAppsFlyerUID", Context.class).invoke(cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), context);
            if (objInvoke instanceof String) {
                f132890a = (String) objInvoke;
            }
        } catch (Exception unused) {
            f132891b = false;
        }
        return f132890a;
    }
}
