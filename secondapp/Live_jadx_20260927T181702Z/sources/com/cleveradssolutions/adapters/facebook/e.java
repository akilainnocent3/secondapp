package com.cleveradssolutions.adapters.facebook;

import com.cleveradssolutions.mediation.core.k;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.ExtraHints;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final wc.b a(AdError adError) {
        wc.b bVar;
        String str;
        m0.p(adError, "<this>");
        int errorCode = adError.getErrorCode();
        if (errorCode == 1000) {
            bVar = wc.b.f142698e;
            str = "NO_CONNECTION";
        } else if (errorCode == 1001) {
            bVar = wc.b.f142696c;
            str = "NO_FILL";
        } else {
            if (errorCode != 7001) {
                return errorCode != 7003 ? new wc.b(0, adError.getErrorMessage()) : new wc.b(10, adError.getErrorMessage());
            }
            bVar = wc.b.f142701h;
            str = "NOT_READY";
        }
        m0.o(bVar, str);
        return bVar;
    }

    public static final void b(Ad ad2, k request) {
        m0.p(ad2, "<this>");
        m0.p(request, "request");
        String strK0 = request.K0("meta_watermark");
        if (strK0 != null) {
            ad2.setExtraHints(new ExtraHints.Builder().mediationData(strK0).build());
        }
    }
}
