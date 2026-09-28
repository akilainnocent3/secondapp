package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w8a implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        if (childAt != null) {
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int width = childAt.getWidth();
            int height = childAt.getHeight();
            if (motionEvent.getRawX() >= i && motionEvent.getRawX() <= i + width && motionEvent.getRawY() >= i2 && motionEvent.getRawY() <= i2 + height) {
                return false;
            }
        }
        return true;
    }
}
