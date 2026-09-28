package androidx.gridlayout.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends GridLayout.h {
    public final /* synthetic */ GridLayout.h a;
    public final /* synthetic */ GridLayout.h b;

    public a(GridLayout.h hVar, GridLayout.h hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    @Override // androidx.gridlayout.widget.GridLayout.h
    public final int a(View view, int i, int i2) {
        return (view.getLayoutDirection() == 1 ? this.b : this.a).a(view, i, i2);
    }

    @Override // androidx.gridlayout.widget.GridLayout.h
    public final String c() {
        return "SWITCHING[L:" + this.a.c() + ", R:" + this.b.c() + "]";
    }

    @Override // androidx.gridlayout.widget.GridLayout.h
    public final int d(int i, View view) {
        return (view.getLayoutDirection() == 1 ? this.b : this.a).d(i, view);
    }
}
