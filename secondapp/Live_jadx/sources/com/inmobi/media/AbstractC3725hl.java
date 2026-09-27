package com.inmobi.media;

import android.os.Build;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.hl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3725hl {
    public static final C4157z5 a(List list) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        return list.size() != 2 ? new C4157z5(0, 0) : new C4157z5(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static final String a(String url) {
        kotlin.jvm.internal.m0.p(url, "url");
        if (Build.VERSION.SDK_INT >= 33) {
            return URLEncoder.encode(url, Charset.defaultCharset());
        }
        return URLEncoder.encode(url);
    }
}
