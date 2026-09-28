package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ExtendedFloatingActionButton.i {
    public final /* synthetic */ ExtendedFloatingActionButton a;

    public a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.a = extendedFloatingActionButton;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final ViewGroup.LayoutParams a() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int b() {
        return this.a.getMeasuredHeight();
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int c() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.h0 + extendedFloatingActionButton.i0;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getPaddingEnd() {
        return this.a.i0;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getPaddingStart() {
        return this.a.h0;
    }
}
