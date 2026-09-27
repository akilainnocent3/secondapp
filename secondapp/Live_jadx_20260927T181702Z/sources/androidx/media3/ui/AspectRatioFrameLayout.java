package androidx.media3.ui;

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
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16997f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16998g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f16999h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f17000i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f17001j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f17002k = 0.01f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f17003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public b f17004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f17005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17006e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(float f10, float f11, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f17007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f17008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f17009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17010e;

        public c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f17007b = f10;
            this.f17008c = f11;
            this.f17009d = z10;
            if (this.f17010e) {
                return;
            }
            this.f17010e = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17010e = false;
            if (AspectRatioFrameLayout.this.f17004c == null) {
                return;
            }
            AspectRatioFrameLayout.this.f17004c.a(this.f17007b, this.f17008c, this.f17009d);
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
        return this.f17006e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f17005d <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f17005d / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f17003b.a(this.f17005d, f14, false);
            return;
        }
        int i12 = this.f17006e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f17005d;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f17005d;
                    } else {
                        f11 = this.f17005d;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f17005d;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f17005d;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f17005d;
            measuredWidth = (int) (f13 * f10);
        }
        this.f17003b.a(this.f17005d, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f17005d != f10) {
            this.f17005d = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable b bVar) {
        this.f17004c = bVar;
    }

    public void setResizeMode(int i10) {
        if (this.f17006e != i10) {
            this.f17006e = i10;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17006e = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, i.m.f17549a, 0, 0);
            try {
                this.f17006e = typedArrayObtainStyledAttributes.getInt(i.m.f17552b, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f17003b = new c();
    }
}
