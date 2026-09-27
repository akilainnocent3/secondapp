package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.chartboost.sdk.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class p4 extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f40411d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40412e = -15262682;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6 f40413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds.a f40414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f40415c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(Context context, AttributeSet attributeSet, int i10, c6 densityProvider, ds.a onCloseClicked) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(densityProvider, "densityProvider");
        kotlin.jvm.internal.m0.p(onCloseClicked, "onCloseClicked");
        this.f40413a = densityProvider;
        this.f40414b = onCloseClicked;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(f40412e);
        setBackground(gradientDrawable);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(densityProvider.a(28), densityProvider.a(28));
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.cb_close_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f40415c = imageView;
        addView(imageView);
    }

    public final void a(uk tracker, sk purpose) {
        kotlin.jvm.internal.m0.p(tracker, "tracker");
        kotlin.jvm.internal.m0.p(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f40415c, purpose);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.m0.p(event, "event");
        if (event.getAction() == 1) {
            this.f40414b.invoke();
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f40416b = new a();

        public a() {
            super(0);
        }

        @Override // ds.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return dr.w2.f79517a;
        }

        public final void a() {
        }
    }

    public /* synthetic */ p4(Context context, AttributeSet attributeSet, int i10, c6 c6Var, ds.a aVar, int i11, kotlin.jvm.internal.x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new w5(context) : c6Var, (i11 & 16) != 0 ? a.f40416b : aVar);
    }
}
