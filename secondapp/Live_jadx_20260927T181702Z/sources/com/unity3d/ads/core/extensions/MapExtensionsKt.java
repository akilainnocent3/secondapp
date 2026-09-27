package com.unity3d.ads.core.extensions;

import cv.g;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nMapExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapExtensions.kt\ncom/unity3d/ads/core/extensions/MapExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,9:1\n1#2:10\n*E\n"})
public final class MapExtensionsKt {
    public static final int sizeInKb(@l Map<String, String> map) {
        m0.p(map, "<this>");
        Iterator<T> it = map.entrySet().iterator();
        int length = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Charset charset = g.f77202b;
            byte[] bytes = str.getBytes(charset);
            m0.o(bytes, "this as java.lang.String).getBytes(charset)");
            int length2 = bytes.length;
            byte[] bytes2 = str2.getBytes(charset);
            m0.o(bytes2, "this as java.lang.String).getBytes(charset)");
            length += length2 + bytes2.length;
        }
        return length / 1024;
    }
}
