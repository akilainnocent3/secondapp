package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv {
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.kub> hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static boolean f37649sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static long f37650tq;

    public static void hww(com.bytedance.sdk.openadsdk.core.model.kub kubVar) {
        com.bytedance.sdk.openadsdk.core.model.hu huVarEow = kubVar.eow();
        if (huVarEow == null || TextUtils.isEmpty(huVarEow.hww())) {
            return;
        }
        hww = new WeakReference<>(kubVar);
    }

    public static boolean sd() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.kub> weakReference = hww;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        f37649sd = true;
        return true;
    }

    private static void tq(final long j10) {
        com.bytedance.sdk.openadsdk.core.model.kub kubVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.kub> weakReference = hww;
        if (weakReference == null || j10 <= 0 || (kubVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.vy.sd.hww(System.currentTimeMillis(), kubVar, kubVar.hv(), "store_duration", new com.bytedance.sdk.openadsdk.wgt.sd.hww() { // from class: com.bytedance.sdk.openadsdk.utils.hv.1
            @Override // com.bytedance.sdk.openadsdk.wgt.sd.hww, com.bytedance.sdk.openadsdk.wgt.sd.tq
            public JSONObject tq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        hww = null;
        f37649sd = false;
    }

    public static void hww(long j10) {
        tq(j10);
    }

    public static void hww() {
        if (hww == null || f37649sd) {
            return;
        }
        if (f37650tq > 0) {
            tq(SystemClock.elapsedRealtime() - f37650tq);
        }
        hww = null;
        f37650tq = 0L;
    }

    public static void tq() {
        if (hww == null || f37649sd) {
            return;
        }
        f37650tq = SystemClock.elapsedRealtime();
    }
}
