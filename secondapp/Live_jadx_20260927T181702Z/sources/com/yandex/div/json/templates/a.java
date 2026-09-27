package com.yandex.div.json.templates;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a {
    @l
    public static EntityTemplate a(TemplateProvider templateProvider, @l String str, @l JSONObject jSONObject) throws ParsingException {
        EntityTemplate entityTemplate = templateProvider.get(str);
        if (entityTemplate != null) {
            return entityTemplate;
        }
        throw ParsingExceptionKt.templateNotFound(jSONObject, str);
    }
}
