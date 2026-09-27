package com.yandex.div.data;

import com.yandex.div.data.ErrorsCollectorEnvironment;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div.serialization.b;
import fr.r0;
import java.util.ArrayList;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ErrorsCollectorEnvironment implements ParsingEnvironment {

    @l
    private final List<Exception> errors = new ArrayList();

    @l
    private final ParsingErrorLogger logger = new ParsingErrorLogger() { // from class: iq.b
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            ErrorsCollectorEnvironment.logger$lambda$0(this.f99161a, exc);
        }

        @Override // com.yandex.div.json.ParsingErrorLogger
        public /* synthetic */ void logTemplateError(Exception exc, String str) {
            com.yandex.div.json.c.a(this, exc, str);
        }
    };

    @l
    private final ParsingErrorLogger originLogger;

    @l
    private final TemplateProvider<EntityTemplate<?>> templates;

    public ErrorsCollectorEnvironment(@l ParsingEnvironment parsingEnvironment) {
        this.originLogger = parsingEnvironment.getLogger();
        this.templates = parsingEnvironment.getTemplates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logger$lambda$0(ErrorsCollectorEnvironment errorsCollectorEnvironment, Exception exc) {
        errorsCollectorEnvironment.errors.add(exc);
        errorsCollectorEnvironment.originLogger.logError(exc);
    }

    @l
    public final List<Exception> collectErrors() {
        return r0.a6(this.errors);
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public /* synthetic */ boolean getAllowPropertyOverride() {
        return b.a(this);
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @l
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @l
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this.templates;
    }
}
