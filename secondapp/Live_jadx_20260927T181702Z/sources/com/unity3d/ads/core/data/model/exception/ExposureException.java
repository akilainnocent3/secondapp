package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ExposureException extends Exception {

    @l
    private final Object[] parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureException(@l String message, @l Object[] parameters) {
        super(message);
        m0.p(message, "message");
        m0.p(parameters, "parameters");
        this.parameters = parameters;
    }

    @l
    public final Object[] getParameters() {
        return this.parameters;
    }
}
