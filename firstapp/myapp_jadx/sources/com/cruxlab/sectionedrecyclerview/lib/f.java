package com.cruxlab.sectionedrecyclerview.lib;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ SectionHeaderLayout.a b;

    public f(SectionHeaderLayout.a aVar, View view) {
        this.b = aVar;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SectionHeaderLayout.a aVar = this.b;
        SectionHeaderLayout sectionHeaderLayout = SectionHeaderLayout.this;
        SectionHeaderLayout sectionHeaderLayout2 = SectionHeaderLayout.this;
        if (sectionHeaderLayout.getChildCount() > 1) {
            sectionHeaderLayout2.removeViewAt(1);
        }
        sectionHeaderLayout2.addView(this.a);
    }
}
