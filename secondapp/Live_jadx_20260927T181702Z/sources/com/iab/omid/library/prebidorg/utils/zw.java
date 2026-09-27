package com.iab.omid.library.prebidorg.utils;

import android.text.TextUtils;
import com.iab.omid.library.prebidorg.adsession.zc;
import com.iab.omid.library.prebidorg.adsession.zf;
import com.iab.omid.library.prebidorg.adsession.zy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zw {
    public static void zr(zf zfVar) {
        if (zfVar.zy()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void zs(zf zfVar) {
        if (zfVar.zf()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    private static void zt(zf zfVar) {
        if (!zfVar.zf()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void zu(zf zfVar) {
        if (!zfVar.zd()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void zv(zf zfVar) {
        if (!zfVar.ze()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void zw(zf zfVar) {
        if (zfVar.zc().zs() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void zx(zf zfVar) {
        if (zfVar.zc().zt() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    public static void zz() {
        if (!com.iab.omid.library.prebidorg.zz.zz()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void zz(zc zcVar, com.iab.omid.library.prebidorg.adsession.zv zvVar, zy zyVar) {
        if (zcVar == zc.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zvVar == com.iab.omid.library.prebidorg.adsession.zv.DEFINED_BY_JAVASCRIPT && zcVar == zc.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zyVar == zy.DEFINED_BY_JAVASCRIPT && zcVar == zc.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void zz(zf zfVar) {
        zt(zfVar);
        zr(zfVar);
    }

    public static void zz(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void zz(String str, int i10, String str2) {
        if (str.length() > i10) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void zz(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
