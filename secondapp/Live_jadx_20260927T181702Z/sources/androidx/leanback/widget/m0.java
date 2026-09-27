package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class m0 extends androidx.appcompat.widget.w implements t0, n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t0.a f12804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n0.a f12805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f12806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f12807e;

    public m0(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        n0.a aVar = this.f12805c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    @k.t0(26)
    public int getAutofillType() {
        return 1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            setBackground(this.f12806d);
        } else {
            setBackground(this.f12807e);
        }
        if (z10) {
            return;
        }
        setFocusable(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((isFocused() ? androidx.appcompat.widget.w.class : TextView.class).getName());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        t0.a aVar = this.f12804b;
        boolean zA = aVar != null ? aVar.a(this, i10, keyEvent) : false;
        return !zA ? super.onKeyPreIme(i10, keyEvent) : zA;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isInTouchMode() || isFocusableInTouchMode() || isTextSelectable()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.appcompat.widget.w, android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.G(this, callback));
    }

    @Override // androidx.leanback.widget.t0
    public void setImeKeyListener(t0.a aVar) {
        this.f12804b = aVar;
    }

    @Override // androidx.leanback.widget.n0
    public void setOnAutofillListener(n0.a aVar) {
        this.f12805c = aVar;
    }

    public m0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public m0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12806d = getBackground();
        GuidedActionEditText.a aVar = new GuidedActionEditText.a();
        this.f12807e = aVar;
        setBackground(aVar);
    }
}
