package com.unity3d.ads.core.utils;

import cv.j0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class GetMemoryValueFromStringKt {
    public static final long getMemoryValueFromString(@m String str) {
        Long lR1;
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String strGroup = null;
        while (matcher.find()) {
            strGroup = matcher.group(1);
        }
        if (strGroup == null || (lR1 = j0.r1(strGroup)) == null) {
            return -1L;
        }
        return lR1.longValue();
    }
}
