package com.yandex.div.core.view2;

import android.graphics.Rect;
import android.view.View;
import k.e0;
import k.j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ViewVisibilityCalculator {

    @oy.l
    private final Rect visibleRect = new Rect();

    @cr.a
    public ViewVisibilityCalculator() {
    }

    @j0
    @e0(from = 0, to = 100)
    public int calculateVisibilityPercentage(@oy.l View view) {
        if (!view.isShown() || !view.getGlobalVisibleRect(this.visibleRect)) {
            return 0;
        }
        return ((this.visibleRect.width() * this.visibleRect.height()) * 100) / (view.getWidth() * view.getHeight());
    }

    @j0
    public boolean isViewFullyVisible(@oy.l View view) {
        return view.isShown() && view.getGlobalVisibleRect(this.visibleRect) && view.getWidth() == this.visibleRect.width() && view.getHeight() == this.visibleRect.height();
    }
}
