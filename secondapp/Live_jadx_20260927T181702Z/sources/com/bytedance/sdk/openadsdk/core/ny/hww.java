package com.bytedance.sdk.openadsdk.core.ny;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.kub;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f36513hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private String f36514hv;
    private int nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private String f36515ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private double f36516ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f36517rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    sd f36518sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    tq f36519tq;
    private String vgm;
    private String vy;
    final com.bytedance.sdk.openadsdk.core.model.vy hww = new com.bytedance.sdk.openadsdk.core.model.vy();
    private String vhb = "VAST_ACTION_BUTTON";

    private JSONArray weu() {
        Set<nod> setTq = this.hww.tq();
        if (setTq == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (nod nodVar : setTq) {
            if (nodVar != null) {
                jSONArray.put(nodVar.vy());
            }
        }
        return jSONArray;
    }

    public Set<nod> ed() {
        return this.hww.tq();
    }

    public String hu() {
        return this.f36513hu;
    }

    public String hv() {
        return this.f36514hv;
    }

    public vy hww() {
        return this.hww.hww();
    }

    public com.bytedance.sdk.openadsdk.core.model.vy khx() {
        return this.hww;
    }

    public JSONObject nod() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        vy vyVarHww = this.hww.hww();
        if (vyVarHww != null) {
            jSONObject.put("videoTrackers", vyVarHww.hww());
        }
        tq tqVar = this.f36519tq;
        if (tqVar != null) {
            jSONObject.put("vastIcon", tqVar.hww());
        }
        sd sdVar = this.f36518sd;
        if (sdVar != null) {
            jSONObject.put("endCard", sdVar.hww());
        }
        jSONObject.put("title", this.vy);
        jSONObject.put("description", this.f36514hv);
        jSONObject.put("clickThroughUrl", this.f36513hu);
        jSONObject.put("videoUrl", this.vgm);
        jSONObject.put("videDuration", this.f36516ok);
        jSONObject.put("videoWidth", this.f36517rs);
        jSONObject.put("videoHeight", this.nod);
        jSONObject.put("viewabilityVendor", weu());
        return jSONObject;
    }

    public int ny() {
        return this.nod;
    }

    public double ok() {
        return this.f36516ok;
    }

    public String rs() {
        sd sdVar;
        String str = this.f36513hu;
        if (!TextUtils.isEmpty(this.f36515ny)) {
            String str2 = this.f36515ny;
            this.f36515ny = null;
            return str2;
        }
        String str3 = this.vhb;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            tq tqVar = this.f36519tq;
            if (tqVar != null && !TextUtils.isEmpty(tqVar.f36543ok)) {
                str = this.f36519tq.f36543ok;
            }
        } else if (str3.equals("VAST_END_CARD") && (sdVar = this.f36518sd) != null && !TextUtils.isEmpty(sdVar.f36543ok)) {
            str = this.f36518sd.f36543ok;
        }
        this.vhb = "VAST_ACTION_BUTTON";
        return str;
    }

    public sd sd() {
        return this.f36518sd;
    }

    public tq tq() {
        return this.f36519tq;
    }

    public String vgm() {
        return this.vgm;
    }

    public int vhb() {
        return this.f36517rs;
    }

    public String vy() {
        return this.vy;
    }

    public void hu(String str) {
        this.f36515ny = str;
    }

    public void hv(String str) {
        this.vhb = str;
    }

    public void hww(tq tqVar) {
        if (tqVar != null) {
            tqVar.hww(this.vgm);
        }
        this.f36519tq = tqVar;
    }

    public void sd(String str) {
        this.f36513hu = str;
    }

    public void tq(String str) {
        this.f36514hv = str;
    }

    public void vy(String str) {
        this.vgm = str;
    }

    public void tq(int i10) {
        this.nod = i10;
    }

    public void hww(sd sdVar) {
        if (sdVar != null) {
            sdVar.hww(this.vgm);
        }
        this.f36518sd = sdVar;
    }

    public void hww(String str) {
        this.vy = str;
    }

    public void hww(double d10) {
        this.f36516ok = d10;
    }

    public static hww hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        hww hwwVar = new hww();
        vy vyVarHww = hwwVar.hww.hww();
        if (vyVarHww == null) {
            vyVarHww = new vy();
            hwwVar.hww.hww(vyVarHww);
        }
        vyVarHww.hww(jSONObject.optJSONObject("videoTrackers"));
        hwwVar.f36519tq = tq.hww(jSONObject.optJSONObject("vastIcon"));
        hwwVar.f36518sd = sd.tq(jSONObject.optJSONObject("endCard"));
        hwwVar.vy = jSONObject.optString("title");
        hwwVar.f36514hv = jSONObject.optString("description");
        hwwVar.f36513hu = jSONObject.optString("clickThroughUrl");
        hwwVar.vgm = jSONObject.optString("videoUrl");
        hwwVar.f36516ok = jSONObject.optDouble("videDuration");
        hwwVar.f36517rs = jSONObject.optInt("videoWidth");
        hwwVar.f36517rs = jSONObject.optInt("videoHeight");
        Set<nod> setTq = hwwVar.hww.tq();
        if (setTq == null) {
            setTq = new HashSet<>();
            hwwVar.hww.hww(setTq);
        }
        setTq.addAll(nod.hww(jSONObject.optJSONArray("viewabilityVendor")));
        return hwwVar;
    }

    public void hww(kub kubVar) {
        this.hww.hww(kubVar);
        tq tqVar = this.f36519tq;
        if (tqVar != null) {
            tqVar.hww(kubVar);
        }
        sd sdVar = this.f36518sd;
        if (sdVar != null) {
            sdVar.hww(kubVar);
        }
    }

    public void hww(int i10) {
        this.f36517rs = i10;
    }

    public void hww(Set<nod> set) {
        this.hww.tq(set);
    }
}
