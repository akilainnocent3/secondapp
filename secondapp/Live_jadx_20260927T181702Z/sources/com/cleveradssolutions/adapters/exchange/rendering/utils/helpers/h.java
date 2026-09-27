package com.cleveradssolutions.adapters.exchange.rendering.utils.helpers;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "inlineVideo":
            case "calendar":
                return true;
            case "sms":
            case "tel":
                return com.cleveradssolutions.adapters.exchange.rendering.sdk.d.a().b().e();
            case "storePicture":
                return com.cleveradssolutions.adapters.exchange.rendering.sdk.d.a().b().zz();
            case "location":
                return com.cleveradssolutions.adapters.exchange.rendering.sdk.d.a().b().f();
            default:
                return false;
        }
    }
}
