package yads;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z63 extends CheckBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f158634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f158635b;

    public z63(@oy.l Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setButtonDrawable((Drawable) null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f158634a);
        stateListDrawable.addState(new int[0], this.f158635b);
        setBackground(stateListDrawable);
    }

    public final void setCheckedIcon(@oy.l Drawable drawable) {
        this.f158634a = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f158634a);
        stateListDrawable.addState(new int[0], this.f158635b);
        setBackground(stateListDrawable);
    }

    public final void setUncheckedIcon(@oy.l Drawable drawable) {
        this.f158635b = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f158634a);
        stateListDrawable.addState(new int[0], this.f158635b);
        setBackground(stateListDrawable);
    }

    public z63(@oy.l Context context, @oy.m AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public z63(@oy.l Context context, @oy.m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
