package com.yandex.div.json.templates;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingException;
import java.util.Map;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface TemplateProvider<T extends EntityTemplate<?>> {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @l
        public final <T extends EntityTemplate<?>> TemplateProvider<T> empty() {
            return (TemplateProvider<T>) new TemplateProvider<T>() { // from class: com.yandex.div.json.templates.TemplateProvider$Companion$empty$1
                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
                @Override // com.yandex.div.json.templates.TemplateProvider
                @m
                public EntityTemplate get(@l String str) {
                    return null;
                }

                @Override // com.yandex.div.json.templates.TemplateProvider
                public /* synthetic */ EntityTemplate getOrThrow(String str, JSONObject jSONObject) {
                    return a.a(this, str, jSONObject);
                }
            };
        }

        @l
        public final <T extends EntityTemplate<?>> TemplateProvider<T> wrap(@l final Map<String, ? extends T> map) {
            return (TemplateProvider<T>) new TemplateProvider<T>() { // from class: com.yandex.div.json.templates.TemplateProvider$Companion$wrap$1
                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
                @Override // com.yandex.div.json.templates.TemplateProvider
                @m
                public EntityTemplate get(@l String str) {
                    return (EntityTemplate) map.get(str);
                }

                @Override // com.yandex.div.json.templates.TemplateProvider
                public /* synthetic */ EntityTemplate getOrThrow(String str, JSONObject jSONObject) {
                    return a.a(this, str, jSONObject);
                }
            };
        }
    }

    @m
    T get(@l String str);

    @l
    T getOrThrow(@l String str, @l JSONObject jSONObject) throws ParsingException;
}
