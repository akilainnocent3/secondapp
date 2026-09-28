package com.chad.library.adapter.base.module;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback;
import com.chad.library.adapter.base.listener.DraggableListenerImp;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.chad.library.adapter.base.listener.OnItemSwipeListener;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u0000 m2\u00020\u0001:\u0001mB\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010\u0019J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u0019J;\u0010(\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u0015H\u0002¢\u0006\u0004\b5\u00106R\u001c\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\"\u00108\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b8\u0010\u0012\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00109\u001a\u0004\b<\u0010\u0012\"\u0004\b=\u0010;R\"\u0010>\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010S\u001a\u0004\u0018\u00010R8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010Z\u001a\u0004\u0018\u00010Y8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010`\u001a\u0004\u0018\u00010*8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010-R$\u0010e\u001a\u0004\u0018\u00010.8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u00101R*\u0010k\u001a\u00020\u00102\u0006\u0010j\u001a\u00020\u00108\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bk\u00109\u001a\u0004\bk\u0010\u0012\"\u0004\bl\u0010;¨\u0006n"}, d2 = {"Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "Lcom/chad/library/adapter/base/listener/DraggableListenerImp;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", "initView$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "initView", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "attachToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "hasToggleView", "()Z", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "", "getViewHolderPosition", "(Landroidx/recyclerview/widget/RecyclerView$d0;)I", "onItemDragStart", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "source", "target", "onItemDragMoving", "(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)V", "onItemDragEnd", "onItemSwipeStart", "onItemSwipeClear", "onItemSwiped", "Landroid/graphics/Canvas;", "canvas", "", "dX", "dY", "isCurrentlyActive", "onItemSwiping", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView$d0;FFZ)V", "Lcom/chad/library/adapter/base/listener/OnItemDragListener;", "onItemDragListener", "setOnItemDragListener", "(Lcom/chad/library/adapter/base/listener/OnItemDragListener;)V", "Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;", "onItemSwipeListener", "setOnItemSwipeListener", "(Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;)V", "initItemTouch", "()V", "position", "inRange", "(I)Z", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "isDragEnabled", "Z", "setDragEnabled", "(Z)V", "isSwipeEnabled", "setSwipeEnabled", "toggleViewId", "I", "getToggleViewId", "()I", "setToggleViewId", "(I)V", "Landroidx/recyclerview/widget/r;", "itemTouchHelper", "Landroidx/recyclerview/widget/r;", "getItemTouchHelper", "()Landroidx/recyclerview/widget/r;", "setItemTouchHelper", "(Landroidx/recyclerview/widget/r;)V", "Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "itemTouchHelperCallback", "Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "getItemTouchHelperCallback", "()Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "setItemTouchHelperCallback", "(Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;)V", "Landroid/view/View$OnTouchListener;", "mOnToggleViewTouchListener", "Landroid/view/View$OnTouchListener;", "getMOnToggleViewTouchListener", "()Landroid/view/View$OnTouchListener;", "setMOnToggleViewTouchListener", "(Landroid/view/View$OnTouchListener;)V", "Landroid/view/View$OnLongClickListener;", "mOnToggleViewLongClickListener", "Landroid/view/View$OnLongClickListener;", "getMOnToggleViewLongClickListener", "()Landroid/view/View$OnLongClickListener;", "setMOnToggleViewLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "mOnItemDragListener", "Lcom/chad/library/adapter/base/listener/OnItemDragListener;", "getMOnItemDragListener", "()Lcom/chad/library/adapter/base/listener/OnItemDragListener;", "setMOnItemDragListener", "mOnItemSwipeListener", "Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;", "getMOnItemSwipeListener", "()Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;", "setMOnItemSwipeListener", "value", "isDragOnLongPressEnabled", "setDragOnLongPressEnabled", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class BaseDraggableModule implements DraggableListenerImp {
    private static final int NO_TOGGLE_VIEW = 0;
    private final BaseQuickAdapter<?, ?> baseQuickAdapter;
    private boolean isDragEnabled;
    private boolean isDragOnLongPressEnabled;
    private boolean isSwipeEnabled;
    public r itemTouchHelper;
    public DragAndSwipeCallback itemTouchHelperCallback;
    private OnItemDragListener mOnItemDragListener;
    private OnItemSwipeListener mOnItemSwipeListener;
    private View.OnLongClickListener mOnToggleViewLongClickListener;
    private View.OnTouchListener mOnToggleViewTouchListener;
    private int toggleViewId;

    public BaseDraggableModule(BaseQuickAdapter<?, ?> baseQuickAdapter) {
        baseQuickAdapter.getClass();
        this.baseQuickAdapter = baseQuickAdapter;
        initItemTouch();
        this.isDragOnLongPressEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _set_isDragOnLongPressEnabled_$lambda$0(BaseDraggableModule baseDraggableModule, View view) {
        baseDraggableModule.getClass();
        if (!baseDraggableModule.isDragEnabled) {
            return true;
        }
        r itemTouchHelper = baseDraggableModule.getItemTouchHelper();
        Object tag = view.getTag(R.id.BaseQuickAdapter_viewholder_support);
        tag.getClass();
        itemTouchHelper.t((RecyclerView.d0) tag);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _set_isDragOnLongPressEnabled_$lambda$1(BaseDraggableModule baseDraggableModule, View view, MotionEvent motionEvent) {
        baseDraggableModule.getClass();
        if (motionEvent.getAction() != 0 || baseDraggableModule.getIsDragOnLongPressEnabled()) {
            return false;
        }
        if (!baseDraggableModule.isDragEnabled) {
            return true;
        }
        r itemTouchHelper = baseDraggableModule.getItemTouchHelper();
        Object tag = view.getTag(R.id.BaseQuickAdapter_viewholder_support);
        tag.getClass();
        itemTouchHelper.t((RecyclerView.d0) tag);
        return true;
    }

    private final boolean inRange(int position) {
        return position >= 0 && position < this.baseQuickAdapter.getData().size();
    }

    private final void initItemTouch() {
        setItemTouchHelperCallback(new DragAndSwipeCallback(this));
        setItemTouchHelper(new r(getItemTouchHelperCallback()));
    }

    public final void attachToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        getItemTouchHelper().j(recyclerView);
    }

    public final r getItemTouchHelper() {
        r rVar = this.itemTouchHelper;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.n("itemTouchHelper");
        throw null;
    }

    public final DragAndSwipeCallback getItemTouchHelperCallback() {
        DragAndSwipeCallback dragAndSwipeCallback = this.itemTouchHelperCallback;
        if (dragAndSwipeCallback != null) {
            return dragAndSwipeCallback;
        }
        Intrinsics.n("itemTouchHelperCallback");
        throw null;
    }

    public final OnItemDragListener getMOnItemDragListener() {
        return this.mOnItemDragListener;
    }

    public final OnItemSwipeListener getMOnItemSwipeListener() {
        return this.mOnItemSwipeListener;
    }

    public final View.OnLongClickListener getMOnToggleViewLongClickListener() {
        return this.mOnToggleViewLongClickListener;
    }

    public final View.OnTouchListener getMOnToggleViewTouchListener() {
        return this.mOnToggleViewTouchListener;
    }

    public final int getToggleViewId() {
        return this.toggleViewId;
    }

    public final int getViewHolderPosition(RecyclerView.d0 viewHolder) {
        viewHolder.getClass();
        return viewHolder.getAdapterPosition() - this.baseQuickAdapter.getHeaderLayoutCount();
    }

    public boolean hasToggleView() {
        return this.toggleViewId != 0;
    }

    public final void initView$com_github_CymChad_brvah(BaseViewHolder holder) {
        View viewFindViewById;
        holder.getClass();
        if (this.isDragEnabled && hasToggleView() && (viewFindViewById = holder.itemView.findViewById(this.toggleViewId)) != null) {
            viewFindViewById.setTag(R.id.BaseQuickAdapter_viewholder_support, holder);
            if (getIsDragOnLongPressEnabled()) {
                viewFindViewById.setOnLongClickListener(this.mOnToggleViewLongClickListener);
            } else {
                viewFindViewById.setOnTouchListener(this.mOnToggleViewTouchListener);
            }
        }
    }

    /* JADX INFO: renamed from: isDragEnabled, reason: from getter */
    public final boolean getIsDragEnabled() {
        return this.isDragEnabled;
    }

    /* JADX INFO: renamed from: isDragOnLongPressEnabled, reason: from getter */
    public boolean getIsDragOnLongPressEnabled() {
        return this.isDragOnLongPressEnabled;
    }

    /* JADX INFO: renamed from: isSwipeEnabled, reason: from getter */
    public final boolean getIsSwipeEnabled() {
        return this.isSwipeEnabled;
    }

    public void onItemDragEnd(RecyclerView.d0 viewHolder) {
        viewHolder.getClass();
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null) {
            onItemDragListener.onItemDragEnd(viewHolder, getViewHolderPosition(viewHolder));
        }
    }

    public void onItemDragMoving(RecyclerView.d0 source, RecyclerView.d0 target) {
        source.getClass();
        target.getClass();
        int viewHolderPosition = getViewHolderPosition(source);
        int viewHolderPosition2 = getViewHolderPosition(target);
        if (inRange(viewHolderPosition) && inRange(viewHolderPosition2)) {
            if (viewHolderPosition >= viewHolderPosition2) {
                int i = viewHolderPosition2 + 1;
                if (i <= viewHolderPosition) {
                    int i2 = viewHolderPosition;
                    while (true) {
                        Collections.swap(this.baseQuickAdapter.getData(), i2, i2 - 1);
                        if (i2 == i) {
                            break;
                        } else {
                            i2--;
                        }
                    }
                }
            } else {
                int i3 = viewHolderPosition;
                while (i3 < viewHolderPosition2) {
                    int i4 = i3 + 1;
                    Collections.swap(this.baseQuickAdapter.getData(), i3, i4);
                    i3 = i4;
                }
            }
            this.baseQuickAdapter.notifyItemMoved(source.getAdapterPosition(), target.getAdapterPosition());
        }
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null) {
            onItemDragListener.onItemDragMoving(source, viewHolderPosition, target, viewHolderPosition2);
        }
    }

    public void onItemDragStart(RecyclerView.d0 viewHolder) {
        viewHolder.getClass();
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null) {
            onItemDragListener.onItemDragStart(viewHolder, getViewHolderPosition(viewHolder));
        }
    }

    public void onItemSwipeClear(RecyclerView.d0 viewHolder) {
        OnItemSwipeListener onItemSwipeListener;
        viewHolder.getClass();
        if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
            return;
        }
        onItemSwipeListener.clearView(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void onItemSwipeStart(RecyclerView.d0 viewHolder) {
        OnItemSwipeListener onItemSwipeListener;
        viewHolder.getClass();
        if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
            return;
        }
        onItemSwipeListener.onItemSwipeStart(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void onItemSwiped(RecyclerView.d0 viewHolder) {
        OnItemSwipeListener onItemSwipeListener;
        viewHolder.getClass();
        int viewHolderPosition = getViewHolderPosition(viewHolder);
        if (inRange(viewHolderPosition)) {
            this.baseQuickAdapter.getData().remove(viewHolderPosition);
            this.baseQuickAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
                return;
            }
            onItemSwipeListener.onItemSwiped(viewHolder, viewHolderPosition);
        }
    }

    public void onItemSwiping(Canvas canvas, RecyclerView.d0 viewHolder, float dX, float dY, boolean isCurrentlyActive) {
        OnItemSwipeListener onItemSwipeListener;
        if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
            return;
        }
        onItemSwipeListener.onItemSwipeMoving(canvas, viewHolder, dX, dY, isCurrentlyActive);
    }

    public final void setDragEnabled(boolean z) {
        this.isDragEnabled = z;
    }

    public void setDragOnLongPressEnabled(boolean z) {
        this.isDragOnLongPressEnabled = z;
        if (z) {
            this.mOnToggleViewTouchListener = null;
            this.mOnToggleViewLongClickListener = new View.OnLongClickListener() { // from class: v02
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return BaseDraggableModule._set_isDragOnLongPressEnabled_$lambda$0(this.a, view);
                }
            };
        } else {
            this.mOnToggleViewTouchListener = new View.OnTouchListener() { // from class: w02
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return BaseDraggableModule._set_isDragOnLongPressEnabled_$lambda$1(this.a, view, motionEvent);
                }
            };
            this.mOnToggleViewLongClickListener = null;
        }
    }

    public final void setItemTouchHelper(r rVar) {
        rVar.getClass();
        this.itemTouchHelper = rVar;
    }

    public final void setItemTouchHelperCallback(DragAndSwipeCallback dragAndSwipeCallback) {
        dragAndSwipeCallback.getClass();
        this.itemTouchHelperCallback = dragAndSwipeCallback;
    }

    public final void setMOnItemDragListener(OnItemDragListener onItemDragListener) {
        this.mOnItemDragListener = onItemDragListener;
    }

    public final void setMOnItemSwipeListener(OnItemSwipeListener onItemSwipeListener) {
        this.mOnItemSwipeListener = onItemSwipeListener;
    }

    public final void setMOnToggleViewLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mOnToggleViewLongClickListener = onLongClickListener;
    }

    public final void setMOnToggleViewTouchListener(View.OnTouchListener onTouchListener) {
        this.mOnToggleViewTouchListener = onTouchListener;
    }

    @Override // com.chad.library.adapter.base.listener.DraggableListenerImp
    public void setOnItemDragListener(OnItemDragListener onItemDragListener) {
        this.mOnItemDragListener = onItemDragListener;
    }

    @Override // com.chad.library.adapter.base.listener.DraggableListenerImp
    public void setOnItemSwipeListener(OnItemSwipeListener onItemSwipeListener) {
        this.mOnItemSwipeListener = onItemSwipeListener;
    }

    public final void setSwipeEnabled(boolean z) {
        this.isSwipeEnabled = z;
    }

    public final void setToggleViewId(int i) {
        this.toggleViewId = i;
    }
}
