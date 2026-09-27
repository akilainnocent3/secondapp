package xh;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Dialog f145135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f145136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f145137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f145138e;

    public a(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f145135b = dialog;
        this.f145136c = rect.left;
        this.f145137d = rect.top;
        this.f145138e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f145136c + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f145137d + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f145138e;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f145135b.onTouchEvent(motionEventObtain);
    }
}
