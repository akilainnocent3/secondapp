package com.bytedance.sdk.openadsdk.omn.hww.tq;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.ok.ok;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.settings.vhb;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.grv;
import com.bytedance.sdk.openadsdk.utils.syb;
import com.bytedance.sdk.openadsdk.wgt.hww.sd;
import com.bytedance.sdk.openadsdk.wgt.hww.vy;
import com.bytedance.sdk.openadsdk.wgt.tq;
import com.ironsource.Q6;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private static volatile hww vgm;
    private AtomicLong hww = new AtomicLong(0);

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f37575tq = 0;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f37574sd = "";
    private final AtomicBoolean vy = new AtomicBoolean(false);

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private volatile Boolean f37573hv = null;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f37572hu = "";

    private hww() {
    }

    public boolean sd() {
        return vhb.sd().zvy(Q6.V0);
    }

    public String tq() {
        return sd() ? this.f37574sd : "";
    }

    public static hww hww() {
        if (vgm == null) {
            synchronized (hww.class) {
                try {
                    if (vgm == null) {
                        vgm = new hww();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vgm;
    }

    public void tq(boolean z10) {
        hww(z10, 0, "", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String tq(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th2.toString());
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                sb2.append("\n\tat ");
                sb2.append(stackTraceElement.toString());
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void hww(String str) {
        this.f37574sd = str;
    }

    public void hww(boolean z10) {
        if (sd()) {
            if (this.f37575tq == 1 || !TextUtils.isEmpty(this.f37574sd)) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (z10 || this.hww.get() <= jElapsedRealtime) {
                this.hww.set(jElapsedRealtime + 300000);
                syb.hww((ok) new DeviceUtils.sd());
                return;
            }
            return;
        }
        if (this.vy.getAndSet(true)) {
            return;
        }
        hww().hww(1, "not in privacy fields allowed");
    }

    public void hww(int i10) {
        this.f37575tq = i10;
    }

    public void hww(JSONObject jSONObject) {
        if (!sd() || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(Q6.V0, this.f37574sd);
        } catch (JSONException unused) {
        }
    }

    public void hww(int i10, String str) {
        hww(false, i10, str, null);
    }

    public void hww(int i10, Throwable th2) {
        hww(false, i10, "", th2);
    }

    public void hww(final boolean z10, final int i10, final String str, final Throwable th2) {
        if (this.f37573hv == null) {
            synchronized (this) {
                try {
                    if (this.f37573hv == null) {
                        this.f37573hv = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= vhb.sd().hww("gid_status", 100));
                        if (this.f37573hv.booleanValue()) {
                            try {
                                this.f37572hu = grv.hww();
                            } catch (Throwable unused) {
                                this.f37572hu = "default";
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (!this.f37573hv.booleanValue() || bs.hww() == null) {
            return;
        }
        bs.hv().hww(new tq() { // from class: com.bytedance.sdk.openadsdk.omn.hww.tq.hww.1
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            @Nullable
            public sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("session_id", hww.this.f37572hu);
                jSONObject.put("is_success", z10);
                jSONObject.put("error_code", i10);
                jSONObject.put("error_msg", TextUtils.isEmpty(str) ? hww.tq(th2) : str);
                jSONObject.put("has_setting", vhb.sd().jy() > 0);
                return vy.tq().hww("gid_status").tq(jSONObject.toString());
            }
        }, false);
    }
}
