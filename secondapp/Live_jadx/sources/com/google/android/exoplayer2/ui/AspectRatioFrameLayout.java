package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f49167f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f49168g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f49169h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f49170i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f49171j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f49172k = 0.01f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f49173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public b f49174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f49175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49176e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(float f10, float f11, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f49177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f49178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f49179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f49180e;

        public c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f49177b = f10;
            this.f49178c = f11;
            this.f49179d = z10;
            if (this.f49180e) {
                return;
            }
            this.f49180e = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f49180e = false;
            if (AspectRatioFrameLayout.this.f49174c == null) {
                return;
            }
            AspectRatioFrameLayout.this.f49174c.a(this.f49177b, this.f49178c, this.f49179d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f49176e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f49175d <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f49175d / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f49173b.a(this.f49175d, f14, false);
            return;
        }
        int i12 = this.f49176e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f49175d;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f49175d;
                    } else {
                        f11 = this.f49175d;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f49175d;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f49175d;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f49175d;
            measuredWidth = (int) (f13 * f10);
        }
        this.f49173b.a(this.f49175d, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f49175d != f10) {
            this.f49175d = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable b bVar) {
        this.f49174c = bVar;
    }

    public void setResizeMode(int i10) {
        if (this.f49176e != i10) {
            this.f49176e = i10;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49176e = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.m.f49695a, 0, 0);
            try {
                this.f49176e = typedArrayObtainStyledAttributes.getInt(h.m.f49700b, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f49173b = new c();
    }
}
