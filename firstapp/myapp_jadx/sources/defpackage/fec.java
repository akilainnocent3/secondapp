package defpackage;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class fec extends LinkMovementMethod {
    public static fec a;

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (zOnTouchEvent || motionEvent.getAction() != 1) {
            return zOnTouchEvent;
        }
        ViewParent parent = textView.getParent();
        return parent instanceof ViewGroup ? ((ViewGroup) parent).performClick() : zOnTouchEvent;
    }
}
