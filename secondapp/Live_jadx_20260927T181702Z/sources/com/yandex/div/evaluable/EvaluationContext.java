package com.yandex.div.evaluable;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class EvaluationContext {

    @l
    private final FunctionProvider functionProvider;

    @l
    private final StoredValueProvider storedValueProvider;

    @l
    private final VariableProvider variableProvider;

    @l
    private final WarningSender warningSender;

    public EvaluationContext(@l VariableProvider variableProvider, @l StoredValueProvider storedValueProvider, @l FunctionProvider functionProvider, @l WarningSender warningSender) {
        m0.p(variableProvider, "variableProvider");
        m0.p(storedValueProvider, "storedValueProvider");
        m0.p(functionProvider, "functionProvider");
        m0.p(warningSender, "warningSender");
        this.variableProvider = variableProvider;
        this.storedValueProvider = storedValueProvider;
        this.functionProvider = functionProvider;
        this.warningSender = warningSender;
    }

    @l
    public final FunctionProvider getFunctionProvider() {
        return this.functionProvider;
    }

    @l
    public final StoredValueProvider getStoredValueProvider() {
        return this.storedValueProvider;
    }

    @l
    public final VariableProvider getVariableProvider() {
        return this.variableProvider;
    }

    @l
    public final WarningSender getWarningSender() {
        return this.warningSender;
    }
}
