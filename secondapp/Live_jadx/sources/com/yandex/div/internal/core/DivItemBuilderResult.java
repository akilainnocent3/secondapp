package com.yandex.div.internal.core;

import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.jvm.internal.m0;
import mq.e0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivItemBuilderResult {

    @l
    private final e0 div;

    @l
    private final ExpressionResolver expressionResolver;

    public DivItemBuilderResult(@l e0 e0Var, @l ExpressionResolver expressionResolver) {
        this.div = e0Var;
        this.expressionResolver = expressionResolver;
    }

    public static /* synthetic */ DivItemBuilderResult copy$default(DivItemBuilderResult divItemBuilderResult, e0 e0Var, ExpressionResolver expressionResolver, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = divItemBuilderResult.div;
        }
        if ((i10 & 2) != 0) {
            expressionResolver = divItemBuilderResult.expressionResolver;
        }
        return divItemBuilderResult.copy(e0Var, expressionResolver);
    }

    @l
    public final e0 component1() {
        return this.div;
    }

    @l
    public final ExpressionResolver component2() {
        return this.expressionResolver;
    }

    @l
    public final DivItemBuilderResult copy(@l e0 e0Var, @l ExpressionResolver expressionResolver) {
        return new DivItemBuilderResult(e0Var, expressionResolver);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivItemBuilderResult)) {
            return false;
        }
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
        return m0.g(this.div, divItemBuilderResult.div) && m0.g(this.expressionResolver, divItemBuilderResult.expressionResolver);
    }

    @l
    public final e0 getDiv() {
        return this.div;
    }

    @l
    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    public int hashCode() {
        return (this.div.hashCode() * 31) + this.expressionResolver.hashCode();
    }

    @l
    public String toString() {
        return "DivItemBuilderResult(div=" + this.div + ", expressionResolver=" + this.expressionResolver + ')';
    }
}
