package com.yandex.div.evaluable;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class IntegerOverflow extends EvaluableException {

    @l
    private final String expression;

    public /* synthetic */ IntegerOverflow(String str, Exception exc, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }

    @l
    public final String getExpression() {
        return this.expression;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegerOverflow(@l String expression, @m Exception exc) {
        super("Failed to evaluate [" + expression + "]. Integer overflow.", exc);
        m0.p(expression, "expression");
        this.expression = expression;
    }
}
