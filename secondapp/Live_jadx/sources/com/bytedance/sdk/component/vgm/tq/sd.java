package com.bytedance.sdk.component.vgm.tq;

import android.text.TextUtils;
import com.bytedance.sdk.component.tq.hww.ny;
import com.bytedance.sdk.component.tq.hww.vhb;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sd {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    int f35129hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    String f35130hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected vhb f35133sd;
    protected String vy = null;
    protected final Map<String, String> vgm = new HashMap();

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    protected String f35131ok = null;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    protected boolean f35132rs = false;

    public sd(vhb vhbVar) {
        this.f35133sd = vhbVar;
        try {
            sd(UUID.randomUUID().toString());
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void hww(String str) {
        this.f35130hv = str;
    }

    public void sd(String str) {
        this.vy = str;
    }

    public void tq(String str) {
        this.f35131ok = str;
    }

    public void vy(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.vgm.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void hww(int i10) {
        this.f35129hu = i10;
    }

    public String sd() {
        return this.vy;
    }

    public void tq(String str, String str2) {
        this.vgm.put(str, str2);
    }

    public void hww(ny.hww hwwVar) {
        if (hwwVar != null && this.vgm.size() > 0) {
            for (Map.Entry<String, String> entry : this.vgm.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    hwwVar.tq(key, value);
                }
            }
        }
    }

    public void tq() {
        vhb vhbVar;
        if (this.vy == null || (vhbVar = this.f35133sd) == null) {
            return;
        }
        com.bytedance.sdk.component.tq.hww.vy vyVarHww = vhbVar.hww();
        synchronized (vyVarHww) {
            try {
                for (com.bytedance.sdk.component.tq.hww.tq tqVar : vyVarHww.sd()) {
                    if (this.vy.equals(tqVar.hww().hww())) {
                        tqVar.sd();
                    }
                }
                for (com.bytedance.sdk.component.tq.hww.tq tqVar2 : vyVarHww.vy()) {
                    if (this.vy.equals(tqVar2.hww().hww())) {
                        tqVar2.sd();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String vy() {
        return this.f35131ok;
    }
}
