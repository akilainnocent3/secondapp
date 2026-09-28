package com.chad.library.adapter.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.a1s;
import defpackage.hwr;
import defpackage.pe4;
import defpackage.q1b;
import defpackage.ttr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00028\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0003H\u0014¢\u0006\u0004\b(\u0010&J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b)\u0010\"R'\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "T", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "data", "<init>", "(Ljava/util/List;)V", "", "", "position", "getItemType", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", AnalyticsParam.EVENT_STREAM_PROVIDER, "", "addItemProvider", "(Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateDefViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "getDefItemViewType", "(I)I", "holder", "item", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "viewHolder", "bindViewClickListener", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "getItemProvider", "(I)Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "onViewDetachedFromWindow", "bindClick", "bindChildClick", "Landroid/util/SparseArray;", "mItemProviders$delegate", "Lttr;", "getMItemProviders", "()Landroid/util/SparseArray;", "mItemProviders", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseProviderMultiAdapter<T> extends BaseQuickAdapter<T, BaseViewHolder> {

    /* JADX INFO: renamed from: mItemProviders$delegate, reason: from kotlin metadata */
    private final ttr mItemProviders;

    public BaseProviderMultiAdapter(List<T> list) {
        super(0, list);
        this.mItemProviders = hwr.a(a1s.c, BaseProviderMultiAdapter$mItemProviders$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindChildClick$lambda$6$lambda$5$lambda$4(BaseViewHolder baseViewHolder, BaseProviderMultiAdapter baseProviderMultiAdapter, BaseItemProvider baseItemProvider, View view) {
        baseViewHolder.getClass();
        baseProviderMultiAdapter.getClass();
        baseItemProvider.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - baseProviderMultiAdapter.getHeaderLayoutCount();
        view.getClass();
        baseItemProvider.onChildClick(baseViewHolder, view, baseProviderMultiAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindChildClick$lambda$9$lambda$8$lambda$7(BaseViewHolder baseViewHolder, BaseProviderMultiAdapter baseProviderMultiAdapter, BaseItemProvider baseItemProvider, View view) {
        baseViewHolder.getClass();
        baseProviderMultiAdapter.getClass();
        baseItemProvider.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - baseProviderMultiAdapter.getHeaderLayoutCount();
        view.getClass();
        return baseItemProvider.onChildLongClick(baseViewHolder, view, baseProviderMultiAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindClick$lambda$2(BaseViewHolder baseViewHolder, BaseProviderMultiAdapter baseProviderMultiAdapter, View view) {
        baseViewHolder.getClass();
        baseProviderMultiAdapter.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - baseProviderMultiAdapter.getHeaderLayoutCount();
        BaseItemProvider<T> baseItemProvider = baseProviderMultiAdapter.getMItemProviders().get(baseViewHolder.getItemViewType());
        view.getClass();
        baseItemProvider.onClick(baseViewHolder, view, baseProviderMultiAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindClick$lambda$3(BaseViewHolder baseViewHolder, BaseProviderMultiAdapter baseProviderMultiAdapter, View view) {
        baseViewHolder.getClass();
        baseProviderMultiAdapter.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - baseProviderMultiAdapter.getHeaderLayoutCount();
        BaseItemProvider<T> baseItemProvider = baseProviderMultiAdapter.getMItemProviders().get(baseViewHolder.getItemViewType());
        view.getClass();
        return baseItemProvider.onLongClick(baseViewHolder, view, baseProviderMultiAdapter.getData().get(headerLayoutCount), headerLayoutCount);
    }

    private final SparseArray<BaseItemProvider<T>> getMItemProviders() {
        return (SparseArray) this.mItemProviders.getValue();
    }

    public void addItemProvider(BaseItemProvider<T> provider) {
        provider.getClass();
        provider.setAdapter$com_github_CymChad_brvah(this);
        getMItemProviders().put(provider.getItemViewType(), provider);
    }

    public void bindChildClick(final BaseViewHolder viewHolder, int viewType) {
        final BaseItemProvider<T> itemProvider;
        viewHolder.getClass();
        int i = 0;
        if (getMOnItemChildClickListener() == null) {
            final BaseItemProvider<T> itemProvider2 = getItemProvider(viewType);
            if (itemProvider2 == null) {
                return;
            }
            ArrayList<Integer> childClickViewIds = itemProvider2.getChildClickViewIds();
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
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: k42
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BaseProviderMultiAdapter.bindChildClick$lambda$6$lambda$5$lambda$4(viewHolder, this, itemProvider2, view);
                        }
                    });
                }
            }
        }
        if (getMOnItemChildLongClickListener() != null || (itemProvider = getItemProvider(viewType)) == null) {
            return;
        }
        ArrayList<Integer> childLongClickViewIds = itemProvider.getChildLongClickViewIds();
        int size2 = childLongClickViewIds.size();
        while (i < size2) {
            Integer num2 = childLongClickViewIds.get(i);
            i++;
            View viewFindViewById2 = viewHolder.itemView.findViewById(num2.intValue());
            if (viewFindViewById2 != null) {
                if (!viewFindViewById2.isLongClickable()) {
                    viewFindViewById2.setLongClickable(true);
                }
                viewFindViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: l42
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return BaseProviderMultiAdapter.bindChildClick$lambda$9$lambda$8$lambda$7(viewHolder, this, itemProvider, view);
                    }
                });
            }
        }
    }

    public void bindClick(final BaseViewHolder viewHolder) {
        viewHolder.getClass();
        if (getMOnItemClickListener() == null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: m42
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseProviderMultiAdapter.bindClick$lambda$2(viewHolder, this, view);
                }
            });
        }
        if (getMOnItemLongClickListener() == null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: n42
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return BaseProviderMultiAdapter.bindClick$lambda$3(viewHolder, this, view);
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
    public void convert(BaseViewHolder holder, T item, List<? extends Object> payloads) {
        holder.getClass();
        payloads.getClass();
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        itemProvider.getClass();
        itemProvider.convert(holder, item, payloads);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int position) {
        return getItemType(getData(), position);
    }

    public BaseItemProvider<T> getItemProvider(int viewType) {
        return getMItemProviders().get(viewType);
    }

    public abstract int getItemType(List<? extends T> data, int position);

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int viewType) {
        parent.getClass();
        BaseItemProvider<T> itemProvider = getItemProvider(viewType);
        if (itemProvider == null) {
            q1b.a(pe4.b(viewType, "ViewType: ", " no such provider found，please use addItemProvider() first!"));
            return null;
        }
        Context context = parent.getContext();
        context.getClass();
        itemProvider.setContext(context);
        BaseViewHolder baseViewHolderOnCreateViewHolder = itemProvider.onCreateViewHolder(parent, viewType);
        itemProvider.onViewHolderCreated(baseViewHolderOnCreateViewHolder, viewType);
        return baseViewHolderOnCreateViewHolder;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.f
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        holder.getClass();
        super.onViewAttachedToWindow(holder);
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        if (itemProvider != null) {
            itemProvider.onViewAttachedToWindow(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onViewDetachedFromWindow(BaseViewHolder holder) {
        holder.getClass();
        super.onViewDetachedFromWindow(holder);
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        if (itemProvider != null) {
            itemProvider.onViewDetachedFromWindow(holder);
        }
    }

    public /* synthetic */ BaseProviderMultiAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseProviderMultiAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder holder, T item) {
        holder.getClass();
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        itemProvider.getClass();
        itemProvider.convert(holder, item);
    }
}
