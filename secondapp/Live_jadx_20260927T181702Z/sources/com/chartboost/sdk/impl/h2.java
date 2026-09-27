package com.chartboost.sdk.impl;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h2 implements hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39056a;

    public h2() {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        this.f39056a = string;
    }

    @Override // com.chartboost.sdk.impl.hh
    public final String a() {
        return this.f39056a;
    }
}
