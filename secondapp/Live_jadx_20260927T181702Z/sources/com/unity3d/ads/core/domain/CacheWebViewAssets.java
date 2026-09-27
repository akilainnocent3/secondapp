package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.WebViewConfiguration;
import dr.w2;
import java.io.File;
import java.util.Map;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface CacheWebViewAssets {
    @l
    Map<String, File> getCached();

    @m
    Object invoke(@l WebViewConfiguration webViewConfiguration, @l f<? super w2> fVar);
}
