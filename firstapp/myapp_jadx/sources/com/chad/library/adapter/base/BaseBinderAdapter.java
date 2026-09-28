package com.chad.library.adapter.base;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.n;
import com.chad.library.adapter.base.BaseBinderAdapter;
import com.chad.library.adapter.base.binder.BaseItemBinder;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.i0b;
import defpackage.pe4;
import defpackage.q1b;
import defpackage.zkh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u000f\u001a\u00020\u0000\"\b\b\u0000\u0010\b*\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u000f\u001a\u00020\u0000\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u00022\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014¢\u0006\u0004\b\u001b\u0010\u001fJ#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0014H\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00142\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0004¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0003H\u0014¢\u0006\u0004\b1\u0010*J\u001f\u00102\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b2\u0010(RH\u00105\u001a6\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r03j\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R8\u00107\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u001403j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u0014`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R$\u00109\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u000b088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/chad/library/adapter/base/BaseBinderAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS, "<init>", "(Ljava/util/List;)V", "T", "Ljava/lang/Class;", "clazz", "Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "baseItemBinder", "Landroidx/recyclerview/widget/n$e;", "callback", "addItemBinder", "(Ljava/lang/Class;Lcom/chad/library/adapter/base/binder/BaseItemBinder;Landroidx/recyclerview/widget/n$e;)Lcom/chad/library/adapter/base/BaseBinderAdapter;", "(Lcom/chad/library/adapter/base/binder/BaseItemBinder;Landroidx/recyclerview/widget/n$e;)Lcom/chad/library/adapter/base/BaseBinderAdapter;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateDefViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "item", "", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "getItemBinder", "(I)Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "getItemBinderOrNull", "position", "getDefItemViewType", "(I)I", "viewHolder", "bindViewClickListener", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "onViewDetachedFromWindow", "", "onFailedToRecycleView", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)Z", "findViewType", "(Ljava/lang/Class;)I", "bindClick", "bindChildClick", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classDiffMap", "Ljava/util/HashMap;", "mTypeMap", "Landroid/util/SparseArray;", "mBinderArray", "Landroid/util/SparseArray;", "ItemCallback", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class BaseBinderAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {
    private final HashMap<Class<?>, n.e<Object>> classDiffMap;
    private final SparseArray<BaseItemBinder<Object, ?>> mBinderArray;
    private final HashMap<Class<?>, Integer> mTypeMap;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/chad/library/adapter/base/BaseBinderAdapter$ItemCallback;", "Landroidx/recyclerview/widget/n$e;", "", "<init>", "(Lcom/chad/library/adapter/base/BaseBinderAdapter;)V", "oldItem", "newItem", "", "areItemsTheSame", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areContentsTheSame", "getChangePayload", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ItemCallback extends n.e<Object> {
        public ItemCallback() {
        }

        @Override // androidx.recyclerview.widget.n.e
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            n.e eVar;
            oldItem.getClass();
            newItem.getClass();
            if (!oldItem.getClass().equals(newItem.getClass()) || (eVar = (n.e) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) {
                return true;
            }
            return eVar.areContentsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.n.e
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            n.e eVar;
            oldItem.getClass();
            newItem.getClass();
            return (!oldItem.getClass().equals(newItem.getClass()) || (eVar = (n.e) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) ? oldItem.equals(newItem) : eVar.areItemsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.n.e
        public Object getChangePayload(Object oldItem, Object newItem) {
            n.e eVar;
            oldItem.getClass();
            newItem.getClass();
            if (!oldItem.getClass().equals(newItem.getClass()) || (eVar = (n.e) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) {
                return null;
            }
            return eVar.getChangePayload(oldItem, newItem);
        }
    }

    public BaseBinderAdapter(List<Object> list) {
        super(0, list);
        this.classDiffMap = new HashMap<>();
        this.mTypeMap = new HashMap<>();
        this.mBinderArray = new SparseArray<>();
        setDiffCallback(new ItemCallback());
    }

    public static /* synthetic */ BaseBinderAdapter addItemBinder$default(BaseBinderAdapter baseBinderAdapter, Class cls, BaseItemBinder baseItemBinder, n.e eVar, int i, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: addItemBinder");
            return null;
        }
        if ((i & 4) != 0) {
            eVar = null;
        }
        return baseBinderAdapter.addItemBinder(cls, baseItemBinder, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindChildClick$lambda$11$lambda$10$lambda$9(BaseViewHolder baseViewHolder, BaseBinderAdapter baseBinderAdapter, BaseItemBinder baseItemBinder, View view) {
        int headerLayoutCount;
        Object objV;
        baseViewHolder.getClass();
        baseBinderAdapter.getClass();
        baseItemBinder.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || (objV = CollectionsKt.V((headerLayoutCount = bindingAdapterPosition - baseBinderAdapter.getHeaderLayoutCount()), baseBinderAdapter.getData())) == null) {
            return false;
        }
        view.getClass();
        return baseItemBinder.onChildLongClick(baseViewHolder, view, objV, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindChildClick$lambda$8$lambda$7$lambda$6(BaseViewHolder baseViewHolder, BaseBinderAdapter baseBinderAdapter, BaseItemBinder baseItemBinder, View view) {
        int headerLayoutCount;
        Object objV;
        baseViewHolder.getClass();
        baseBinderAdapter.getClass();
        baseItemBinder.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || (objV = CollectionsKt.V((headerLayoutCount = bindingAdapterPosition - baseBinderAdapter.getHeaderLayoutCount()), baseBinderAdapter.getData())) == null) {
            return;
        }
        view.getClass();
        baseItemBinder.onChildClick(baseViewHolder, view, objV, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindClick$lambda$4(BaseViewHolder baseViewHolder, BaseBinderAdapter baseBinderAdapter, View view) {
        baseViewHolder.getClass();
        baseBinderAdapter.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - baseBinderAdapter.getHeaderLayoutCount();
        BaseItemBinder<Object, BaseViewHolder> itemBinder = baseBinderAdapter.getItemBinder(baseViewHolder.getItemViewType());
        if (CollectionsKt.V(headerLayoutCount, baseBinderAdapter.getData()) == null) {
            return;
        }
        view.getClass();
        itemBinder.onClick(baseViewHolder, view, baseBinderAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindClick$lambda$5(BaseViewHolder baseViewHolder, BaseBinderAdapter baseBinderAdapter, View view) {
        baseViewHolder.getClass();
        baseBinderAdapter.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - baseBinderAdapter.getHeaderLayoutCount();
        BaseItemBinder<Object, BaseViewHolder> itemBinder = baseBinderAdapter.getItemBinder(baseViewHolder.getItemViewType());
        Object objV = CollectionsKt.V(headerLayoutCount, baseBinderAdapter.getData());
        if (objV == null) {
            return false;
        }
        view.getClass();
        return itemBinder.onLongClick(baseViewHolder, view, objV, headerLayoutCount);
    }

    public final <T> BaseBinderAdapter addItemBinder(Class<? extends T> clazz, BaseItemBinder<T, ?> baseItemBinder, n.e<T> callback) {
        clazz.getClass();
        baseItemBinder.getClass();
        int size = this.mTypeMap.size() + 1;
        this.mTypeMap.put(clazz, Integer.valueOf(size));
        this.mBinderArray.append(size, baseItemBinder);
        baseItemBinder.set_adapter$com_github_CymChad_brvah(this);
        if (callback != null) {
            this.classDiffMap.put(clazz, callback);
        }
        return this;
    }

    public void bindChildClick(final BaseViewHolder viewHolder, int viewType) {
        viewHolder.getClass();
        int i = 0;
        if (getMOnItemChildClickListener() == null) {
            final BaseItemBinder<Object, BaseViewHolder> itemBinder = getItemBinder(viewType);
            ArrayList<Integer> childClickViewIds = itemBinder.getChildClickViewIds();
            int size = childClickViewIds.size();
            int i2 = 0;
            while (i2 < size) {
                Integer num = childClickViewIds.get(i2);
                i2++;
                View viewFindViewById = viewHolder.itemView.findViewById(num.intValue());
                if (viewFindViewById != null) {
                    if (!viewFindViewById.isClickable()) {
                        viewFindViewById.setClickable(true);
                    }
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: fz1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BaseBinderAdapter.bindChildClick$lambda$8$lambda$7$lambda$6(viewHolder, this, itemBinder, view);
                        }
                    });
                }
            }
        }
        if (getMOnItemChildLongClickListener() == null) {
            final BaseItemBinder<Object, BaseViewHolder> itemBinder2 = getItemBinder(viewType);
            ArrayList<Integer> childLongClickViewIds = itemBinder2.getChildLongClickViewIds();
            int size2 = childLongClickViewIds.size();
            while (i < size2) {
                Integer num2 = childLongClickViewIds.get(i);
                i++;
                View viewFindViewById2 = viewHolder.itemView.findViewById(num2.intValue());
                if (viewFindViewById2 != null) {
                    if (!viewFindViewById2.isLongClickable()) {
                        viewFindViewById2.setLongClickable(true);
                    }
                    viewFindViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: gz1
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            return BaseBinderAdapter.bindChildClick$lambda$11$lambda$10$lambda$9(viewHolder, this, itemBinder2, view);
                        }
                    });
                }
            }
        }
    }

    public void bindClick(final BaseViewHolder viewHolder) {
        viewHolder.getClass();
        if (getMOnItemClickListener() == null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: hz1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseBinderAdapter.bindClick$lambda$4(viewHolder, this, view);
                }
            });
        }
        if (getMOnItemLongClickListener() == null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: iz1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return BaseBinderAdapter.bindClick$lambda$5(viewHolder, this, view);
                }
            });
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void bindViewClickListener(BaseViewHolder viewHolder, int viewType) {
        viewHolder.getClass();
        super.bindViewClickListener(viewHolder, viewType);
        bindClick(viewHolder);
        bindChildClick(viewHolder, viewType);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder holder, Object item, List<? extends Object> payloads) {
        holder.getClass();
        item.getClass();
        payloads.getClass();
        getItemBinder(holder.getItemViewType()).convert(holder, item, payloads);
    }

    public final int findViewType(Class<?> clazz) {
        clazz.getClass();
        Integer num = this.mTypeMap.get(clazz);
        if (num != null) {
            return num.intValue();
        }
        i0b.b(clazz, "findViewType: ViewType: ", " Not Find!");
        return 0;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int position) {
        return findViewType(getData().get(position).getClass());
    }

    public BaseItemBinder<Object, BaseViewHolder> getItemBinder(int viewType) {
        BaseItemBinder<Object, BaseViewHolder> baseItemBinder = (BaseItemBinder) this.mBinderArray.get(viewType);
        if (baseItemBinder != null) {
            return baseItemBinder;
        }
        q1b.a(pe4.b(viewType, "getItemBinder: viewType '", "' no such Binder found，please use addItemBinder() first!"));
        return null;
    }

    public BaseItemBinder<Object, BaseViewHolder> getItemBinderOrNull(int viewType) {
        BaseItemBinder<Object, BaseViewHolder> baseItemBinder = (BaseItemBinder) this.mBinderArray.get(viewType);
        if (baseItemBinder == null) {
            return null;
        }
        return baseItemBinder;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int viewType) {
        parent.getClass();
        BaseItemBinder<Object, BaseViewHolder> itemBinder = getItemBinder(viewType);
        itemBinder.set_context$com_github_CymChad_brvah(getContext());
        return itemBinder.onCreateViewHolder(parent, viewType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean onFailedToRecycleView(BaseViewHolder holder) {
        holder.getClass();
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            return itemBinderOrNull.onFailedToRecycleView(holder);
        }
        return false;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.f
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        holder.getClass();
        super.onViewAttachedToWindow(holder);
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewAttachedToWindow(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onViewDetachedFromWindow(BaseViewHolder holder) {
        holder.getClass();
        super.onViewDetachedFromWindow(holder);
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewDetachedFromWindow(holder);
        }
    }

    public static BaseBinderAdapter addItemBinder$default(BaseBinderAdapter baseBinderAdapter, BaseItemBinder baseItemBinder, n.e eVar, int i, Object obj) {
        if (obj == null) {
            baseItemBinder.getClass();
            Intrinsics.m();
            throw null;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemBinder");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder holder, Object item) {
        holder.getClass();
        item.getClass();
        getItemBinder(holder.getItemViewType()).convert(holder, item);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBinderAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BaseBinderAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public final <T> BaseBinderAdapter addItemBinder(Class<? extends T> cls, BaseItemBinder<T, ?> baseItemBinder) {
        cls.getClass();
        baseItemBinder.getClass();
        return addItemBinder$default(this, cls, baseItemBinder, null, 4, null);
    }

    public final <T> BaseBinderAdapter addItemBinder(BaseItemBinder<T, ?> baseItemBinder, n.e<T> callback) {
        baseItemBinder.getClass();
        Intrinsics.m();
        throw null;
    }
}
