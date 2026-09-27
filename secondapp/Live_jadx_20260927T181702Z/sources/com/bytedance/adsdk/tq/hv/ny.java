package com.bytedance.adsdk.tq.hv;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class ny implements npz<Float> {
    public static final ny hww = new ny();

    private ny() {
    }

    @Override // com.bytedance.adsdk.tq.hv.npz
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public Float tq(JsonReader jsonReader, float f10) throws IOException {
        return Float.valueOf(mrs.tq(jsonReader) * f10);
    }
}
