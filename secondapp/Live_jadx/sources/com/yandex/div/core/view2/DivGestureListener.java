package com.yandex.div.core.view2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivGestureListener extends GestureDetector.SimpleOnGestureListener {
    private final boolean awaitLongClick;

    @oy.m
    private ds.a<w2> onDoubleTapListener;

    @oy.m
    private ds.a<w2> onSingleTapListener;

    public DivGestureListener(boolean z10) {
        this.awaitLongClick = z10;
    }

    @oy.m
    public final ds.a<w2> getOnDoubleTapListener() {
        return this.onDoubleTapListener;
    }

    @oy.m
    public final ds.a<w2> getOnSingleTapListener() {
        return this.onSingleTapListener;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@oy.l MotionEvent motionEvent) {
        ds.a<w2> aVar = this.onDoubleTapListener;
        if (aVar == null) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(@oy.l MotionEvent motionEvent) {
        if (this.awaitLongClick) {
            return false;
        }
        return (this.onDoubleTapListener == null && this.onSingleTapListener == null) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(@oy.l MotionEvent motionEvent) {
        ds.a<w2> aVar;
        if (this.onDoubleTapListener == null || (aVar = this.onSingleTapListener) == null) {
            return false;
        }
        if (aVar == null) {
            return true;
        }
        aVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@oy.l MotionEvent motionEvent) {
        ds.a<w2> aVar;
        if (this.onDoubleTapListener != null || (aVar = this.onSingleTapListener) == null) {
            return false;
        }
        if (aVar == null) {
            return true;
        }
        aVar.invoke();
        return true;
    }

    public final void setOnDoubleTapListener(@oy.m ds.a<w2> aVar) {
        this.onDoubleTapListener = aVar;
    }

    public final void setOnSingleTapListener(@oy.m ds.a<w2> aVar) {
        this.onSingleTapListener = aVar;
    }
}
