package com.bytedance.adsdk.ugeno.hww;

import n0.w;
import w0.f;
import zi.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum hv {
    TRANSLATE("translate", "translation", "point"),
    TRANSLATE_X("translateX", "translationX", w.b.f115804c),
    TRANSLATE_Y("translateY", "translationY", w.b.f115804c),
    ROTATE_X("rotateX", "rotationX", w.b.f115804c),
    ROTATE_Y("rotateY", "rotationY", w.b.f115804c),
    ROTATE_Z("rotateZ", f.f141740i, w.b.f115804c),
    SCALE("scale", "scale", "point"),
    SCALE_X("scaleX", "scaleX", w.b.f115804c),
    SCALE_Y("scaleY", "scaleY", w.b.f115804c),
    ALPHA("opacity", "alpha", w.b.f115804c),
    BACKGROUND_COLOR("backgroundColor", "backgroundColor", "int"),
    BORDER_RADIUS("borderRadius", "borderRadius", w.b.f115804c),
    RIPPLE("ripple", "ripple", w.b.f115804c),
    SHINE("shine", "shine", w.b.f115804c);


    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private final String f32506bs;
    private final String weu;
    private final String wgt;

    hv(String str, String str2, String str3) {
        this.weu = str;
        this.wgt = str2;
        this.f32506bs = str3;
    }

    public String hww() {
        return this.weu;
    }

    public String sd() {
        return this.f32506bs;
    }

    public String tq() {
        return this.wgt;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static hv hww(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    b10 = 0;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    b10 = 1;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b10 = 2;
                }
                break;
            case -930826704:
                if (str.equals("ripple")) {
                    b10 = 3;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 4;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 5;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    b10 = 6;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b10 = 7;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    b10 = 8;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b10 = 9;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    b10 = 10;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    b10 = c.f161635m;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    b10 = c.f161636n;
                }
                break;
        }
        switch (b10) {
            case 0:
                return TRANSLATE_X;
            case 1:
                return TRANSLATE_Y;
            case 2:
                return ALPHA;
            case 3:
                return RIPPLE;
            case 4:
                return SCALE_X;
            case 5:
                return SCALE_Y;
            case 6:
                return SCALE;
            case 7:
                return TRANSLATE;
            case 8:
                return BACKGROUND_COLOR;
            case 9:
                return BORDER_RADIUS;
            case 10:
                return ROTATE_X;
            case 11:
                return ROTATE_Y;
            case 12:
                return ROTATE_Z;
            default:
                return TRANSLATE_X;
        }
    }
}
