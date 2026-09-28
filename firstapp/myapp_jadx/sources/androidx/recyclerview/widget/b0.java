package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c0 {
    @Override // androidx.recyclerview.widget.c0
    public final int b(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.N(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.Q(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.R(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int e(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.T(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int f() {
        return this.a.D;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int g() {
        RecyclerView.o oVar = this.a;
        return oVar.D - oVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.c0
    public final int h() {
        return this.a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.c0
    public final int i() {
        return this.a.B;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int j() {
        return this.a.A;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int k() {
        return this.a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.c0
    public final int l() {
        RecyclerView.o oVar = this.a;
        return (oVar.D - oVar.getPaddingTop()) - oVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.c0
    public final int n(View view) {
        RecyclerView.o oVar = this.a;
        Rect rect = this.c;
        oVar.X(rect, view);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int o(View view) {
        RecyclerView.o oVar = this.a;
        Rect rect = this.c;
        oVar.X(rect, view);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void p(int i) {
        this.a.e0(i);
    }
}
