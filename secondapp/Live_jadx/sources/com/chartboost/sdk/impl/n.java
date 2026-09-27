package com.chartboost.sdk.impl;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds.a f40062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40063c;

    public n(float f10, ds.a onClick) {
        kotlin.jvm.internal.m0.p(onClick, "onClick");
        this.f40061a = f10;
        this.f40062b = onClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e10) {
        kotlin.jvm.internal.m0.p(e10, "e");
        this.f40063c = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent e10, float f10, float f11) {
        kotlin.jvm.internal.m0.p(e10, "e2");
        this.f40063c = ((float) Math.hypot((double) f10, (double) f11)) > this.f40061a;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e10) {
        kotlin.jvm.internal.m0.p(e10, "e");
        if (this.f40063c) {
            return false;
        }
        this.f40062b.invoke();
        return true;
    }

    public /* synthetic */ n(float f10, ds.a aVar, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? 10.0f : f10, aVar);
    }
}
