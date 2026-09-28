package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends c0 {
    @Override // androidx.recyclerview.widget.c0
    public final int b(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.S(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.R(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.Q(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int e(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.P(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int f() {
        return this.a.C;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int g() {
        RecyclerView.o oVar = this.a;
        return oVar.C - oVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.c0
    public final int h() {
        return this.a.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.c0
    public final int i() {
        return this.a.A;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int j() {
        return this.a.B;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int k() {
        return this.a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.c0
    public final int l() {
        RecyclerView.o oVar = this.a;
        return (oVar.C - oVar.getPaddingLeft()) - oVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.c0
    public final int n(View view) {
        RecyclerView.o oVar = this.a;
        Rect rect = this.c;
        oVar.X(rect, view);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int o(View view) {
        RecyclerView.o oVar = this.a;
        Rect rect = this.c;
        oVar.X(rect, view);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void p(int i) {
        this.a.d0(i);
    }
}
