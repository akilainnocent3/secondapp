package com.bytedance.sdk.component.hww;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hww {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    protected String f34879hv;
    protected Context hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected vgm f34881sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected vhb f34882tq;
    hu vgm;
    protected Handler vy = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    protected volatile boolean f34878hu = false;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final Map<String, hu> f34880ok = new HashMap();

    public abstract Context hww(rs rsVar);

    public abstract String hww();

    public abstract void hww(String str);

    public void invokeMethod(final String str) {
        if (this.f34878hu) {
            return;
        }
        this.vy.post(new Runnable() { // from class: com.bytedance.sdk.component.hww.hww.1
            @Override // java.lang.Runnable
            public void run() {
                khx khxVarHww;
                if (hww.this.f34878hu) {
                    return;
                }
                try {
                    khxVarHww = hww.this.hww(new JSONObject(str));
                } catch (Exception unused) {
                    khxVarHww = null;
                }
                if (!khx.hww(khxVarHww)) {
                    hww.this.hww(khxVarHww);
                    return;
                }
                Objects.toString(khxVarHww);
                if (khxVarHww != null) {
                    hww.this.tq(mrs.hww(new wgt(khxVarHww.hww, "Failed to parse invocation.")), khxVarHww);
                }
            }
        });
    }

    public final void sd(rs rsVar) {
        this.hww = hww(rsVar);
        this.f34881sd = rsVar.vy;
        this.f34882tq = rsVar.f34900ok;
        this.vgm = new hu(rsVar, this);
        this.f34879hv = rsVar.nod;
        tq(rsVar);
    }

    public void tq() {
        this.vgm.hww();
        Iterator<hu> it = this.f34880ok.values().iterator();
        while (it.hasNext()) {
            it.next().hww();
        }
        this.vy.removeCallbacksAndMessages(null);
        this.f34878hu = true;
    }

    public abstract void tq(rs rsVar);

    public void hww(String str, khx khxVar) {
        hww(str);
    }

    public final void hww(khx khxVar) {
        String strHww;
        if (this.f34878hu || (strHww = hww()) == null) {
            return;
        }
        hu huVarTq = tq(khxVar.vgm);
        if (huVarTq == null) {
            khxVar.toString();
            if (this.f34882tq != null) {
                hww();
            }
            tq(mrs.hww(new wgt(-4, "Namespace " + khxVar.vgm + " unknown.")), khxVar);
            return;
        }
        hv hvVar = new hv();
        hvVar.f34877tq = strHww;
        hvVar.hww = this.hww;
        hvVar.f34876sd = huVarTq;
        try {
            hu.hww hwwVarHww = huVarTq.hww(khxVar, hvVar);
            if (hwwVarHww == null) {
                khxVar.toString();
                if (this.f34882tq != null) {
                    hww();
                }
                tq(mrs.hww(new wgt(-2, "Function " + khxVar.vy + " is not registered.")), khxVar);
                return;
            }
            if (hwwVarHww.hww) {
                tq(hwwVarHww.f34875tq, khxVar);
            }
            if (this.f34882tq != null) {
                hww();
            }
        } catch (Exception e10) {
            khxVar.toString();
            tq(mrs.hww(e10), khxVar);
        }
    }

    public final void tq(String str, khx khxVar) {
        JSONObject jSONObject;
        if (this.f34878hu || TextUtils.isEmpty(khxVar.f34884hu)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            ok.hww(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        hww(ed.hww().hww("__msg_type", "callback").hww("__callback_id", khxVar.f34884hu).hww("__params", jSONObject).tq(), khxVar);
    }

    private hu tq(String str) {
        if (!TextUtils.equals(str, this.f34879hv) && !TextUtils.isEmpty(str)) {
            return this.f34880ok.get(str);
        }
        return this.vgm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public khx hww(JSONObject jSONObject) {
        String strOptString;
        if (this.f34878hu) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (hww() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    if (objOpt instanceof String) {
                        strValueOf = (String) objOpt;
                    } else {
                        strValueOf = String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString("namespace");
            return khx.hww().hww(string2).tq(string).sd(strOptString3).vy(strOptString).hv(strOptString2).hu(strOptString4).vgm(jSONObject.optString("__iframe_url")).hww();
        } catch (JSONException unused2) {
            return khx.hww(strOptString2, -1);
        }
    }
}
