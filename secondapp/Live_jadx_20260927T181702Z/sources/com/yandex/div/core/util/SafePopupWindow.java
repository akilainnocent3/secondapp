package com.yandex.div.core.util;

import android.view.View;
import android.widget.PopupWindow;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class SafePopupWindow extends PopupWindow {
    public SafePopupWindow(@l View view, int i10, int i11, boolean z10) {
        super(view, i10, i11, z10);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(@m View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(view);
    }

    public SafePopupWindow(@l View view, int i10, int i11) {
        super(view, i10, i11);
    }
}
