package com.cruxlab.sectionedrecyclerview.lib;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ SectionHeaderLayout.a c;

    public e(SectionHeaderLayout.a aVar, View view, int i) {
        this.c = aVar;
        this.a = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView.o layoutManager;
        View viewF;
        int top;
        SectionHeaderLayout sectionHeaderLayout = SectionHeaderLayout.this;
        View view = this.a;
        int height = view.getHeight();
        int i = SectionHeaderLayout.e;
        RecyclerView recyclerView = sectionHeaderLayout.a;
        int i2 = 0;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (viewF = layoutManager.F(this.b)) != null && (top = height - viewF.getTop()) > 0) {
            i2 = -top;
        }
        view.setTranslationY(i2);
        view.requestLayout();
    }
}
