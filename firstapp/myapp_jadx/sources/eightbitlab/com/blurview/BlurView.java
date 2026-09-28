package eightbitlab.com.blurview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a850;
import defpackage.dwx;
import defpackage.eg4;
import defpackage.fg4;
import defpackage.ha20;
import defpackage.o750;
import defpackage.uk30;

/* JADX INFO: loaded from: classes8.dex */
public class BlurView extends FrameLayout {
    public fg4 a;
    public int b;

    public BlurView(Context context) {
        super(context);
        this.a = new dwx();
        a(null, 0);
    }

    private eg4 getBlurAlgorithm() {
        return Build.VERSION.SDK_INT >= 31 ? new o750() : new a850(getContext());
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, uk30.a, i, 0);
        this.b = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final ha20 b(ViewGroup viewGroup, eg4 eg4Var) {
        this.a.destroy();
        ha20 ha20Var = new ha20(this, viewGroup, this.b, eg4Var);
        this.a = ha20Var;
        return ha20Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.a.d(canvas)) {
            super.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.a.e(true);
        } else {
            Log.e("BlurView", "BlurView can't be used in not hardware-accelerated window!");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.e(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.f();
    }

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new dwx();
        a(attributeSet, 0);
    }

    public BlurView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new dwx();
        a(attributeSet, i);
    }
}
