package com.bytedance.adsdk.tq.sd;

import za.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hu {
    public final float hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final String f32158sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public final float f32159tq;

    public hu(String str, float f10, float f11) {
        this.f32158sd = str;
        this.f32159tq = f11;
        this.hww = f10;
    }

    public boolean hww(String str) {
        if (this.f32158sd.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f32158sd.endsWith(h.f160939d)) {
            String str2 = this.f32158sd;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
