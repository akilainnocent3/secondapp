package com.yandex.div.json;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParsingEnvironmentExtensionsKt {
    @l
    public static final ParsingEnvironmentWrapper withLogger(@l ParsingEnvironment parsingEnvironment, @l ParsingErrorLogger parsingErrorLogger) {
        return new ParsingEnvironmentWrapper(parsingEnvironment, parsingErrorLogger);
    }
}
