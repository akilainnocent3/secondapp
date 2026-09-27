package com.ironsource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class L4 implements W3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final L4 f59397a = new L4();

    private L4() {
    }

    @Override // com.ironsource.W3
    @oy.l
    public InputStream a(@oy.l String url) throws IOException {
        kotlin.jvm.internal.m0.p(url, "url");
        InputStream inputStreamOpenStream = new URL(url).openStream();
        kotlin.jvm.internal.m0.o(inputStreamOpenStream, "URL(url).openStream()");
        return inputStreamOpenStream;
    }
}
