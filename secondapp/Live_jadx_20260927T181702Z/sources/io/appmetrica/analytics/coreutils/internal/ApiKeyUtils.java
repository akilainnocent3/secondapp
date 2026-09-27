package io.appmetrica.analytics.coreutils.internal;

import cs.o;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ApiKeyUtils {

    @l
    public static final ApiKeyUtils INSTANCE = new ApiKeyUtils();

    private ApiKeyUtils() {
    }

    @l
    @o
    public static final String createPartialApiKey(@m String str) {
        if (str == null || str.length() != 36) {
            return "undefined";
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb2.toString();
    }
}
