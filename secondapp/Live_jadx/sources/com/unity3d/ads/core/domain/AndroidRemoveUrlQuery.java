package com.unity3d.ads.core.domain;

import android.net.Uri;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    @l
    public String invoke(@l String url) {
        m0.p(url, "url");
        String string = Uri.parse(url).buildUpon().clearQuery().build().toString();
        m0.o(string, "parse(url).buildUpon().c…uery().build().toString()");
        return string;
    }
}
