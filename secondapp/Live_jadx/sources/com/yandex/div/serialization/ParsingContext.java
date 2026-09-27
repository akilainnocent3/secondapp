package com.yandex.div.serialization;

import com.yandex.div.core.annotations.ExperimentalApi;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@ExperimentalApi
public interface ParsingContext {
    boolean getAllowPropertyOverride();

    @l
    ParsingErrorLogger getLogger();

    @l
    TemplateProvider<EntityTemplate<?>> getTemplates();
}
