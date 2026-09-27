package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionBinder$passToParentLongClickListener$1 extends o0 implements ds.l<View, Boolean> {
    public static final DivActionBinder$passToParentLongClickListener$1 INSTANCE = new DivActionBinder$passToParentLongClickListener$1();

    public DivActionBinder$passToParentLongClickListener$1() {
        super(1);
    }

    @Override // ds.l
    @oy.l
    public final Boolean invoke(@oy.l View view) {
        boolean zPerformLongClick = false;
        do {
            ViewParent parent = view.getParent();
            view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (view == null || view.getParent() == null) {
                break;
            }
            zPerformLongClick = view.performLongClick();
        } while (!zPerformLongClick);
        return Boolean.valueOf(zPerformLongClick);
    }
}
