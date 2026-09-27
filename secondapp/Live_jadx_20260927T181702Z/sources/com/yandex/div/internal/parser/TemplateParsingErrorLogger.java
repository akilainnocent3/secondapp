package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingErrorLogger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TemplateParsingErrorLogger implements ParsingErrorLogger {

    @oy.l
    private final ParsingErrorLogger logger;

    @oy.l
    private final String templateId;

    public TemplateParsingErrorLogger(@oy.l ParsingErrorLogger parsingErrorLogger, @oy.l String str) {
        this.logger = parsingErrorLogger;
        this.templateId = str;
    }

    @Override // com.yandex.div.json.ParsingErrorLogger
    public void logError(@oy.l Exception exc) {
        this.logger.logTemplateError(exc, this.templateId);
    }

    @Override // com.yandex.div.json.ParsingErrorLogger
    public /* synthetic */ void logTemplateError(Exception exc, String str) {
        com.yandex.div.json.c.a(this, exc, str);
    }
}
