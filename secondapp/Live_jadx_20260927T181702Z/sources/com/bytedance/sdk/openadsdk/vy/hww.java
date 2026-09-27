package com.bytedance.sdk.openadsdk.vy;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.core.model.kub;
import com.bytedance.sdk.openadsdk.core.model.za;
import com.bytedance.sdk.openadsdk.utils.grv;
import com.bytedance.sdk.openadsdk.utils.syb;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww implements com.bytedance.sdk.component.hu.hww.vy.hww.tq {
    private static final Set<String> nod = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> vhb = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.vy.hww.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };
    private String aeg;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private String f37874bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private JSONObject f37875ed;
    private String hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final String f37876hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private long f37877hv;
    public final String hww;
    private String jpb;
    private String khx;
    private int kub;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private String f37878kv;
    private String mrs;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private final AtomicBoolean f37879ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f37880ok;
    private com.bytedance.sdk.openadsdk.vy.tq.hww omn;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f37881rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f37882sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected final JSONObject f37883tq;
    private int vgm;
    private long vy;
    private String weu;
    private String wgt;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.vy.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0391hww {

        /* JADX INFO: renamed from: bs, reason: collision with root package name */
        private int f37884bs;

        /* JADX INFO: renamed from: ed, reason: collision with root package name */
        private String f37885ed;

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private String f37886hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private String f37887hv;
        public int hww;
        private int jpb;
        private com.bytedance.sdk.openadsdk.vy.tq.tq khx;
        private boolean mrs;
        private JSONObject nod;

        /* JADX INFO: renamed from: ny, reason: collision with root package name */
        private final int f37888ny;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private String f37889ok;
        private String omn;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private String f37890rs;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private String f37891sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private String f37892tq;
        private String vgm;
        private String vhb;
        private String vy;
        private com.bytedance.sdk.openadsdk.vy.tq.hww weu;
        private final long wgt;

        public C0391hww(long j10, kub kubVar) {
            this.f37884bs = -1;
            this.jpb = -1;
            this.hww = -1;
            if (kubVar != null) {
                this.mrs = za.tq(kubVar);
                this.f37884bs = kubVar.bq();
                this.jpb = kubVar.eb();
                this.hww = kubVar.tad();
            }
            this.wgt = j10;
            this.f37888ny = com.bytedance.sdk.component.utils.jpb.sd(com.bytedance.sdk.openadsdk.core.bs.hww());
        }

        public C0391hww hu(String str) {
            this.f37890rs = str;
            return this;
        }

        public C0391hww hv(String str) {
            this.f37889ok = str;
            return this;
        }

        public C0391hww ok(String str) {
            this.omn = str;
            return this;
        }

        public C0391hww sd(String str) {
            this.vy = str;
            return this;
        }

        public C0391hww tq(String str) {
            this.f37891sd = str;
            return this;
        }

        public C0391hww vgm(String str) {
            this.vgm = str;
            return this;
        }

        public C0391hww vy(String str) {
            this.f37887hv = str;
            return this;
        }

        public C0391hww hww(String str) {
            this.f37885ed = str;
            return this;
        }

        public C0391hww hww(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.nod = jSONObject;
            return this;
        }

        public void hww(com.bytedance.sdk.openadsdk.vy.tq.hww hwwVar) {
            com.bytedance.sdk.openadsdk.hu.tq.hww().hww(this.vy, this.omn, this.vgm, this.f37891sd);
            this.weu = hwwVar;
            final hww hwwVar2 = new hww(this);
            try {
                com.bytedance.sdk.openadsdk.vy.tq.tq tqVar = this.khx;
                if (tqVar != null) {
                    tqVar.hww(hwwVar2.f37883tq, this.wgt);
                } else {
                    new com.bytedance.sdk.openadsdk.vy.tq.sd().hww(hwwVar2.f37883tq, this.wgt);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
                syb.sd(new com.bytedance.sdk.component.ok.ok("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.vy.hww.hww.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.vy.hww.tq.hww(hwwVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.vy.hww.tq.hww(hwwVar2);
            }
        }
    }

    public hww(String str, JSONObject jSONObject) {
        this.f37876hu = "adiff";
        this.f37879ny = new AtomicBoolean(false);
        this.f37875ed = new JSONObject();
        this.hww = str;
        this.f37883tq = jSONObject;
    }

    private void hu() {
        JSONObject jSONObject = this.f37875ed;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("value");
            String strOptString2 = this.f37875ed.optString("category");
            String strOptString3 = this.f37875ed.optString("log_extra");
            if (hww(this.f37874bs, this.wgt, this.f37878kv)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !tq(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.f37874bs) || TextUtils.equals(this.f37874bs, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.wgt) || !tq(this.wgt)) && (TextUtils.isEmpty(strOptString2) || !tq(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.f37878kv) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!hww(this.f37874bs, this.wgt, this.f37878kv)) {
            return;
        }
        this.vy = com.bytedance.sdk.openadsdk.vy.hww.tq.hww.incrementAndGet();
    }

    private boolean hww(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean tq(String str) {
        str.getClass();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private void vgm() throws JSONException {
        this.f37883tq.putOpt("app_log_url", this.aeg);
        this.f37883tq.putOpt("tag", this.khx);
        this.f37883tq.putOpt("label", this.weu);
        this.f37883tq.putOpt("category", this.wgt);
        if (!TextUtils.isEmpty(this.f37874bs)) {
            try {
                this.f37883tq.putOpt("value", Long.valueOf(Long.parseLong(this.f37874bs)));
            } catch (NumberFormatException unused) {
                this.f37883tq.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.mrs)) {
            try {
                this.f37883tq.putOpt("ext_value", Long.valueOf(Long.parseLong(this.mrs)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f37878kv)) {
            this.f37883tq.putOpt("log_extra", this.f37878kv);
        }
        if (!TextUtils.isEmpty(this.hnv)) {
            try {
                this.f37883tq.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.hnv)));
            } catch (NumberFormatException unused3) {
            }
        }
        hww(this.f37883tq, this.weu);
        try {
            this.f37883tq.putOpt("nt", Integer.valueOf(this.kub));
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.f37875ed.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f37883tq.putOpt(next, this.f37875ed.opt(next));
        }
    }

    public boolean hv() {
        Set<String> setKhx;
        if (this.f37883tq == null || (setKhx = com.bytedance.sdk.openadsdk.core.bs.vy().khx()) == null) {
            return false;
        }
        String strOptString = this.f37883tq.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setKhx.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.weu)) {
            return false;
        }
        return setKhx.contains(this.weu);
    }

    public JSONObject sd() {
        if (this.f37879ny.get()) {
            return this.f37883tq;
        }
        try {
            vgm();
            if (this.f37883tq.has("ad_extra_data")) {
                Object objOpt = this.f37883tq.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            this.f37883tq.put("ad_extra_data", hww((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.f37883tq.put("ad_extra_data", hww(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e10) {
                        omn.vy("AdEvent", "json error", e10.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.hww);
                    if (this.f37882sd) {
                        jSONObject.put("interaction_method", this.vgm);
                        jSONObject.put("real_interaction_method", this.f37880ok);
                        jSONObject.put("image_mode", this.f37881rs);
                    }
                    this.f37883tq.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e11) {
                    omn.vy("AdEvent", "json error", e11.getMessage());
                }
            }
            this.f37879ny.set(true);
        } catch (Throwable unused) {
        }
        return this.f37883tq;
    }

    public String vy() {
        return this.hww;
    }

    private void tq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : vhb.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(vhb.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private JSONObject hww(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.hww);
            }
            if (this.f37882sd) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.vgm);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.f37880ok);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.f37881rs);
                }
            }
            tq(jSONObject);
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.hww + TokenBuilder.TOKEN_DELIMITER + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th2) {
            omn.sd("AdEvent", th2.getMessage() == null ? "error " : th2.getMessage());
            return jSONObject;
        }
    }

    public hww(C0391hww c0391hww) {
        this.f37876hu = "adiff";
        this.f37879ny = new AtomicBoolean(false);
        this.f37875ed = new JSONObject();
        if (!TextUtils.isEmpty(c0391hww.f37892tq)) {
            this.hww = c0391hww.f37892tq;
        } else {
            this.hww = grv.hww();
        }
        this.omn = c0391hww.weu;
        this.f37878kv = c0391hww.f37886hu;
        this.khx = c0391hww.f37891sd;
        this.weu = c0391hww.vy;
        if (!TextUtils.isEmpty(c0391hww.f37887hv)) {
            this.wgt = c0391hww.f37887hv;
        } else {
            this.wgt = "app_union";
        }
        this.hnv = c0391hww.vhb;
        this.f37874bs = c0391hww.f37889ok;
        this.mrs = c0391hww.f37890rs;
        this.jpb = c0391hww.vgm;
        this.kub = c0391hww.f37888ny;
        this.aeg = c0391hww.f37885ed;
        this.f37875ed = c0391hww.nod = c0391hww.nod != null ? c0391hww.nod : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.f37883tq = jSONObject;
        if (!TextUtils.isEmpty(c0391hww.f37885ed)) {
            try {
                jSONObject.put("app_log_url", c0391hww.f37885ed);
            } catch (JSONException e10) {
                omn.sd("AdEvent", e10.getMessage());
            }
        }
        this.vgm = c0391hww.f37884bs;
        this.f37880ok = c0391hww.jpb;
        this.f37881rs = c0391hww.hww;
        this.f37882sd = c0391hww.mrs;
        this.f37877hv = System.currentTimeMillis();
        hu();
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww.tq
    public long tq() {
        return this.vy;
    }

    public JSONObject hww(boolean z10) {
        JSONObject jSONObjectSd = sd();
        try {
            if (z10) {
                JSONObject jSONObject = new JSONObject(jSONObjectSd.toString());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (jSONObjectOptJSONObject == null) {
                    return jSONObject;
                }
                jSONObjectOptJSONObject.remove("app_log_url");
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObjectSd.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e10) {
            omn.sd("AdEvent", e10.getMessage());
            return jSONObjectSd;
        }
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww.tq
    public JSONObject hww(String str) {
        return sd();
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww.tq
    public long hww() {
        return this.f37877hv;
    }

    private static void hww(JSONObject jSONObject, String str) {
        try {
            Set<String> set = nod;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th2) {
            omn.vy("AdEvent", th2);
        }
    }
}
