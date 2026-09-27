package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class h1 extends LinearLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12599e = 23;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f12600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f12602d;

    public h1(Context context) {
        this(context, null);
    }

    public Drawable a() {
        return d0.a(this);
    }

    public void b(Drawable drawable) {
        d0.b(this, drawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f12600b;
        if (drawable != null) {
            if (this.f12601c) {
                this.f12601c = false;
                Rect rect = this.f12602d;
                rect.set(0, 0, getRight() - getLeft(), getBottom() - getTop());
                drawable.setBounds(rect);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f12600b;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f12600b.setState(getDrawableState());
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12600b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f12601c = z10 | this.f12601c;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12600b;
    }

    public h1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12602d = new Rect();
        if (context.getApplicationInfo().targetSdkVersion >= 23) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.foreground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            b(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
