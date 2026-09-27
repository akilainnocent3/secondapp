package com.bytedance.adsdk.tq.hv;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
class grv {
    public static com.bytedance.adsdk.tq.sd.tq.rs hww(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.tq.sd.tq.rs.hww hwwVarHww = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    hwwVarHww = com.bytedance.adsdk.tq.sd.tq.rs.hww.hww(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.tq.sd.tq.rs(strNextString, hwwVarHww, zNextBoolean);
    }
}
