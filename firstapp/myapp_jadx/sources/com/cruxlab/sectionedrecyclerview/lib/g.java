package com.cruxlab.sectionedrecyclerview.lib;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ SectionHeaderLayout.a a;

    public g(SectionHeaderLayout.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SectionHeaderLayout sectionHeaderLayout = SectionHeaderLayout.this;
        if (sectionHeaderLayout.getChildCount() > 1) {
            sectionHeaderLayout.removeViewAt(1);
        }
    }
}
