package com.chad.library.adapter.base;

import android.util.SparseArray;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import defpackage.qlr;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/util/SparseArray;", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class BaseProviderMultiAdapter$mItemProviders$2<T> extends qlr implements Function0<SparseArray<BaseItemProvider<T>>> {
    public static final BaseProviderMultiAdapter$mItemProviders$2 INSTANCE = new BaseProviderMultiAdapter$mItemProviders$2();

    public BaseProviderMultiAdapter$mItemProviders$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SparseArray<BaseItemProvider<T>> invoke() {
        return new SparseArray<>();
    }
}
