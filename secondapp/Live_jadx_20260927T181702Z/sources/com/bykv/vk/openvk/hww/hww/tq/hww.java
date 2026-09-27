package com.bykv.vk.openvk.hww.hww.tq;

import android.text.TextUtils;
import com.bykv.vk.openvk.hww.hww.hww.hww.tq;
import com.ironsource.C4497s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static boolean f31590hu = false;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static tq f31591hv = null;
    public static int hww = 10;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private static int f31592ok = 8192;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public static int f31593sd = 10;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static int f31594tq = 10;
    private static int vgm = 1;
    public static int vy = 10;

    public static int hu() {
        return vgm;
    }

    public static int hv() {
        return vy;
    }

    public static void hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            hww = jSONObject.optInt("splash", 10);
            f31594tq = jSONObject.optInt(C4497s.f63499j, 10);
            f31593sd = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt("other", 10);
            vy = iOptInt;
            if (hww < 0) {
                hww = 10;
            }
            if (f31594tq < 0) {
                f31594tq = 10;
            }
            if (f31593sd < 0) {
                f31593sd = 10;
            }
            if (iOptInt < 0) {
                vy = 10;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static int sd() {
        return f31594tq;
    }

    public static boolean tq(String str) {
        return f31590hu && str != null && str.endsWith(".mp4");
    }

    public static int vgm() {
        return f31592ok;
    }

    public static int vy() {
        return f31593sd;
    }

    public static int tq() {
        return hww;
    }

    public static void hww(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            f31590hu = jSONObject.optInt("check_moov", 0) == 1;
            vgm = jSONObject.optInt("new_media_source", 1);
            f31592ok = jSONObject.optInt("read_buffer_size_k", 8) * 1024;
        } catch (JSONException unused) {
        }
    }

    public static void hww(tq tqVar) {
        f31591hv = tqVar;
    }

    public static void hww() {
        tq tqVar = f31591hv;
        if (tqVar != null) {
            tqVar.vy();
        }
    }
}
