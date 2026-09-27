package com.yandex.div.storage;

import com.yandex.div.core.annotations.PublicApi;
import java.util.Map;
import k.i1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface DivTemplateStorage {
    @i1
    void clear();

    @i1
    void deleteTemplates(@l String str);

    @i1
    @l
    Map<String, byte[]> readTemplates(@l String str);

    @i1
    @l
    Map<String, byte[]> readTemplatesByIds(@l String... strArr);

    @i1
    void writeTemplates(@l String str, @l Map<String, byte[]> map);
}
