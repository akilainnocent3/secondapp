package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"AppCompatCustomView"})
@y0({y0.a.LIBRARY_GROUP})
public class q0 extends ImageButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51114b;

    public q0(Context context) {
        this(context, null);
    }

    public final void c(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f51114b = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f51114b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        c(i10, true);
    }

    public q0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public q0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f51114b = getVisibility();
    }
}
