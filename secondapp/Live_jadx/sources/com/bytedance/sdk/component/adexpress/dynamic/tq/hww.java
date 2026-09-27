package com.bytedance.sdk.component.adexpress.dynamic.tq;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.vy.vgm;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    public static int hww(vgm vgmVar) {
        if (vgmVar == null) {
            return 0;
        }
        String strQt = vgmVar.qt();
        String strAeg = vgmVar.aeg();
        if (TextUtils.isEmpty(strAeg) || TextUtils.isEmpty(strQt) || !strAeg.equals("creative")) {
            return 0;
        }
        if (strQt.equals("shake")) {
            return 2;
        }
        if (strQt.equals("twist")) {
            return 3;
        }
        return strQt.equals("slide") ? 1 : 0;
    }
}
