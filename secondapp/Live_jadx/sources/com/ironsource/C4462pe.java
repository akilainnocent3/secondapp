package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4462pe extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final IronSourceError f63322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4462pe(@oy.l IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.m0.p(error, "error");
        this.f63322a = error;
        this.f63323b = error.getErrorCode();
    }

    @oy.l
    public final IronSourceError a() {
        return this.f63322a;
    }

    public final int b() {
        return this.f63323b;
    }
}
