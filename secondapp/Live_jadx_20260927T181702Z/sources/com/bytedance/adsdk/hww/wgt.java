package com.bytedance.adsdk.hww;

import android.text.TextUtils;
import zi.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class wgt {
    public static Object hww(com.bytedance.adsdk.hww.tq.hww.hww hwwVar) {
        rs rsVarHww;
        if (hwwVar == null || (rsVarHww = hww(hwwVar.hww())) == null) {
            return null;
        }
        return rsVarHww.hww(null, hwwVar.tq());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static rs hww(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1919300188:
                if (str.equals("toNumber")) {
                    b10 = 0;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    b10 = 1;
                }
                break;
            case -1368121510:
                if (str.equals("formatDecimal")) {
                    b10 = 2;
                }
                break;
            case -652088201:
                if (str.equals("modArray")) {
                    b10 = 3;
                }
                break;
            case 3143097:
                if (str.equals("find")) {
                    b10 = 4;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    b10 = 5;
                }
                break;
            case 94642797:
                if (str.equals("chunk")) {
                    b10 = 6;
                }
                break;
            case 96955127:
                if (str.equals("exist")) {
                    b10 = 7;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b10 = 8;
                }
                break;
            case 515198113:
                if (str.equals("decodeUrl")) {
                    b10 = 9;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b10 = 10;
                }
                break;
            case 1508134777:
                if (str.equals("encodeUrl")) {
                    b10 = c.f161635m;
                }
                break;
            case 2056988195:
                if (str.equals("isDigit")) {
                    b10 = c.f161636n;
                }
                break;
        }
        switch (b10) {
            case 0:
                return new ed();
            case 1:
                return new khx();
            case 2:
                return new vgm();
            case 3:
                return new nod();
            case 4:
                return new hu();
            case 5:
                return new vhb();
            case 6:
                return new hww();
            case 7:
                return new hv();
            case 8:
                return new ny();
            case 9:
                return new tq();
            case 10:
                return new weu();
            case 11:
                return new vy();
            case 12:
                return new ok();
            default:
                return null;
        }
    }
}
