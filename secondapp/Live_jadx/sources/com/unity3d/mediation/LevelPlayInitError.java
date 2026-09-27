package com.unity3d.mediation;

import com.ironsource.C4426ne;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayInitError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f76296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private final String f76297b;

    public LevelPlayInitError(int i10, @l String errorMessage) {
        m0.p(errorMessage, "errorMessage");
        this.f76296a = i10;
        this.f76297b = errorMessage;
    }

    public final int getErrorCode() {
        return this.f76296a;
    }

    @l
    public final String getErrorMessage() {
        return this.f76297b;
    }

    @l
    public String toString() {
        return "LevelPlayError(errorCode=" + this.f76296a + ", errorMessage='" + this.f76297b + "')";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(@l C4426ne sdkError) {
        this(sdkError.c(), sdkError.d());
        m0.p(sdkError, "sdkError");
    }
}
