package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Da {
    public static String a(String fileKey) {
        kotlin.jvm.internal.m0.p(fileKey, "fileKey");
        return "com.im.keyValueStore." + fileKey;
    }

    public static Ea a(Context context, String fileKey) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(fileKey, "fileKey");
        String strA = a(fileKey);
        ConcurrentHashMap concurrentHashMap = Ea.f54559b;
        Ea ea2 = (Ea) concurrentHashMap.get(strA);
        if (ea2 == null) {
            ea2 = new Ea(context, strA);
            Ea ea3 = (Ea) concurrentHashMap.putIfAbsent(strA, ea2);
            if (ea3 != null) {
                return ea3;
            }
        }
        return ea2;
    }
}
