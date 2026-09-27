package yads;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j12 implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ou f150902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d02 f150903b;

    public j12(ou ouVar, d02 d02Var) {
        this.f150902a = ouVar;
        this.f150903b = d02Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f150902a.f153612a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        d02 d02Var = this.f150903b;
        d02Var.getClass();
        if ((view instanceof TextView) || (view instanceof tl2)) {
            d02Var.a(view, motionEvent);
        }
        return this.f150902a.onTouch(view, motionEvent);
    }
}
