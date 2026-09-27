package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RatingBar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class wl2 extends RatingBar implements tl2 {
    public wl2(@oy.l Context context) {
        super(context);
    }

    @Override // android.widget.RatingBar
    public final float getRating() {
        return super.getRating();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return isClickable() && motionEvent.getAction() == 0;
    }

    @Override // android.widget.RatingBar, yads.tl2
    public void setRating(float f10) {
        super.setRating(f10);
    }

    public wl2(@oy.l Context context, @oy.m AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public wl2(@oy.l Context context, @oy.m AttributeSet attributeSet, @k.f int i10) {
        super(context, attributeSet, i10);
    }
}
