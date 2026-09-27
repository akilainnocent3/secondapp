package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class mw {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f36349hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private String f36350hv;
    private String hww;
    private String nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f36351ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private String f36352rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f36353sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f36354tq;
    private String vgm;
    private int vhb;
    private int vy;

    public void hu(String str) {
        this.hww = str;
    }

    public String hv() {
        return this.f36349hu;
    }

    public String hww() {
        return this.vgm;
    }

    public String nod() {
        return this.f36353sd == 2 ? this.f36354tq : this.hww;
    }

    public boolean ok() {
        return this.vy == 2;
    }

    public boolean rs() {
        return this.vhb == 1;
    }

    public String sd() {
        return this.f36352rs;
    }

    public int tq() {
        return this.f36351ok;
    }

    public void vgm(String str) {
        this.f36354tq = str;
    }

    public JSONObject vhb() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.hww)) {
                jSONObject.put("market_dpl", this.hww);
            }
            if (!TextUtils.isEmpty(this.f36354tq)) {
                jSONObject.put("market_dpl_auto", this.f36354tq);
            }
            if (!TextUtils.isEmpty(this.f36350hv)) {
                jSONObject.put("market_pkg", this.f36350hv);
            }
            if (!TextUtils.isEmpty(this.vgm)) {
                jSONObject.put("app_pkg", this.vgm);
            }
            if (!TextUtils.isEmpty(this.f36349hu)) {
                jSONObject.put("regex", this.f36349hu);
            }
            jSONObject.put("exec_type", this.f36353sd);
            jSONObject.put("oem_vendor_type", this.vy);
            jSONObject.put("overlay", this.f36351ok);
            jSONObject.put("gp_card", this.vhb);
            if (!TextUtils.isEmpty(this.f36352rs)) {
                jSONObject.put("caller_id", this.f36352rs);
            }
            if (!TextUtils.isEmpty(this.nod)) {
                jSONObject.put("ext_map", this.nod);
            }
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.omn.sd("OemModel", th2.getMessage());
            return null;
        }
    }

    public String vy() {
        return this.f36350hv;
    }

    public int hu() {
        return this.vy;
    }

    public void hv(String str) {
        this.f36349hu = str;
    }

    public void hww(String str) {
        this.vgm = str;
    }

    public void sd(String str) {
        this.nod = str;
    }

    public void tq(int i10) {
        this.f36351ok = i10;
    }

    public boolean vgm() {
        return this.vy == 1;
    }

    public void vy(String str) {
        this.f36350hv = str;
    }

    public void hww(int i10) {
        this.vhb = i10;
    }

    public void sd(int i10) {
        this.f36353sd = i10;
    }

    public void tq(String str) {
        this.f36352rs = str;
    }

    public void vy(int i10) {
        this.vy = i10;
    }

    public static mw hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        mw mwVar = new mw();
        try {
            mwVar.hu(jSONObject.optString("market_dpl", ""));
            mwVar.vgm(jSONObject.optString("market_dpl_auto", ""));
            mwVar.sd(jSONObject.optInt("exec_type", 0));
            mwVar.vy(jSONObject.optInt("oem_vendor_type", 0));
            mwVar.vy(jSONObject.optString("market_pkg", ""));
            mwVar.hv(jSONObject.optString("regex", ""));
            mwVar.tq(jSONObject.optInt("overlay", 1));
            mwVar.tq(jSONObject.optString("caller_id", ""));
            mwVar.sd(jSONObject.optString("ext_map", null));
            mwVar.hww(jSONObject.optInt("gp_card", 0));
            mwVar.hww(jSONObject.optString("app_pkg", ""));
            return mwVar;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.omn.sd("OemModel", th2.getMessage());
            return mwVar;
        }
    }

    public void hww(Intent intent) {
        if (TextUtils.isEmpty(this.nod)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.nod);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
