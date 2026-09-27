package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.A8;
import com.ironsource.B8;
import com.ironsource.C4205ba;
import com.ironsource.C4485r4;
import com.ironsource.C4540u8;
import com.ironsource.I5;
import com.ironsource.Mc;
import com.ironsource.O9;
import com.ironsource.S9;
import com.ironsource.Y9;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class IronSourceNetwork {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f63585a = "IronSourceNetwork";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Y9 f63586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<Mc> f63587c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C4205ba f63588d;

    private static void a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            I5 i5A = B8.a(jSONObject);
            if (i5A.a()) {
                A8.a(i5A, B8.a(context, str, str2, map));
            }
        }
    }

    public static synchronized void addInitListener(Mc mc2) {
        C4205ba c4205ba = f63588d;
        if (c4205ba == null) {
            f63587c.add(mc2);
        } else if (c4205ba.b()) {
            mc2.onSuccess();
        } else {
            mc2.onFail(f63588d.a());
        }
    }

    public static synchronized void destroyAd(O9 o10) throws Exception {
        a();
        f63586b.b(o10);
    }

    public static synchronized e getControllerManager() {
        return f63586b.a();
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            Logger.e(f63585a, "applicationKey is NULL");
            return;
        }
        if (f63586b == null) {
            SDKUtils.setInitSDKParams(map);
            try {
                a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                Logger.e(f63585a, "Failed to init event tracker: " + e10.getMessage());
            }
            f63586b = S9.a(context, str, str2);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(O9 o10) {
        Y9 y10 = f63586b;
        if (y10 == null) {
            return false;
        }
        return y10.a(o10);
    }

    public static synchronized void loadAd(O9 o10, Map<String, String> map) throws Exception {
        a();
        f63586b.a(o10, map);
    }

    public static synchronized void loadAdView(Activity activity, O9 o10, Map<String, String> map) throws Exception {
        a();
        f63586b.b(activity, o10, map);
    }

    public static void onPause(Activity activity) {
        Y9 y10 = f63586b;
        if (y10 == null) {
            return;
        }
        y10.onPause(activity);
    }

    public static void onResume(Activity activity) {
        Y9 y10 = f63586b;
        if (y10 == null) {
            return;
        }
        y10.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        Y9 y10 = f63586b;
        if (y10 == null) {
            return;
        }
        y10.a(activity);
    }

    public static synchronized void showAd(Activity activity, O9 o10, Map<String, String> map) throws Exception {
        a();
        f63586b.a(activity, o10, map);
    }

    public static synchronized void updateInitFailed(C4540u8 c4540u8) {
        try {
            f63588d = new C4205ba(c4540u8);
            Iterator<Mc> it = f63587c.iterator();
            while (it.hasNext()) {
                it.next().onFail(c4540u8);
            }
            f63587c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void updateInitSucceeded() {
        try {
            f63588d = new C4205ba();
            Iterator<Mc> it = f63587c.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
            f63587c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static synchronized void a() throws Exception {
        if (f63586b == null) {
            throw new NullPointerException("Call initSDK first");
        }
    }
}
