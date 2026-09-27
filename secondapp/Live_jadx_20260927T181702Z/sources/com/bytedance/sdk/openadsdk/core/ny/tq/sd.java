package com.bytedance.sdk.openadsdk.core.ny.tq;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.ok.ok;
import com.bytedance.sdk.component.utils.zvy;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.kub;
import com.bytedance.sdk.openadsdk.utils.qt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {
    private static final Map<String, tq> hww = new ConcurrentHashMap();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static final AtomicBoolean f36573tq = new AtomicBoolean(false);

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private boolean f36574hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private EnumC0354sd f36575hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final String f36576sd;
    private final boolean vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        private final String hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private EnumC0354sd f36586tq = EnumC0354sd.TRACKING_URL;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private boolean f36585sd = false;

        public hww(String str) {
            this.hww = str;
        }

        public hww hww(boolean z10) {
            this.f36585sd = z10;
            return this;
        }

        public sd hww() {
            return new sd(this.hww, this.f36586tq, Boolean.valueOf(this.f36585sd));
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ny.tq.sd$sd, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum EnumC0354sd {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq {
        final kub hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        float f36589sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        String f36590tq;

        public tq(String str, kub kubVar) {
            this(str, kubVar, -1.0f);
        }

        public String toString() {
            return super.toString();
        }

        public tq(String str, kub kubVar, float f10) {
            this.f36590tq = str;
            this.hww = kubVar;
            this.f36589sd = f10;
        }
    }

    static {
        zvy.hww(new zvy.hww() { // from class: com.bytedance.sdk.openadsdk.core.ny.tq.sd.1
            @Override // com.bytedance.sdk.component.utils.zvy.hww
            public void hww(Context context, Intent intent, boolean z10, int i10) {
                if (i10 == 0 || sd.hww.size() <= 0) {
                    return;
                }
                sd.tq();
            }
        }, bs.hww());
    }

    public sd(String str, EnumC0354sd enumC0354sd, Boolean bool) {
        this.f36576sd = str;
        this.f36575hv = enumC0354sd;
        this.vy = bool.booleanValue();
    }

    public static List<com.bytedance.sdk.openadsdk.core.ny.tq.hww> sd(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.ny.tq.hww.C0353hww(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).hww());
                }
            }
        }
        return arrayList;
    }

    public static void tq(kub kubVar, @NonNull List<sd> list, @Nullable com.bytedance.sdk.openadsdk.core.ny.hww.hww hwwVar, @Nullable long j10, @Nullable String str, String str2) {
        hww(kubVar, list, hwwVar, j10, str, null, str2);
    }

    public boolean hv() {
        return this.f36574hu;
    }

    public void l_() {
        this.f36574hu = true;
    }

    public boolean vy() {
        return this.vy;
    }

    public static List<String> hww(kub kubVar, @NonNull List<sd> list, @Nullable com.bytedance.sdk.openadsdk.core.ny.hww.hww hwwVar, @Nullable long j10, @Nullable String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (sd sdVar : list) {
            if (sdVar != null && (!sdVar.hv() || sdVar.vy())) {
                arrayList.add(sdVar.sd());
                sdVar.l_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.ny.sd.sd(arrayList, kubVar).hww(hwwVar).hww(j10).tq(str).hww(str2).hww();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tq() {
        if (f36573tq.compareAndSet(false, true)) {
            Map<String, tq> map = hww;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    hww((String) entry.getKey(), (tq) entry.getValue(), true);
                }
            }
            f36573tq.set(false);
        }
    }

    public String sd() {
        return this.f36576sd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tq(final boolean z10, final String str, final String str2, final tq tqVar, final String str3, final boolean z11) {
        kub kubVar;
        if (tqVar == null || (kubVar = tqVar.hww) == null) {
            return;
        }
        final boolean zOp = kubVar.op();
        final String str4 = zOp ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.vy.sd.hww(new ok(str4) { // from class: com.bytedance.sdk.openadsdk.core.ny.tq.sd.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", tqVar.f36590tq);
                    jSONObject.put("success", z10);
                    jSONObject.put("url", str3);
                    if (zOp) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        float f10 = tqVar.f36589sd;
                        if (f10 >= 0.0f) {
                            jSONObject.put("progress", ((double) Math.round(f10 * 100.0f)) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.vy.sd.hww(System.currentTimeMillis(), tqVar.hww, str2, str4, new com.bytedance.sdk.openadsdk.wgt.sd.hww() { // from class: com.bytedance.sdk.openadsdk.core.ny.tq.sd.3.1
                    @Override // com.bytedance.sdk.openadsdk.wgt.sd.hww, com.bytedance.sdk.openadsdk.wgt.sd.tq
                    public JSONObject hww() {
                        if (!z11) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.wgt.sd.hww, com.bytedance.sdk.openadsdk.wgt.sd.tq
                    public JSONObject sd() {
                        return jSONObject;
                    }
                });
            }
        });
    }

    public static List<com.bytedance.sdk.openadsdk.core.ny.tq.tq> tq(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.ny.tq.tq.hww(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).hww());
                }
            }
        }
        return arrayList;
    }

    public static boolean hww(kub kubVar, @NonNull List<sd> list, @Nullable com.bytedance.sdk.openadsdk.core.ny.hww.hww hwwVar, @Nullable long j10, @Nullable String str, tq tqVar, @Nullable String str2) {
        List<String> listHww = hww(kubVar, list, hwwVar, j10, str, str2);
        hww(listHww, tqVar);
        return !listHww.isEmpty();
    }

    public static void hww(List<String> list, tq tqVar) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (!TextUtils.isEmpty(str)) {
                hww(str, tqVar, false);
            }
        }
    }

    private static void hww(final String str, final tq tqVar, final boolean z10) {
        com.bytedance.sdk.component.vgm.tq.tq tqVarSd = com.bytedance.sdk.openadsdk.mrs.tq.tq().sd().sd();
        if (tqVarSd == null) {
            return;
        }
        tqVarSd.hww(true);
        tqVarSd.tq(str);
        tqVarSd.hww(new com.bytedance.sdk.component.vgm.hww.hww() { // from class: com.bytedance.sdk.openadsdk.core.ny.tq.sd.2
            @Override // com.bytedance.sdk.component.vgm.hww.hww
            public void hww(com.bytedance.sdk.component.vgm.tq.sd sdVar, com.bytedance.sdk.component.vgm.tq tqVar2) {
                String str2;
                boolean z11;
                tq tqVar3 = tqVar;
                if (tqVar3 == null || tqVar3.hww == null) {
                    return;
                }
                String str3 = null;
                if (tqVar2 == null || !tqVar2.hu()) {
                    if (tqVar2 != null) {
                        str3 = tqVar2.hww() + ":" + tqVar2.tq();
                        if (!z10 && (tqVar2.hww() <= 300 || tqVar2.hww() >= 400)) {
                            sd.hww.put(str, tqVar);
                        }
                    }
                    str2 = str3;
                    z11 = false;
                } else {
                    str2 = null;
                    z11 = true;
                }
                sd.tq(z11, str2, qt.sd(tqVar.hww.zkn()), tqVar, str, z10);
                if (!z11 || sd.hww.isEmpty()) {
                    return;
                }
                sd.tq();
            }

            @Override // com.bytedance.sdk.component.vgm.hww.hww
            public void hww(com.bytedance.sdk.component.vgm.tq.sd sdVar, IOException iOException) {
                kub kubVar;
                tq tqVar2 = tqVar;
                if (tqVar2 != null && (kubVar = tqVar2.hww) != null) {
                    sd.tq(false, iOException != null ? iOException.getMessage() : null, qt.sd(kubVar.zkn()), tqVar, str, z10);
                }
                if (z10 || tqVar == null) {
                    return;
                }
                sd.hww.put(str, tqVar);
            }
        });
    }

    public static JSONArray hww(List<sd> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            jSONArray.put(list.get(i10).sd());
        }
        return jSONArray;
    }

    public static List<sd> hww(JSONArray jSONArray) {
        return hww(jSONArray, false);
    }

    public static List<sd> hww(JSONArray jSONArray, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new hww(strOptString).hww(z10).hww());
                }
            }
        }
        return arrayList;
    }
}
