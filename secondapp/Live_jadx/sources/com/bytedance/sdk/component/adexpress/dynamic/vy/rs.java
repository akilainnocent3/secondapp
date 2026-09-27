package com.bytedance.sdk.component.adexpress.dynamic.vy;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs {
    public float hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public float f34258tq;

    public rs(float f10, float f11) {
        this.hww = f10;
        this.f34258tq = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            rs rsVar = (rs) obj;
            if (Float.compare(rsVar.hww, this.hww) == 0 && Float.compare(rsVar.f34258tq, this.f34258tq) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.hww), Float.valueOf(this.f34258tq)});
    }
}
