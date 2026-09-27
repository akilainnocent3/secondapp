package com.bytedance.adsdk.tq.hv;

import android.graphics.PointF;
import android.util.JsonReader;
import c2.j;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;
import zi.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class rs implements npz<com.bytedance.adsdk.tq.sd.tq> {
    public static final rs hww = new rs();

    private rs() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.tq.hv.npz
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.tq.sd.tq tq(JsonReader jsonReader, float f10) throws IOException {
        com.bytedance.adsdk.tq.sd.tq.hww hwwVar = com.bytedance.adsdk.tq.sd.tq.hww.CENTER;
        jsonReader.beginObject();
        com.bytedance.adsdk.tq.sd.tq.hww hwwVar2 = hwwVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iHww = 0;
        int iHww2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case 102:
                    if (strNextName.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                        b10 = 0;
                    }
                    break;
                case 106:
                    if (strNextName.equals(j.f22221a)) {
                        b10 = 1;
                    }
                    break;
                case 115:
                    if (strNextName.equals("s")) {
                        b10 = 2;
                    }
                    break;
                case 116:
                    if (strNextName.equals("t")) {
                        b10 = 3;
                    }
                    break;
                case 3261:
                    if (strNextName.equals("fc")) {
                        b10 = 4;
                    }
                    break;
                case 3452:
                    if (strNextName.equals("lh")) {
                        b10 = 5;
                    }
                    break;
                case 3463:
                    if (strNextName.equals("ls")) {
                        b10 = 6;
                    }
                    break;
                case 3543:
                    if (strNextName.equals("of")) {
                        b10 = 7;
                    }
                    break;
                case 3587:
                    if (strNextName.equals("ps")) {
                        b10 = 8;
                    }
                    break;
                case 3664:
                    if (strNextName.equals("sc")) {
                        b10 = 9;
                    }
                    break;
                case 3684:
                    if (strNextName.equals("sw")) {
                        b10 = 10;
                    }
                    break;
                case 3687:
                    if (strNextName.equals("sz")) {
                        b10 = c.f161635m;
                    }
                    break;
                case 3710:
                    if (strNextName.equals("tr")) {
                        b10 = c.f161636n;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 1:
                    int iNextInt2 = jsonReader.nextInt();
                    hwwVar2 = com.bytedance.adsdk.tq.sd.tq.hww.CENTER;
                    if (iNextInt2 <= hwwVar2.ordinal() && iNextInt2 >= 0) {
                        hwwVar2 = com.bytedance.adsdk.tq.sd.tq.hww.values()[iNextInt2];
                    }
                    break;
                case 2:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    strNextString = jsonReader.nextString();
                    break;
                case 4:
                    iHww = mrs.hww(jsonReader);
                    break;
                case 5:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 8:
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case 9:
                    iHww2 = mrs.hww(jsonReader);
                    break;
                case 10:
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case 11:
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case 12:
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.tq.sd.tq(strNextString, strNextString2, fNextDouble, hwwVar2, iNextInt, fNextDouble2, fNextDouble3, iHww, iHww2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
