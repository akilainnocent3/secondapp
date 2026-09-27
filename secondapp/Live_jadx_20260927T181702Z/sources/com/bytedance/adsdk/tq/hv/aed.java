package com.bytedance.adsdk.tq.hv;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
class aed {
    public static com.bytedance.adsdk.tq.hww.tq.rs hww(JsonReader jsonReader, com.bytedance.adsdk.tq.vgm vgmVar) throws IOException {
        return new com.bytedance.adsdk.tq.hww.tq.rs(vgmVar, omn.hww(jsonReader, vgmVar, com.bytedance.adsdk.tq.hu.hu.hww(), zvy.hww, jsonReader.peek() == JsonToken.BEGIN_OBJECT, false));
    }
}
