package com.yandex.div.core.view2.divs.pager;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import ds.a;
import fr.d;
import java.util.List;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.x;
import mq.wf;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPagerAdapter extends DivCollectionAdapter<DivPagerViewHolder> {

    @l
    public static final Companion Companion = new Companion(null);
    public static final int OFFSET_TO_REAL_ITEM = 2;

    @l
    private final BindingContext bindingContext;

    @l
    private wf.c crossAxisAlignment;

    @l
    private final DivBinder divBinder;
    private boolean infiniteScrollEnabled;

    @l
    private final d<DivItemBuilderResult> itemsToShow;
    private int orientation;

    @l
    private final SparseArray<Float> pageTranslations;

    @l
    private final DivPagerView pagerView;
    private int removedItems;

    @l
    private final DivViewCreator viewCreator;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements a<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ds.a
        @l
        public final Boolean invoke() {
            return Boolean.valueOf(DivPagerAdapter.this.isHorizontal());
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass2 extends o0 implements a<wf.c> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // ds.a
        @l
        public final wf.c invoke() {
            return DivPagerAdapter.this.getCrossAxisAlignment();
        }
    }

    public DivPagerAdapter(@l List<DivItemBuilderResult> list, @l BindingContext bindingContext, @l DivBinder divBinder, @l SparseArray<Float> sparseArray, @l DivViewCreator divViewCreator, @l DivStatePath divStatePath, @l DivPagerView divPagerView) {
        super(bindingContext, divStatePath, list);
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.pageTranslations = sparseArray;
        this.viewCreator = divViewCreator;
        this.pagerView = divPagerView;
        this.itemsToShow = new d<DivItemBuilderResult>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$itemsToShow$1
            public /* bridge */ boolean contains(DivItemBuilderResult divItemBuilderResult) {
                return super.contains((Object) divItemBuilderResult);
            }

            @Override // fr.d, fr.b
            public int getSize() {
                return this.this$0.getVisibleItems().size() + (this.this$0.getInfiniteScrollEnabled() ? 4 : 0);
            }

            public /* bridge */ int indexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.indexOf((Object) divItemBuilderResult);
            }

            public /* bridge */ int lastIndexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.lastIndexOf((Object) divItemBuilderResult);
            }

            @Override // fr.b, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return contains((DivItemBuilderResult) obj);
                }
                return false;
            }

            @Override // fr.d, java.util.List
            @l
            public DivItemBuilderResult get(int i10) {
                return !this.this$0.getInfiniteScrollEnabled() ? this.this$0.getVisibleItems().get(i10) : this.this$0.getVisibleItems().get(this.this$0.realItemPosition(i10));
            }

            @Override // fr.d, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return indexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }

            @Override // fr.d, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return lastIndexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }
        };
        this.crossAxisAlignment = wf.c.START;
    }

    private final int getOffsetToRealItem() {
        return this.infiniteScrollEnabled ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHorizontal() {
        return this.orientation == 0;
    }

    private final void notifyVirtualItemsChanged(int i10) {
        if (i10 >= 0 && i10 < 2) {
            notifyItemRangeChanged(getVisibleItems().size() + i10, 2 - i10);
            return;
        }
        int size = getVisibleItems().size() - 2;
        if (i10 >= getVisibleItems().size() || size > i10) {
            return;
        }
        notifyItemRangeChanged((i10 - getVisibleItems().size()) + 2, 2);
    }

    @l
    public final wf.c getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final int getCurrentItem() {
        return this.pagerView.getCurrentItem$div_release();
    }

    public final boolean getInfiniteScrollEnabled() {
        return this.infiniteScrollEnabled;
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter, androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.itemsToShow.size();
    }

    @l
    public final d<DivItemBuilderResult> getItemsToShow() {
        return this.itemsToShow;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getPosition(int i10) {
        return i10 + getOffsetToRealItem();
    }

    public final int getRealPosition(int i10) {
        return i10 - getOffsetToRealItem();
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemChanged(int i10) {
        if (!this.infiniteScrollEnabled) {
            notifyItemChanged(i10);
        } else {
            notifyItemChanged(i10 + 2);
            notifyVirtualItemsChanged(i10);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemInserted(int i10) {
        if (!this.infiniteScrollEnabled) {
            notifyItemInserted(i10);
        } else {
            notifyItemInserted(i10 + 2);
            notifyVirtualItemsChanged(i10);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemRemoved(int i10) {
        this.removedItems++;
        if (!this.infiniteScrollEnabled) {
            notifyItemRemoved(i10);
        } else {
            notifyItemRemoved(i10 + 2);
            notifyVirtualItemsChanged(i10);
        }
    }

    public final int realItemPosition(int i10) {
        Integer numValueOf = Integer.valueOf(getVisibleItems().size());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return 0;
        }
        int iIntValue = numValueOf.intValue();
        return (getRealPosition(i10) + iIntValue) % iIntValue;
    }

    public final void setCrossAxisAlignment(@l wf.c cVar) {
        this.crossAxisAlignment = cVar;
    }

    public final void setInfiniteScrollEnabled(boolean z10) {
        if (this.infiniteScrollEnabled == z10) {
            return;
        }
        this.infiniteScrollEnabled = z10;
        notifyItemRangeChanged(0, getItemCount());
        DivPagerView divPagerView = this.pagerView;
        divPagerView.setCurrentItem$div_release(divPagerView.getCurrentItem$div_release() + (z10 ? 2 : -2));
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void setItems(@l List<DivItemBuilderResult> list) {
        int size = getItems().size();
        this.removedItems = 0;
        int currentItem = getCurrentItem();
        super.setItems(list);
        if (this.removedItems == size) {
            this.pagerView.setCurrentItem$div_release(currentItem);
        }
    }

    public final void setOrientation(int i10) {
        this.orientation = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @l
    public DivPagerViewHolder onCreateViewHolder(@l ViewGroup viewGroup, int i10) {
        return new DivPagerViewHolder(this.bindingContext, new DivPagerPageLayout(this.bindingContext.getDivView().getContext$div_release(), new DivPagerAdapter$onCreateViewHolder$view$1(this)), this.divBinder, this.viewCreator, new AnonymousClass1(), new AnonymousClass2());
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void onBindViewHolder(@l DivPagerViewHolder divPagerViewHolder, int i10) {
        super.onBindViewHolder(divPagerViewHolder, realItemPosition(i10));
        Float f10 = this.pageTranslations.get(i10);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            if (isHorizontal()) {
                divPagerViewHolder.itemView.setTranslationX(fFloatValue);
            } else {
                divPagerViewHolder.itemView.setTranslationY(fFloatValue);
            }
        }
    }
}
