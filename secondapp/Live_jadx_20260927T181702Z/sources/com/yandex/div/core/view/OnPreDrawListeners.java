package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import com.yandex.div.core.annotations.InternalApi;
import cs.j;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@j(name = "OnPreDrawListeners")
public final class OnPreDrawListeners {
    @InternalApi
    @l
    public static final ViewTreeObserver.OnPreDrawListener onPreDrawListener(@l DrawingPassOverrideStrategy drawingPassOverrideStrategy, @l final ds.a<Boolean> aVar) {
        return new OverridableOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.div.core.view.a
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return OnPreDrawListeners.onPreDrawListener$lambda$0(aVar);
            }
        }, drawingPassOverrideStrategy);
    }

    public static /* synthetic */ ViewTreeObserver.OnPreDrawListener onPreDrawListener$default(DrawingPassOverrideStrategy drawingPassOverrideStrategy, ds.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawingPassOverrideStrategy = DrawingPassOverrideStrategy.Safe.INSTANCE;
        }
        return onPreDrawListener(drawingPassOverrideStrategy, (ds.a<Boolean>) aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPreDrawListener$lambda$0(ds.a aVar) {
        return ((Boolean) aVar.invoke()).booleanValue();
    }

    public static /* synthetic */ ViewTreeObserver.OnPreDrawListener onPreDrawListener$default(DrawingPassOverrideStrategy drawingPassOverrideStrategy, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawingPassOverrideStrategy = DrawingPassOverrideStrategy.Safe.INSTANCE;
        }
        return onPreDrawListener(drawingPassOverrideStrategy, onPreDrawListener);
    }

    @InternalApi
    @l
    public static final ViewTreeObserver.OnPreDrawListener onPreDrawListener(@l DrawingPassOverrideStrategy drawingPassOverrideStrategy, @l ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        return new OverridableOnPreDrawListener(onPreDrawListener, drawingPassOverrideStrategy);
    }
}
