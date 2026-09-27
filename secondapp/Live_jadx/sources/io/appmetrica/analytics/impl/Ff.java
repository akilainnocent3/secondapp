package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.Application;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@DoNotInline
@TargetApi(28)
public final class Ff implements Df {
    @Override // io.appmetrica.analytics.impl.Df
    @oy.m
    public String a() {
        return Application.getProcessName();
    }
}
