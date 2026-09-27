package com.bytedance.sdk.openadsdk.core.nod;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.khx;
import com.bytedance.sdk.openadsdk.core.ny;
import com.bytedance.sdk.openadsdk.core.rs;
import com.bytedance.sdk.openadsdk.core.settings.vhb;
import com.bytedance.sdk.openadsdk.multipro.vy.vy;
import com.bytedance.sdk.openadsdk.utils.qt;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
class hww {
    private PglSSManager hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private volatile boolean f36484tq;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private volatile boolean f36483sd = true;
    private volatile boolean vy = false;

    public hww() {
        hww();
    }

    private Class nod() {
        Class<?> cls;
        try {
            cls = Class.forName("com.pgl.ssdk.ces.out.PglSSManager");
            try {
                this.f36483sd = true;
                return cls;
            } catch (Throwable unused) {
                this.f36483sd = false;
                return cls;
            }
        } catch (Throwable unused2) {
            cls = null;
        }
    }

    private boolean ok() {
        if (!this.f36484tq && this.f36483sd) {
            hww();
        }
        return this.f36484tq;
    }

    private void rs() {
        if (this.hww == null) {
            this.hww = PglSSManager.getInstance();
        }
    }

    public long hu() {
        if (!ok()) {
            return 0L;
        }
        rs();
        PglSSManager pglSSManager = this.hww;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public String hv() {
        if (!ok()) {
            return "";
        }
        rs();
        PglSSManager pglSSManager = this.hww;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public void sd() {
        if (ok()) {
            rs();
            if (this.hww != null) {
                khx.tq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nod.hww.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, bs.vy().kub());
                            hww.this.hww.setCustomInfo(map);
                        } catch (Throwable th2) {
                            omn.vy("MSSdkImpl", "setCustomInfo", th2.getMessage());
                        }
                    }
                });
            }
        }
    }

    public boolean tq() {
        return this.f36484tq;
    }

    public int vgm() {
        if (this.f36483sd) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public String vy() {
        if (!ok()) {
            return "";
        }
        rs();
        PglSSManager pglSSManager = this.hww;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public synchronized void hww() {
        try {
            if (!this.f36484tq) {
                try {
                    Context contextHww = bs.hww();
                    String strVy = rs.tq().vy();
                    if (TextUtils.isEmpty(strVy)) {
                        strVy = rs.hww("app_id", Long.MAX_VALUE);
                    }
                    if (TextUtils.isEmpty(strVy)) {
                        return;
                    }
                    String strHww = ny.hww(contextHww);
                    String strTq = com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().tq();
                    PglSSConfig pglSSConfigBuild = PglSSConfig.builder().setAppId(strVy).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
                    String strTq2 = vy.tq("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                    HashMap map = new HashMap();
                    if (!TextUtils.isEmpty(strTq2)) {
                        map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strTq2);
                    }
                    Set<String> setKm = vhb.sd().km();
                    if (setKm != null && !setKm.isEmpty()) {
                        map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setKm);
                    }
                    String strJpb = qt.jpb();
                    if (!TextUtils.isEmpty(strJpb)) {
                        map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strJpb);
                    }
                    map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, vhb.sd().sr());
                    String strHww2 = com.bytedance.sdk.openadsdk.kv.hww.hww(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                    if (!TextUtils.isEmpty(strHww2)) {
                        map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strHww2);
                    }
                    pglSSConfigBuild.setCustomInfo(map);
                    pglSSConfigBuild.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.nod.hww.1
                        @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                        public void reportSoftDecData(final String str, final String str2) {
                            com.bytedance.sdk.openadsdk.wgt.sd.hww(str, false, new com.bytedance.sdk.openadsdk.wgt.tq() { // from class: com.bytedance.sdk.openadsdk.core.nod.hww.1.1
                                @Override // com.bytedance.sdk.openadsdk.wgt.tq
                                @Nullable
                                public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                                    return com.bytedance.sdk.openadsdk.wgt.hww.vy.tq().hww(str).tq(str2);
                                }
                            });
                        }
                    });
                    PglSSManager.init(contextHww, pglSSConfigBuild, null, null, strHww, strTq);
                    rs();
                    this.f36484tq = true;
                } catch (Throwable unused) {
                    nod();
                    this.f36484tq = false;
                }
                try {
                    if (this.f36483sd) {
                        sd(PglSSManager.getLoadError());
                    }
                } catch (Throwable th2) {
                    omn.sd("mssdk", th2.getMessage());
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public void tq(String str) {
        if (ok()) {
            rs();
            PglSSManager pglSSManager = this.hww;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    private void sd(final String str) {
        if (this.vy || TextUtils.isEmpty(str)) {
            return;
        }
        bs.hv().hww(new com.bytedance.sdk.openadsdk.wgt.tq() { // from class: com.bytedance.sdk.openadsdk.core.nod.hww.4
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                return com.bytedance.sdk.openadsdk.wgt.hww.vy.tq().hww("secsdk_init_error").tq(str);
            }
        }, false);
        this.vy = true;
    }

    public void hww(String str) {
        if (ok()) {
            rs();
            PglSSManager pglSSManager = this.hww;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void hww(final Map<String, Object> map) {
        if (ok()) {
            rs();
            if (this.hww != null) {
                khx.tq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nod.hww.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            hww.this.hww.setCustomInfo(map);
                        } catch (Throwable th2) {
                            omn.vy("MSSdkImpl", "setCustomInfo", th2.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void hww(String str, Map<String, Object> map) {
        if (ok()) {
            rs();
            PglSSManager pglSSManager = this.hww;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void hww(MotionEvent motionEvent) {
        if (tq()) {
            rs();
            PglSSManager pglSSManager = this.hww;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> hww(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!ok() || (featureHash = this.hww.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
