package com.yandex.div.evaluable;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class MissingVariableException extends EvaluableException {

    @l
    private final String variableName;

    public /* synthetic */ MissingVariableException(String str, Exception exc, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }

    @l
    public final String getVariableName() {
        return this.variableName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingVariableException(@l String variableName, @m Exception exc) {
        super("Variable '" + variableName + "' is missing.", exc);
        m0.p(variableName, "variableName");
        this.variableName = variableName;
    }
}
