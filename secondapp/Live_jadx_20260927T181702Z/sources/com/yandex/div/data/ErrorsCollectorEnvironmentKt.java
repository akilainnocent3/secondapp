package com.yandex.div.data;

import com.yandex.div.json.ParsingEnvironment;
import fr.h0;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ErrorsCollectorEnvironmentKt {
    @l
    public static final List<Exception> collectErrors(@l ParsingEnvironment parsingEnvironment) {
        return parsingEnvironment instanceof ErrorsCollectorEnvironment ? ((ErrorsCollectorEnvironment) parsingEnvironment).collectErrors() : h0.J();
    }

    @l
    public static final ErrorsCollectorEnvironment withErrorsCollector(@l ParsingEnvironment parsingEnvironment) {
        return new ErrorsCollectorEnvironment(parsingEnvironment);
    }
}
