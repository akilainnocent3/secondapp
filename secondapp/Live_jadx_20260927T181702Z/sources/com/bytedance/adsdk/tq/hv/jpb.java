package com.bytedance.adsdk.tq.hv;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class jpb implements npz<Integer> {
    public static final jpb hww = new jpb();

    private jpb() {
    }

    @Override // com.bytedance.adsdk.tq.hv.npz
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public Integer tq(JsonReader jsonReader, float f10) throws IOException {
        return Integer.valueOf(Math.round(mrs.tq(jsonReader) * f10));
    }
}
