package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ou implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f153612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f153614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f153615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f153616e;

    public ou(Context context, View.OnClickListener onClickListener) {
        this.f153612a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f153613b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f153612a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i10 = action & 255;
        if (i10 == 0) {
            this.f153615d = x10;
            this.f153616e = y10;
            this.f153614c = true;
            return false;
        }
        if (i10 == 1) {
            if (this.f153614c) {
                this.f153612a.onClick(view);
            }
            return true;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f153614c = false;
                return false;
            }
        } else if (this.f153614c) {
            int i11 = (int) (x10 - this.f153615d);
            int i12 = (int) (y10 - this.f153616e);
            if ((i12 * i12) + (i11 * i11) > this.f153613b) {
                this.f153614c = false;
            }
        }
        return false;
    }
}
