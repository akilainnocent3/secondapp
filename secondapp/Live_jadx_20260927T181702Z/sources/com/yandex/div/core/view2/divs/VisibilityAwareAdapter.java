package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import fr.h0;
import fr.i0;
import fr.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mq.lq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class VisibilityAwareAdapter<VH extends RecyclerView.f0> extends RecyclerView.h<VH> implements ExpressionSubscriber {
    private boolean isVisibleItemListValid;

    @oy.l
    private final List<DivItemBuilderResult> itemList;

    @oy.l
    private final List<Boolean> itemVisibilityList;

    @oy.l
    private final List<Disposable> subscriptions;

    @oy.l
    private final List<DivItemBuilderResult> visibleItemList = new ArrayList();

    public VisibilityAwareAdapter(@oy.l List<DivItemBuilderResult> list) {
        this.itemList = r0.d6(list);
        List<DivItemBuilderResult> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(VisibilityAwareAdapterKt.isVisible((DivItemBuilderResult) it.next())));
        }
        this.itemVisibilityList = r0.d6(arrayList);
        this.subscriptions = new ArrayList();
        subscribeOnElements();
    }

    public static /* synthetic */ void addItem$default(VisibilityAwareAdapter visibilityAwareAdapter, int i10, DivItemBuilderResult divItemBuilderResult, lq lqVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
        }
        if ((i11 & 4) != 0) {
            lqVar = VisibilityAwareAdapterKt.getVisibility(divItemBuilderResult);
        }
        visibilityAwareAdapter.addItem(i10, divItemBuilderResult, lqVar);
    }

    private final List<DivItemBuilderResult> buildVisibleItemList() {
        if (!this.isVisibleItemListValid) {
            this.visibleItemList.clear();
            List<DivItemBuilderResult> list = this.itemList;
            List<DivItemBuilderResult> list2 = this.visibleItemList;
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    h0.b0();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                if (!this.itemVisibilityList.get(i10).booleanValue()) {
                    divItemBuilderResult = null;
                }
                if (divItemBuilderResult != null) {
                    list2.add(divItemBuilderResult);
                }
                i10 = i11;
            }
            this.isVisibleItemListValid = true;
        }
        return this.visibleItemList;
    }

    private final void notifyVisibleItemChanged(int i10) {
        notifyRawItemChanged(visiblePositionOf(i10));
    }

    private final void notifyVisibleItemInserted(int i10) {
        notifyRawItemInserted(visiblePositionOf(i10));
    }

    private final void notifyVisibleItemRemoved(int i10) {
        notifyRawItemRemoved(visiblePositionOf(i10));
    }

    public static /* synthetic */ void setItem$default(VisibilityAwareAdapter visibilityAwareAdapter, int i10, DivItemBuilderResult divItemBuilderResult, lq lqVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setItem");
        }
        if ((i11 & 4) != 0) {
            lqVar = VisibilityAwareAdapterKt.getVisibility(divItemBuilderResult);
        }
        visibilityAwareAdapter.setItem(i10, divItemBuilderResult, lqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemVisibility(int i10, lq lqVar) {
        boolean z10 = lqVar == lq.VISIBLE;
        boolean zBooleanValue = this.itemVisibilityList.get(i10).booleanValue();
        if (z10 == zBooleanValue) {
            return;
        }
        this.itemVisibilityList.set(i10, Boolean.valueOf(z10));
        this.isVisibleItemListValid = false;
        if (zBooleanValue) {
            notifyVisibleItemRemoved(i10);
        } else {
            notifyVisibleItemInserted(i10);
        }
    }

    public static /* synthetic */ void updateItemVisibility$default(VisibilityAwareAdapter visibilityAwareAdapter, int i10, lq lqVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateItemVisibility");
        }
        if ((i11 & 2) != 0) {
            lqVar = VisibilityAwareAdapterKt.getVisibility(visibilityAwareAdapter.itemList.get(i10));
        }
        visibilityAwareAdapter.updateItemVisibility(i10, lqVar);
    }

    private final int visiblePositionOf(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (this.itemVisibilityList.get(i12).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final void addItem(int i10, @oy.l DivItemBuilderResult divItemBuilderResult, @oy.l lq lqVar) {
        boolean z10 = lqVar == lq.VISIBLE;
        this.itemList.add(i10, divItemBuilderResult);
        this.itemVisibilityList.add(i10, Boolean.valueOf(z10));
        this.isVisibleItemListValid = false;
        if (z10) {
            notifyVisibleItemInserted(i10);
        }
    }

    public final void addItems(int i10, @oy.l Collection<DivItemBuilderResult> collection) {
        this.itemList.addAll(i10, collection);
        List<Boolean> list = this.itemVisibilityList;
        Collection<DivItemBuilderResult> collection2 = collection;
        ArrayList arrayList = new ArrayList(i0.d0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(VisibilityAwareAdapterKt.isVisible((DivItemBuilderResult) it.next())));
        }
        list.addAll(i10, arrayList);
        int i11 = 0;
        this.isVisibleItemListValid = false;
        for (Object obj : collection2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            if (VisibilityAwareAdapterKt.getVisibility((DivItemBuilderResult) obj) == lq.VISIBLE) {
                notifyVisibleItemInserted(i11 + i10);
            }
            i11 = i12;
        }
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void addSubscription(Disposable disposable) {
        com.yandex.div.internal.core.a.a(this, disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void closeAllSubscription() {
        com.yandex.div.internal.core.a.b(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return getVisibleItems().size();
    }

    @oy.l
    public final List<DivItemBuilderResult> getItems() {
        return this.itemList;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @oy.l
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    @oy.l
    public final List<DivItemBuilderResult> getVisibleItems() {
        return buildVisibleItemList();
    }

    public void notifyRawItemChanged(int i10) {
        notifyItemChanged(i10);
    }

    public void notifyRawItemInserted(int i10) {
        notifyItemInserted(i10);
    }

    public void notifyRawItemRemoved(int i10) {
        notifyItemRemoved(i10);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public /* synthetic */ void release() {
        com.yandex.div.internal.core.a.c(this);
    }

    public final void removeItem(int i10) {
        this.itemList.remove(i10);
        boolean zBooleanValue = this.itemVisibilityList.remove(i10).booleanValue();
        this.isVisibleItemListValid = false;
        if (zBooleanValue) {
            notifyVisibleItemRemoved(i10);
        }
    }

    public final void setItem(int i10, @oy.l DivItemBuilderResult divItemBuilderResult, @oy.l lq lqVar) {
        boolean z10 = lqVar == lq.VISIBLE;
        boolean zBooleanValue = this.itemVisibilityList.get(i10).booleanValue();
        this.itemList.set(i10, divItemBuilderResult);
        this.itemVisibilityList.set(i10, Boolean.valueOf(z10));
        if (z10 || zBooleanValue) {
            this.isVisibleItemListValid = false;
        }
        if (zBooleanValue && !z10) {
            notifyVisibleItemRemoved(i10);
            return;
        }
        if (!zBooleanValue && z10) {
            notifyVisibleItemInserted(i10);
        } else if (zBooleanValue && z10) {
            notifyVisibleItemChanged(i10);
        }
    }

    public final void subscribeOnElements() {
        closeAllSubscription();
        int i10 = 0;
        for (Object obj : this.itemList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                h0.b0();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            addSubscription(divItemBuilderResult.getDiv().d().getVisibility().observe(divItemBuilderResult.getExpressionResolver(), new VisibilityAwareAdapter$subscribeOnElements$1$subscription$1(this, i10)));
            i10 = i11;
        }
    }
}
