package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ExtendedFloatingActionButton.i {
    public final /* synthetic */ b a;
    public final /* synthetic */ a b;
    public final /* synthetic */ ExtendedFloatingActionButton c;

    public c(ExtendedFloatingActionButton extendedFloatingActionButton, b bVar, a aVar) {
        this.c = extendedFloatingActionButton;
        this.a = bVar;
        this.b = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final ViewGroup.LayoutParams a() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        int i = extendedFloatingActionButton.o0;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.p0;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int b() {
        int i = this.c.p0;
        if (i == -1) {
            return this.a.b();
        }
        return (i == 0 || i == -2) ? this.b.a.getMeasuredHeight() : i;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int c() {
        int i = this.c.o0;
        if (i == -1) {
            return this.a.c();
        }
        return (i == 0 || i == -2) ? this.b.c() : i;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getPaddingEnd() {
        return this.c.i0;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getPaddingStart() {
        return this.c.h0;
    }
}
