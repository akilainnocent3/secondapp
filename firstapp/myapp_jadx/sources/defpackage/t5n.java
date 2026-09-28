package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.sportybet.plugin.realsports.widget.FlashBoostBadgeView;

/* JADX INFO: loaded from: classes7.dex */
public final class t5n {
    public static final q5n a(View view, FlashBoostBadgeView flashBoostBadgeView, ViewGroup viewGroup, ku1 ku1Var) {
        ViewParent parent = viewGroup;
        if (viewGroup == null) {
            parent = view.getParent();
        }
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null) {
            return null;
        }
        q5n q5nVar = new q5n();
        q5nVar.a = viewGroup2;
        q5nVar.b = flashBoostBadgeView;
        q5nVar.c = view;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new r5n(q5nVar, flashBoostBadgeView, viewGroup2, ku1Var));
        } else {
            b(ku1Var, q5nVar, view, viewGroup2, flashBoostBadgeView);
        }
        s5n s5nVar = new s5n(q5nVar, flashBoostBadgeView, viewGroup2, ku1Var);
        q5nVar.d = s5nVar;
        view.addOnAttachStateChangeListener(s5nVar);
        return q5nVar;
    }

    public static final void b(ku1 ku1Var, q5n q5nVar, View view, ViewGroup viewGroup, FlashBoostBadgeView flashBoostBadgeView) {
        float measuredHeight;
        if (q5nVar.b == flashBoostBadgeView && q5nVar.a == viewGroup && viewGroup.isAttachedToWindow()) {
            if (flashBoostBadgeView.getParent() == null) {
                viewGroup.getOverlay().add(flashBoostBadgeView);
            }
            flashBoostBadgeView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            flashBoostBadgeView.layout(0, 0, flashBoostBadgeView.getMeasuredWidth(), flashBoostBadgeView.getMeasuredHeight());
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            view.getLocationInWindow(iArr2);
            int i = iArr2[0] - iArr[0];
            int i2 = iArr2[1] - iArr[1];
            flashBoostBadgeView.setTranslationX(((view.getWidth() / 2.0f) + i) - (flashBoostBadgeView.getMeasuredWidth() / 2.0f));
            int iOrdinal = ku1Var.ordinal();
            if (iOrdinal == 0) {
                measuredHeight = i2 - flashBoostBadgeView.getMeasuredHeight();
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return;
                }
                measuredHeight = view.getHeight() + i2;
            }
            flashBoostBadgeView.setTranslationY(measuredHeight);
        }
    }
}
