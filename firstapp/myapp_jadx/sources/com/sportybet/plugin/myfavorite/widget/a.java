package com.sportybet.plugin.myfavorite.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.itf0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends RecyclerView.h {
    public final /* synthetic */ MyFavoriteLivePanel.g a;

    public a(MyFavoriteLivePanel.g gVar) {
        this.a = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void a() {
        MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
        myFavoriteLivePanel.G(myFavoriteLivePanel.R);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void b(int i, int i2) {
        itf0.a aVar = itf0.a;
        aVar.q("MyFavoriteLivePanel");
        aVar.a("onItemRangeChanged - positionStart = " + i + ", itemCount = " + i2, new Object[0]);
        for (int i3 = 0; i3 < i2; i3++) {
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            myFavoriteLivePanel.H(myFavoriteLivePanel.R, i + i3, "update");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void d(int i, int i2) {
        itf0.a aVar = itf0.a;
        aVar.q("MyFavoriteLivePanel");
        aVar.a("onItemRangeInserted - positionStart = " + i + ", itemCount = " + i2, new Object[0]);
        for (int i3 = 0; i3 < i2; i3++) {
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            myFavoriteLivePanel.H(myFavoriteLivePanel.R, i + i3, "insert");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void f(int i, int i2) {
        itf0.a aVar = itf0.a;
        aVar.q("MyFavoriteLivePanel");
        aVar.a("onItemRangeRemoved - positionStart = " + i + ", itemCount = " + i2, new Object[0]);
        for (int i3 = 0; i3 < i2; i3++) {
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            myFavoriteLivePanel.H(myFavoriteLivePanel.R, i, "delete");
        }
    }
}
