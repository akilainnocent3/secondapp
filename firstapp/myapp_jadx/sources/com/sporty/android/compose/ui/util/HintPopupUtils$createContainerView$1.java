package com.sporty.android.compose.ui.util;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/sporty/android/compose/ui/util/HintPopupUtils$createContainerView$1", "Landroid/widget/FrameLayout;", "compose-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HintPopupUtils$createContainerView$1 extends FrameLayout {
    public static final /* synthetic */ int b = 0;
    public int a;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        canvas.clipRect(0, this.a, getWidth(), getHeight());
        super.onDraw(canvas);
    }
}
