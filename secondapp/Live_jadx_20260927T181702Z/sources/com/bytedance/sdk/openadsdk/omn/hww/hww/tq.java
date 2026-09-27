package com.bytedance.sdk.openadsdk.omn.hww.hww;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.ok.ok;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.ed;
import com.bytedance.sdk.openadsdk.core.model.hu;
import com.bytedance.sdk.openadsdk.core.model.kub;
import com.bytedance.sdk.openadsdk.core.model.mw;
import com.bytedance.sdk.openadsdk.core.rpd;
import com.bytedance.sdk.openadsdk.core.rs;
import com.bytedance.sdk.openadsdk.core.weu;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.hv;
import com.bytedance.sdk.openadsdk.utils.kv;
import com.bytedance.sdk.openadsdk.utils.qt;
import com.bytedance.sdk.openadsdk.utils.syb;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements sd {
    protected String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final WeakReference<Context> f37568sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected int f37569tq;

    public tq(Context context, String str) {
        this.f37568sd = new WeakReference<>(context);
        this.hww = str;
        "====tag===".concat(String.valueOf(str));
        if (bs.hww() == null) {
            bs.tq(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hv(kub kubVar) {
        if (tq(kubVar)) {
            kubVar.hv(true);
            hv.hww(kubVar);
            return;
        }
        if (vy(kubVar)) {
            kubVar.hv(true);
            hv.hww(kubVar);
            return;
        }
        if (hww(kubVar, false)) {
            hv.hww(kubVar);
            return;
        }
        if (sd(kubVar)) {
            kubVar.hv(true);
            hv.hww(kubVar);
        } else {
            if (kubVar.eow() != null || kubVar.oo() == null) {
                return;
            }
            rpd.hww(hww(), kubVar.oo(), kubVar, qt.hww(this.hww), this.hww, true);
            kubVar.hv(true);
            hv.hww(kubVar);
        }
    }

    private static boolean tq() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.omn.hww.hww.sd
    public boolean sd(kub kubVar) {
        hu huVarEow;
        if (kubVar == null || (huVarEow = kubVar.eow()) == null) {
            return false;
        }
        return hww(hww(), kubVar, huVarEow.hww(), huVarEow.sd());
    }

    @Override // com.bytedance.sdk.openadsdk.omn.hww.hww.sd
    public boolean vy(kub kubVar) {
        hu huVarEow;
        if (kubVar == null || (huVarEow = kubVar.eow()) == null || kubVar.xzi() == 0) {
            return false;
        }
        String strSd = huVarEow.sd();
        if (TextUtils.isEmpty(strSd)) {
            return false;
        }
        return hww(kubVar, strSd, hww(), this.hww, new HashMap());
    }

    public static boolean hww(Context context, String str, String str2, String str3, kub kubVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.vy.sd.tq(kubVar, str3, "store_open", (JSONObject) null);
                hv.hww(kubVar);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(uri);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        com.bytedance.sdk.openadsdk.vy.sd.tq(kubVar, str3, "store_open", (JSONObject) null);
                        hv.hww(kubVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th2);
            }
        }
        return false;
    }

    public boolean tq(kub kubVar) {
        com.bytedance.sdk.openadsdk.core.vy.hww(kubVar, this.hww, 1, null);
        ed edVarSuy = kubVar.suy();
        if (edVarSuy == null) {
            com.bytedance.sdk.openadsdk.core.vy.hww(kubVar, this.hww, -1, null);
            return false;
        }
        HashMap map = new HashMap();
        hww(kubVar, map);
        if (hww.hww(hww(), edVarSuy.hww(), kubVar, qt.tq(kubVar), map, true)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.vy.sd.hww(kubVar, this.hww, "open_fallback_url", map);
        return false;
    }

    public static boolean tq(kub kubVar, Context context, boolean z10) {
        String strSd;
        IPBroadcastReceiver iPBroadcastReceiverHww;
        if (kubVar != null && context != null) {
            try {
                mw mwVarSgm = kubVar.sgm();
                if (mwVarSgm != null && !TextUtils.isEmpty(mwVarSgm.nod())) {
                    if (mwVarSgm.rs() && hww(kubVar, context, z10)) {
                        return true;
                    }
                    if (mwVarSgm.vgm() || mwVarSgm.ok()) {
                        if (kubVar.wgt() == 1) {
                            strSd = mwVarSgm.hww();
                        } else {
                            strSd = (kubVar.eow() == null || TextUtils.isEmpty(kubVar.eow().sd())) ? null : kubVar.eow().sd();
                        }
                        if (!TextUtils.isEmpty(strSd) && (iPBroadcastReceiverHww = IPBroadcastReceiver.hww(context, kubVar)) != null) {
                            iPBroadcastReceiverHww.hww(strSd, kubVar);
                        }
                    }
                    final boolean zHww = hww.hww(context, mwVarSgm.nod(), kubVar, qt.tq(kubVar), hww(kubVar, z10, mwVarSgm), true);
                    syb.tq(new ok("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.omn.hww.hww.tq.4
                        @Override // java.lang.Runnable
                        public void run() {
                            if (zHww) {
                                rs.hww("oem_store", "1");
                            } else {
                                rs.hww("oem_store", "-2");
                            }
                        }
                    });
                    return zHww;
                }
            } catch (Throwable th2) {
                omn.sd("GPDownLoader", th2.getMessage());
            }
        }
        return false;
    }

    public static boolean hww(kub kubVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentHww;
        if (kubVar != null && kubVar.xzi() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentHww = qt.hww(context, str)) == null) {
                return false;
            }
            intentHww.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentHww.addFlags(268435456);
            }
            context.startActivity(intentHww);
            if (map == null) {
                map = new HashMap<>();
            }
            if (kubVar != null && kubVar.ym() == 0) {
                map.put("auto_click", Boolean.valueOf(!kubVar.bs()));
            }
            map.put("can_query_install", Integer.valueOf(tq() ? 1 : 0));
            com.bytedance.sdk.openadsdk.vy.sd.hww(kubVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.omn.hww.hww.sd
    public void hww(int i10) {
        this.f37569tq = i10;
    }

    public boolean hww(Context context, kub kubVar, String str, String str2) {
        return hww(context, str, str2, this.hww, kubVar);
    }

    public Context hww() {
        WeakReference<Context> weakReference = this.f37568sd;
        return (weakReference == null || weakReference.get() == null) ? bs.hww() : this.f37568sd.get();
    }

    @Override // com.bytedance.sdk.openadsdk.omn.hww.hww.sd
    public void hww(final kub kubVar) {
        if (hww() == null || kubVar == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.kv.hww.hww("gp_downloader_async", 0) == 1) {
            syb.rs().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.omn.hww.hww.tq.1
                @Override // java.lang.Runnable
                public void run() {
                    tq.this.hv(kubVar);
                }
            });
        } else {
            hv(kubVar);
        }
    }

    private void hww(kub kubVar, Map<String, Object> map) {
        if (kubVar != null && kubVar.ym() == 0) {
            map.put("auto_click", Boolean.valueOf(!kubVar.bs()));
        }
        if (kubVar != null && kubVar.ym() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.f37569tq >= 11));
        }
        map.put("can_query_install", Integer.valueOf(tq() ? 1 : 0));
    }

    public boolean hww(kub kubVar, boolean z10) {
        return tq(kubVar, hww(), z10);
    }

    private static void hww(final JSONObject jSONObject, kub kubVar, String str, final int i10) {
        try {
            com.bytedance.sdk.openadsdk.vy.sd.hww(System.currentTimeMillis(), kubVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.wgt.sd.hww() { // from class: com.bytedance.sdk.openadsdk.omn.hww.hww.tq.2
                @Override // com.bytedance.sdk.openadsdk.wgt.sd.hww, com.bytedance.sdk.openadsdk.wgt.sd.tq
                public JSONObject hww() {
                    try {
                        jSONObject.put("status", i10);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static boolean hww(kub kubVar, Context context, boolean z10) {
        if (kubVar != null && kubVar.sgm() != null && kubVar.sgm().rs() && !TextUtils.isEmpty(kubVar.sgm().nod()) && context != null) {
            try {
                mw mwVarSgm = kubVar.sgm();
                String strHww = qt.hww(kubVar);
                final JSONObject jSONObjectVhb = mwVarSgm.vhb();
                jSONObjectVhb.put("from_web", z10 ? 1 : 0);
                jSONObjectVhb.put("is_w2a", kubVar.wgt());
                com.bytedance.sdk.openadsdk.vy.sd.hww(System.currentTimeMillis(), kubVar, strHww, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.wgt.sd.hww() { // from class: com.bytedance.sdk.openadsdk.omn.hww.hww.tq.3
                    @Override // com.bytedance.sdk.openadsdk.wgt.sd.hww, com.bytedance.sdk.openadsdk.wgt.sd.tq
                    public JSONObject hww() {
                        try {
                            jSONObjectVhb.put("status", 0);
                        } catch (Throwable unused) {
                        }
                        return jSONObjectVhb;
                    }
                });
                Intent intentHww = hww(context, mwVarSgm);
                if (intentHww == null) {
                    hww(jSONObjectVhb, kubVar, strHww, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!kv.hww((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity activityTq = weu.hww().hv().tq();
                    if (activityTq != null && kv.hww(activityTq)) {
                        context = activityTq;
                    }
                }
                if (!(context instanceof Activity)) {
                    hww(jSONObjectVhb, kubVar, strHww, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && intentHww.resolveActivity(packageManager) != null) {
                    try {
                        ((Activity) context).startActivityForResult(intentHww, 0);
                        hww(jSONObjectVhb, kubVar, strHww, 1);
                        return true;
                    } catch (Throwable unused) {
                        hww(jSONObjectVhb, kubVar, strHww, -3);
                        return false;
                    }
                }
                hww(jSONObjectVhb, kubVar, strHww, -4);
                return false;
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return false;
    }

    private static Intent hww(Context context, mw mwVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String strVy = mwVar.vy();
            if (!TextUtils.isEmpty(strVy)) {
                intent.setPackage(strVy);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(mwVar.nod()));
            boolean z10 = true;
            if (mwVar.tq() != 1) {
                z10 = false;
            }
            intent.putExtra("overlay", z10);
            if (TextUtils.isEmpty(mwVar.sd())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", mwVar.sd());
            }
            mwVar.hww(intent);
            return intent;
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }

    @NonNull
    private static Map<String, Object> hww(kub kubVar, boolean z10, mw mwVar) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", mwVar.hu());
            jSONObject.put("from_web", z10 ? 1 : 0);
            jSONObject.put("is_w2a", kubVar.wgt());
            map.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return map;
    }

    public static boolean hww(String str, kub kubVar) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if ("market".equals(scheme) && c.channelApi.equals(host)) {
                    return true;
                }
                if ((!"http".equals(scheme) && !"https".equals(scheme)) || (!"play.google.com".equals(host) && !"market.android.com".equals(host))) {
                    if ("market".equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = uri.getQueryParameter("uri")) != null) {
                        return hww(queryParameter, kubVar);
                    }
                }
                return true;
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return false;
    }

    public static boolean hww(kub kubVar, String str) {
        if (kubVar == null || kubVar.sgm() == null) {
            return false;
        }
        String strHv = kubVar.sgm().hv();
        if (TextUtils.isEmpty(strHv)) {
            return false;
        }
        return Pattern.compile(strHv).matcher(str).matches();
    }
}
