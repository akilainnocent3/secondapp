package com.chad.library.adapter.base.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseBinderAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import defpackage.a1s;
import defpackage.hwr;
import defpackage.i0b;
import defpackage.ndv;
import defpackage.ttr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J/\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010 \u001a\u00020\u00152\u0006\u0010\r\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u001fJ/\u0010#\u001a\u00020\u00152\u0006\u0010\r\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010!J\u001b\u0010&\u001a\u00020\u000f2\f\b\u0001\u0010%\u001a\u00020$\"\u00020\t¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\t0(j\b\u0012\u0004\u0012\u00020\t`)¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\u000f2\f\b\u0001\u0010%\u001a\u00020$\"\u00020\t¢\u0006\u0004\b,\u0010'J\u001d\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\t0(j\b\u0012\u0004\u0012\u00020\t`)¢\u0006\u0004\b-\u0010+R+\u00101\u001a\u0012\u0012\u0004\u0012\u00020\t0(j\b\u0012\u0004\u0012\u00020\t`)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010+R+\u00104\u001a\u0012\u0012\u0004\u0012\u00020\t0(j\b\u0012\u0004\u0012\u00020\t`)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u0010+R$\u00106\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010=\u001a\u0004\u0018\u00010<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0011\u0010D\u001a\u0002058F¢\u0006\u0006\u001a\u0004\bC\u00109R\u0011\u0010F\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\bE\u0010@R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040G8F¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "T", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "data", "", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "", "onFailedToRecycleView", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)Z", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "onViewDetachedFromWindow", "Landroid/view/View;", "view", "position", "onClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)V", "onLongClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)Z", "onChildClick", "onChildLongClick", "", "ids", "addChildClickViewIds", "([I)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getChildClickViewIds", "()Ljava/util/ArrayList;", "addChildLongClickViewIds", "getChildLongClickViewIds", "clickViewIds$delegate", "Lttr;", "getClickViewIds", "clickViewIds", "longClickViewIds$delegate", "getLongClickViewIds", "longClickViewIds", "Lcom/chad/library/adapter/base/BaseBinderAdapter;", "_adapter", "Lcom/chad/library/adapter/base/BaseBinderAdapter;", "get_adapter$com_github_CymChad_brvah", "()Lcom/chad/library/adapter/base/BaseBinderAdapter;", "set_adapter$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/BaseBinderAdapter;)V", "Landroid/content/Context;", "_context", "Landroid/content/Context;", "get_context$com_github_CymChad_brvah", "()Landroid/content/Context;", "set_context$com_github_CymChad_brvah", "(Landroid/content/Context;)V", "getAdapter", "adapter", "getContext", "context", "", "getData", "()Ljava/util/List;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseItemBinder<T, VH extends BaseViewHolder> {
    private BaseBinderAdapter _adapter;
    private Context _context;

    /* JADX INFO: renamed from: clickViewIds$delegate, reason: from kotlin metadata */
    private final ttr clickViewIds;

    /* JADX INFO: renamed from: longClickViewIds$delegate, reason: from kotlin metadata */
    private final ttr longClickViewIds;

    public BaseItemBinder() {
        a1s a1sVar = a1s.c;
        this.clickViewIds = hwr.a(a1sVar, BaseItemBinder$clickViewIds$2.INSTANCE);
        this.longClickViewIds = hwr.a(a1sVar, BaseItemBinder$longClickViewIds$2.INSTANCE);
    }

    private final ArrayList<Integer> getClickViewIds() {
        return (ArrayList) this.clickViewIds.getValue();
    }

    private final ArrayList<Integer> getLongClickViewIds() {
        return (ArrayList) this.longClickViewIds.getValue();
    }

    public final void addChildClickViewIds(int... ids) {
        ids.getClass();
        int length = ids.length;
        int iA = 0;
        while (iA < length) {
            iA = ndv.a(ids[iA], iA, 1, getClickViewIds());
        }
    }

    public final void addChildLongClickViewIds(int... ids) {
        ids.getClass();
        int length = ids.length;
        int iA = 0;
        while (iA < length) {
            iA = ndv.a(ids[iA], iA, 1, getLongClickViewIds());
        }
    }

    public abstract void convert(VH holder, T data);

    public void convert(VH holder, T data, List<? extends Object> payloads) {
        holder.getClass();
        payloads.getClass();
    }

    public final BaseBinderAdapter getAdapter() {
        BaseBinderAdapter baseBinderAdapter = this._adapter;
        if (baseBinderAdapter != null) {
            baseBinderAdapter.getClass();
            return baseBinderAdapter;
        }
        i0b.b(this, "This ", " has not been attached to BaseBinderAdapter yet.\n                    You should not call the method before addItemBinder().");
        return null;
    }

    public final ArrayList<Integer> getChildClickViewIds() {
        return getClickViewIds();
    }

    public final ArrayList<Integer> getChildLongClickViewIds() {
        return getLongClickViewIds();
    }

    public final Context getContext() {
        Context context = this._context;
        if (context != null) {
            context.getClass();
            return context;
        }
        i0b.b(this, "This ", " has not been attached to BaseBinderAdapter yet.\n                    You should not call the method before onCreateViewHolder().");
        return null;
    }

    public final List<Object> getData() {
        return getAdapter().getData();
    }

    /* JADX INFO: renamed from: get_adapter$com_github_CymChad_brvah, reason: from getter */
    public final BaseBinderAdapter get_adapter() {
        return this._adapter;
    }

    /* JADX INFO: renamed from: get_context$com_github_CymChad_brvah, reason: from getter */
    public final Context get_context() {
        return this._context;
    }

    public void onChildClick(VH holder, View view, T data, int position) {
        holder.getClass();
        view.getClass();
    }

    public boolean onChildLongClick(VH holder, View view, T data, int position) {
        holder.getClass();
        view.getClass();
        return false;
    }

    public void onClick(VH holder, View view, T data, int position) {
        holder.getClass();
        view.getClass();
    }

    public abstract VH onCreateViewHolder(ViewGroup parent, int viewType);

    public boolean onFailedToRecycleView(VH holder) {
        holder.getClass();
        return false;
    }

    public boolean onLongClick(VH holder, View view, T data, int position) {
        holder.getClass();
        view.getClass();
        return false;
    }

    public void onViewAttachedToWindow(VH holder) {
        holder.getClass();
    }

    public void onViewDetachedFromWindow(VH holder) {
        holder.getClass();
    }

    public final void set_adapter$com_github_CymChad_brvah(BaseBinderAdapter baseBinderAdapter) {
        this._adapter = baseBinderAdapter;
    }

    public final void set_context$com_github_CymChad_brvah(Context context) {
        this._context = context;
    }
}
