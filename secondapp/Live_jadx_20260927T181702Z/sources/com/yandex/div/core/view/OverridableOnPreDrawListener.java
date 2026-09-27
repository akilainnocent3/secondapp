package com.yandex.div.core.view;

import android.annotation.SuppressLint;
import android.view.ViewTreeObserver;
import com.yandex.div.core.annotations.InternalApi;
import cs.k;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@InternalApi
@SuppressLint({"OnPreDrawListenerIssue"})
public final class OverridableOnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {

    @l
    private final ViewTreeObserver.OnPreDrawListener delegate;

    @l
    private final DrawingPassOverrideStrategy overrideStrategy;

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public OverridableOnPreDrawListener(@l ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(onPreDrawListener, null, 2, 0 == true ? 1 : 0);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        return this.overrideStrategy.overrideDrawingPass(this.delegate, this.delegate.onPreDraw());
    }

    @k
    public OverridableOnPreDrawListener(@l ViewTreeObserver.OnPreDrawListener onPreDrawListener, @l DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.delegate = onPreDrawListener;
        this.overrideStrategy = drawingPassOverrideStrategy;
    }

    public /* synthetic */ OverridableOnPreDrawListener(ViewTreeObserver.OnPreDrawListener onPreDrawListener, DrawingPassOverrideStrategy drawingPassOverrideStrategy, int i10, x xVar) {
        this(onPreDrawListener, (i10 & 2) != 0 ? DrawingPassOverrideStrategy.Safe.INSTANCE : drawingPassOverrideStrategy);
    }
}
