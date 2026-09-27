package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ed extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f38783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38784b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e10) {
            kotlin.jvm.internal.m0.p(e10, "e");
            ed.this.f38784b = true;
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(Context context) {
        super(context);
        kotlin.jvm.internal.m0.p(context, "context");
        this.f38783a = new GestureDetector(context, new a());
    }

    public final boolean getGestureDetected() {
        return this.f38784b;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.m0.p(event, "event");
        this.f38783a.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    public final void a() {
        this.f38784b = false;
    }
}
