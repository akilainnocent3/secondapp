package com.yandex.div.serialization;

import com.yandex.div.core.annotations.ExperimentalApi;
import com.yandex.div.data.EntityTemplate;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@ExperimentalApi
public final class TemplateParsingResult<T extends EntityTemplate<?>> {

    @l
    private final Map<String, Set<String>> templateDependencies;

    @l
    private final Map<String, T> templates;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateParsingResult(@l Map<String, ? extends T> map, @l Map<String, ? extends Set<String>> map2) {
        this.templates = map;
        this.templateDependencies = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TemplateParsingResult copy$default(TemplateParsingResult templateParsingResult, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = templateParsingResult.templates;
        }
        if ((i10 & 2) != 0) {
            map2 = templateParsingResult.templateDependencies;
        }
        return templateParsingResult.copy(map, map2);
    }

    @l
    public final Map<String, T> component1() {
        return this.templates;
    }

    @l
    public final Map<String, Set<String>> component2() {
        return this.templateDependencies;
    }

    @l
    public final TemplateParsingResult<T> copy(@l Map<String, ? extends T> map, @l Map<String, ? extends Set<String>> map2) {
        return new TemplateParsingResult<>(map, map2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateParsingResult)) {
            return false;
        }
        TemplateParsingResult templateParsingResult = (TemplateParsingResult) obj;
        return m0.g(this.templates, templateParsingResult.templates) && m0.g(this.templateDependencies, templateParsingResult.templateDependencies);
    }

    @l
    public final Map<String, Set<String>> getTemplateDependencies() {
        return this.templateDependencies;
    }

    @l
    public final Map<String, T> getTemplates() {
        return this.templates;
    }

    public int hashCode() {
        return (this.templates.hashCode() * 31) + this.templateDependencies.hashCode();
    }

    @l
    public String toString() {
        return "TemplateParsingResult(templates=" + this.templates + ", templateDependencies=" + this.templateDependencies + ')';
    }
}
