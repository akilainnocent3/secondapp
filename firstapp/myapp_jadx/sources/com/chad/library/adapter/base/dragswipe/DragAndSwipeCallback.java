package com.chad.library.adapter.base.dragswipe;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public class DragAndSwipeCallback extends r.d {
    private BaseDraggableModule mDraggableModule;
    private float mMoveThreshold = 0.1f;
    private float mSwipeThreshold = 0.7f;
    private int mDragMoveFlags = 15;
    private int mSwipeMoveFlags = 32;

    public DragAndSwipeCallback(BaseDraggableModule baseDraggableModule) {
        this.mDraggableModule = baseDraggableModule;
    }

    private boolean isViewCreateByAdapter(RecyclerView.d0 d0Var) {
        int itemViewType = d0Var.getItemViewType();
        return itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821;
    }

    @Override // androidx.recyclerview.widget.r.d
    public void clearView(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        super.clearView(recyclerView, d0Var);
        if (isViewCreateByAdapter(d0Var)) {
            return;
        }
        if (d0Var.itemView.getTag(R.id.BaseQuickAdapter_dragging_support) != null && ((Boolean) d0Var.itemView.getTag(R.id.BaseQuickAdapter_dragging_support)).booleanValue()) {
            BaseDraggableModule baseDraggableModule = this.mDraggableModule;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemDragEnd(d0Var);
            }
            d0Var.itemView.setTag(R.id.BaseQuickAdapter_dragging_support, Boolean.FALSE);
        }
        if (d0Var.itemView.getTag(R.id.BaseQuickAdapter_swiping_support) == null || !((Boolean) d0Var.itemView.getTag(R.id.BaseQuickAdapter_swiping_support)).booleanValue()) {
            return;
        }
        BaseDraggableModule baseDraggableModule2 = this.mDraggableModule;
        if (baseDraggableModule2 != null) {
            baseDraggableModule2.onItemSwipeClear(d0Var);
        }
        d0Var.itemView.setTag(R.id.BaseQuickAdapter_swiping_support, Boolean.FALSE);
    }

    @Override // androidx.recyclerview.widget.r.d
    public float getMoveThreshold(RecyclerView.d0 d0Var) {
        return this.mMoveThreshold;
    }

    @Override // androidx.recyclerview.widget.r.d
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        return isViewCreateByAdapter(d0Var) ? r.d.makeMovementFlags(0, 0) : r.d.makeMovementFlags(this.mDragMoveFlags, this.mSwipeMoveFlags);
    }

    @Override // androidx.recyclerview.widget.r.d
    public float getSwipeThreshold(RecyclerView.d0 d0Var) {
        return this.mSwipeThreshold;
    }

    @Override // androidx.recyclerview.widget.r.d
    public boolean isItemViewSwipeEnabled() {
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            return baseDraggableModule.getIsSwipeEnabled();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.r.d
    public boolean isLongPressDragEnabled() {
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        return (baseDraggableModule == null || !baseDraggableModule.getIsDragEnabled() || this.mDraggableModule.hasToggleView()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.r.d
    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        super.onChildDrawOver(canvas, recyclerView, d0Var, f, f2, i, z);
        if (i != 1 || isViewCreateByAdapter(d0Var)) {
            return;
        }
        View view = d0Var.itemView;
        canvas.save();
        if (f > 0.0f) {
            canvas.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f, view.getBottom());
            canvas.translate(view.getLeft(), view.getTop());
        } else {
            canvas.clipRect(view.getRight() + f, view.getTop(), view.getRight(), view.getBottom());
            canvas.translate(view.getRight() + f, view.getTop());
        }
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.onItemSwiping(canvas, d0Var, f, f2, z);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.r.d
    public boolean onMove(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
        return d0Var.getItemViewType() == d0Var2.getItemViewType();
    }

    @Override // androidx.recyclerview.widget.r.d
    public void onMoved(RecyclerView recyclerView, RecyclerView.d0 d0Var, int i, RecyclerView.d0 d0Var2, int i2, int i3, int i4) {
        super.onMoved(recyclerView, d0Var, i, d0Var2, i2, i3, i4);
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.onItemDragMoving(d0Var, d0Var2);
        }
    }

    @Override // androidx.recyclerview.widget.r.d
    public void onSelectedChanged(RecyclerView.d0 d0Var, int i) {
        if (i == 2 && !isViewCreateByAdapter(d0Var)) {
            BaseDraggableModule baseDraggableModule = this.mDraggableModule;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemDragStart(d0Var);
            }
            d0Var.itemView.setTag(R.id.BaseQuickAdapter_dragging_support, Boolean.TRUE);
        } else if (i == 1 && !isViewCreateByAdapter(d0Var)) {
            BaseDraggableModule baseDraggableModule2 = this.mDraggableModule;
            if (baseDraggableModule2 != null) {
                baseDraggableModule2.onItemSwipeStart(d0Var);
            }
            d0Var.itemView.setTag(R.id.BaseQuickAdapter_swiping_support, Boolean.TRUE);
        }
        super.onSelectedChanged(d0Var, i);
    }

    @Override // androidx.recyclerview.widget.r.d
    public void onSwiped(RecyclerView.d0 d0Var, int i) {
        BaseDraggableModule baseDraggableModule;
        if (isViewCreateByAdapter(d0Var) || (baseDraggableModule = this.mDraggableModule) == null) {
            return;
        }
        baseDraggableModule.onItemSwiped(d0Var);
    }

    public void setDragMoveFlags(int i) {
        this.mDragMoveFlags = i;
    }

    public void setMoveThreshold(float f) {
        this.mMoveThreshold = f;
    }

    public void setSwipeMoveFlags(int i) {
        this.mSwipeMoveFlags = i;
    }

    public void setSwipeThreshold(float f) {
        this.mSwipeThreshold = f;
    }
}
