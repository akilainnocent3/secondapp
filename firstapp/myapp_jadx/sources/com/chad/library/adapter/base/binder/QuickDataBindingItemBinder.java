package com.chad.library.adapter.base.binder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import defpackage.d7i0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004:\u0001\u0012B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/chad/library/adapter/base/binder/QuickDataBindingItemBinder;", "T", "Ld7i0;", "DB", "Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "Lcom/chad/library/adapter/base/binder/QuickDataBindingItemBinder$BinderDataBindingHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/binder/QuickDataBindingItemBinder$BinderDataBindingHolder;", "Landroid/view/LayoutInflater;", "layoutInflater", "onCreateDataBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Ld7i0;", "BinderDataBindingHolder", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class QuickDataBindingItemBinder<T, DB extends d7i0> extends BaseItemBinder<T, BinderDataBindingHolder<DB>> {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/chad/library/adapter/base/binder/QuickDataBindingItemBinder$BinderDataBindingHolder;", "Ld7i0;", "DB", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "dataBinding", "<init>", "(Ld7i0;)V", "Ld7i0;", "getDataBinding", "()Ld7i0;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BinderDataBindingHolder<DB extends d7i0> extends BaseViewHolder {
        private final DB dataBinding;

        public BinderDataBindingHolder(DB db) {
            db.getClass();
            db.getClass();
            throw null;
        }

        public final DB getDataBinding() {
            return this.dataBinding;
        }
    }

    public abstract DB onCreateDataBinding(LayoutInflater layoutInflater, ViewGroup parent, int viewType);

    @Override // com.chad.library.adapter.base.binder.BaseItemBinder
    public BinderDataBindingHolder<DB> onCreateViewHolder(ViewGroup parent, int viewType) {
        parent.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        layoutInflaterFrom.getClass();
        return new BinderDataBindingHolder<>(onCreateDataBinding(layoutInflaterFrom, parent, viewType));
    }
}
