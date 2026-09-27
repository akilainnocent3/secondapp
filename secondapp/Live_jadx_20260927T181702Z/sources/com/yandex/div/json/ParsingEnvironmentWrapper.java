package com.yandex.div.json;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.Set;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParsingEnvironmentWrapper implements ParsingEnvironment {

    @l
    private final KeyWatchingTemplateProvider _templates;

    @l
    private final ParsingErrorLogger logger;

    public ParsingEnvironmentWrapper(@l ParsingEnvironment parsingEnvironment, @l ParsingErrorLogger parsingErrorLogger) {
        this.logger = parsingErrorLogger;
        this._templates = new KeyWatchingTemplateProvider(parsingEnvironment.getTemplates());
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public /* synthetic */ boolean getAllowPropertyOverride() {
        return com.yandex.div.serialization.b.a(this);
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @l
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @l
    public final Set<String> getRequestedKeys() {
        return this._templates.getRequestedKeys();
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @l
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this._templates;
    }
}
