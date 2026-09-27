package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private static boolean f36616ed = false;
    public static ed hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static final Set<String> f36617tq = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.rs.1
        {
            add("8025677");
            add("5001121");
        }
    };

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.ed.sd.sd f36618bs;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    @NonNull
    private String f36619hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private String f36620hv;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.core.vy.vgm.hww> jpb;
    private String khx;
    private Bitmap nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private int f36621ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    @Nullable
    private String f36622ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f36623rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f36624sd;
    private int vgm;
    private Integer vhb;

    @NonNull
    private String vy;
    private boolean weu;
    private String wgt;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        private static final rs hww = new rs();
    }

    public static int hu() {
        try {
            String strHww = hww("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strHww)) {
                return 0;
            }
            return Integer.valueOf(strHww).intValue();
        } catch (Throwable th2) {
            th2.getMessage();
            return 0;
        }
    }

    public static int hv() {
        try {
            String strHww = hww("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strHww)) {
                return 0;
            }
            return Integer.valueOf(strHww).intValue();
        } catch (Throwable th2) {
            th2.getMessage();
            return 0;
        }
    }

    public static void kub() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            f36616ed = true;
        }
    }

    public static boolean kv() {
        return f36616ed;
    }

    @NonNull
    public static rs tq() {
        return hww.hww;
    }

    public String aeg() {
        return com.bytedance.sdk.openadsdk.multipro.tq.sd() ? com.bytedance.sdk.openadsdk.multipro.vy.vy.tq("sp_global_file", "adx_id", "") : this.khx;
    }

    public boolean bs() {
        return f36617tq.contains(this.vy);
    }

    @Nullable
    public String ed() {
        return com.bytedance.sdk.openadsdk.multipro.tq.sd() ? com.bytedance.sdk.openadsdk.multipro.vy.vy.tq("sp_global_file", "extra_data", null) : this.f36622ok;
    }

    public void hnv() {
        try {
            if (this.jpb == null || this.jpb.size() != 0) {
                return;
            }
            this.jpb = null;
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public boolean jpb() {
        return "5001121".contains(this.vy);
    }

    public com.bytedance.sdk.openadsdk.core.ed.sd.sd khx() {
        if (this.f36618bs == null) {
            this.f36618bs = new com.bytedance.sdk.openadsdk.core.ed.sd.sd(10, 8);
        }
        return this.f36618bs;
    }

    public boolean mrs() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.qt.hu());
    }

    public int nod() {
        Integer num = this.vhb;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_privacy", "tt_gdpr", -1);
    }

    public boolean ny() {
        int i10 = this.f36621ny;
        return i10 < -1 || i10 > 1;
    }

    @NonNull
    public String ok() {
        if (TextUtils.isEmpty(this.f36619hu)) {
            this.f36619hu = hww(bs.hww());
        }
        return this.f36619hu;
    }

    public String omn() {
        if (!TextUtils.isEmpty(this.wgt)) {
            return this.wgt;
        }
        String strHww = com.bytedance.sdk.openadsdk.utils.ny.hww();
        this.wgt = strHww;
        if (!TextUtils.isEmpty(strHww)) {
            return this.wgt;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.ny.hww(strValueOf);
        this.wgt = strValueOf;
        return strValueOf;
    }

    public int rs() {
        return com.bytedance.sdk.openadsdk.multipro.tq.sd() ? com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_icon_id", "icon_id", 0) : this.vgm;
    }

    public boolean sd() {
        return com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_file", "sdk_activate_init", true);
    }

    public String vgm() {
        String str = this.f36620hv;
        if (str != null) {
            return str;
        }
        String strHww = hww("mediation_info", Long.MAX_VALUE);
        this.f36620hv = strHww;
        if (strHww == null) {
            this.f36620hv = "";
        }
        return this.f36620hv;
    }

    public int vhb() {
        return this.f36621ny;
    }

    @Nullable
    public String vy() {
        if (TextUtils.isEmpty(this.vy)) {
            String strHww = hww("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strHww)) {
                this.vy = strHww;
            }
        }
        return this.vy;
    }

    public boolean weu() {
        return true;
    }

    public Bitmap wgt() {
        return com.bytedance.sdk.openadsdk.multipro.tq.sd() ? com.bytedance.sdk.component.utils.vy.hww(com.bytedance.sdk.openadsdk.multipro.vy.vy.tq("sp_global_file", "pause_icon", null)) : this.nod;
    }

    private rs() {
        this.f36624sd = false;
        this.f36623rs = 0;
        this.nod = null;
        this.vhb = null;
        this.f36621ny = -1;
        this.jpb = null;
    }

    private static JSONObject ny(String str) {
        String strTq = com.bytedance.sdk.openadsdk.multipro.vy.vy.tq("sp_global_file", str, null);
        if (TextUtils.isEmpty(strTq)) {
            return null;
        }
        try {
            return new JSONObject(strTq);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.omn.sd("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    private static void vhb(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        ed edVar = hww;
        if (edVar != null) {
            edVar.hww(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.omn.sd("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public void sd(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_icon_id", "icon_id", Integer.valueOf(i10));
        }
        this.vgm = i10;
    }

    public void tq(boolean z10) {
        com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_file", "sdk_activate_init", Boolean.valueOf(z10));
    }

    public static void hww(ed edVar) {
        hww = edVar;
    }

    public static void tq(int i10) {
        if (i10 >= 0) {
            hww("config_fail_times", String.valueOf(i10));
        }
    }

    private static void nod(String str) {
        ed edVar;
        if (TextUtils.isEmpty(str) && (edVar = hww) != null) {
            edVar.hww(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.omn.sd("TTAD.GlobalInfo", "appid cannot be empty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rs(String str) {
        if (!TextUtils.isEmpty(this.f36622ok)) {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArray = new JSONArray(this.f36622ok);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("name");
                        if (!TextUtils.isEmpty(strOptString)) {
                            map.put(strOptString, jSONObjectOptJSONObject);
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i11);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                        String strOptString3 = jSONObjectOptJSONObject2.optString("value");
                        if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                            map.put(strOptString2, jSONObjectOptJSONObject2);
                        }
                    }
                }
                Collection collectionValues = map.values();
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    jSONArray3.put((JSONObject) it.next());
                }
                this.f36622ok = jSONArray3.toString();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        } else {
            this.f36622ok = str;
        }
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_file", "extra_data", this.f36622ok);
        }
    }

    public boolean hww() {
        return this.weu;
    }

    public void ok(String str) {
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_file", "adx_id", str);
        }
        this.khx = str;
    }

    public void tq(String str) {
        this.f36620hv = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hww("mediation_info", str);
    }

    public static boolean vgm(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public void hu(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_file", "title_bar_theme", Integer.valueOf(i10));
        }
        this.f36623rs = i10;
    }

    public void hv(int i10) {
        this.f36621ny = i10;
    }

    public void hww(boolean z10) {
        this.weu = z10;
    }

    public void sd(@Nullable final String str) {
        vhb(str);
        if (com.bytedance.sdk.openadsdk.utils.syb.hu()) {
            khx.tq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rs.3
                @Override // java.lang.Runnable
                public void run() {
                    rs.this.rs(str);
                }
            });
        } else {
            rs(str);
        }
    }

    public static void hww(int i10) {
        if (i10 >= 0) {
            hww("domain_index", String.valueOf(i10));
        }
    }

    public com.bytedance.sdk.openadsdk.core.vy.vgm.hww hv(String str) {
        try {
            if (this.jpb == null || str == null) {
                return null;
            }
            return this.jpb.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void vy(final int i10) {
        if (i10 == 1) {
            i10 = 0;
        } else if (i10 == 0) {
            i10 = 1;
        }
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.vhb;
            if (num == null || num.intValue() != i10) {
                this.vhb = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.syb.hu()) {
                    hww(num, i10);
                } else {
                    khx.tq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rs.2
                        @Override // java.lang.Runnable
                        public void run() {
                            rs.this.hww(num, i10);
                        }
                    });
                }
            }
        }
    }

    public void hww(@NonNull String str) {
        nod(str);
        this.vy = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hww("app_id", str);
        com.bytedance.sdk.openadsdk.core.settings.vhb.sd().vy(7);
    }

    public void hu(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
                com.bytedance.sdk.openadsdk.sd.nod.hww(6, str);
            } else if (this.jpb != null) {
                this.jpb.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public void sd(boolean z10) {
        this.f36624sd = z10;
    }

    private String hww(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static Pair<String, Long> vy(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectNy = ny(str);
            if (jSONObjectNy == null) {
                return null;
            }
            return new Pair<>(jSONObjectNy.getString("value"), Long.valueOf(jSONObjectNy.getLong("time")));
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.omn.sd("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(Integer num, int i10) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.vhb.sd().hww(4, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_privacy", "tt_gdpr", -1) != i10) {
            com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.vhb.sd().hww(4, true);
        }
    }

    public static void hww(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.omn.sd("TTAD.GlobalInfo", e10.getMessage());
        }
    }

    public static String hww(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectNy = ny(str);
            if (jSONObjectNy == null) {
                return null;
            }
            if (System.currentTimeMillis() - jSONObjectNy.getLong("time") <= j10) {
                return jSONObjectNy.getString("value");
            }
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.omn.sd("TTAD.GlobalInfo", e10.getMessage());
        }
        return null;
    }

    public void hww(String str, com.bytedance.sdk.openadsdk.core.vy.vgm.hww hwwVar) {
        try {
            if (TextUtils.isEmpty(str) || hwwVar == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
                com.bytedance.sdk.openadsdk.sd.nod.hww(6, str, hwwVar);
                return;
            }
            if (this.jpb == null) {
                synchronized (rs.class) {
                    try {
                        if (this.jpb == null) {
                            this.jpb = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (this.jpb != null) {
                this.jpb.put(str, hwwVar);
            }
        } catch (Throwable unused) {
        }
    }
}
