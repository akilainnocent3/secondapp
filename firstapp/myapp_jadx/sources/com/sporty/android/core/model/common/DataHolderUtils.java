package com.sporty.android.core.model.common;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0007b\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/sporty/android/core/model/common/DataHolderUtils;", "", "<init>", "()V", "asDataHolderOrNull", "Lcom/sporty/android/core/model/common/DataHolder;", "T", "obj", "clazz", "Ljava/lang/Class;", "Lkotlin/jvm/JvmStatic;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DataHolderUtils {
    public static final DataHolderUtils INSTANCE = new DataHolderUtils();

    private DataHolderUtils() {
    }

    public static final <T> DataHolder<T> asDataHolderOrNull(Object obj, Class<T> clazz) {
        clazz.getClass();
        if (!(obj instanceof DataHolder)) {
            return null;
        }
        DataHolder<T> dataHolder = (DataHolder) obj;
        T primary = dataHolder.getPrimary();
        T active = dataHolder.getActive();
        if (clazz.isInstance(primary) && (active == null || clazz.isInstance(active))) {
            return dataHolder;
        }
        return null;
    }
}
