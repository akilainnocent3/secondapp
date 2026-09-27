package com.yandex.div.internal.parser;

import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParsingEnvironmentImpl implements ParsingEnvironment {

    @oy.l
    private final ParsingErrorLogger logger;

    @oy.l
    private final TemplateProvider<JsonTemplate<?>> templates;

    /* JADX WARN: Multi-variable type inference failed */
    public ParsingEnvironmentImpl(@oy.l TemplateProvider<? extends JsonTemplate<?>> templateProvider, @oy.l ParsingErrorLogger parsingErrorLogger) {
        this.templates = templateProvider;
        this.logger = parsingErrorLogger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public /* synthetic */ boolean getAllowPropertyOverride() {
        return com.yandex.div.serialization.b.a(this);
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @oy.l
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @oy.l
    public TemplateProvider<JsonTemplate<?>> getTemplates() {
        return this.templates;
    }
}
