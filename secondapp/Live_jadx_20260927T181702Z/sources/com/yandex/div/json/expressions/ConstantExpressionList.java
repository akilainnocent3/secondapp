package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import dr.w2;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ConstantExpressionList<T> implements ExpressionList<T> {

    @l
    private final List<T> values;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstantExpressionList(@l List<? extends T> list) {
        this.values = list;
    }

    public boolean equals(@m Object obj) {
        return (obj instanceof ConstantExpressionList) && m0.g(this.values, ((ConstantExpressionList) obj).values);
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @l
    public List<T> evaluate(@l ExpressionResolver expressionResolver) {
        return this.values;
    }

    @l
    public final List<T> getValues$div_data_release() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() * 16;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @l
    public Disposable observe(@l ExpressionResolver expressionResolver, @l ds.l<? super List<? extends T>, w2> lVar) {
        return Disposable.NULL;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @l
    public Disposable observeAndGet(@l ExpressionResolver expressionResolver, @l ds.l<? super List<? extends T>, w2> lVar) {
        lVar.invoke(this.values);
        return Disposable.NULL;
    }
}
