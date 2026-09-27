package com.bytedance.adsdk.tq.hv;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class yt implements npz<com.bytedance.adsdk.tq.vgm.sd> {
    public static final yt hww = new yt();

    private yt() {
    }

    @Override // com.bytedance.adsdk.tq.hv.npz
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.tq.vgm.sd tq(JsonReader jsonReader, float f10) throws IOException {
        boolean z10 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z10) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z10) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.tq.vgm.sd((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}
