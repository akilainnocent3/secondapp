package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.fyf0;
import defpackage.pk30;

/* JADX INFO: loaded from: classes4.dex */
public class TabItem extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fyf0 fyf0VarE = fyf0.e(context, attributeSet, pk30.h0);
        TypedArray typedArray = fyf0VarE.b;
        this.a = typedArray.getText(2);
        this.b = fyf0VarE.b(0);
        this.c = typedArray.getResourceId(1, 0);
        fyf0VarE.g();
    }

    public TabItem(Context context) {
        this(context, null);
    }
}
