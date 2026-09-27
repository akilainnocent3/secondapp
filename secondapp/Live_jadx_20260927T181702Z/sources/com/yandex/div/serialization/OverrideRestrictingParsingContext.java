package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class OverrideRestrictingParsingContext implements ParsingContext, ParsingContextWrapper {

    @l
    private final ParsingContext baseContext;

    public OverrideRestrictingParsingContext(@l ParsingContext parsingContext) {
        this.baseContext = parsingContext;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public boolean getAllowPropertyOverride() {
        return false;
    }

    @Override // com.yandex.div.serialization.ParsingContextWrapper
    @l
    public ParsingContext getBaseContext() {
        return this.baseContext;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @l
    public ParsingErrorLogger getLogger() {
        return this.baseContext.getLogger();
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @l
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this.baseContext.getTemplates();
    }
}
