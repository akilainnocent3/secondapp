package com.yandex.div.serialization;

import com.yandex.div.core.annotations.ExperimentalApi;
import com.yandex.div.data.EntityTemplate;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@ExperimentalApi
public interface TemplateParser<D, T extends EntityTemplate<?>> extends Serializer<D, T>, TemplateDeserializer<D, T> {
}
