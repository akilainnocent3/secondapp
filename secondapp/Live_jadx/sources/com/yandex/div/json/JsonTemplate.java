package com.yandex.div.json;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.JSONSerializable;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface JsonTemplate<T extends JSONSerializable> extends EntityTemplate<T> {
    @l
    T resolve(@l ParsingEnvironment parsingEnvironment, @l JSONObject jSONObject);
}
