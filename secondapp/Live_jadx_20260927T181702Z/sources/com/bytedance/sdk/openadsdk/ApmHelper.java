package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.ok.ok;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.core.aeg;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.kub;
import com.bytedance.sdk.openadsdk.core.ny;
import com.bytedance.sdk.openadsdk.core.settings.vhb;
import com.bytedance.sdk.openadsdk.multipro.vy.vy;
import com.bytedance.sdk.openadsdk.utils.qt;
import com.bytedance.sdk.openadsdk.utils.syb;
import com.ironsource.C4235d4;
import com.ironsource.C4593xa;
import com.ironsource.Q6;
import com.ironsource.Y1;
import com.pgl.ssdk.ces.out.PglSSConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l3.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ApmHelper {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static hww f35158hu = null;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static tq f35159hv = null;
    private static volatile boolean hww = false;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static String f35160sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static final AtomicBoolean f35161tq = new AtomicBoolean(false);
    private static boolean vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        public final String hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public final Throwable f35165sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public final String f35166tq;

        public hww(String str, String str2, Throwable th2) {
            this.hww = str;
            this.f35166tq = str2;
            this.f35165sd = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface tq {
        void hww(String str, String str2, Throwable th2);
    }

    @NonNull
    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Q6.V0, com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().tq());
            jSONObject.put("ipv6", vy.tq("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put("region", bs.vy().ytm());
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new aeg(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = "0";
        if (jSONObjectEncryptType4WithNoWrapBase64 != null) {
            int iOptInt = jSONObjectEncryptType4WithNoWrapBase64.optInt("cypher");
            if (iOptInt == 4) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "4";
            } else if (iOptInt == 3) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = a.Z4;
            } else {
                string = jSONObject.toString();
            }
        }
        return new Pair<>(str, string);
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (f35161tq.compareAndSet(false, true) && !hww) {
            syb.hww(new ok("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!ApmHelper.hww) {
                        vhb vhbVarVy = bs.vy();
                        boolean unused = ApmHelper.vy = vhbVarVy.gsa();
                        String strJpb = qt.jpb();
                        if (ApmHelper.vy && !TextUtils.isEmpty(strJpb)) {
                            String unused2 = ApmHelper.f35160sd = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String strHww = ny.hww(context);
                            try {
                                Npth.setCrashWaitTime(com.bytedance.sdk.openadsdk.kv.hww.hww("apm_crash_wait_time", 10000));
                                Npth.enableLoopMonitor(false);
                                Npth.enableAnrInfo(false);
                                Npth.enableNativeDump(false);
                                Npth.enableActivityDump(false);
                                Npth.enableMessageDump(false);
                                MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.CustomRequestHeader
                                    public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                        httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                        httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                        httpURLConnection.setRequestProperty("x-pangle-target-idc", bs.vy().sr());
                                    }
                                });
                                final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 7809L, BuildConfig.VERSION_NAME, strArr);
                                monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.apm.insight.AttachUserData
                                    @Nullable
                                    public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> mapOk = ApmHelper.ok();
                                        if (mapOk.containsKey("render_type")) {
                                            monitorCrashInitSDK.addTags("render_type", mapOk.get("render_type"));
                                            return mapOk;
                                        }
                                        monitorCrashInitSDK.addTags("render_type", "-2");
                                        return mapOk;
                                    }
                                });
                                if (vhbVarVy.xe()) {
                                    monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                monitorCrashInitSDK.config().setDeviceId(strHww);
                                monitorCrashInitSDK.setReportUrl(strJpb);
                                monitorCrashInitSDK.addTags("host_appid", ApmHelper.f35160sd);
                                monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                                tq unused3 = ApmHelper.f35159hv = new tq() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.tq
                                    public void hww(String str, String str2, Throwable th2) {
                                        monitorCrashInitSDK.reportCustomErr(str, str2, th2);
                                    }
                                };
                                boolean unused4 = ApmHelper.hww = true;
                                ApmHelper.sd(strHww, strJpb);
                                hww hwwVar = ApmHelper.f35158hu;
                                hww unused5 = ApmHelper.f35158hu = null;
                                if (hwwVar != null) {
                                    ApmHelper.f35159hv.hww(hwwVar.hww, hwwVar.f35166tq, hwwVar.f35165sd);
                                }
                            } catch (Throwable unused6) {
                                boolean unused7 = ApmHelper.hww = false;
                            }
                        }
                    }
                    ApmHelper.f35161tq.set(false);
                }
            });
        }
    }

    public static boolean isIsInit() {
        return hww;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> ok() {
        HashMap map = new HashMap();
        kub kubVarTq = com.bytedance.sdk.openadsdk.utils.tq.tq();
        if (kubVarTq != null) {
            map.put("adType", String.valueOf(kubVarTq.fyo()));
            map.put(C4593xa.f64436b, String.valueOf(kubVarTq.ip()));
            map.put("cid", kubVarTq.uy());
            map.put("reqId", kubVarTq.jfy());
            map.put("rit", kubVarTq.oxu(Y1.f60333f));
            int iHh = kubVarTq.hh();
            if (kubVarTq.nuc() != 2) {
                iHh = -1;
            }
            map.put("render_type", String.valueOf(iHh));
        }
        return map;
    }

    public static void reportCustomError(String str, String str2, Throwable th2) {
        tq tqVar = f35159hv;
        if (tqVar != null) {
            tqVar.hww(str, str2, th2);
        } else {
            f35158hu = new hww(str, str2, th2);
        }
    }

    public static void reportPvFromBackGround() {
        if (vy) {
            tq(ny.hww(bs.hww()), qt.jpb());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sd(String str, String str2) {
        tq(str, str2);
    }

    private static void tq(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        bs.sd().hww(tq(str), "https://" + str2 + "/monitor/collect/c/session?version_code=7809&device_platform=android&aid=10000001");
    }

    private static JSONObject tq(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", f35160sd);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put(Q6.F, C4235d4.f61260d);
            jSONObject2.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put(C4593xa.f64436b, "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e10) {
            omn.sd("ApmHelper", e10.getMessage());
            return jSONObject;
        }
    }
}
