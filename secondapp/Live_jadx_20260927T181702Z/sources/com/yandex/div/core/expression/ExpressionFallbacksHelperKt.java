package com.yandex.div.core.expression;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import dr.w2;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ExpressionFallbacksHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isExpressionResolveFail(ParsingException parsingException) {
        return parsingException.getReason() == ParsingExceptionReason.MISSING_VARIABLE || parsingException.getReason() == ParsingExceptionReason.INVALID_VALUE || parsingException.getReason() == ParsingExceptionReason.TYPE_MISMATCH;
    }

    public static final void suppressExpressionErrors(@l ds.a<w2> aVar) {
        try {
            aVar.invoke();
        } catch (ParsingException e10) {
            if (!isExpressionResolveFail(e10)) {
                throw e10;
            }
        }
    }
}
