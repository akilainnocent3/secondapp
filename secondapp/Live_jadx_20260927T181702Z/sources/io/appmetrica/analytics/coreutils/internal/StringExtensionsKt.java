package io.appmetrica.analytics.coreutils.internal;

import cv.e;
import java.util.Locale;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class StringExtensionsKt {
    @l
    public static final String replaceFirstCharWithTitleCase(@l String str) {
        return replaceFirstCharWithTitleCase(str, Locale.US);
    }

    @l
    public static final String replaceFirstCharWithTitleCase(@l String str, @l Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? e.v(cCharAt, locale) : String.valueOf(cCharAt)));
        sb2.append(str.substring(1));
        return sb2.toString();
    }
}
