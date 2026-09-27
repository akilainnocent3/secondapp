package com.bytedance.adsdk.tq.hv;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
class hnv {
    public static <T> List<com.bytedance.adsdk.tq.vgm.hww<T>> hww(JsonReader jsonReader, com.bytedance.adsdk.tq.vgm vgmVar, float f10, npz<T> npzVar, boolean z10) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.tq.vgm vgmVar2;
        float f11;
        npz<T> npzVar2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            vgmVar.hww("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.tq.vgm vgmVar3 = vgmVar;
                    float f12 = f10;
                    npz<T> npzVar3 = npzVar;
                    boolean z12 = z10;
                    com.bytedance.adsdk.tq.vgm.hww hwwVarHww = omn.hww(jsonReader3, vgmVar3, f12, npzVar3, false, z12);
                    jsonReader2 = jsonReader3;
                    vgmVar2 = vgmVar3;
                    f11 = f12;
                    npzVar2 = npzVar3;
                    z11 = z12;
                    arrayList.add(hwwVarHww);
                } else {
                    jsonReader2 = jsonReader;
                    vgmVar2 = vgmVar;
                    f11 = f10;
                    npzVar2 = npzVar;
                    z11 = z10;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(omn.hww(jsonReader2, vgmVar2, f11, npzVar2, true, z11));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                vgmVar = vgmVar2;
                f10 = f11;
                npzVar = npzVar2;
                z10 = z11;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(omn.hww(jsonReader4, vgmVar, f10, npzVar, false, z10));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        hww(arrayList);
        return arrayList;
    }

    public static <T> void hww(List<? extends com.bytedance.adsdk.tq.vgm.hww<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.bytedance.adsdk.tq.vgm.hww<T> hwwVar = list.get(i11);
            i11++;
            com.bytedance.adsdk.tq.vgm.hww<T> hwwVar2 = list.get(i11);
            hwwVar.vgm = Float.valueOf(hwwVar2.f32346hu);
            if (hwwVar.f32352tq == null && (t10 = hwwVar2.hww) != null) {
                hwwVar.f32352tq = t10;
                if (hwwVar instanceof com.bytedance.adsdk.tq.hww.tq.rs) {
                    ((com.bytedance.adsdk.tq.hww.tq.rs) hwwVar).hww();
                }
            }
        }
        com.bytedance.adsdk.tq.vgm.hww<T> hwwVar3 = list.get(i10);
        if ((hwwVar3.hww == null || hwwVar3.f32352tq == null) && list.size() > 1) {
            list.remove(hwwVar3);
        }
    }
}
