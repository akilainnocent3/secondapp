package com.yandex.div.core.view2.divs.widgets;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParentScrollRestrictor implements OnInterceptTouchEventListener {

    @l
    public static final ParentScrollRestrictor INSTANCE = new ParentScrollRestrictor();

    private ParentScrollRestrictor() {
    }

    @Override // com.yandex.div.internal.widget.OnInterceptTouchEventListener
    public boolean onInterceptTouchEvent(@l ViewGroup viewGroup, @l MotionEvent motionEvent) {
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1 || actionMasked == 3) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
