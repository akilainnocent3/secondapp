package com.sporty.android.core.model.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u001f\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0004\u0018\u00010\u0003H\u0086\b¨\u0006\u0004"}, d2 = {"asDataHolderOrNull", "Lcom/sporty/android/core/model/common/DataHolder;", "T", "", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class DataHolderKt {
    public static final <T> DataHolder<T> asDataHolderOrNull(Object obj) {
        DataHolder dataHolder = obj instanceof DataHolder ? (DataHolder) obj : null;
        if (dataHolder == null) {
            return null;
        }
        dataHolder.getPrimary();
        dataHolder.getActive();
        Intrinsics.m();
        throw null;
    }
}
