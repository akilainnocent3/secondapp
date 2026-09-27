package yads;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zc implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f158728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dialog f158729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ke1 f158730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f158731d;

    public zc(ViewGroup viewGroup, Dialog dialog, ke1 ke1Var) {
        this.f158728a = viewGroup;
        this.f158729b = dialog;
        this.f158730c = ke1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f158731d = rawY;
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            float f10 = this.f158731d;
            if (rawY > f10) {
                this.f158728a.setTranslationY(rawY - f10);
            } else {
                this.f158728a.setTranslationY(0.0f);
            }
        } else if (rawY > this.f158731d) {
            this.f158730c.getClass();
            ke1.a(view);
            ng0.a(this.f158729b);
        }
        return true;
    }
}
