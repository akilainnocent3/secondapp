package com.sportybet.plugin.realsports.betorder.calendar.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.l1a0;

/* JADX INFO: loaded from: classes7.dex */
public class SlowdownRecyclerView extends RecyclerView {
    public final l1a0 b1;

    public SlowdownRecyclerView(Context context) {
        super(context);
        this.b1 = new l1a0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void q0(int i, int i2) {
        r0(i, i2, this.b1, false);
    }

    public SlowdownRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b1 = new l1a0();
    }

    public SlowdownRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b1 = new l1a0();
    }
}
