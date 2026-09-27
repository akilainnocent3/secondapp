package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import com.yandex.div.json.ParsingException;
import dr.w2;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface ExpressionList<T> {
    @l
    List<T> evaluate(@l ExpressionResolver expressionResolver) throws ParsingException;

    @l
    Disposable observe(@l ExpressionResolver expressionResolver, @l ds.l<? super List<? extends T>, w2> lVar);

    @l
    Disposable observeAndGet(@l ExpressionResolver expressionResolver, @l ds.l<? super List<? extends T>, w2> lVar);
}
