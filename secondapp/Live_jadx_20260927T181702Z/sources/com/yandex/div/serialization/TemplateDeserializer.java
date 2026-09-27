package com.yandex.div.serialization;

import com.yandex.div.core.annotations.ExperimentalApi;
import com.yandex.div.data.EntityTemplate;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@ExperimentalApi
public interface TemplateDeserializer<D, T extends EntityTemplate<?>> extends Deserializer<D, T> {
    @l
    T deserialize(@l ParsingContext parsingContext, @m T t10, D d10);

    @Override // com.yandex.div.serialization.Deserializer
    @l
    T deserialize(@l ParsingContext parsingContext, D d10);

    @Override // com.yandex.div.serialization.Deserializer
    /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj);
}
