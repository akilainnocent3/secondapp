package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import cs.g;
import dr.w2;
import java.util.List;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface ExpressionResolver {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    @g
    public static final ExpressionResolver EMPTY = new ExpressionResolver() { // from class: com.yandex.div.json.expressions.ExpressionResolver$Companion$EMPTY$1
        @Override // com.yandex.div.json.expressions.ExpressionResolver
        @m
        public <R, T> T get(@l String str, @l String str2, @l Evaluable evaluable, @m ds.l<? super R, ? extends T> lVar, @l ValueValidator<T> valueValidator, @l TypeHelper<T> typeHelper, @l ParsingErrorLogger parsingErrorLogger) {
            return null;
        }

        @Override // com.yandex.div.json.expressions.ExpressionResolver
        public /* synthetic */ void notifyResolveFailed(ParsingException parsingException) {
            a.a(this, parsingException);
        }

        @Override // com.yandex.div.json.expressions.ExpressionResolver
        @l
        public Disposable subscribeToExpression(@l String str, @l List<String> list, @l ds.a<w2> aVar) {
            return Disposable.NULL;
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @m
    <R, T> T get(@l String str, @l String str2, @l Evaluable evaluable, @m ds.l<? super R, ? extends T> lVar, @l ValueValidator<T> valueValidator, @l TypeHelper<T> typeHelper, @l ParsingErrorLogger parsingErrorLogger);

    void notifyResolveFailed(@l ParsingException parsingException);

    @l
    Disposable subscribeToExpression(@l String str, @l List<String> list, @l ds.a<w2> aVar);
}
