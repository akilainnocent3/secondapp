package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private grv f36240hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private kub f36241hv;
    private String hww;
    private kv nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private kub f36242ny;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f36244rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f36245sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f36246tq;
    private String vhb;
    private List<kub> vy = new ArrayList();
    private JSONObject vgm = new JSONObject();

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private volatile boolean f36243ok = false;

    @Nullable
    public JSONObject ed() {
        try {
            JSONObject jSONObject = new JSONObject();
            kv kvVarVgm = vgm();
            if (kvVarVgm != null) {
                jSONObject.put("loop_config", kvVarVgm.vhb());
            }
            grv grvVarNy = ny();
            if (grvVarNy != null) {
                jSONObject.put("multi_ad_config", grvVarNy.jpb());
            }
            List<kub> list = this.vy;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.vy.size(); i10++) {
                    jSONArray.put(this.vy.get(i10).jp());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("multi_ad_style", this.f36244rs);
            jSONObject.put(CommonUrlParts.REQUEST_ID, this.hww);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.omn.hww("AdInfo", "toJsonObj: ", th2);
            return null;
        }
    }

    public kub hu() {
        if (this.vy.size() > 0) {
            return this.vy.get(0);
        }
        return null;
    }

    public boolean hv() {
        List<kub> list = this.vy;
        return list != null && list.size() > 0;
    }

    public JSONObject hww() {
        return this.vgm;
    }

    public String khx() {
        return this.vhb;
    }

    public boolean nod() {
        return this.f36244rs == 1;
    }

    public grv ny() {
        return this.f36240hu;
    }

    public boolean ok() {
        return this.f36243ok;
    }

    public void rs() {
        this.f36243ok = false;
    }

    public int sd() {
        return this.f36246tq;
    }

    public String tq() {
        kub kubVarHu = hu();
        return kubVarHu != null ? kubVarHu.jfy() : "";
    }

    public kv vgm() {
        return this.nod;
    }

    public kub vhb() {
        return this.f36242ny;
    }

    public List<kub> vy() {
        return this.vy;
    }

    public kub weu() {
        return this.f36241hv;
    }

    public void hww(JSONObject jSONObject) {
        this.vgm = jSONObject;
    }

    public void sd(String str) {
        this.vhb = str;
    }

    public void hww(String str) {
        this.hww = str;
    }

    public void hww(int i10) {
        this.f36246tq = i10;
    }

    public void tq(String str) {
        this.f36245sd = str;
    }

    public void hww(kub kubVar) {
        this.vy.add(kubVar);
        if (this.f36242ny == null) {
            this.f36242ny = kubVar;
        }
    }

    public void tq(int i10) {
        this.f36244rs = i10;
    }

    public static hww tq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            hww hwwVar = new hww();
            hwwVar.hww(kv.hww(jSONObject.optJSONObject("loop_config")));
            hwwVar.tq(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    kub kubVarHww = com.bytedance.sdk.openadsdk.core.tq.hww(jSONArrayOptJSONArray.optJSONObject(i10), null, null, hwwVar, i10);
                    if (kubVarHww != null) {
                        arrayList.add(kubVarHww);
                    }
                }
                hwwVar.hww(arrayList);
            }
            hwwVar.hww(jSONObject.optString(CommonUrlParts.REQUEST_ID, ""));
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                hwwVar.hww(grv.hww(strOptString));
            }
            return hwwVar;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.omn.hww("AdInfo", "fromJson: ", th2);
            return null;
        }
    }

    public void hww(List<kub> list) {
        this.vy = list;
        if (list.isEmpty()) {
            return;
        }
        this.f36242ny = list.get(0);
    }

    public static Map<String, kub> hww(hww hwwVar) {
        if (hwwVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (kub kubVar : hwwVar.vy()) {
            if (!TextUtils.isEmpty(kubVar.zx())) {
                map.put(kubVar.zx(), kubVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public void hww(kv kvVar) {
        this.nod = kvVar;
    }

    public void hww(grv grvVar) {
        this.f36240hu = grvVar;
    }

    public void tq(kub kubVar) {
        this.f36241hv = kubVar;
    }
}
