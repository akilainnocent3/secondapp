package com.cleveradssolutions.adapters.vungle;

import com.vungle.ads.VungleError;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final wc.b a(VungleError vungleError) {
        wc.b bVar;
        String str;
        m0.p(vungleError, "<this>");
        switch (vungleError.getCode()) {
            case 2:
            case 201:
            case 207:
            case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
            case 500:
            case AD_PUBLISHER_MISMATCH_VALUE:
                return new wc.b(10, vungleError.getErrorMessage());
            case 6:
                bVar = wc.b.f142700g;
                str = "NOT_INITIALIZED";
                break;
            case AD_NOT_LOADED_VALUE:
                bVar = wc.b.f142701h;
                str = "NOT_READY";
                break;
            case PLACEMENT_SLEEP_VALUE:
            case 10001:
            case AD_LOAD_TOO_FREQUENTLY_VALUE:
                bVar = wc.b.f142696c;
                str = "NO_FILL";
                break;
            case 217:
                bVar = wc.b.f142697d;
                str = "TIMEOUT";
                break;
            case 304:
            case 307:
                bVar = wc.b.f142702i;
                str = "EXPIRED";
                break;
            default:
                return new wc.b(0, vungleError.getErrorMessage());
        }
        m0.o(bVar, str);
        return bVar;
    }
}
