package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import dr.w2;
import nv.o0;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface WebViewBridge {
    @l
    o0<Invocation> getOnInvocation();

    void handleCallback(@l String str, @l String str2, @l String str3);

    void handleInvocation(@l String str);

    @m
    Object request(@l String str, @l String str2, @l Object[] objArr, @l f<? super Object[]> fVar);

    @m
    Object sendEvent(@l WebViewEvent webViewEvent, @l f<? super w2> fVar);
}
