package com.unity3d.services.core.network.core;

import android.content.Context;
import kotlin.jvm.internal.m0;
import org.chromium.net.CronetEngine;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CronetEngineBuilderFactory {
    @l
    public final CronetEngine.Builder createCronetEngineBuilder(@l Context context) {
        m0.p(context, "context");
        return new CronetEngine.Builder(context);
    }
}
