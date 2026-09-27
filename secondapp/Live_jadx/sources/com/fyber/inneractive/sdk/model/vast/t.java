package com.fyber.inneractive.sdk.model.vast;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum t {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    MEDIA_TYPE_X_MPEG("application/x-mpegURL"),
    UNKNOWN("unknown");

    private static final Map<String, t> sMediaTypeMap = new HashMap();
    final String mimeType;

    static {
        for (t tVar : values()) {
            sMediaTypeMap.put(tVar.mimeType, tVar);
        }
    }

    t(String str) {
        this.mimeType = str;
    }

    public static t a(String str) {
        Map<String, t> map = sMediaTypeMap;
        return map.containsKey(str) ? map.get(str) : UNKNOWN;
    }
}
