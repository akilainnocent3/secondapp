package com.yandex.div.core.widget;

import android.view.View;
import js.f;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface AspectView {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final float DEFAULT_ASPECT_RATIO = 0.0f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final float DEFAULT_ASPECT_RATIO = 0.0f;

        private Companion() {
        }

        @l
        public final f<View, Float> aspectRatioProperty$div_release() {
            return ViewsKt.dimensionAffecting(Float.valueOf(0.0f), AspectView$Companion$aspectRatioProperty$1.INSTANCE);
        }
    }

    float getAspectRatio();

    void setAspectRatio(float f10);
}
