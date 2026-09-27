package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {
    private static volatile sd hww;

    private sd() {
    }

    public static sd hww() {
        if (hww == null) {
            synchronized (sd.class) {
                try {
                    if (hww == null) {
                        hww = new sd();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }

    public String tq(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.vy.vy.tq("ttopenadsdk", str, str2);
    }

    public int tq(String str, int i10) {
        return com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("ttopenadsdk", str, i10);
    }

    public Long tq(String str, long j10) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("ttopenadsdk", str, j10));
    }

    public void hww(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("ttopenadsdk", str, str2);
    }

    public void hww(String str, int i10) {
        com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("ttopenadsdk", str, Integer.valueOf(i10));
    }

    public void hww(String str, long j10) {
        com.bytedance.sdk.openadsdk.multipro.vy.vy.hww("ttopenadsdk", str, Long.valueOf(j10));
    }
}
