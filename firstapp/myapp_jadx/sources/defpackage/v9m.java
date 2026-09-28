package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.compose.ui.util.HintPopupUtils$createContainerView$1;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes4.dex */
public final class v9m {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewTreeObserver$OnScrollChangedListener, p9m] */
    public static void a(final ViewGroup viewGroup, final View view, final ConstraintLayout constraintLayout, final String str, final int i, final int i2, final b120 b120Var, final int i3, Function0 function0) {
        viewGroup.getClass();
        view.getClass();
        str.getClass();
        Object tag = view.getTag(R.id.hint_popup_tag);
        AttributeSet attributeSet = null;
        View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null) {
            viewGroup.removeView(view2);
            view.setTag(R.id.hint_popup_tag, null);
        }
        final HintPopupUtils$createContainerView$1 hintPopupUtils$createContainerView$1 = new HintPopupUtils$createContainerView$1(viewGroup.getContext());
        hintPopupUtils$createContainerView$1.post(new Runnable() { // from class: s9m
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = HintPopupUtils$createContainerView$1.b;
                View view3 = constraintLayout;
                if (view3 != null) {
                    int[] iArr = new int[2];
                    view3.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    HintPopupUtils$createContainerView$1 hintPopupUtils$createContainerView$2 = hintPopupUtils$createContainerView$1;
                    hintPopupUtils$createContainerView$2.getLocationInWindow(iArr2);
                    hintPopupUtils$createContainerView$2.a = (view3.getHeight() + iArr[1]) - iArr2[1];
                    hintPopupUtils$createContainerView$2.invalidate();
                }
            }
        });
        hintPopupUtils$createContainerView$1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        hintPopupUtils$createContainerView$1.setWillNotDraw(false);
        Context context = viewGroup.getContext();
        context.getClass();
        final ComposeView composeView = new ComposeView(context, attributeSet, 6, 0);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        composeView.setVisibility(4);
        hintPopupUtils$createContainerView$1.addView(composeView);
        view.setTag(R.id.hint_popup_tag, hintPopupUtils$createContainerView$1);
        viewGroup.addView(hintPopupUtils$createContainerView$1);
        ?? r0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: p9m
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                v9m.b(view, viewGroup, composeView, constraintLayout, i2, 0.0f, b120Var);
            }
        };
        final q9m q9mVar = new q9m(viewGroup, hintPopupUtils$createContainerView$1, view, r0, function0);
        composeView.setContent(new op8(344909871, new Function2() { // from class: r9m
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o9m.b(j.w(d.a.b, i), str, c68.a(R.color.hint, aVar), b120Var, i3, q9mVar, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        float f = i2;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new t9m(view, composeView, viewGroup, constraintLayout, f, 0.0f, b120Var, r0));
            return;
        }
        if (!view.isLaidOut() || !composeView.isLaidOut()) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new u9m(view, composeView, viewGroup, constraintLayout, f, 0.0f, b120Var, r0));
            return;
        }
        b(view, viewGroup, composeView, constraintLayout, f, 0.0f, b120Var);
        composeView.setVisibility(0);
        viewGroup.getViewTreeObserver().addOnScrollChangedListener(r0);
    }

    public static void b(View view, View view2, View view3, View view4, float f, float f2, b120 b120Var) {
        int height;
        if (view3.getWidth() == 0 || view3.getHeight() == 0) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        if (view4 != null) {
            int[] iArr3 = new int[2];
            view4.getLocationOnScreen(iArr3);
            height = (view4.getHeight() + iArr3[1]) - iArr2[1];
        } else {
            height = 0;
        }
        int width = iArr[0];
        int i = iArr[1] - iArr2[1];
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        float f3 = view2.getContext().getResources().getDisplayMetrics().density;
        float f4 = f * f3;
        float f5 = f2 * f3;
        if (b120Var != b120.a && b120Var != b120.c) {
            width = (width + width2) - view3.getWidth();
        }
        float f6 = width;
        float height3 = b120Var.b() ? i + height2 + f5 : (i - view3.getHeight()) - f5;
        view3.setX(f.d(f6, 0.0f, view2.getWidth() - view3.getWidth()) + f4);
        view3.setY(height3);
        view3.setVisibility((((float) view3.getHeight()) + height3 <= ((float) height) || height3 >= ((float) view2.getHeight())) ? 4 : 0);
    }
}
