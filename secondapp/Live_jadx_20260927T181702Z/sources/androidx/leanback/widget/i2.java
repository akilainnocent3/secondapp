package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f12673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f12674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12675d;

    public i2(Context context) {
        this(context, null, 0);
    }

    public void a(View view) {
        if (this.f12673b.indexOfChild(view) < 0) {
            this.f12673b.addView(view, 0);
        }
    }

    public void b(View view) {
        addView(view);
    }

    public void c(View view) {
        if (this.f12673b.indexOfChild(view) >= 0) {
            this.f12673b.removeView(view);
        }
    }

    public void d(@k.k int i10) {
        Drawable drawable = this.f12674c;
        if (!(drawable instanceof ColorDrawable)) {
            setForeground(new ColorDrawable(i10));
        } else {
            ((ColorDrawable) drawable.mutate()).setColor(i10);
            invalidate();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f12674c;
        if (drawable != null) {
            if (this.f12675d) {
                this.f12675d = false;
                drawable.setBounds(0, 0, getWidth(), getHeight());
            }
            this.f12674c.draw(canvas);
        }
    }

    public void e(boolean z10) {
        this.f12673b.setVisibility(z10 ? 0 : 8);
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f12674c;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f12675d = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f12674c = drawable;
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public i2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12675d = true;
        setOrientation(1);
        LayoutInflater.from(context).inflate(s3.a.j.T, this);
        this.f12673b = (ViewGroup) findViewById(s3.a.h.f128737l1);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }
}
