package com.yandex.div.core.util.validator;

import ds.a;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ExpressionValidator extends BaseValidator {

    @l
    private final a<Boolean> calculateExpression;

    public ExpressionValidator(boolean z10, @l a<Boolean> aVar) {
        super(z10);
        this.calculateExpression = aVar;
    }

    @l
    public final a<Boolean> getCalculateExpression() {
        return this.calculateExpression;
    }

    @Override // com.yandex.div.core.util.validator.BaseValidator
    public boolean validate(@l String str) {
        return (getAllowEmpty() && str.length() == 0) || this.calculateExpression.invoke().booleanValue();
    }
}
