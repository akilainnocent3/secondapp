package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import defpackage.bpy;

/* JADX INFO: loaded from: classes7.dex */
public class ResizeRelativeLayoutLayout extends RelativeLayout {
    public ResizeRelativeLayoutLayout(Context context) {
        super(context);
    }

    public bpy getResizeListener() {
        return null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public ResizeRelativeLayoutLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setResizeListener(bpy bpyVar) {
    }
}
