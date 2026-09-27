package com.unity3d.ads.adplayer;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum HandlerType {
    CALLBACK("handleCallback"),
    INVOCATION("handleInvocation"),
    EVENT("handleEvent");


    @l
    private final String jsPath;

    HandlerType(String str) {
        this.jsPath = str;
    }

    @l
    public final String getJsPath() {
        return this.jsPath;
    }
}
