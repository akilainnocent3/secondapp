package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import com.yandex.div.core.annotations.InternalApi;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@InternalApi
public interface DrawingPassOverrideStrategy {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @InternalApi
    public static final class Safe extends SafeDrawingPassOverrideStrategy {

        @l
        public static final Safe INSTANCE = new Safe();

        private Safe() {
        }
    }

    boolean overrideDrawingPass(@l ViewTreeObserver.OnPreDrawListener onPreDrawListener, boolean z10);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @InternalApi
    public static final class NoOp implements DrawingPassOverrideStrategy {

        @l
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
        }

        @Override // com.yandex.div.core.view.DrawingPassOverrideStrategy
        public boolean overrideDrawingPass(@l ViewTreeObserver.OnPreDrawListener onPreDrawListener, boolean z10) {
            return z10;
        }
    }
}
