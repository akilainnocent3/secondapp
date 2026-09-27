package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fj extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f38961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(String message, Integer num) {
        super(message);
        kotlin.jvm.internal.m0.p(message, "message");
        this.f38961b = num;
    }

    public final Integer a() {
        return this.f38961b;
    }
}
