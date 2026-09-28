package com.sporty.android.core.model.config.bo.mapper;

import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.IBOConfigParam;
import defpackage.l48;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001e\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"dto", "Lcom/sporty/android/core/model/config/bo/BOConfigParamDto;", "Lcom/sporty/android/core/model/config/bo/IBOConfigParam;", "getDto", "(Lcom/sporty/android/core/model/config/bo/IBOConfigParam;)Lcom/sporty/android/core/model/config/bo/BOConfigParamDto;", "dtos", "", "", "getDtos", "(Ljava/util/Collection;)Ljava/util/List;", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class BOConfigParamMapperKt {
    private static final BOConfigParamDto getDto(IBOConfigParam iBOConfigParam) {
        return new BOConfigParamDto(iBOConfigParam.getAppId(), iBOConfigParam.getNamespace(), iBOConfigParam.getConfigKey(), iBOConfigParam.getDeserializeOption());
    }

    public static final List<BOConfigParamDto> getDtos(Collection<? extends IBOConfigParam> collection) {
        collection.getClass();
        Collection<? extends IBOConfigParam> collection2 = collection;
        ArrayList arrayList = new ArrayList(l48.r(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(getDto((IBOConfigParam) it.next()));
        }
        return CollectionsKt.A0(arrayList);
    }
}
