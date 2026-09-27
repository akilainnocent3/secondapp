package com.yandex.div.internal.widget.menu;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
class NonScrollImageView extends AppCompatImageView {
    public NonScrollImageView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect, boolean z10) {
        return false;
    }

    public NonScrollImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
