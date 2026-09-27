package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import com.yandex.div.core.annotations.InternalApi;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@InternalApi
public class SafeDrawingPassOverrideStrategy implements DrawingPassOverrideStrategy {

    @l
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int DEFAULT_FRAME_CANCEL_LIMIT = 3;
    private int frameCancelCount;
    private int frameCancelLimit = 3;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public final int getFrameCancelLimit() {
        return this.frameCancelLimit;
    }

    @Override // com.yandex.div.core.view.DrawingPassOverrideStrategy
    public boolean overrideDrawingPass(@l ViewTreeObserver.OnPreDrawListener onPreDrawListener, boolean z10) {
        if (z10) {
            this.frameCancelCount = 0;
            return true;
        }
        int i10 = this.frameCancelCount;
        int i11 = this.frameCancelLimit;
        if (i10 < i11) {
            int i12 = i10 + 1;
            this.frameCancelCount = i12;
            onFrameCancelled(onPreDrawListener, i12);
            return false;
        }
        if (i10 == i11) {
            int i13 = i10 + 1;
            this.frameCancelCount = i13;
            onFrameCancelLimitExceeded(onPreDrawListener, i13);
        }
        return true;
    }

    public final void setFrameCancelLimit(int i10) {
        if (this.frameCancelLimit != i10) {
            this.frameCancelLimit = i10;
            this.frameCancelCount = 0;
        }
    }

    public void onFrameCancelLimitExceeded(@l ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
    }

    public void onFrameCancelled(@l ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
    }
}
