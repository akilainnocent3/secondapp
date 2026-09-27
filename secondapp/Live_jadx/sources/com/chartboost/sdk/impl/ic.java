package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ic extends fj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(String elementName, Integer num) {
        super("Missing required element: " + elementName + androidx.media3.session.fe.F, num);
        kotlin.jvm.internal.m0.p(elementName, "elementName");
    }

    public /* synthetic */ ic(String str, Integer num, int i10, kotlin.jvm.internal.x xVar) {
        this(str, (i10 & 2) != 0 ? 101 : num);
    }
}
