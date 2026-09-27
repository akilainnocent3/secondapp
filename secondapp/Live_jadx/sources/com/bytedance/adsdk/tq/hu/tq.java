package com.bytedance.adsdk.tq.hu;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq {
    private static float hww(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float tq(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int hww(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float fTq = tq(((i10 >> 16) & 255) / 255.0f);
        float fTq2 = tq(((i10 >> 8) & 255) / 255.0f);
        float fTq3 = tq((i10 & 255) / 255.0f);
        float fTq4 = tq(((i11 >> 16) & 255) / 255.0f);
        float f12 = f11 + (((((i11 >> 24) & 255) / 255.0f) - f11) * f10);
        float fTq5 = fTq2 + ((tq(((i11 >> 8) & 255) / 255.0f) - fTq2) * f10);
        float fTq6 = fTq3 + (f10 * (tq((i11 & 255) / 255.0f) - fTq3));
        return (Math.round(hww(fTq + ((fTq4 - fTq) * f10)) * 255.0f) << 16) | (Math.round(f12 * 255.0f) << 24) | (Math.round(hww(fTq5) * 255.0f) << 8) | Math.round(hww(fTq6) * 255.0f);
    }
}
