package com.chad.library.adapter.base.listener;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public interface OnItemDragListener {
    void onItemDragEnd(RecyclerView.d0 d0Var, int i);

    void onItemDragMoving(RecyclerView.d0 d0Var, int i, RecyclerView.d0 d0Var2, int i2);

    void onItemDragStart(RecyclerView.d0 d0Var, int i);
}
