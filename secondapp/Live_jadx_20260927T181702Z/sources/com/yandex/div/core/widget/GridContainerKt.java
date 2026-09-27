package com.yandex.div.core.widget;

import com.yandex.div.internal.widget.DivLayoutParams;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class GridContainerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float getColumnWeight(DivLayoutParams divLayoutParams) {
        return divLayoutParams.getHorizontalWeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getRowWeight(DivLayoutParams divLayoutParams) {
        return divLayoutParams.getVerticalWeight();
    }
}
