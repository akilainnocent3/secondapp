package com.yandex.div.core.tooltip;

import android.view.View;
import com.yandex.div.core.util.SafePopupWindow;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivTooltipWindow extends SafePopupWindow {
    public /* synthetic */ DivTooltipWindow(View view, int i10, int i11, boolean z10, int i12, x xVar) {
        this(view, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? false : z10);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }

    public DivTooltipWindow(@l View view, int i10, int i11, boolean z10) {
        super(view, i10, i11, z10);
    }
}
