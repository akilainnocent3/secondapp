package com.bytedance.adsdk.tq.hv;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class syb implements npz<com.bytedance.adsdk.tq.sd.tq.khx> {
    public static final syb hww = new syb();

    private syb() {
    }

    @Override // com.bytedance.adsdk.tq.hv.npz
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.tq.sd.tq.khx tq(JsonReader jsonReader, float f10) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listHww = null;
        List<PointF> listHww2 = null;
        List<PointF> listHww3 = null;
        boolean zNextBoolean = false;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                if (listHww == null || listHww2 == null || listHww3 == null) {
                    throw new IllegalArgumentException("Shape data was missing information.");
                }
                if (listHww.isEmpty()) {
                    return new com.bytedance.adsdk.tq.sd.tq.khx(new PointF(), false, Collections.EMPTY_LIST);
                }
                int size = listHww.size();
                PointF pointF = listHww.get(0);
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 1; i10 < size; i10++) {
                    PointF pointF2 = listHww.get(i10);
                    int i11 = i10 - 1;
                    arrayList.add(new com.bytedance.adsdk.tq.sd.hww(com.bytedance.adsdk.tq.hu.hv.hww(listHww.get(i11), listHww3.get(i11)), com.bytedance.adsdk.tq.hu.hv.hww(pointF2, listHww2.get(i10)), pointF2));
                }
                if (zNextBoolean) {
                    PointF pointF3 = listHww.get(0);
                    int i12 = size - 1;
                    arrayList.add(new com.bytedance.adsdk.tq.sd.hww(com.bytedance.adsdk.tq.hu.hv.hww(listHww.get(i12), listHww3.get(i12)), com.bytedance.adsdk.tq.hu.hv.hww(pointF3, listHww2.get(0)), pointF3));
                }
                return new com.bytedance.adsdk.tq.sd.tq.khx(pointF, zNextBoolean, arrayList);
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "i":
                    listHww2 = mrs.hww(jsonReader, f10);
                    break;
                case "o":
                    listHww3 = mrs.hww(jsonReader, f10);
                    break;
                case "v":
                    listHww = mrs.hww(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}
