package com.yandex.div.core.view2.text;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SelectableLinkMovementMethod extends ArrowKeyMovementMethod implements MovementMethod {

    @l
    public static final SelectableLinkMovementMethod INSTANCE = new SelectableLinkMovementMethod();

    private SelectableLinkMovementMethod() {
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(@l TextView textView, @l Spannable spannable, @l MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            int x10 = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y10 = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y10), x10);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (!(clickableSpanArr.length == 0)) {
                super.onTouchEvent(textView, spannable, motionEvent);
                if (action == 1) {
                    for (ClickableSpan clickableSpan : clickableSpanArr) {
                        clickableSpan.onClick(textView);
                    }
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
