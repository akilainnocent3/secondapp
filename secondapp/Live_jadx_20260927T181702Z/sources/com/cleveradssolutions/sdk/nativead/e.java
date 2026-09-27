package com.cleveradssolutions.sdk.nativead;

import k.j0;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    @j0
    public void a(@l d nativeAd, @l com.cleveradssolutions.sdk.a ad2) {
        m0.p(nativeAd, "nativeAd");
        m0.p(ad2, "ad");
    }

    @j0
    public void b(@l wc.b error) {
        m0.p(error, "error");
    }

    @j0
    public void c(@l d nativeAd, @l wc.b error) {
        m0.p(nativeAd, "nativeAd");
        m0.p(error, "error");
    }

    @j0
    public abstract void d(@l d dVar, @l com.cleveradssolutions.sdk.a aVar);
}
