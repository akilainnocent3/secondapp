package com.unity3d.ads.adplayer;

import android.view.InputEvent;
import dr.w2;
import nv.z0;
import or.f;
import org.json.JSONArray;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface WebViewContainer {
    @m
    Object addJavascriptInterface(@l WebViewBridge webViewBridge, @l String str, @l f<? super w2> fVar);

    @m
    Object destroy(@l f<? super w2> fVar);

    @m
    Object evaluateJavascript(@l HandlerType handlerType, @l JSONArray jSONArray, @l f<? super w2> fVar);

    @l
    z0<InputEvent> getLastInputEvent();

    @m
    Object loadUrl(@l String str, @l f<? super w2> fVar);
}
