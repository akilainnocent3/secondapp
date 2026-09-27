package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.ArrayList;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class ErrorCollectingParsingContext implements ParsingContext, ParsingContextWrapper {

    @l
    private final ParsingContext baseContext;

    @l
    private final List<Exception> errors = new ArrayList();

    @l
    private final ParsingErrorLogger logger = new ParsingErrorLogger() { // from class: com.yandex.div.serialization.a
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            ErrorCollectingParsingContext.logger$lambda$0(this.f76712a, exc);
        }

        @Override // com.yandex.div.json.ParsingErrorLogger
        public /* synthetic */ void logTemplateError(Exception exc, String str) {
            com.yandex.div.json.c.a(this, exc, str);
        }
    };

    public ErrorCollectingParsingContext(@l ParsingContext parsingContext) {
        this.baseContext = parsingContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logger$lambda$0(ErrorCollectingParsingContext errorCollectingParsingContext, Exception exc) {
        errorCollectingParsingContext.errors.add(exc);
        errorCollectingParsingContext.getBaseContext().getLogger().logError(exc);
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public boolean getAllowPropertyOverride() {
        return this.baseContext.getAllowPropertyOverride();
    }

    @Override // com.yandex.div.serialization.ParsingContextWrapper
    @l
    public ParsingContext getBaseContext() {
        return this.baseContext;
    }

    @l
    public final List<Exception> getErrors() {
        return this.errors;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @l
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @l
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this.baseContext.getTemplates();
    }
}
