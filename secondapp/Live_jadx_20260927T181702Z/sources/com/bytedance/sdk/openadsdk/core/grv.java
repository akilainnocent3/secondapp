package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class grv {
    private static final AtomicInteger hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static final AtomicInteger f36147sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static final AtomicInteger f36148tq;
    private static final AtomicInteger vy;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        hww = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        f36148tq = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        f36147sd = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        vy = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void hww() {
        try {
            long jHww = com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file", "upload_time_key", 0L);
            if (jHww <= 0 || System.currentTimeMillis() - jHww < 86400000) {
                if (jHww <= 0 || jHww > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            tq();
            synchronized (grv.class) {
                hww.set(0);
                f36148tq.set(0);
                f36147sd.set(0);
                vy.set(0);
                com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    private static void tq() {
        final int i10 = hww.get();
        final int i11 = f36148tq.get();
        final int i12 = f36147sd.get();
        final int i13 = vy.get();
        com.bytedance.sdk.openadsdk.wgt.sd.hww("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.wgt.tq() { // from class: com.bytedance.sdk.openadsdk.core.grv.1
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            @Nullable
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i10);
                    jSONObject.put("encrypt_fail_count", i11);
                    jSONObject.put("decrypt_success_count", i12);
                    jSONObject.put("decrypt_fail_count", i13);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.wgt.hww.vy.tq().hww("crypt_v4_statistics").tq(jSONObject.toString());
            }
        });
    }

    public static synchronized void tq(boolean z10) {
        try {
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(hww.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(f36148tq.incrementAndGet()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void hww(final int i10, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i11) {
        com.bytedance.sdk.openadsdk.wgt.sd.hww("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.wgt.tq() { // from class: com.bytedance.sdk.openadsdk.core.grv.2
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            @Nullable
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i10);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i11);
                    if (i11 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.wgt.hww.vy.tq().hww("crypt_v4_fail").tq(jSONObject.toString());
            }
        });
    }

    public static synchronized void hww(boolean z10) {
        try {
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(f36147sd.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(f36147sd.incrementAndGet()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void hww(JSONObject jSONObject) {
        tq(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
