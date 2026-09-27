package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LoadWebViewError extends AdPlayerError {

    @l
    private final List<WebViewClientError> errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadWebViewError(@l List<WebViewClientError> errors) {
        super("AdPlayer was not able to load the webview.", null);
        m0.p(errors, "errors");
        this.errors = errors;
    }

    @l
    public final List<WebViewClientError> getErrors() {
        return this.errors;
    }
}
