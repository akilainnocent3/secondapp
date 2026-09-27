package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class yg extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f41672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41673b;

    public yg(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        this.f41672a = new GestureDetector(context, this);
    }

    public final boolean a() {
        return this.f41673b;
    }

    public final void b() {
        this.f41673b = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e10) {
        kotlin.jvm.internal.m0.p(e10, "e");
        this.f41673b = true;
        return super.onSingleTapUp(e10);
    }

    public final boolean a(MotionEvent event) {
        kotlin.jvm.internal.m0.p(event, "event");
        return this.f41672a.onTouchEvent(event);
    }
}
