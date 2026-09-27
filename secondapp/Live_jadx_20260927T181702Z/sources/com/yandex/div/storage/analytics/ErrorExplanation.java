package com.yandex.div.storage.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ErrorExplanation {

    @m
    private final String details;

    @l
    private final String shortReason;

    public ErrorExplanation(@l String str, @m String str2) {
        this.shortReason = str;
        this.details = str2;
    }

    @l
    public final Map<String, String> getAllDetails() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.details;
        if (str != null) {
            linkedHashMap.put(c.channelApi, str);
        }
        return linkedHashMap;
    }

    @l
    public final String getShortReason() {
        return this.shortReason;
    }

    public /* synthetic */ ErrorExplanation(String str, String str2, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
